package enderpower.wands;

import enderpower.magic.Magic;
import enderpower.magic.Magic;
import enderpower.projectiles.BlastBall;
import enderpower.projectiles.LightningEntity;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class LightningWand extends Item{
	public LightningWand(){
		super();
		setCreativeTab(CreativeTabs.tabCombat);
	}
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world,EntityPlayer player){
			if (Magic.get(world).useMana(5, 0, 10, 0, 0, 0) && !world.isRemote)
			{
				world.spawnEntityInWorld(new LightningEntity(world, player));
			}
		return itemstack;   
	        }
	}


