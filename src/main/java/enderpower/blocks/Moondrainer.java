package enderpower.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import enderpower.blocks.tileentity.TileEntityMoondrainer;
import enderpower.magic.Magic;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class Moondrainer extends BlockContainer {
	protected Moondrainer() {
		super(Material.rock);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
	}
	public TileEntity createNewTileEntity(World world, int a)
    {
        return new TileEntityMoondrainer();
    }
	@SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.blockIcon = p_149651_1_.registerIcon(this.getTextureName() + "_" + "side");
        this.field_149950_a = p_149651_1_.registerIcon(this.getTextureName() + "_" + "top");
        this.field_149949_b = p_149651_1_.registerIcon(this.getTextureName() + "_" + "bottom");
    }
	@SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        return p_149691_1_ == 0 ? this.field_149949_b : (p_149691_1_ == 1 ? this.field_149950_a : this.blockIcon);
    }
	@SideOnly(Side.CLIENT)
    private IIcon field_149950_a;
    @SideOnly(Side.CLIENT)
    private IIcon field_149949_b;
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    public boolean isOpaqueCube()
    {
        return false;
    }
}
