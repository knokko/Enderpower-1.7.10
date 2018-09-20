package enderpower.wands;

import enderpower.magic.Magic;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class SpeedWand extends Item {
	@Override
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player){
		if(Magic.get(world).useMana(2, 0, 0, 0, 0, 0)){
		player.addPotionEffect(new PotionEffect(1, 5, 3));
		player.jumpMovementFactor = 0.1F;
		}
		return item;
		
	}

}
