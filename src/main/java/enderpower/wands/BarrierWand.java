package enderpower.wands;

import enderpower.blocks.EnderpowerBlocks;
import enderpower.magic.Magic;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.world.World;

public class BarrierWand extends Item{
	@Override
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player){
		MovingObjectPosition objectMouseOver;
        Minecraft mc = Minecraft.getMinecraft();

        objectMouseOver = mc.thePlayer.rayTrace(300, 1);

        
        if (objectMouseOver != null && objectMouseOver.typeOfHit == MovingObjectType.BLOCK && Magic.get(world).useMana(50, 0, 0, 0, 0, 10) && !world.isRemote) {
        	int i = objectMouseOver.blockX;
            int j = objectMouseOver.blockY;
            int k = objectMouseOver.blockZ;
            
            System.out.println(player.rotationYaw);
            
            if(player.rotationYaw >= -135 && player.rotationYaw <= -45 || player.rotationYaw >= -315 && player.rotationYaw <= -225 || player.rotationYaw <= 135 && player.rotationYaw >= 45 || player.rotationYaw <= 315 && player.rotationYaw >= 225){
            	world.setBlock(i + 0, j + 0, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 0, k + 1, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 0, k + 2, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 0, k + 3, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 0, k + 4, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 0, k + 5, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 0, k + 6, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 0, k + 7, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 0, k + 8, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 0, k - 1, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 0, k - 2, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 0, k - 3, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 0, k - 4, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 0, k - 5, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 0, k - 6, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 0, k - 7, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 0, k - 8, EnderpowerBlocks.thaubarrier);
            	
            	world.setBlock(i + 0, j + 1, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 1, k + 1, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 1, k + 2, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 1, k + 3, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 1, k + 4, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 1, k + 5, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 1, k + 6, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 1, k + 7, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 1, k + 8, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 1, k - 1, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 1, k - 2, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 1, k - 3, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 1, k - 4, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 1, k - 5, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 1, k - 6, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 1, k - 7, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 1, k - 8, EnderpowerBlocks.thaubarrier);
            	
            	world.setBlock(i + 0, j + 2, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 2, k + 1, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 2, k + 2, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 2, k + 3, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 2, k + 4, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 2, k + 5, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 2, k + 6, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 2, k + 7, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 2, k + 8, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 2, k - 1, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 2, k - 2, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 2, k - 3, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 2, k - 4, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 2, k - 5, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 2, k - 6, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 2, k - 7, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 2, k - 8, EnderpowerBlocks.thaubarrier);
            	
            	world.setBlock(i + 0, j + 3, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 3, k + 1, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 3, k + 2, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 3, k + 3, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 3, k + 4, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 3, k + 5, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 3, k + 6, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 3, k + 7, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 3, k + 8, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 3, k - 1, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 3, k - 2, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 3, k - 3, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 3, k - 4, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 3, k - 5, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 3, k - 6, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 3, k - 7, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 0, j + 3, k - 8, EnderpowerBlocks.thaubarrier);
            	
            }
            if(player.rotationYaw >= -225 && player.rotationYaw <= -135 || player.rotationYaw <= -315 || player.rotationYaw >= -45 && player.rotationYaw <= 45 || player.rotationYaw <= 225 && player.rotationYaw >= 135 || player.rotationYaw >= 315){
            	world.setBlock(i + 0, j + 0, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 1, j + 0, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 2, j + 0, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 3, j + 0, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 4, j + 0, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 5, j + 0, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 6, j + 0, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 7, j + 0, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 8, j + 0, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i - 1, j + 0, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i - 2, j + 0, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i - 3, j + 0, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i - 4, j + 0, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i - 5, j + 0, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i - 6, j + 0, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i - 7, j + 0, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i - 8, j + 0, k + 0, EnderpowerBlocks.thaubarrier);
            	
            	world.setBlock(i + 0, j + 1, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 1, j + 1, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 2, j + 1, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 3, j + 1, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 4, j + 1, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 5, j + 1, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 6, j + 1, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 7, j + 1, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 8, j + 1, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i - 1, j + 1, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i - 2, j + 1, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i - 3, j + 1, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i - 4, j + 1, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i - 5, j + 1, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i - 6, j + 1, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i - 7, j + 1, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i - 8, j + 1, k + 0, EnderpowerBlocks.thaubarrier);
            	
            	world.setBlock(i + 0, j + 2, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 1, j + 2, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 2, j + 2, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 3, j + 2, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 4, j + 2, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 5, j + 2, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 6, j + 2, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 7, j + 2, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 8, j + 2, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i - 1, j + 2, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i - 2, j + 2, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i - 3, j + 2, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i - 4, j + 2, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i - 5, j + 2, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i - 6, j + 2, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i - 7, j + 2, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i - 8, j + 2, k + 0, EnderpowerBlocks.thaubarrier);
            	
            	world.setBlock(i + 0, j + 3, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 1, j + 3, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 2, j + 3, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 3, j + 3, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 4, j + 3, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 5, j + 3, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 6, j + 3, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 7, j + 3, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i + 8, j + 3, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i - 1, j + 3, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i - 2, j + 3, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i - 3, j + 3, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i - 4, j + 3, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i - 5, j + 3, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i - 6, j + 3, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i - 7, j + 3, k + 0, EnderpowerBlocks.thaubarrier);
            	world.setBlock(i - 8, j + 3, k + 0, EnderpowerBlocks.thaubarrier);
            }
        }
		return item;
		
	}

}
