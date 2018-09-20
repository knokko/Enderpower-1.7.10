package enderpower.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class BatSword extends ItemSword{

	public BatSword(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		setCreativeTab(CreativeTabs.tabCombat);

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
