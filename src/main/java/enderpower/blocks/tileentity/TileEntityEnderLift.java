package enderpower.blocks.tileentity;

import java.util.List;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;

public class TileEntityEnderLift extends TileEntity {
	public void updateEntity(){
		List mobs = worldObj.getEntitiesWithinAABB(EntityLivingBase.class, AxisAlignedBB.getBoundingBox(xCoord - 0.5, yCoord + 1, zCoord - 0.5, xCoord + 0.5, yCoord + 100, zCoord + 0.5));
		for (int j = 0; j < mobs.size(); ++j){
			EntityLivingBase mob = (EntityLivingBase) mobs.get(j);
			mob.motionY = 0.1;
			mob.fallDistance = 0;
		}
	}
}
