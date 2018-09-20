package enderpower.blocks;

import enderpower.blocks.tileentity.TileEntityGravityBrickN;
import enderpower.blocks.tileentity.TileEntityGravityBrickU;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GravityBrickU extends BlockContainer{
	protected GravityBrickU() {
		super(Material.rock);
		setHardness(2.0F);
		setResistance(15F);
		setStepSound(soundTypeStone);
	}
	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityGravityBrickU();
	}
}
