package enderpower.items;

import enderpower.main.Enderpower;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Poison extends Item{
	public Poison()
    {
        super();
        setMaxStackSize(64);
        setNoRepair();
        this.setCreativeTab(Enderpower.enderpowermagicitemstab);
    }

  
   
	public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer player){
		player.inventory.addItemStackToInventory(new ItemStack(EnderpowerItems.blood));
	}

}
