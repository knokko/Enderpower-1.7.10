package enderpower.items;

import enderpower.magic.Magic;
import enderpower.main.Enderpower;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class ManaMeterItem extends Item{
	public ManaMeterItem(){
		super();
		setCreativeTab(Enderpower.enderpowermagicitemstab);
	}
	public ItemStack onItemRightClick(ItemStack itemstack, World world,EntityPlayer player){
		if(!world.isRemote){
		
			player.addChatMessage(new ChatComponentTranslation(EnumChatFormatting.LIGHT_PURPLE + "your mana = " + Magic.get(world).getThauMana()));
			player.addChatMessage(new ChatComponentTranslation(EnumChatFormatting.YELLOW + "your fiemana = " + Magic.get(world).getFieMana()));
			player.addChatMessage(new ChatComponentTranslation(EnumChatFormatting.GREEN + "your geemana = " + Magic.get(world).getGeeMana()));
			player.addChatMessage(new ChatComponentTranslation(EnumChatFormatting.DARK_BLUE + "your doumana = " + Magic.get(world).getDouMana()));
			player.addChatMessage(new ChatComponentTranslation(EnumChatFormatting.DARK_PURPLE + "your endermana = " + Magic.get(world).getEnderMana()));
			player.addChatMessage(new ChatComponentTranslation(EnumChatFormatting.BLUE + "your siemana = " + Magic.get(world).getSieMana()));
		}
		return itemstack;
		
	}
	

}
