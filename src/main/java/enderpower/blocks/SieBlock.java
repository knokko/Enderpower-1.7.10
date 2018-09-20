package enderpower.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SieBlock extends Block {

	protected SieBlock() {
		super(Material.rock);
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(30.0F);
		setStepSound(Block.soundTypeStone);
		setResistance(2000.0F);
		setHarvestLevel("pickaxe", 3);
		
		
	}

}
