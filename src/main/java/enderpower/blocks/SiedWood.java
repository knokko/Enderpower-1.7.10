package enderpower.blocks;

import enderpower.main.Enderpower;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SiedWood extends Block {

	protected SiedWood() {
		super(Material.wood);
		setCreativeTab(Enderpower.enderpowersieblockstab);
		setHarvestLevel("axe", 3);
		setHardness(5.0F);
		setResistance(2000.0F);
	}

}
