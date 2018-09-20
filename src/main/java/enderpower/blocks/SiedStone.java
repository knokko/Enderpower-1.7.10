package enderpower.blocks;

import enderpower.main.Enderpower;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SiedStone extends Block{

	protected SiedStone() {
		super(Material.rock);
		setCreativeTab(Enderpower.enderpowersieblockstab);
		setResistance(2000.0F);
		setHardness(5.0F);
		setStepSound(Block.soundTypeStone);
	}

}
