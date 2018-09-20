package enderpower.tabs;

import enderpower.blocks.EnderpowerBlocks;
import enderpower.items.EnderpowerItems;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class EnderpowerSietab extends CreativeTabs {

	public EnderpowerSietab(int par1, String par2Str) {
		super(par1, par2Str);
		
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(EnderpowerBlocks.sieobsidian);
	}

}
