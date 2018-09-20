package enderpower.tabs;

import enderpower.items.EnderpowerItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Enderpowertab extends CreativeTabs {

	public Enderpowertab(int par1, String par2Str) {
		super(par1, par2Str);
		
	}

	@Override
	public Item getTabIconItem() {
		return EnderpowerItems.thau_ball;
	}

	public String gettranslatedTabLabel() {
		return "enderpowermagicitems";
	}
}
