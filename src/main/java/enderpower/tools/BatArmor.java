package enderpower.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BatArmor extends ItemArmor{
	public BatArmor(ArmorMaterial material, int id, int slot) {
		super(material, id, slot);
		this.setCreativeTab(CreativeTabs.tabCombat);


		if(slot == 0) {
			this.setTextureName("enderpower:bathelmet");
		}else if (slot == 1) {
			this.setTextureName("enderpower:batchestplate");
		}else if (slot == 2) {
			this.setTextureName("enderpower:batleggings");
		}else if (slot == 3) {
			this.setTextureName("enderpower:batboots");
		}	
	}


	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type) {
		if (itemstack.getItem() == ToolRegistratie.bathelmet || itemstack.getItem() == ToolRegistratie.batchestplate || itemstack.getItem() == ToolRegistratie.batboots) {  
				return "enderpower:textures/armor/batarmor1.png";
		}else if (itemstack.getItem() == ToolRegistratie.batleggings) {  
			return "enderpower:textures/armor/batarmor2.png";
		}else{
			return null;
		}
	}


	@Override
    public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemStack)
    {
        return false;
    }

    @Override
    public boolean getShareTag()
    {
        return true;
    }

    public boolean hasContainerItem(ItemStack itemStack)
    {
       return true;
    }
    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
        ItemStack stack = itemStack.copy();

        stack.setItemDamage(stack.getItemDamage() - 1);
        stack.stackSize = 1;

        return stack;

    }


}
