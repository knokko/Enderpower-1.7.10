package enderpower.wands;

import enderpower.mobs.EntityUndeadMage;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class NecromancyWand extends Item {
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player){
		if(!world.isRemote){
			world.spawnEntityInWorld(new EntityUndeadMage(world, player, 0, player.posX, player.posY + 1, player.posZ - 2));
		}
		return item;
	}

}
