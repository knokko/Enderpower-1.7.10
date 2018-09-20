package enderpower.wands;

import enderpower.magic.Magic;
import enderpower.projectiles.DouBall;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class DouWand extends Item{
	public DouWand(){
		super();
		setCreativeTab(CreativeTabs.tabCombat);
	}
	@Override
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player){
			if(Magic.get(world).useMana(0, 0, 0, 10, 0, 0) && !world.isRemote){
				world.spawnEntityInWorld(new DouBall(world, player));
			}
		return item;
	}
}
		
	


