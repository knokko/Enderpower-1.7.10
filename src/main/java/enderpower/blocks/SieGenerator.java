package enderpower.blocks;

import enderpower.items.EnderpowerItems;
import enderpower.magic.Magic;
import enderpower.main.Enderpower;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class SieGenerator extends Block {

	protected SieGenerator() {
		super(Material.rock);
		setHardness(3.0F);
		setResistance(2000.0F);
		setCreativeTab(Enderpower.enderpowermagicitemstab);
	}
	public boolean onBlockActivated(World world, int x, int y,int z, EntityPlayer player, int max, float maxX, float p_149727_8_, float p_149727_9_){
		if(player.inventory.hasItem(EnderpowerItems.siefuel)){
			player.inventory.consumeInventoryItem(EnderpowerItems.siefuel);
			Magic.get(world).editMana(20, 0, 5, 0, 0, 50);
		}
		if(!player.inventory.hasItem(EnderpowerItems.siefuel)){
			player.addChatMessage(new ChatComponentTranslation(EnumChatFormatting.RED + "you need sie fuel to use this generator"));
		}
		return true;
		
	}

}
