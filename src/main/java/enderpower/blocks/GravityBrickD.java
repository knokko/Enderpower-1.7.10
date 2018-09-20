package enderpower.blocks;

import enderpower.blocks.tileentity.TileEntityGravityBrickD;
import enderpower.blocks.tileentity.TileEntityGravityBrickN;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GravityBrickD extends BlockContainer{
	protected GravityBrickD() {
		super(Material.rock);
		setHardness(2.0F);
		setResistance(15F);
		setStepSound(soundTypeStone);
	}
	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityGravityBrickD();
	}
}
