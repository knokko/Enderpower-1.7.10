package enderpower.projectiles;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class BlastBall2 extends EntityThrowable {
	
	public void onUpdate(){
		super.onUpdate();
		worldObj.spawnParticle("reddust", posX, posY, posZ, 10D, 10D, 0D);
	}
	private int explosions;
	
	protected float getGravityVelocity()
    {
        return 0.00F;
    }
	
	public BlastBall2(World par1World)
    {
        super(par1World);
    }
	
    public BlastBall2(World par1World, EntityLivingBase par2EntityLivingBase)
    {
        super(par1World, par2EntityLivingBase);
        
    }
    
    public BlastBall2(World par1World, double par2, double par4, double par6)
    {
        super(par1World, par2, par4, par6);
    }
    
    @Override
    protected void onImpact(MovingObjectPosition par1MovingObjectPosition){
    	if(this.explosions != 20 && !worldObj.isRemote){
    		boolean flag = worldObj.getGameRules().getGameRuleBooleanValue("enderpowerExplosions");
        	worldObj.createExplosion(this, posX, posY, posZ, 8, flag);
    		explosions += 1;
    	}
    	if(explosions == 20){
    		setDead();
    		explosions = 0;
    	}

       
    }


}
