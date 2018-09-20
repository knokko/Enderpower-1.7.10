package enderpower.backups;

import enderpower.blocks.EnderpowerBlocks;
import enderpower.backups.MetalEnchanter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityMetalEnchanter extends TileEntity{
	public MetalEnchanter enchanter;
	public Item powder;
	public int amountPowder;
	public int amountIron;
	public int ticksExisted;
	public ItemStack[] itemstack = new ItemStack[3];
	
	public void updateEntity(){
		if(enchanter == null && worldObj.getBlock(xCoord, yCoord, zCoord) == EnderpowerBlocks.metalenchanter){
			enchanter = (MetalEnchanter) worldObj.getBlock(xCoord, yCoord, zCoord);
		}
		if(enchanter != null && !worldObj.isRemote){
			if(enchanter.input_powder != null){
				if(enchanter.input_powder.stackSize < 1){
					enchanter.input_powder = null;
				}
			}
			if(enchanter.input_iron != null && amountIron > 0){
				if(enchanter.input_iron.stackSize == 0 && ticksExisted <= 5){
					enchanter.input_iron.stackSize = amountIron;
				}
			}
			if(enchanter.input_iron != null){
				if(enchanter.input_iron.stackSize > 0 || ticksExisted >= 5){
					amountIron = enchanter.input_iron.stackSize;
				}
			}
			if(enchanter.input_powder == null && amountPowder > 0 && ticksExisted < 5 && powder != null){
				enchanter.input_powder = new ItemStack(powder, amountPowder);
			}
			System.out.println("amountIron = " + amountIron);
			System.out.println(powder);
			System.out.println(amountPowder);
		}
		++ticksExisted;
	}
	public void writeToNBT(NBTTagCompound nbt){
		super.writeToNBT(nbt);
		if(enchanter != null){
			if(enchanter.input_iron != null){
				if(enchanter.input_iron.stackSize > 0){
					nbt.setInteger("amountIron", enchanter.input_iron.stackSize);
				}
			}
			if(enchanter.input_powder != null){
				nbt.setInteger("amountPowder", enchanter.input_powder.stackSize);
				nbt.setInteger("itemPowder", Item.getIdFromItem(enchanter.input_powder.getItem()));
			}
		}
	}
	public void readFromNBT(NBTTagCompound nbt){
		super.readFromNBT(nbt);
		amountIron = nbt.getInteger("amountIron");
		if(nbt.getInteger("itemPowder") != 0){
			powder = Item.getItemById(nbt.getInteger("itemPowder"));
			amountPowder = nbt.getInteger("amountPowder");
		}
	}
}
