package enderpower.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SieLamp extends Block{
	protected SieLamp() {
		super(Material.glass);
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(5.0F);
		setStepSound(Block.soundTypeGlass);
		setResistance(2000.0F);
		this.setLightLevel(1.0F);
		
		
	}

}
