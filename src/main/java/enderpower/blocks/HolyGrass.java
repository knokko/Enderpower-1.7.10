package enderpower.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class HolyGrass extends BlockGrass {

	protected HolyGrass() {
		super();
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setTickRandomly(true);
		this.setHardness(1.0F);
		
	}
	@SideOnly(Side.CLIENT)
    private IIcon field_149991_b;
    @SideOnly(Side.CLIENT)
    private IIcon field_149993_M;
    @SideOnly(Side.CLIENT)
    private IIcon field_149994_N;
    
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        return p_149691_1_ == 1 ? this.field_149991_b : (p_149691_1_ == 0 ? Blocks.dirt.getBlockTextureFromSide(p_149691_1_) : this.blockIcon);
    }
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(IBlockAccess p_149673_1_, int p_149673_2_, int p_149673_3_, int p_149673_4_, int p_149673_5_)
    {
        if (p_149673_5_ == 1)
        {
            return this.field_149991_b;
        }
        else if (p_149673_5_ == 0)
        {
            return Blocks.dirt.getBlockTextureFromSide(p_149673_5_);
        }
        else
        {
            Material material = p_149673_1_.getBlock(p_149673_2_, p_149673_3_ + 1, p_149673_4_).getMaterial();
            return material != Material.snow && material != Material.craftedSnow ? this.blockIcon : this.field_149993_M;
        }
    }
    @Override
	public void onBlockClicked(World world, int x, int y, int z, EntityPlayer player){
		world.setBlock(x, y, z, Blocks.grass);
		
	}

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.blockIcon = p_149651_1_.registerIcon(this.getTextureName() + "_side");
        this.field_149991_b = p_149651_1_.registerIcon(this.getTextureName() + "_top");
        this.field_149994_N = p_149651_1_.registerIcon(this.getTextureName() + "_side_overlay");
    }
	public void updateTick(World world, int x, int y, int z, Random random){
		if(world.getBlock(x + 1, y + 0, z + 1) == EnderpowerBlocks.cursedgrass){
			world.setBlock(x + 1, y + 0, z + 1, EnderpowerBlocks.holygrass);
		}
		if(world.getBlock(x + 1, y + 0, z + 0) == EnderpowerBlocks.cursedgrass){
			world.setBlock(x + 1, y + 0, z + 0, EnderpowerBlocks.holygrass);
		}
		if(world.getBlock(x + 1, y + 0, z - 1) == EnderpowerBlocks.cursedgrass){
			world.setBlock(x + 1, y + 0, z - 1, EnderpowerBlocks.holygrass);
		}
		if(world.getBlock(x + 0, y + 0, z - 1) == EnderpowerBlocks.cursedgrass){
			world.setBlock(x + 0, y + 0, z - 1, EnderpowerBlocks.holygrass);
		}
		if(world.getBlock(x + 0, y + 0, z + 1) == EnderpowerBlocks.cursedgrass){
			world.setBlock(x + 0, y + 0, z + 1, EnderpowerBlocks.holygrass);
		}
		if(world.getBlock(x - 1, y + 0, z + 0) == EnderpowerBlocks.cursedgrass){
			world.setBlock(x - 1, y + 0, z + 0, EnderpowerBlocks.holygrass);
		}
		if(world.getBlock(x - 1, y + 0, z + 1) == EnderpowerBlocks.cursedgrass){
			world.setBlock(x - 1, y + 0, z + 1, EnderpowerBlocks.holygrass);
		}
		if(world.getBlock(x - 1, y + 0, z - 1) == EnderpowerBlocks.cursedgrass){
			world.setBlock(x - 1, y + 0, z - 1, EnderpowerBlocks.holygrass);
		}
		
		if(world.getBlock(x + 1, y + 1, z + 1) == EnderpowerBlocks.cursedgrass){
			world.setBlock(x + 1, y + 1, z + 1, EnderpowerBlocks.holygrass);
		}
		if(world.getBlock(x + 1, y + 1, z + 0) == EnderpowerBlocks.cursedgrass){
			world.setBlock(x + 1, y + 1, z + 0, EnderpowerBlocks.holygrass);
		}
		if(world.getBlock(x + 1, y + 1, z - 1) == EnderpowerBlocks.cursedgrass){
			world.setBlock(x + 1, y + 1, z - 1, EnderpowerBlocks.holygrass);
		}
		if(world.getBlock(x + 0, y + 1, z - 1) == EnderpowerBlocks.cursedgrass){
			world.setBlock(x + 0, y + 1, z - 1, EnderpowerBlocks.holygrass);
		}
		if(world.getBlock(x + 0, y + 1, z + 1) == EnderpowerBlocks.cursedgrass){
			world.setBlock(x + 0, y + 1, z + 1, EnderpowerBlocks.holygrass);
		}
		if(world.getBlock(x - 1, y + 1, z + 0) == EnderpowerBlocks.cursedgrass){
			world.setBlock(x - 1, y + 1, z + 0, EnderpowerBlocks.holygrass);
		}
		if(world.getBlock(x - 1, y + 1, z + 1) == EnderpowerBlocks.cursedgrass){
			world.setBlock(x - 1, y + 1, z + 1, EnderpowerBlocks.holygrass);
		}
		if(world.getBlock(x - 1, y + 1, z - 1) == EnderpowerBlocks.cursedgrass){
			world.setBlock(x - 1, y + 1, z - 1, EnderpowerBlocks.holygrass);
		}
		
		if(world.getBlock(x + 1, y - 1, z + 1) == EnderpowerBlocks.cursedgrass){
			world.setBlock(x + 1, y - 1, z + 1, EnderpowerBlocks.holygrass);
		}
		if(world.getBlock(x + 1, y - 1, z + 0) == EnderpowerBlocks.cursedgrass){
			world.setBlock(x + 1, y - 1, z + 0, EnderpowerBlocks.holygrass);
		}
		if(world.getBlock(x + 1, y - 1, z - 1) == EnderpowerBlocks.cursedgrass){
			world.setBlock(x + 1, y + 0, z - 1, EnderpowerBlocks.holygrass);
		}
		if(world.getBlock(x + 0, y - 1, z - 1) == EnderpowerBlocks.cursedgrass){
			world.setBlock(x + 0, y - 1, z - 1, EnderpowerBlocks.holygrass);
		}
		if(world.getBlock(x + 0, y - 1, z + 1) == EnderpowerBlocks.cursedgrass){
			world.setBlock(x + 0, y - 1, z + 1, EnderpowerBlocks.holygrass);
		}
		if(world.getBlock(x - 1, y - 1, z + 0) == EnderpowerBlocks.cursedgrass){
			world.setBlock(x - 1, y - 1, z + 0, EnderpowerBlocks.holygrass);
		}
		if(world.getBlock(x - 1, y - 1, z + 1) == EnderpowerBlocks.cursedgrass){
			world.setBlock(x - 1, y - 1, z + 1, EnderpowerBlocks.holygrass);
		}
		if(world.getBlock(x - 1, y - 1, z - 1) == EnderpowerBlocks.cursedgrass){
			world.setBlock(x - 1, y - 1, z - 1, EnderpowerBlocks.holygrass);
		}
		
	}
	

}
