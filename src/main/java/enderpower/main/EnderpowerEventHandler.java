package enderpower.main;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.ClientTickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.WorldTickEvent;
import enderpower.blocks.EnderpowerBlocks;
import enderpower.blocks.Thaublock;
import enderpower.items.EnderpowerItems;
import enderpower.magic.Magic;
import enderpower.mobs.EntityEnderhunter;
import enderpower.mobs.EntityUndeadMage;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.world.WorldEvent.Load;

public class EnderpowerEventHandler{
	
	
	@SubscribeEvent
	public void hurtEvent(LivingHurtEvent event){
		if(event.entityLiving instanceof EntityPlayer){
			EntityPlayer player = (EntityPlayer) event.entityLiving;
			World world = event.entityLiving.worldObj;
			List UndeadMages = world.getEntitiesWithinAABB(EntityUndeadMage.class, AxisAlignedBB.getBoundingBox(player.posX - 20, 0, player.posZ - 20, player.posX + 20, 260, player.posZ + 20));
			for(int u = 0; u < UndeadMages.size(); ++u){
				EntityUndeadMage mage = (EntityUndeadMage) UndeadMages.get(u);
				if(player == mage.summoner && event.source.getEntity() != null){
					mage.target = (EntityLivingBase) event.source.getEntity();
				}
			}
		}
	}
	
    public Random r = new Random();
	
	@SubscribeEvent
    public void onEntityDrop(LivingDropsEvent event) {
  	  if(event.entityLiving instanceof EntityCow) {
  		event.entityLiving.dropItem(EnderpowerItems.blood, r.nextInt(3));
  		 
  	  }
  	  
  	  if(event.entityLiving instanceof EntityPig) {
  		event.entityLiving.dropItem(EnderpowerItems.blood, r.nextInt(3));
  		  
  	  }
  	  
  	  if(event.entityLiving instanceof EntitySheep) {
  		event.entityLiving.dropItem(EnderpowerItems.blood, r.nextInt(3));
  		  
  	  }
  	  
  	  if(event.entityLiving instanceof EntityHorse) {
  		event.entityLiving.dropItem(EnderpowerItems.blood, r.nextInt(4));
  		 
  	  }
  	  
  	  if(event.entityLiving instanceof EntityChicken) {
  		event.entityLiving.dropItem(EnderpowerItems.blood, r.nextInt(2));
  		
  	  }
  	  
  	  if(event.entityLiving instanceof EntitySnowman) {
  		  
  	  }
  	  
  	  if(event.entityLiving instanceof EntityIronGolem) {
  		 
  	  }
  	  
  	  if(event.entityLiving instanceof EntityZombie) {
  		 event.entityLiving.dropItem(EnderpowerItems.poisonedblood, r.nextInt(2));
  	  }
  	  
  	  if(event.entityLiving instanceof EntityPigZombie) {
  		 event.entityLiving.dropItem(EnderpowerItems.poisonedblood, r.nextInt(2));
  	  }
  	  
  	  if(event.entityLiving instanceof EntitySpider) {
  		 event.entityLiving.dropItem(EnderpowerItems.poisonedblood, r.nextInt(2));
  	  }
  	  
  	  if(event.entityLiving instanceof EntityCaveSpider) {
  		 event.entityLiving.dropItem(EnderpowerItems.poisonedblood, r.nextInt(2));
  	  }
  	  
  	  if(event.entityLiving instanceof EntityBlaze) {
  		
  	  }
  	  
  	  if(event.entityLiving instanceof EntityCreeper) {
  		event.entityLiving.dropItem(EnderpowerItems.blood, r.nextInt(3));
  		
  	  }
  	  
  	  if(event.entityLiving instanceof EntityEnderman) {
  		
  	  }
  	  
  	  if(event.entityLiving instanceof EntityGhast) {
  		 
  	  }
  	  
  	  if(event.entityLiving instanceof EntitySilverfish) {
  		event.entityLiving.dropItem(EnderpowerItems.blood, r.nextInt(2));
  		 
  	  }
  	  
  	  if(event.entityLiving instanceof EntitySkeleton) {
  		
  	  }
  	  
  	  if(event.entityLiving instanceof EntitySlime) {
  		
  	  }
  	  
  	  if(event.entityLiving instanceof EntityMagmaCube) {
  		  
  	  }
  	  
  	  if(event.entityLiving instanceof EntityWitch) {
  		  event.entityLiving.dropItem(EnderpowerItems.blood, r.nextInt(3));
  		 
  	  }
  	  
  	  if(event.entityLiving instanceof EntityWither) {
  		  
  	  }
  	  
  	  if(event.entityLiving instanceof EntityDragon) {
  		 
  	  }
  	  
  	  if(event.entityLiving instanceof EntityBat){
  		  event.entityLiving.dropItem(EnderpowerItems.bat_eye, r.nextInt(2));
  		  event.entityLiving.dropItem(EnderpowerItems.bat_tooth, r.nextInt(2));
  		  event.entityLiving.dropItem(EnderpowerItems.batskin, r.nextInt(2));
  		  event.entityLiving.dropItem(EnderpowerItems.blood, r.nextInt(2));
  		  
  	  }
  	  if(event.entityLiving instanceof EntityEnderhunter){
  		  event.entityLiving.dropItem(Items.ender_pearl, r.nextInt(2));
  	  }
    }
	
	@SubscribeEvent
	public void joinEvent(EntityJoinWorldEvent event){
		if(event.entity instanceof EntityUndeadMage){
			Magic.get(event.world).undeadMages.add(event.entity);
		}
	}
	
	@SubscribeEvent
	public void onWorldLoad(Load event){
		if(!event.world.getGameRules().hasRule("enderpowerExplosions"))
			event.world.getGameRules().addGameRule("enderpowerExplosions", "True");
	}
}
