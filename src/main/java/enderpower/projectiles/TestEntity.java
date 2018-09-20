package enderpower.projectiles;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class TestEntity extends Entity{


	private int targetX;
	private int targetY;
	private int targetZ;
	public TestEntity(World world, double x, double y, double z, double targetX, double targetY, double targetZ){
		super(world);
		this.targetX = (int) targetX;
		this.targetY = (int) targetY;
		this.targetZ = (int) targetZ;
		
		this.posX = x;
		this.posY = y;
		this.posZ = z;
		
	}
	public void onUpdate(){
		this.worldObj.spawnParticle("splash", posX, posY, posZ, posX, posY, posZ);
		this.moveToPlayer();
		if(this.worldObj.getBlock((int)posX,(int) posY,(int) posZ).getMaterial() != Material.air){
			this.hitBlock();
		}
		
		
	}

	public void hitBlock() {
		this.worldObj.createExplosion(this, posX, posY, posZ, 3, false);
		this.setDead();
	}
	@Override
	protected void entityInit() {
		
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound nbt) {
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound nbt) {
		
	}
	/**
	 * moves the entity to the given target
	 */
	public void moveToTarget(){
		if(this.targetX >= this.posX + 0.1){
			this.posX += 0.1;
		}
		if(this.targetY >= this.posY + 0.1){
			this.posY += 0.1;
		}
		if(this.targetZ >= this.posZ + 0.1){
			this.posZ += 0.1;
		}
		if(this.targetX <= this.posX - 0.1){
			this.posX -= 0.1;
		}
		if(this.targetY <= this.posY - 0.1){
			this.posY -= 0.1;
		}
		if(this.targetZ <= posZ - 0.1){
			this.posZ -= 0.1;
		}
	}

	/**
	 * moves the entity to the player
	 */
	public void moveToPlayer(){
		if(this.worldObj.getClosestPlayerToEntity(this, 20) != null){
		if(this.worldObj.getClosestPlayerToEntity(this, 20).posX >= this.posX + 0.1){
			this.posX += 0.1;
		}
		if(this.worldObj.getClosestPlayerToEntity(this, 20).posY >= this.posY + 0.1){
			this.posY += 0.1;
		}
		if(this.worldObj.getClosestPlayerToEntity(this, 20).posZ >= this.posZ + 0.1){
			this.posZ += 0.1;
		}
		if(this.worldObj.getClosestPlayerToEntity(this, 20).posX <= this.posX - 0.1){
			this.posX -= 0.1;
		}
		if(this.worldObj.getClosestPlayerToEntity(this, 20).posY <= this.posY - 0.1){
			this.posY -= 0.1;
		}
		if(this.worldObj.getClosestPlayerToEntity(this, 20).posZ <= this.posZ - 0.1){
			this.posZ -= 0.1;
		}
		}
		else{
			this.setDead();
		}
			
	}

	public void hitEntity(){
		System.out.println(this.worldObj.getEntitiesWithinAABB(EntityLiving.class, AxisAlignedBB.getBoundingBox(posX - 1, posY - 1, posZ - 1, posX + 1, posY + 1, posZ + 1)));
		if(this.worldObj.getEntitiesWithinAABB(EntityLiving.class, AxisAlignedBB.getBoundingBox(posX - 1, posY - 1, posZ - 1, posX + 1, posY + 1, posZ + 1)) != null){
			this.worldObj.createExplosion(this, posX, posY, posZ, 1, false);
			this.setDead();
		}
	}
	/**
	 *method that currently not works 
	 * @param par1
	 * @param par3
	 * @param par5
	 * @param par7
	 * @return
	 */
	public EntityMob getClosestMob(double par1, double par3, double par5, double par7)
    {
        double d4 = -1.0D;
        EntityMob mob = null;

        for (int i = 0; i < this.mobs.size(); ++i)
        {
            EntityMob mob1 = (EntityMob)this.mobs.get(i);
            double d5 = mob1.getDistanceSq(par1, par3, par5);

            if ((par7 < 0.0D || d5 < par7 * par7) && (d4 == -1.0D || d5 < d4))
            {
                d4 = d5;
                mob = mob1;
            }
        }

        return mob;
    }
	public List mobs = new ArrayList();
	
	public void moveToMob(){
		if(this.getClosestMobToEntity(this, 200) != null){
		if(this.getClosestMobToEntity(this, 200).posX >= this.posX + 0.1){
			this.posX += 0.1;
		}
		if(this.getClosestMobToEntity(this, 200).posY >= this.posY + 0.1){
			this.posY += 0.1;
		}
		if(this.getClosestMobToEntity(this, 200).posZ >= this.posZ + 0.1){
			this.posZ += 0.1;
		}
		if(this.getClosestMobToEntity(this, 200).posX <= this.posX - 0.1){
			this.posX -= 0.1;
		}
		if(this.getClosestMobToEntity(this, 200).posY <= this.posY - 0.1){
			this.posY -= 0.1;
		}
		if(this.getClosestMobToEntity(this, 200).posZ <= this.posZ - 0.1){
			this.posZ -= 0.1;
		}
		}
		else{
			
		}
			
	}
	public Entity getClosestMobToEntity(Entity entity, double par2)
    {
        return this.getClosestMob(entity.posX, entity.posY, entity.posZ, par2);
    }

}


