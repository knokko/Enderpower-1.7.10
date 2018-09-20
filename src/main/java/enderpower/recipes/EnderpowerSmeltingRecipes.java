package enderpower.recipes;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import enderpower.blocks.EnderpowerBlocks;
import enderpower.items.EnderpowerItems;

public class EnderpowerSmeltingRecipes {

	public static void load() {
		
		GameRegistry.addSmelting(EnderpowerBlocks.thauore, new ItemStack(EnderpowerItems.thau_ball, 1), 1.5f);
		GameRegistry.addSmelting(EnderpowerBlocks.sieore, new ItemStack(EnderpowerItems.sie_gem, 1), 1.5f);
		GameRegistry.addSmelting(EnderpowerBlocks.douore, new ItemStack(EnderpowerItems.dou_dust), 1.5f);
		GameRegistry.addSmelting(EnderpowerBlocks.geeore, new ItemStack(EnderpowerItems.gee_dust), 1.5f);
		GameRegistry.addSmelting(EnderpowerBlocks.fieore, new ItemStack(EnderpowerItems.fie_dust), 1.5F);
		GameRegistry.addSmelting(EnderpowerBlocks.enderore, new ItemStack(EnderpowerItems.endergem), 1.5F);
		
		
		
		EnderpowerShapelessCrafting.load();
		EnderpowerShapedCrafting.load();
		BatArmorCrafting.load();
	}

}
