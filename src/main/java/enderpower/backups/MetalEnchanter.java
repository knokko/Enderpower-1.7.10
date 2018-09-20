package enderpower.backups;

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
    
    public ItemStack input_iron = new ItemStack(Items.iron_ingot, 0);
    public ItemStack input_powder;
    public ItemStack output;
    
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
    	if(player.getCurrentEquippedItem() != null && !world.isRemote){
    		if(player.getCurrentEquippedItem().getItem() == Items.iron_ingot && input_iron.stackSize < 64){
    			player.getCurrentEquippedItem().stackSize -= 1;
    			input_iron.stackSize += 1;
    		}
    		if(input_powder != null){
    			if(input_powder.stackSize < 64){
    				if(player.getCurrentEquippedItem().getItem() == input_powder.getItem()){
    					player.getCurrentEquippedItem().stackSize -= 1;
    					input_powder.stackSize += 1;
    				}
    			}
    		}
    		else if(input_powder == null){
    			System.out.println("input_powder = null.");
    			if(isValidItem(player)){
    				input_powder = new ItemStack(player.getCurrentEquippedItem().getItem(), 1);
    				player.getCurrentEquippedItem().stackSize -= 1;
    			}
    		}
    	}
    	if(!world.isRemote){
    		System.out.println(input_iron);
    	}
		return true;
    }
    public void onBlockClicked(World world, int x, int y, int z, EntityPlayer player){
    	if(player.getCurrentEquippedItem() != null && !world.isRemote){
    		if(input_iron.stackSize > 0 && player.getCurrentEquippedItem().getItem() == Items.iron_ingot){
    			player.inventory.addItemStackToInventory(new ItemStack(Items.iron_ingot));
    			input_iron.stackSize -= 1;
    		}
    		if(input_powder != null){
    			if(input_powder.getItem() == player.getCurrentEquippedItem().getItem() && input_powder.stackSize > 0 && player.getCurrentEquippedItem().stackSize < 64){
    				input_powder.stackSize -= 1;
    				player.getCurrentEquippedItem().stackSize += 1;
    			}
    		}
    	}
    	else if(player.getCurrentEquippedItem() == null && !world.isRemote){
    		if(input_iron.stackSize > 0){
    			player.inventory.addItemStackToInventory(new ItemStack(Items.iron_ingot, input_iron.stackSize));
    			input_iron.stackSize = 0;
    		}
    		if(input_powder != null){
    			player.inventory.addItemStackToInventory(input_powder);
    			input_powder = null;
    		}
    	}
    }
    public void breakBlock(World world, int x, int y, int z, Block block, int metadata)
    {
    	if(input_iron.stackSize > 0){
    		world.spawnEntityInWorld(new EntityItem(world, x, y, z, input_iron));
    	}
    	if(input_powder != null){
    		world.spawnEntityInWorld(new EntityItem(world, x, y, z, input_powder));
    	}
    	if(output != null){
    		world.spawnEntityInWorld(new EntityItem(world, x, y, z, output));
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
}
