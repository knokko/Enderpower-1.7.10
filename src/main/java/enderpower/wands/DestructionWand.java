package enderpower.wands;

import enderpower.projectiles.BlastBall;
import enderpower.projectiles.BlastBall3;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class DestructionWand extends Item{
	public DestructionWand(){
		super();
		setCreativeTab(CreativeTabs.tabCombat);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World,EntityPlayer par3EntityPlayer) {
	            par2World.spawnEntityInWorld(new BlastBall3(par2World, par3EntityPlayer));
				return par1ItemStack;
	        }
	    {
	       
	    }

}
