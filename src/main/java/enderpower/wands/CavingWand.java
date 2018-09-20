package enderpower.wands;

import enderpower.magic.Magic;
import enderpower.projectiles.BlastBall;
import enderpower.projectiles.BlastBall2;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class CavingWand extends Item{
	public CavingWand(){
		super();
		setCreativeTab(CreativeTabs.tabCombat);
	}
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world,EntityPlayer player) {
		if(!world.isRemote){
	        if (Magic.get(world).useMana(200, 0, 1000, 0, 0, 0))
			{
	        	world.spawnEntityInWorld(new BlastBall2(world, player));
			}
		}
		return itemstack;
	        }
}
