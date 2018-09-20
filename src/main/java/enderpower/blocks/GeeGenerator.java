package enderpower.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import enderpower.items.EnderpowerItems;
import enderpower.magic.Magic;
import enderpower.main.Enderpower;

public class GeeGenerator extends Block{
	
	protected GeeGenerator() {
		
		super(Material.cloth);
		setCreativeTab(Enderpower.enderpowermagicitemstab);
		
	}
	public boolean onBlockActivated(World world, int x, int y,int z, EntityPlayer player, int max, float maxX, float p_149727_8_, float p_149727_9_){
		if(player.inventory.hasItem(EnderpowerItems.geefuel)){
			player.inventory.consumeInventoryItem(EnderpowerItems.geefuel);
			Magic.get(world).editMana(25, 50, 0, 0, 0, 0);
		}
		if(!player.inventory.hasItem(EnderpowerItems.geefuel)){
			player.addChatMessage(new ChatComponentTranslation(EnumChatFormatting.RED + "you need gee fuel to use this generator"));
		}
		return true;
		
	}

}
