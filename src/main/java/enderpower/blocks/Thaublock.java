package enderpower.blocks;

import java.util.Random;

import enderpower.items.EnderpowerItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;

public class Thaublock extends Block {

	protected Thaublock() {
		super(Material.rock);
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(1.0F);
		setStepSound(Block.soundTypeStone);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 0);
		
		
	}}


