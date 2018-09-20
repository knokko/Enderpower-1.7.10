package enderpower.blocks;

import java.util.ArrayList;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import enderpower.items.EnderpowerItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class LifePlant2 extends BlockCrops{
	@SideOnly(Side.CLIENT)
    private IIcon[] texture;
    private static final String __OBFID = "CL_00000286";

    /**
     * Gets the block's texture. Args: side, meta
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metadata)
    {
        if (metadata < 7)
        {
            if (metadata == 6)
            {
                metadata = 5;
            }

            return this.texture[metadata >> 1];
        }
        else
        {
            return this.texture[3];
        }
    }

    protected Item func_149866_i()
    {
        return EnderpowerItems.lifeseeds;
    }

    protected Item func_149865_P()
    {
        return EnderpowerItems.gee_dust;
    }

    /**
     * Drops the block items with a specified chance of dropping the specified items
     */
    public void dropBlockAsItemWithChance(World world, int i1, int i2, int i3, int i4, float f1, int i5)
    {
        super.dropBlockAsItemWithChance(world, i1, i2, i3, i4, f1, i5);
    }

    @Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune)
    {
        ArrayList<ItemStack> ret = super.getDrops(world, x, y, z, metadata, fortune);
        if (metadata >= 7 && world.rand.nextInt(50) == 0)
            ret.add(new ItemStack(EnderpowerItems.thau_ball));
        return ret;
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister icon)
    {
        this.texture = new IIcon[4];

        for (int i = 0; i < this.texture.length; ++i)
        {
            this.texture[i] = icon.registerIcon(this.getTextureName() + "_stage_" + i);
        }
    }
}

