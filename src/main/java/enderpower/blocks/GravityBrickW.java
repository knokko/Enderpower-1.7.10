package enderpower.blocks;

import enderpower.blocks.tileentity.TileEntityGravityBrickW;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GravityBrickW extends BlockContainer{

	protected GravityBrickW() {
		super(Material.rock);
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityGravityBrickW();
	}

}
