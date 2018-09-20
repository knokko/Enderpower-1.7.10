package enderpower.blocks;

import enderpower.items.EnderpowerItems;
import enderpower.magic.Magic;
import enderpower.main.Enderpower;
import enderpower.tools.ToolRegistratie;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class ThauGenerator extends Block {

	protected ThauGenerator() {
		super(Material.cloth);
		setCreativeTab(Enderpower.enderpowermagicitemstab);
		
	}
	public boolean onBlockActivated(World world, int x, int y,int z, EntityPlayer player, int max, float maxX, float p_149727_8_, float p_149727_9_){
		if(player.inventory.hasItem(EnderpowerItems.magicfuel)){
			player.inventory.consumeInventoryItem(EnderpowerItems.magicfuel);
			Magic.get(world).editMana(50, 10, 10, 10, 10, 10);
		}
		if(!player.inventory.hasItem(EnderpowerItems.magicfuel)){
			player.addChatMessage(new ChatComponentTranslation(EnumChatFormatting.RED + "you need magic fuel to use this generator"));
		}
		return true;
		
	}

}
