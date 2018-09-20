package enderpower.blocks;

import java.util.Random;

import enderpower.items.EnderpowerItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class Enderpowersieore extends Block{

	protected Enderpowersieore() {
		super(Material.rock);
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(15.0F);
		setStepSound(Block.soundTypeStone);
		setResistance(2000.0F);
		setHarvestLevel("pickaxe", 3);
		this.setLightLevel(0.5F);
		}
	
	public Item getItemDropped(int par1, Random par2Random, int par3) {
		return EnderpowerItems.sie_gem;
		
	}
	
	private Random rand = new Random();
	public int getExpDrop(IBlockAccess blockaccess, int par1, int par2) {
		if (this.getItemDropped(par1, rand, par2) != Item.getItemFromBlock(this)) {
			return 1 + rand.nextInt(5);
		}
		return 0;
		
	}

}
