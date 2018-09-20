package enderpower.projectiles;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class LightningEntity extends EntityThrowable {

	private int field_145788_c = -1;
    private int field_145786_d = -1;
    private int field_145787_e = -1;
    private Block field_145785_f;
	private int ticksInGround;
	private int ticksInAir;
  	double x = posX;
	double y = posY;
	double z = posZ;

	private static final float explosionRadius2 = 6;
	private int livingticks;
	
	public void onUpdate(){
		 float f4 = 1.00F;
		
		 if(this.livingticks >= 1200){
			 this.setDead();
		 }
		
		
		 this.lastTickPosX = this.posX;
	        this.lastTickPosY = this.posY;
	        this.lastTickPosZ = this.posZ;
	        super.onUpdate();

	        if (this.throwableShake > 0)
	        {
	            --this.throwableShake;
	        }

	        if (this.inGround)
	        {
	            if (this.worldObj.getBlock(this.field_145788_c, this.field_145786_d, this.field_145787_e) == this.field_145785_f)
	            {
	                ++this.ticksInGround;

	                if (this.ticksInGround == 1200)
	                {
	                    this.setDead();
	                }

	                return;
	            }

	            this.inGround = false;
	            this.motionX = 100.0F;
	            this.motionY = 100.0F;
	            this.motionZ = 100.0F;
	            this.ticksInGround = 0;
	            this.ticksInAir = 0;
	        }
	        else
	        {
	            ++this.ticksInAir;
	        }

	        Vec3 vec3 = Vec3.createVectorHelper(this.posX, this.posY, this.posZ);
	        Vec3 vec31 = Vec3.createVectorHelper(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
	        MovingObjectPosition movingobjectposition = this.worldObj.rayTraceBlocks(vec3, vec31);
	        vec3 = Vec3.createVectorHelper(this.posX, this.posY, this.posZ);
	        vec31 = Vec3.createVectorHelper(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);

	        if (movingobjectposition != null)
	        {
	        	vec31 = Vec3.createVectorHelper(movingobjectposition.hitVec.xCoord, movingobjectposition.hitVec.yCoord, movingobjectposition.hitVec.zCoord);
	        }

	        if (!this.worldObj.isRemote)
	        {
	            Entity entity = null;
	            List list = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.addCoord(this.motionX, this.motionY, this.motionZ).expand(1.0D, 1.0D, 1.0D));
	            double d0 = 0.0D;
	            EntityLivingBase entitylivingbase = this.getThrower();

	            for (int j = 0; j < list.size(); ++j)
	            {
	                Entity entity1 = (Entity)list.get(j);

	                if (entity1.canBeCollidedWith() && (entity1 != entitylivingbase || this.ticksInAir >= 5))
	                {
	                    float f = 0.3F;
	                    AxisAlignedBB axisalignedbb = entity1.boundingBox.expand((double)f, (double)f, (double)f);
	                    MovingObjectPosition movingobjectposition1 = axisalignedbb.calculateIntercept(vec3, vec31);

	                    if (movingobjectposition1 != null)
	                    {
	                        double d1 = vec3.distanceTo(movingobjectposition1.hitVec);

	                        if (d1 < d0 || d0 == 0.0D)
	                        {
	                            entity = entity1;
	                            d0 = d1;
	                        }
	                    }
	                }
	            }

	            if (entity != null)
	            {
	                movingobjectposition = new MovingObjectPosition(entity);
	            }
	        }

	        if (movingobjectposition != null)
	        {
	            if (movingobjectposition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK && this.worldObj.getBlock(movingobjectposition.blockX, movingobjectposition.blockY, movingobjectposition.blockZ) == Blocks.portal)
	            {
	                this.setInPortal();
	            }
	            else
	            {
	                this.onImpact(movingobjectposition);
	            }
	        }

	        this.posX += this.motionX;
	        this.posY += this.motionY;
	        this.posZ += this.motionZ;
	        float f1 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
	        this.rotationYaw = (float)(Math.atan2(this.motionX, this.motionZ) * 180.0D / Math.PI);

	        for (this.rotationPitch = (float)(Math.atan2(this.motionY, (double)f1) * 180.0D / Math.PI); this.rotationPitch - this.prevRotationPitch < -180.0F; this.prevRotationPitch -= 360.0F)
	        {
	            ;
	        }

	        while (this.rotationPitch - this.prevRotationPitch >= 180.0F)
	        {
	            this.prevRotationPitch += 360.0F;
	        }

	        while (this.rotationYaw - this.prevRotationYaw < -180.0F)
	        {
	            this.prevRotationYaw -= 360.0F;
	        }

	        while (this.rotationYaw - this.prevRotationYaw >= 180.0F)
	        {
	            this.prevRotationYaw += 360.0F;
	        }

	        this.rotationPitch = this.prevRotationPitch + (this.rotationPitch - this.prevRotationPitch) * 0.2F;
	        this.rotationYaw = this.prevRotationYaw + (this.rotationYaw - this.prevRotationYaw) * 0.2F;
	        float f2 = 1.00F;
	        float f3 = this.getGravityVelocity();

	        if (this.isInWater())
	        {
	            for (int i = 0; i < 4; ++i)
	            {
	                this.worldObj.spawnParticle("bubble", this.posX - this.motionX * (double)f4, this.posY - this.motionY * (double)f4, this.posZ - this.motionZ * (double)f4, this.motionX, this.motionY, this.motionZ);
	            }

	            f2 = 1.00F;
	        }

	        this.setPosition(this.posX, this.posY, this.posZ);
	    }
	
	protected float getGravityVelocity()
    {
        return 0.00F;
    }

	
	public LightningEntity(World par1World)
    {
        super(par1World);
    }
    public LightningEntity(World par1World, EntityLivingBase par2EntityLivingBase)
    {
        super(par1World, par2EntityLivingBase);
        this.getGravityVelocity();
    }
    public LightningEntity(World par1World, double par2, double par4, double par6)
    {
        super(par1World, par2, par4, par6);
    }
    @Override
    protected void onImpact(MovingObjectPosition o){
    	if(o.entityHit != null){
    		worldObj.addWeatherEffect(new EntityLightningBolt(worldObj, o.entityHit.posX, o.entityHit.posY, o.entityHit.posZ));
    	}
    	else {
    		worldObj.addWeatherEffect(new EntityLightningBolt(worldObj, o.blockX, o.blockY, o.blockZ));
    	}
    	 setDead();
    }
}


