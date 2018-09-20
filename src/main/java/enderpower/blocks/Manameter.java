package enderpower.blocks;

import enderpower.magic.Magic;
import enderpower.main.Enderpower;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class Manameter extends Block {

	
	protected Manameter() {
		super(Material.rock);
		setCreativeTab(Enderpower.enderpowermagicitemstab);
		
	}
	public boolean onBlockActivated(World world, int x, int y,int z, EntityPlayer player, int max, float maxX, float p_149727_8_, float p_149727_9_){
		if(!world.isRemote){
		player.addChatMessage(new ChatComponentTranslation(EnumChatFormatting.LIGHT_PURPLE + "your mana = " + Magic.get(world).getThauMana()));
		player.addChatMessage(new ChatComponentTranslation(EnumChatFormatting.YELLOW + "your fiemana = " + Magic.get(world).getFieMana()));
		player.addChatMessage(new ChatComponentTranslation(EnumChatFormatting.GREEN + "your geemana = " + Magic.get(world).getGeeMana()));
		player.addChatMessage(new ChatComponentTranslation(EnumChatFormatting.DARK_BLUE + "your doumana = " + Magic.get(world).getDouMana()));
		player.addChatMessage(new ChatComponentTranslation(EnumChatFormatting.DARK_PURPLE + "your endermana = " + Magic.get(world).getEnderMana()));
		player.addChatMessage(new ChatComponentTranslation(EnumChatFormatting.BLUE + "your siemana = " + Magic.get(world).getSieMana()));
		}
		return true;
	}
	

}
