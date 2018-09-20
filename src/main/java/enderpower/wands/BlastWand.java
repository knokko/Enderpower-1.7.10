package enderpower.wands;

import enderpower.magic.Magic;
import enderpower.projectiles.BlastBall;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlastWand extends Item{
	public BlastWand(){
		super();
		setCreativeTab(CreativeTabs.tabCombat);
	}
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world,EntityPlayer player) {
		if(!world.isRemote){
			if (Magic.get(world).useMana(40, 0, 100, 0, 0, 0))
			{
				
				world.spawnEntityInWorld(new BlastBall(world, player));
				
			}
		}
		return itemstack;   
	        }
	}
	


