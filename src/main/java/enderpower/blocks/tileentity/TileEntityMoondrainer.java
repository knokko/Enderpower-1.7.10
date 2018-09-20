package enderpower.blocks.tileentity;

import enderpower.magic.Magic;
import net.minecraft.tileentity.TileEntity;

public class TileEntityMoondrainer extends TileEntity {
	private int cooldown;
	public boolean canUpdate(){
		return true;
	}
	public void updateEntity(){
		if(worldObj.canBlockSeeTheSky(xCoord, yCoord + 1, zCoord) && worldObj.getWorldTime() >= 12500 && worldObj.getWorldTime() <= 23500){
			if(cooldown == 0){
				Magic.get(worldObj).editMana(1, 0, 0, 2, 0, 0);
				cooldown = 40;
			}
			if(cooldown >= 1) {
			--cooldown;
			}
		}
	}
}
