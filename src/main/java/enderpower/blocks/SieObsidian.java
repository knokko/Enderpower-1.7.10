package enderpower.blocks;

import enderpower.tabs.Enderpowertab;
import enderpower.main.Enderpower;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class SieObsidian extends Block{

	protected SieObsidian() {
		super(Material.rock);
		setCreativeTab(Enderpower.enderpowersieblockstab);
		setBlockUnbreakable();
		setResistance(18000.0F);
		setStepSound(Block.soundTypeStone);
		
	}

}
