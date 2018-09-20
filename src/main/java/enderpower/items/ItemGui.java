package enderpower.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import enderpower.tabs.Enderpowertab;
import enderpower.main.Enderpower;



public class ItemGui extends Item{
	public String data ="mod"+ ":" + this.getClass().getName();
	   public ItemGui()
	    {
	        super();
	        setMaxStackSize(1);
	        setNoRepair();
	        setMaxDamage(150);  
	        this.setUnlocalizedName(data);
	        this.setTextureName(data);
	        this.setCreativeTab(Enderpower.enderpowermagicitemstab);
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

	        stack.setItemDamage(stack.getItemDamage() + 0);
	        stack.stackSize = 1;

	        return stack;

	    }
	    
	    
}
