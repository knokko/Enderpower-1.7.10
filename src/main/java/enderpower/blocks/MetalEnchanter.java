package enderpower.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import enderpower.blocks.tileentity.TileEntityMetalEnchanter;
import enderpower.items.EnderpowerItems;
import enderpower.main.R;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class MetalEnchanter extends BlockContainer{
	@SideOnly(Side.CLIENT)
    public IIcon top;
    @SideOnly(Side.CLIENT)
    public IIcon bottom;
    
    public TileEntityMetalEnchanter tileEntity;
    
	public MetalEnchanter() {
		super(Material.rock);
		setHardness(5);
		setResistance(10);
	}
	@Override
	public TileEntity createNewTileEntity(World world, int i) {
		return new TileEntityMetalEnchanter();
	}
	@SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metadata)
    {
		if(side == 0){
			return bottom;
		}
		if(side == 1){
			return top;
		}
		else {
			return blockIcon;
		}
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister icon)
    {
        this.blockIcon = icon.registerIcon(R.T + "metalenchanter_side");
        this.bottom = icon.registerIcon(R.T + "metalenchanter_bottom");
        this.top = icon.registerIcon(R.T + "metalenchanter_top");
    }
    public boolean onBlockActivated(World world, int x, int y,int z, EntityPlayer player, int side, float f1, float f2, float f3){
    	if(tileEntity == null){
    		tileEntity  = (TileEntityMetalEnchanter) world.getTileEntity(x, y, z);
    	}
    	else {
    	if(player.getCurrentEquippedItem() != null && !world.isRemote){
    		if(player.getCurrentEquippedItem().getItem() == Items.iron_ingot && tileEntity.input_iron.stackSize < 64){
    			player.getCurrentEquippedItem().stackSize -= 1;
    			tileEntity.input_iron.stackSize += 1;
    		}
    		if(tileEntity.input_powder != null){
    			if(tileEntity.input_powder.stackSize < 64){
    				if(player.getCurrentEquippedItem().getItem() == tileEntity.input_powder.getItem()){
    					player.getCurrentEquippedItem().stackSize -= 1;
    					tileEntity.input_powder.stackSize += 1;
    				}
    			}
    		}
    		else if(tileEntity.input_powder == null){
    			System.out.println("input_powder = null.");
    			if(isValidItem(player)){
    				tileEntity.input_powder = new ItemStack(player.getCurrentEquippedItem().getItem(), 1);
    				player.getCurrentEquippedItem().stackSize -= 1;
    			}
    		}
    	}
    	if(player.getCurrentEquippedItem() == null && !world.isRemote){
    		if(tileEntity.output != null){
    			System.out.println(  tileEntity.output + " should be added to the inventory");
    			player.inventory.addItemStackToInventory(tileEntity.output);
    		}
    	}
    	if(!world.isRemote){
    		System.out.println(tileEntity.input_iron);
    		System.out.println("tileEntity = " + tileEntity);
    	}
    	}
		return true;
    }
    public void onBlockClicked(World world, int x, int y, int z, EntityPlayer player){
    	if(tileEntity == null){
    		tileEntity = (TileEntityMetalEnchanter) world.getTileEntity(x, y, z);
    	}
    	else {
    	if(player.getCurrentEquippedItem() != null && !world.isRemote){
    		if(tileEntity.input_iron.stackSize > 0 && player.getCurrentEquippedItem().getItem() == Items.iron_ingot){
    			player.inventory.addItemStackToInventory(new ItemStack(Items.iron_ingot));
    			tileEntity.input_iron.stackSize -= 1;
    		}
    		if(tileEntity.input_powder != null){
    			if(tileEntity.input_powder.getItem() == player.getCurrentEquippedItem().getItem() && tileEntity.input_powder.stackSize > 0 && player.getCurrentEquippedItem().stackSize < 64){
    				tileEntity.input_powder.stackSize -= 1;
    				player.getCurrentEquippedItem().stackSize += 1;
    			}
    		}
    		if(tileEntity.output != null){
    			if(tileEntity.output.getItem() == player.getCurrentEquippedItem().getItem()){
    				tileEntity.output.stackSize -= 1;
    				player.getCurrentEquippedItem().stackSize += 1;
    			}
    		}
    	}
    	else if(player.getCurrentEquippedItem() == null && !world.isRemote && tileEntity != null){
    		if(tileEntity.input_iron.stackSize > 0){
    			player.inventory.addItemStackToInventory(new ItemStack(Items.iron_ingot, tileEntity.input_iron.stackSize));
    			tileEntity.input_iron.stackSize = 0;
    		}
    		if(tileEntity.input_powder != null){
    			player.inventory.addItemStackToInventory(tileEntity.input_powder);
    			tileEntity.input_powder = null;
    		}
    		if(tileEntity.output != null){
    			player.inventory.addItemStackToInventory(tileEntity.output);
    			tileEntity.output = null;
    		}
    	}
    	}
    }
    public void breakBlock(World world, int x, int y, int z, Block block, int metadata)
    {
    	if(tileEntity != null){
    		if(tileEntity.input_iron.stackSize > 0){
    		world.spawnEntityInWorld(new EntityItem(world, x, y, z, tileEntity.input_iron));
    		}
    		if(tileEntity.input_powder != null){
    		world.spawnEntityInWorld(new EntityItem(world, x, y, z, tileEntity.input_powder));
    		}
    		if(tileEntity.output != null){
    		world.spawnEntityInWorld(new EntityItem(world, x, y, z, tileEntity.output));
    		}
    	}
        super.breakBlock(world, x, y, z, block, metadata);
    }
    public boolean isValidItem(EntityPlayer player){
    	if(player.getCurrentEquippedItem().getItem() == EnderpowerItems.cursedpowder || player.getCurrentEquippedItem().getItem() == EnderpowerItems.poison || player.getCurrentEquippedItem().getItem() == EnderpowerItems.witherpowder){
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    @Override
    public void onPostBlockPlaced(World world, int x, int y, int z, int meta){
    	if(world.getTileEntity(x, y, z) != null){
    		tileEntity = (TileEntityMetalEnchanter) world.getTileEntity(x, y, z);
    	}
    }
}
