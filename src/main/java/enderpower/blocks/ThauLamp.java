package enderpower.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ThauLamp extends Block{
	protected ThauLamp() {
		super(Material.glass);
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(1.0F);
		setStepSound(Block.soundTypeGlass);
		setResistance(5.0F);
		this.setLightLevel(1.0F);

}}
