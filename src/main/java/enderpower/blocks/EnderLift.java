package enderpower.blocks;

import enderpower.blocks.tileentity.TileEntityEnderLift;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class EnderLift extends BlockContainer {
	protected EnderLift() {
		super(Material.rock);
		setHardness(2);
		setResistance(15);
		setStepSound(soundTypeStone);
	}
	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityEnderLift();
	}
}
