package enderpower.mobs;

import java.util.List;
import java.util.UUID;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import enderpower.features.EntityFeatures;
import enderpower.features.Position;
import enderpower.items.EnderpowerItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class EntityUndeadMage extends EntityAnimal{
	/**
	 * The number of ticks after the mob data is erased.
	 */
	public int counter;
	/**
	 * The summoner is the player that has summoned this mob.
	 * This mob is programmed to help the summoner.
	 */
	public EntityPlayer summoner;
	
	public Position position;
	/**
	 * The player name of the summoner.
	 */
	public String summonerName;
	
	public List partners;
	/**
	 * The UUID of the summoner.
	 */
	public UUID summonerUUID;
	/**
	 * The type of magic this mob uses.
	 * 0 = healing
	 * 1 = mixed
	 * 2 = offensive
	 */
	public int mageType;
	/**
	 * The speed of the mob.
	 */
	
	double movementSpeed = this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).getBaseValue();
	/**
	 * The current mana the mob has
	 */
	public int mobMana;
	/**
	 * The UUID of the summoner as String.
	 */
	public String summonerId;
	
	/**
	 * returns true if the mob should follow the summoner.
	 * returns false if the mob should keep on the place where it is.
	 */
	
	public boolean guardSummoner = true;
	/**
	 * A list of all mobs that are close enough to this mob.
	 */
	
	public List mobs;
	
	/**
	 * The way this mob choses his target.
	 * 0 =  defensive, it will only attack mobs that attack him, his partners or the summoner.
	 * 1 =  helper, it will attack all mobs that the summoner attacks too and the defensive targetting.
	 * 2 =  offensive, the mob will attack every monster it sees.
	 */
	
	public int fightType;
	/**
	 * The last mob that attacked this mob.
	 */
	
	public Entity lastAttacker;
	/**
	 * The target of this mob.
	 */
	
	public EntityLivingBase target;
	/**
	 * The time in ticks this mob can't cast spells.
	 */
	public int spellCooldown;
	public Position summonerPosition;
	
	/**
	 * A required constructor for a mob.
	 * 
	 * Do not use this constructor to summon this mob.
	 * Use the constructor world, summoner, mageType, x, y, z.
	 * @param world
	 */
    public EntityUndeadMage(World world)
    {
        super(world);
        this.setSize(0.9F, 1.8F);
    }
 
    /**
     * 
     * @param world - The world the mob has to spawn.
     * @param summoner - The player that summons this mob.
     * @param mageType - The type of magic this mob will use. 0 = positive 1 = mixed 2 = offensive
     * @param x - The X location the mob has to spawn.
     * @param y - The Y location the mob has to spawn.
     * @param z - The Z location the mob has to spawn.
     */
    public EntityUndeadMage(World world, EntityPlayer summoner, int mageType, double x, double y, double z){
    	super(world);
    	this.setSize(0.6F, 1.8F);
    	setPosition(x, y, z);
        prevPosX = x;
        prevPosY = y;
        prevPosZ = z;
        this.summoner = summoner;
        this.mageType = mageType;
    	
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    public boolean isAIEnabled()
    {
        return true;
    }
    
    /**
     * The base attributes of this mob.
     */
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.35);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(64);
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return null;
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.zombie.hurt";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.zombie.hurt";
    }

    protected void func_145780_a(int x, int y, int z, Block block)
    {
        this.playSound("mob.zombie.step", 0.15F, 1.0F);
    }

    /**
     * Returns the volume for the sounds this mob makes.
     */
    protected float getSoundVolume()
    {
        return 0.4F;
    }

    protected Item getDropItem()
    {
        return Items.bone;
    }

    /**
     * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param
     * par2 - Level of Looting used to kill this mob.
     */
    protected void dropFewItems(boolean hitbyplayer, int lootinglevel)
    {
        int j = this.rand.nextInt(3) + this.rand.nextInt(1 + lootinglevel);
        int k;

        for (k = 0; k < j; ++k)
        {
            this.dropItem(Items.bone, 1);
        }

        j = this.rand.nextInt(3) + 1 + this.rand.nextInt(1 + lootinglevel);

        for (k = 0; k < j; ++k)
        {
            if (this.isBurning())
            {
                this.dropItem(Items.skull, 1);
            }
            else
            {
                this.dropItem(Items.skull, 1);
            }
        }
    }

    /**
     * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
     */
    


    public EntityUndeadMage createChild(EntityAgeable ageable)
    {
        return new EntityUndeadMage(this.worldObj);
    }
    public void onUpdate(){
    	super.onUpdate();
    	updateMana();
    	getSummoner();
    	waterMovement();
    	if(summoner != null){
    		summonerPosition = new Position(summoner);
        	useMagic();
        	getTarget();
        	if(guardSummoner){
        		followSummoner();
    		if(summoner.isDead){
    			summoner = null;
    		}
    		}
    	}
    	++counter;
    	if(target != null){
    		if(target.isDead){
    			target = null;
    		}
    	}
    	position = new Position(this);
    }
	public void waterMovement() {
		if(handleWaterMovement() && summoner != null){
			if(summoner.posY <= posY){
				moveFlying(0, -0.1F, 0);
			}
			else {
				moveFlying(0, 0.1F, 0);
			}
		}
		if(handleWaterMovement() && summoner == null){
			moveFlying(0, 0.1F, 0);
		}
	}

	public void getSummoner() {
		if(summonerUUID == null && summoner == null && !worldObj.isRemote){
			if(!summonerId.isEmpty()){
    		summonerUUID = UUID.fromString(summonerId);
			}
    	}
    	if(summonerUUID != null && summoner == null){
    		summoner = worldObj.func_152378_a(summonerUUID);
    	}
    	if(summonerUUID != null){
        	summonerId = summonerUUID.toString();
        }
    	if(summoner != null && summonerUUID == null){
    		summonerUUID = summoner.getUniqueID();
    	}
	}

	public void useMagic() {
		if(mageType == 0){
			useHealingMagic();
		}
		if(mageType == 1){
			useMixedMagic();
		}
		if(mageType == 2){
			useOffensiveMagic();
		}
	}

	public void useOffensiveMagic() {
		if(target != null){
			if(!target.isImmuneToFire() && !target.isPotionActive(12) && spellCooldown == 0 && mobs != null){
				if(mobs.size() < 10 && mobMana >= 100){
					target.attackEntityFrom(DamageSource.inFire, 5);
					target.setFire(5);
					mobMana -= 100;
					spellCooldown = 40;
				}
				else if(mobMana >= 500){
					EntityLightningBolt lighning = new EntityLightningBolt(worldObj, target.posX, target.posY, target.posZ);
					if(partners != null){
						int i = 0;
						while(i < partners.size()){
							EntityUndeadMage partner = (EntityUndeadMage) partners.get(i);
							if(!partner.isPotionActive(12)){
								partner.addPotionEffect(new PotionEffect(12,80));
							}
							++i;
						}
					}
					if(!summoner.isPotionActive(12)){
						summoner.addPotionEffect(new PotionEffect(12, 80));
					}
					worldObj.addWeatherEffect(lighning);
					spellCooldown = 80;
					mobMana -= 500;
				}
			}
		}
	}

	public void useMixedMagic() {
		if(target != null){
			if(!this.target.isPotionActive(2) && mobMana >= 200){
				this.target.addPotionEffect(new PotionEffect(2, 100, 5));
				mobMana -= 200;
			}
		}
	}

	public void useHealingMagic() {
		if(summoner.isBurning() && !summoner.isPotionActive(12) && mobMana >= 200){
			summoner.addPotionEffect(new PotionEffect(12, 40));
			mobMana -= 200;
			worldObj.spawnParticle("flame", posX, posY, posZ, 0D, 0D, 0D);
		}
		List partners = worldObj.getEntitiesWithinAABB(EntityUndeadMage.class, AxisAlignedBB.getBoundingBox(summoner.posX - 20, summoner.posY - 20, summoner.posZ - 20, summoner.posX + 20, summoner.posY + 20, summoner.posZ + 20));
		for (int j = 0; j < partners.size(); ++j){
			EntityUndeadMage partner = (EntityUndeadMage) partners.get(j);
			if(partner.summoner == summoner){
				if(partner.isBurning() && !partner.isPotionActive(12)){
					if(mobMana >= 200){
						partner.addPotionEffect(new PotionEffect(12, 40));
						mobMana -= 200;
					}
				}
			if(partner.getHealth() >= 11 && partner.getHealth() <= 19 && !partner.isPotionActive(10) && mobMana >= 20){
					partner.addPotionEffect(new PotionEffect(10, 100));
					mobMana -= 20;
			}
			if(partner.fallDistance >= 4 && mobMana >= 100){
					partner.fallDistance = 0;
					mobMana -= 100;
			}
			if(partner.getHealth() <= 10 && partner.getHealth() >= 6 && mobMana >= 100 && !partner.isPotionActive(10)){
				partner.addPotionEffect(new PotionEffect(10, 100, 1));
				mobMana -= 100;
			}
			if(partner.getHealth() <= 10 && partner.getHealth() >= 6 && partner.isPotionActive(10) && mobMana >= 100){
				partner.heal(1F);
				mobMana -= 100;
			}
			if(partner.getHealth() <= 5 && partner.getHealth() >= 1 && mobMana >= 500 && !partner.isPotionActive(10)){
				partner.addPotionEffect(new PotionEffect(10, 100, 2));
				mobMana -= 500;
			}
			if(partner.getHealth() <= 5 && partner.getHealth() >= 1 && mobMana >= 1000){
				mobMana -= 1000;
				partner.heal(5F);
			}
			}
		}
		if(summoner.getHealth() >= 11 && summoner.getHealth() <= 19 && !summoner.isPotionActive(10) && mobMana >= 20){
				summoner.addPotionEffect(new PotionEffect(10,100));
				mobMana -= 20;
		}
		if(summoner.fallDistance >= 4 && mobMana >= 100){
				summoner.fallDistance = 0;
				mobMana -= 100;
		}
		if(summoner.getHealth() <= 10 && summoner.getHealth() >= 6 && !summoner.isPotionActive(10) && mobMana >= 100){
				summoner.addPotionEffect(new PotionEffect(10, 10, 1));
				mobMana -= 100;
		}
		if(summoner.getHealth() <= 10 && summoner.getHealth() >= 6 && summoner.isPotionActive(10) && mobMana >= 100){
			summoner.heal(1F);
			mobMana -= 100;
		}
		if(summoner.getHealth() <= 5 && summoner.getHealth() >= 1 && !summoner.isPotionActive(10) && mobMana >= 500){
				summoner.addPotionEffect(new PotionEffect(10, 100, 2));
				mobMana -= 500;
		}
		if(summoner.getHealth() <= 5 && summoner.getHealth() >= 1 && mobMana >= 1000){
			mobMana -= 1000;
			summoner.heal(5F);
		}
		
	}


	public void updateMana() {
		if(mobMana < 5000){
			mobMana += 1;
		}
		if(mobMana >= 5001){
			mobMana = 5000;
		}
		if(spellCooldown > 0){
			spellCooldown -= 1;
		}
		if(spellCooldown < 0){
			spellCooldown = 0;
		}
	}

	public void followSummoner() {
		if(summoner != null){
			if(position != null && summonerPosition != null){
				if(position.getSquaredDistance(summonerPosition) > 5){
					getNavigator().setPath(getNavigator().getPathToEntityLiving(summoner), 1);
				}
				if(position.getSquaredDistance(summonerPosition) > 16){
					if(summoner.onGround || summoner.handleWaterMovement()){
						setPosition(summoner.posX, summoner.posY, summoner.posZ);
					}
				}
				if(position.getSquaredDistance(summonerPosition) > 100){
					if(summoner.dimension == dimension){
						setPosition(summoner.posX, summoner.posY, summoner.posZ);
					}
				}
				if(summoner.isInsideOfMaterial(Material.portal)){
					setPosition(summoner.posX, summoner.posY, summoner.posZ);
				}
			}
		}
	}
	public void writeEntityToNBT(NBTTagCompound nbt){
		super.writeEntityToNBT(nbt);
		if(summonerId != null){
			nbt.setString("summonerUUID", summonerId);
		}
		nbt.setInteger("mobMana", mobMana);
		nbt.setBoolean("guardSummoner", guardSummoner);
		nbt.setInteger("mageType", mageType);
		nbt.setInteger("fightType", fightType);
	}
	public void readEntityFromNBT(NBTTagCompound nbt){
		super.readEntityFromNBT(nbt);
		mobMana = nbt.getInteger("mobMana");
		summonerId = nbt.getString("summonerUUID");
		guardSummoner = nbt.getBoolean("guardSummoner");
		mageType = nbt.getInteger("mageType");
		fightType = nbt.getInteger("fightType");
		
	}
	public boolean interact(EntityPlayer player){
		if(!worldObj.isRemote){
			if(player == summoner){
				ItemStack currentItem = player.inventory.getCurrentItem();
				if(currentItem != null){
					if(currentItem.getItem() == EnderpowerItems.positiveSpellBook && mageType != 0){
						mageType = 0;
						player.addChatMessage(new ChatComponentTranslation("I am now a healing mage."));
					}
					if(currentItem.getItem() == EnderpowerItems.mixedSpellBook && mageType != 1){
						mageType = 1;
						player.addChatMessage(new ChatComponentTranslation("I am now a mixed mage."));
					}
					if(currentItem.getItem() == EnderpowerItems.offensiveSpellBook && mageType != 2){
						mageType = 2;
						player.addChatMessage(new ChatComponentTranslation("I am now an offensive mage."));
					}
					if(currentItem.getItem() == Items.wooden_sword || currentItem.getItem() == Items.stone_sword || currentItem.getItem() == Items.iron_sword || currentItem.getItem() == Items.golden_sword || currentItem.getItem() == Items.diamond_sword){
						if(fightType == 0 && mageType != 0){
							fightType = 1;
							player.addChatMessage(new ChatComponentTranslation("I will attack every mob that attacks you or you attack."));
						}
						else if(fightType == 1 && mageType != 0){
							fightType = 2;
							player.addChatMessage(new ChatComponentTranslation("I will attack every monster I see."));
						}
						else if(fightType == 2 && mageType != 0){
							fightType = 0;
							player.addChatMessage(new ChatComponentTranslation("I will attack every mob that attacks you or my partners."));
						}
					}
				}
				if(currentItem == null && guardSummoner == true && !worldObj.isRemote){
					guardSummoner = false;
					player.addChatMessage(new ChatComponentTranslation("I will guard it here."));
				}
				else if(currentItem == null && guardSummoner == false && !worldObj.isRemote){
					guardSummoner = true;
					player.addChatMessage(new ChatComponentTranslation("I will follow you now."));
				}
			}
		}
		return super.interact(player);
	}
	public boolean attackEntityFrom(DamageSource damage, float f){
		lastAttacker = damage.getEntity();
		if(damage.getEntity() == summoner){
			target = null;
			return true;
		}
		return super.attackEntityFrom(damage, f);
	}
	public void getTarget(){
		if(!worldObj.isRemote){
			partners = worldObj.getEntitiesWithinAABB(EntityUndeadMage.class, AxisAlignedBB.getBoundingBox(posX - 20, posY - 20, posZ - 20, posX + 20, posY + 20, posZ + 20));
			mobs = worldObj.getEntitiesWithinAABB(EntityMob.class, AxisAlignedBB.getBoundingBox(posX - 20, posY - 20, posZ - 20, posX + 20, posY + 20, posZ + 20));
			EntityUndeadMage partner;
			EntityUndeadMage undeadmage;
			for (int j = 0; j < partners.size(); ++j){
				undeadmage = (EntityUndeadMage) partners.get(j);
				if(undeadmage.summoner == summoner){
					partner = (EntityUndeadMage) partners.get(j);
					if(partner.lastAttacker != null && fightType == 0){
						this.target = (EntityLivingBase) partner.lastAttacker;
					}
					if(fightType >= 1 && !(summoner.getLastAttacker() instanceof EntityUndeadMage) && target == null && summoner.getLastAttacker() != null){
						target = summoner.getLastAttacker();
					}
				}
			}
			if(fightType == 2){
				if(target == null){
					target = (EntityLivingBase) EntityFeatures.getRandomEntityWithinAABB(EntityMob.class, AxisAlignedBB.getBoundingBox(posX - 20, posY - 20, posZ - 20, posX + 20, posY + 20, posZ + 20), worldObj);
				}
			}
		}
	}
}
