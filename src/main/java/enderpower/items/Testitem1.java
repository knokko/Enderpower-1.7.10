package enderpower.items;

import enderpower.blocks.TestBlock;
import enderpower.magic.Magic;
import enderpower.magic.Magic;
import enderpower.main.Enderpower;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Testitem1 extends Item{
	public Testitem1(){
		super();
		setCreativeTab(CreativeTabs.tabMisc);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world,EntityPlayer player){
		Magic.get(world).editMana(2000, 2000, 2000, 2000, 2000, 2000);
		
		
		return itemstack;
		
	}
}
