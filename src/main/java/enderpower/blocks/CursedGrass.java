package enderpower.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import enderpower.main.R;
import enderpower.main.Enderpower;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.IIcon;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class CursedGrass extends Block {
	
	
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
    public IIcon getIcon(IBlockAccess blockaccess, int x, int y, int z, int p_149673_5_)
    
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
            Material material = blockaccess.getBlock(x, y + 1, z).getMaterial();
            return material != Material.snow && material != Material.craftedSnow ? this.blockIcon : this.field_149993_M;
        }
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconregister)
    {
        this.blockIcon = iconregister.registerIcon(this.getTextureName() + "_side");
        this.field_149991_b = iconregister.registerIcon(this.getTextureName() + "_top");
        this.field_149993_M = iconregister.registerIcon(this.getTextureName() + "_side");
        this.field_149994_N = iconregister.registerIcon(this.getTextureName() + "_side_overlay");
    }
	
	
	protected CursedGrass() {
		super(Material.grass);
		this.setTickRandomly(true);
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(0.6F);
		setStepSound(soundTypeGravel);
		setResistance(1000.0F);
	}
	@Override
	public void onBlockClicked(World world, int x, int y, int z, EntityPlayer player){
		player.addPotionEffect(new PotionEffect(20, 600, 1));
		
	}
	
	@Override
	public void updateTick(World world, int x, int y, int z, Random random){
		if(world.getBlock(x + 1, y, z) == Blocks.grass || world.getBlock(x + 1, y, z) == Blocks.dirt || world.getBlock(x + 1, y, z) == Blocks.mycelium){
			world.setBlock(x + 1, y, z, EnderpowerBlocks.cursedgrass);
		}
		if(world.getBlock(x - 1, y, z) == Blocks.grass || world.getBlock(x - 1, y, z) == Blocks.dirt || world.getBlock(x - 1, y, z) == Blocks.mycelium){
			world.setBlock(x - 1, y, z, EnderpowerBlocks.cursedgrass);
		}
		if(world.getBlock(x + 1, y, z + 1) == Blocks.grass || world.getBlock(x + 1, y, z + 1) == Blocks.dirt || world.getBlock(x + 1, y, z + 1) == Blocks.mycelium){
			world.setBlock(x + 1, y, z + 1, EnderpowerBlocks.cursedgrass);
		}
		if(world.getBlock(x - 1, y, z + 1) == Blocks.grass || world.getBlock(x - 1, y, z + 1) == Blocks.dirt || world.getBlock(x - 1, y, z + 1) == Blocks.mycelium){
			world.setBlock(x - 1, y, z + 1, EnderpowerBlocks.cursedgrass);
		}
		if(world.getBlock(x + 1, y, z - 1) == Blocks.grass || world.getBlock(x + 1, y, z - 1) == Blocks.dirt || world.getBlock(x + 1, y, z - 1) == Blocks.mycelium){
			world.setBlock(x + 1, y, z - 1, EnderpowerBlocks.cursedgrass);
		}
		if(world.getBlock(x - 1, y, z - 1) == Blocks.grass || world.getBlock(x - 1, y, z - 1) == Blocks.dirt || world.getBlock(x - 1, y, z - 1) == Blocks.mycelium){
			world.setBlock(x - 1, y, z - 1, EnderpowerBlocks.cursedgrass);
		}
		
		
		if(world.getBlock(x, y + 1, z) == Blocks.grass || world.getBlock(x, y + 1, z) == Blocks.dirt || world.getBlock(x, y + 1, z) == Blocks.mycelium){
			world.setBlock(x, y + 1, z, EnderpowerBlocks.cursedgrass);
		}
		if(world.getBlock(x + 1, y + 1, z) == Blocks.grass || world.getBlock(x + 1, y + 1, z) == Blocks.dirt || world.getBlock(x + 1, y + 1, z) == Blocks.mycelium){
			world.setBlock(x + 1, y + 1, z, EnderpowerBlocks.cursedgrass);
		}
		if(world.getBlock(x - 1, y + 1, z) == Blocks.grass || world.getBlock(x - 1, y + 1, z) == Blocks.dirt || world.getBlock(x - 1, y + 1, z) == Blocks.mycelium){
			world.setBlock(x - 1, y + 1, z, EnderpowerBlocks.cursedgrass);
		}
		if(world.getBlock(x + 1, y + 1, z + 1) == Blocks.grass || world.getBlock(x + 1, y + 1, z + 1) == Blocks.dirt || world.getBlock(x + 1, y + 1, z + 1) == Blocks.mycelium){
			world.setBlock(x + 1, y + 1, z + 1, EnderpowerBlocks.cursedgrass);
		}
		if(world.getBlock(x - 1, y + 1, z + 1) == Blocks.grass || world.getBlock(x - 1, y + 1, z + 1) == Blocks.dirt || world.getBlock(x - 1, y + 1, z + 1) == Blocks.mycelium){
			world.setBlock(x - 1, y + 1, z + 1, EnderpowerBlocks.cursedgrass);
		}
		if(world.getBlock(x + 1, y + 1, z - 1) == Blocks.grass || world.getBlock(x + 1, y + 1, z - 1) == Blocks.dirt || world.getBlock(x + 1, y + 1, z - 1) == Blocks.mycelium){
			world.setBlock(x + 1, y + 1, z - 1, EnderpowerBlocks.cursedgrass);
		}
		if(world.getBlock(x - 1, y + 1, z - 1) == Blocks.grass || world.getBlock(x - 1, y + 1, z - 1) == Blocks.dirt || world.getBlock(x - 1, y + 1, z - 1) == Blocks.mycelium){
			world.setBlock(x - 1, y + 1, z - 1, EnderpowerBlocks.cursedgrass);
		}
		
		
		if(world.getBlock(x, y - 1, z) == Blocks.grass || world.getBlock(x, y - 1, z) == Blocks.dirt || world.getBlock(x, y - 1, z) == Blocks.mycelium){
			world.setBlock(x, y - 1, z, EnderpowerBlocks.cursedgrass);
		}
		if(world.getBlock(x + 1, y - 1, z) == Blocks.grass || world.getBlock(x + 1, y - 1, z) == Blocks.dirt || world.getBlock(x + 1, y - 1, z) == Blocks.mycelium){
			world.setBlock(x + 1, y - 1, z, EnderpowerBlocks.cursedgrass);
		}
		if(world.getBlock(x - 1, y - 1, z) == Blocks.grass || world.getBlock(x - 1, y - 1, z) == Blocks.dirt || world.getBlock(x - 1, y - 1, z) == Blocks.mycelium){
			world.setBlock(x - 1, y - 1, z, EnderpowerBlocks.cursedgrass);
		}
		if(world.getBlock(x + 1, y - 1, z + 1) == Blocks.grass || world.getBlock(x + 1, y - 1, z + 1) == Blocks.dirt || world.getBlock(x + 1, y - 1, z + 1) == Blocks.mycelium){
			world.setBlock(x + 1, y - 1, z + 1, EnderpowerBlocks.cursedgrass);
		}
		if(world.getBlock(x - 1, y - 1, z + 1) == Blocks.grass || world.getBlock(x - 1, y - 1, z + 1) == Blocks.dirt || world.getBlock(x - 1, y - 1, z + 1) == Blocks.mycelium){
			world.setBlock(x - 1, y - 1, z + 1, EnderpowerBlocks.cursedgrass);
		}
		if(world.getBlock(x + 1, y - 1, z - 1) == Blocks.grass || world.getBlock(x + 1, y - 1, z - 1) == Blocks.dirt || world.getBlock(x + 1, y - 1, z - 1) == Blocks.mycelium){
			world.setBlock(x + 1, y - 1, z - 1, EnderpowerBlocks.cursedgrass);
		}
		if(world.getBlock(x - 1, y - 1, z - 1) == Blocks.grass || world.getBlock(x - 1, y - 1, z - 1) == Blocks.dirt || world.getBlock(x - 1, y - 1, z - 1) == Blocks.mycelium){
			world.setBlock(x - 1, y - 1, z - 1, EnderpowerBlocks.cursedgrass);
		}
		if(world.getBlock(x, y + 1, z) == Blocks.tallgrass || world.getBlock(x, y + 1, z) == Blocks.dirt || world.getBlock(x, y + 1, z) == Blocks.mycelium){
			world.setBlock(x, y + 1, z, Blocks.air);
		}
		if(world.getBlock(x, y + 1, z) == Blocks.double_plant){
			world.setBlock(x, y + 1, z, Blocks.air);
		}
		if(world.getBlock(x, y + 2, z) == Blocks.double_plant){
			world.setBlock(x, y + 2, z, Blocks.air);
		}
		
	}
	
	@Override
	public void onEntityWalking(World world, int x, int y, int z, Entity entity){
		((EntityLivingBase) entity).addPotionEffect(new PotionEffect(20, 400, 0, true));

	}
	@Override
	public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int q){
		world.spawnEntityInWorld(new EntityLightningBolt(world, x, y,z));
		world.setWorldTime(18000);
		
	}
	
	
	public void onBlockDestroyedByExplosion(World world, int x, int y, int z, Explosion explosion){
		world.spawnEntityInWorld(new EntitySkeleton(world));

		world.setWorldTime(18000);
	}
	
	

}
