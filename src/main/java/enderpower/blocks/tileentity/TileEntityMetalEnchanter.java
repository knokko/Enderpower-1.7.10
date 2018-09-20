package enderpower.blocks.tileentity;

import enderpower.blocks.EnderpowerBlocks;
import enderpower.blocks.MetalEnchanter;
import enderpower.items.EnderpowerItems;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class TileEntityMetalEnchanter extends TileEntity{
	public MetalEnchanter enchanter;
	
	public void updateEntity(){
		if(input_powder != null){
			if(input_powder.stackSize < 1){
				input_powder = null;
			}
		}
		if(output != null){
			if(output.stackSize < 1){
				output = null;
			}
		}
		if(!worldObj.isRemote){
			System.out.println(input_iron);
			System.out.println(input_powder);
			System.out.println(output);
		}
		if(enchanter == null){
			enchanter = (MetalEnchanter) worldObj.getBlock(xCoord, yCoord, zCoord);
		}
		if(enchanter != null){
			enchanter.tileEntity = this;
		}
		if(input_iron == null){
			input_iron = new ItemStack(Items.iron_ingot, 0);
		}
		if(input_iron != null && input_powder != null){
			if(input_iron.stackSize > 0 && input_powder.stackSize > 0){
				if(enchantTime < 100){
					++enchantTime;
				}
				else {
					if(input_powder.getItem() == EnderpowerItems.cursedpowder){
						if(output == null){
							output = new ItemStack(EnderpowerItems.cursedmetal);
							input_iron.stackSize -= 1;
							input_powder.stackSize -= 1;
							enchantTime = 0;
						}
						else if(output != null){
							if(output.getItem() == EnderpowerItems.cursedmetal){
								output.stackSize += 1;
								input_iron.stackSize -= 1;
								input_powder.stackSize -= 1;
								enchantTime = 0;
							}
						}
					}
				}
			}
			else {
				enchantTime = 0;
			}
		}
		else {
			enchantTime = 0;
		}
	}
	public void writeToNBT(NBTTagCompound nbt){
		super.writeToNBT(nbt);
		if(input_iron != null){
			nbt.setInteger("Iron", input_iron.stackSize);
		}
		if(input_powder != null){
			nbt.setInteger("powder", Item.getIdFromItem(input_powder.getItem()));
			nbt.setInteger("amountPowder", input_powder.stackSize);
		}
	}
	public void readFromNBT(NBTTagCompound nbt){
		super.readFromNBT(nbt);
		input_iron = new ItemStack(Items.iron_ingot, nbt.getInteger("Iron"));
		if(nbt.getInteger("powder") > 0){
			input_powder = new ItemStack(Item.getItemById(nbt.getInteger("powder")), nbt.getInteger("amountPowder"));
		}
	}
	
    public ItemStack input_iron;
    public ItemStack input_powder;
    public ItemStack output;
    public int enchantTime;
    
}
