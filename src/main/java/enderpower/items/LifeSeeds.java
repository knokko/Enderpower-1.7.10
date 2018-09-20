package enderpower.items;

import enderpower.blocks.EnderpowerBlocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class LifeSeeds extends Item {
	
	public boolean onItemUse(ItemStack item, EntityPlayer player, World world, int x, int y, int z, int i4, float f1, float f2, float f3)
    {
		if(world.getBlock(x, y, z) == Blocks.farmland && world.getBlock(x, y + 1, z) == Blocks.air){
			world.setBlock(x, y + 1, z, EnderpowerBlocks.lifeplant);
			player.inventory.consumeInventoryItem(EnderpowerItems.lifeseeds);
			return true;
		}
		else {
			return false;
		}
    }
}
