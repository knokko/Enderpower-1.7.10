package enderpower.mobs;

import java.util.Calendar;

import enderpower.blocks.TestBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.WorldProviderHell;

public class EntityEnderhunter extends EntityMob{

	public EntityEnderhunter(World world) {
		super(world);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIMoveTowardsRestriction(this, 1.0D));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityCow.class, 0.5D, true));
        this.targetTasks.addTask(0, new EntityAINearestAttackableTarget(this, EntityCow.class, 0, false));
        this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityPig.class, 0.5D, true));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPig.class, 0, false));
        this.tasks.addTask(4, new EntityAIAttackOnCollide(this, EntityChicken.class, 0.5D, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityChicken.class, 0, false));
        this.tasks.addTask(5, new EntityAIAttackOnCollide(this, EntityZombie.class, 0.5D, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityZombie.class, 0, true));
	}
	protected void applyEntityAttributes(){
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(5.0D);
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(64.0D);
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.8D);
		this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.5D);
		

	}
	public boolean isAIEnabled()
    {
        return true;
    }
	public boolean hitByEntity(Entity par1Entity)
    {
		this.tasks.addTask(6, new EntityAIAttackOnCollide(this, EntityPlayer.class, 0.6D, true));
        this.targetTasks.addTask(4, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, false));
        return false;
    }
	
	
	
	

}
