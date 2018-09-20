package enderpower.blocks.tileentity;

import java.util.List;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;

public class TileEntityGravityBrickS extends TileEntity {
	public boolean canUpdate(){
		return true;
	}
	public void updateEntity(){
		List mobs = worldObj.getEntitiesWithinAABB(EntityLivingBase.class, AxisAlignedBB.getBoundingBox(xCoord - 0.5, yCoord, zCoord + 1, xCoord + 0.5, yCoord, zCoord + 4));
		for (int j = 0; j < mobs.size(); ++j){
			EntityLivingBase mob = (EntityLivingBase) mobs.get(j);
			mob.motionY = 0;
			mob.fallDistance = 0;
			mob.jumpMovementFactor = 0.1F;
		}
	}
}
