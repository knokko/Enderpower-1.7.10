package enderpower.blocks;

import enderpower.blocks.tileentity.TileEntityGravityBrickS;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GravityBrickS extends BlockContainer {

	protected GravityBrickS() {
		super(Material.rock);
		setHardness(2.0F);
		setResistance(15F);
		setStepSound(soundTypeStone);
	}
	
	@Override
	public TileEntity createNewTileEntity(World world, int i) {
		return new TileEntityGravityBrickS();
	}
}
