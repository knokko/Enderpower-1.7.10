package enderpower.blocks.tileentity;

import java.util.List;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;

public class TileEntityGravityBrickW extends TileEntity {
	public boolean canUpdate(){
		return true;
	}
	public void updateEntity(){
		List mobs = worldObj.getEntitiesWithinAABB(EntityLivingBase.class, AxisAlignedBB.getBoundingBox(xCoord - 3, yCoord, zCoord - 0.5, xCoord, yCoord, zCoord + 0.5));
		for (int j = 0; j < mobs.size(); ++j){
			EntityLivingBase mob = (EntityLivingBase) mobs.get(j);
			mob.motionY = 0;
			mob.fallDistance = 0;
			mob.jumpMovementFactor = 0.1F;
		}
	}
}
