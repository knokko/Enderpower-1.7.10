package enderpower.items;

import enderpower.magic.Magic;
import enderpower.projectiles.TestEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Testitem3 extends Item {
	@Override
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player){
		Magic.get(world).editMana(100, 10, 200, 50, 100, 100);
		world.spawnEntityInWorld(new TestEntity(world, player.posX + 10, player.posY + 10, player.posZ + 10, player.posX + 30, player.posY + 30, player.posZ + 30));
		return item;
		
	}


}
