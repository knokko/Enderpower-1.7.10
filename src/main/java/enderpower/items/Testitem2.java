package enderpower.items;

import enderpower.blocks.TestBlock;
import enderpower.magic.Magic;
import enderpower.main.Enderpower;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Testitem2 extends Item{
	public Testitem2(){
		super();
		setCreativeTab(CreativeTabs.tabMisc);
	}
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world,EntityPlayer player){
		Magic.get(world).setMana(0, 0, 0, 0, 0, 0);
		return itemstack;
		
	}

}
