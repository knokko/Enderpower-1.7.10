package enderpower.wands;

import enderpower.blocks.EnderpowerBlocks;
import enderpower.magic.Magic;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.world.World;

public class HolyWand extends Item {
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player){
		MovingObjectPosition objectMouseOver;
        Minecraft mc = Minecraft.getMinecraft();

        objectMouseOver = mc.thePlayer.rayTrace(300, 1);
		if(!world.isRemote){
			int i = objectMouseOver.blockX;
	           int j = objectMouseOver.blockY;
	           int k = objectMouseOver.blockZ;
			if(objectMouseOver != null && objectMouseOver.typeOfHit == MovingObjectType.BLOCK){
				if(world.getBlock(i, j, k) == EnderpowerBlocks.cursedgrass && Magic.get(world).useMana(3000, 25000, 0, 0, 0, 0)){
		        	   world.setBlock(i, j, k, EnderpowerBlocks.holygrass);
		           }
				
			}
		}
		return item;
		
	}

}
