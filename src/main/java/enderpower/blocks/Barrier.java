package enderpower.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.IBlockAccess;

public class Barrier extends Block {

	protected Barrier() {
		super(Material.glass);
		setCreativeTab(CreativeTabs.tabAllSearch);
		this.setLightOpacity(0);
	}
	public boolean isOpaqueCube()
    {
        return false;
    }

}
