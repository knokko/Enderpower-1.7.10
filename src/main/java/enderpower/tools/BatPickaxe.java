package enderpower.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class BatPickaxe extends ItemPickaxe{

	protected BatPickaxe(ToolMaterial p_i45347_1_) {
		super(p_i45347_1_);
		setCreativeTab(CreativeTabs.tabTools);
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
