package enderpower.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import enderpower.blocks.EnderpowerBlocks;
import enderpower.items.EnderpowerItems;
import enderpower.tools.BatAxe;
import enderpower.tools.ToolRegistratie;

public class EnderpowerShapedCrafting {

	public static void load() {
		
		ItemStack thauballstack = new ItemStack(EnderpowerItems.thau_ball);
		ItemStack siegemstack = new ItemStack(EnderpowerItems.sie_gem);
		ItemStack stickstack = new ItemStack(Items.stick);
		ItemStack thaupowder = new ItemStack(EnderpowerItems.thau_powder);
		ItemStack siepowderstack = new ItemStack(EnderpowerItems.sie_powder);
		ItemStack thaulampstack = new ItemStack(EnderpowerBlocks.thaulamp);
		ItemStack sielampstack = new ItemStack(EnderpowerBlocks.sielamp);
		ItemStack thaulamp2stack = new ItemStack(EnderpowerBlocks.thaulamp2);
		ItemStack sielamp2stack = new ItemStack(EnderpowerBlocks.sielamp2);
		ItemStack stone = new ItemStack(Blocks.stone);
		ItemStack energydrainer = new ItemStack(EnderpowerItems.energy_drainer);
		ItemStack bateye = new ItemStack(EnderpowerItems.bat_eye);
		ItemStack bloodstick = new ItemStack(EnderpowerItems.blood_stick);
		ItemStack battooth = new ItemStack(EnderpowerItems.bat_tooth);
		ItemStack cobblestone = new ItemStack(Blocks.cobblestone);
		ItemStack magicmixer = new ItemStack(EnderpowerItems.magic_mixer);
		ItemStack magicstick = new ItemStack(EnderpowerItems.magic_stick);
		ItemStack glasspane = new ItemStack(Blocks.glass_pane);
		ItemStack batskin = new ItemStack(EnderpowerItems.batskin);
		
		
		
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerBlocks.thaublock) ,"ttt", "ttt", "ttt", 't' , thauballstack);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerBlocks.enderblock) ,"ttt", "ttt", "ttt", 't' , EnderpowerItems.enderdust);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerBlocks.sieblock) ,"sss", "sss", "sss", 's' , siegemstack);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerBlocks.geeblock) ,"sss", "sss", "sss", 's' , EnderpowerItems.gee_dust);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerBlocks.doublock) ,"sss", "sss", "sss", 's' , EnderpowerItems.dou_dust);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerBlocks.fieblock) ,"sss", "sss", "sss", 's' , EnderpowerItems.fie_dust);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerBlocks.geelamp), "p p", " b ", "p p", 'p', EnderpowerItems.gee_powder, 'b', EnderpowerItems.gee_dust);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerBlocks.fielamp), "p p", " b ", "p p", 'p', EnderpowerItems.fie_powder, 'b', EnderpowerItems.fie_dust);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerBlocks.geelamp2, 5), "p p", " p ", "p p", 'p', EnderpowerBlocks.geelamp);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerBlocks.fielamp2, 5), "p p", " p ", "p p", 'p', EnderpowerBlocks.fielamp);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerBlocks.geelamp, 4), "   ", " ll", " ll", 'l', EnderpowerBlocks.geelamp2);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerBlocks.fielamp, 4), "   ", " ll", " ll", 'l', EnderpowerBlocks.fielamp2);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerBlocks.thaulamp), "p p", " b ", "p p", 'p', thaupowder, 'b', thauballstack);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerBlocks.sielamp), "p p", " b ", "p p", 'p', siepowderstack, 'b', siegemstack);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerBlocks.thaulamp2, 5), "p p", " p ", "p p", 'p', thaulampstack);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerBlocks.sielamp2, 5), "p p", " p ", "p p", 'p', sielampstack);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerBlocks.thaulamp, 4), "   ", " ll", " ll", 'l', thaulamp2stack);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerBlocks.sielamp, 4), "   ", " ll", " ll", 'l', sielamp2stack);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerItems.energy_drainer), " tb", " st", "s  ", 'b', bateye, 's', bloodstick, 't', battooth);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerItems.magic_mixer), "   o", " s ", "s  ", 's', magicstick, 'o', EnderpowerItems.thauorb);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerItems.glass_orb), "ggg", "gtg", "ggg", 'g', glasspane, 't', thaupowder);
		GameRegistry.addShapedRecipe(new ItemStack(ToolRegistratie.bataxe), "es ", "tb ", " b ", 'b', bloodstick, 'e', bateye, 's', batskin, 't', battooth);
		GameRegistry.addShapedRecipe(new ItemStack(ToolRegistratie.batsword), " e ", " b ", " s ", 'e', EnderpowerItems.bat_eye, 'b', EnderpowerItems.batskin, 's', EnderpowerItems.blood_stick);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerItems.literbottle, 16), " g ", "g g", "ggg", 'g', Blocks.glass_pane);
		GameRegistry.addShapedRecipe(new ItemStack(ToolRegistratie.batpickaxe), "tes", " b ", " b ", 'b', EnderpowerItems.blood_stick, 't', EnderpowerItems.bat_tooth, 'e', EnderpowerItems.bat_eye, 's', EnderpowerItems.batskin);
		GameRegistry.addShapedRecipe(new ItemStack(ToolRegistratie.bathoe), "te ", " s ", " s ", 's', EnderpowerItems.blood_stick, 't', EnderpowerItems.bat_tooth, 'e', EnderpowerItems.bat_eye);
		GameRegistry.addShapedRecipe(new ItemStack(ToolRegistratie.batboots), "   ", "s s", "s s", 's', EnderpowerItems.batskin);
		GameRegistry.addShapedRecipe(new ItemStack(ToolRegistratie.batleggings), "sss", "s s", "s s", 's', EnderpowerItems.batskin);
		GameRegistry.addShapedRecipe(new ItemStack(ToolRegistratie.batchestplate), "s s", "sss", "sss", 's', EnderpowerItems.batskin);
		GameRegistry.addShapedRecipe(new ItemStack(ToolRegistratie.bathelmet), "sss", "ese", "tst", 's', EnderpowerItems.batskin, 'e', EnderpowerItems.bat_eye, 't', EnderpowerItems.bat_tooth);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerBlocks.thaugenerator), "tet", "ebe", "tet", 't', EnderpowerItems.thau_powder, 'e', EnderpowerItems.enderpowder, 'b', EnderpowerBlocks.thaublock);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerBlocks.geegenerator), "tet", "ebe", "tet", 't', EnderpowerItems.gee_powder, 'e', EnderpowerItems.enderpowder, 'b', EnderpowerBlocks.geeblock);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerBlocks.dougenerator), "tet", "ebe", "tet", 't', EnderpowerItems.dou_powder, 'e', EnderpowerItems.enderpowder, 'b', EnderpowerBlocks.doublock);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerBlocks.fiegenerator), "tet", "ebe", "tet", 't', EnderpowerItems.fie_powder, 'e', EnderpowerItems.enderpowder, 'b', EnderpowerBlocks.fieblock);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerBlocks.siegenerator), "tet", "ebe", "tet", 't', EnderpowerItems.sie_powder, 'e', EnderpowerItems.enderpowder, 'b', EnderpowerBlocks.sieblock);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerBlocks.endergenerator), "tet", "ebe", "tet", 't', EnderpowerItems.enderpowder, 'e', EnderpowerItems.enderpowder, 'b', EnderpowerBlocks.enderblock);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerBlocks.manameter), "tet", "tbt", "tet", 't', EnderpowerItems.thau_powder, 'b', EnderpowerBlocks.thaublock, 'e', EnderpowerItems.enderpowder);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerItems.douorb), "ddd", "dgd", "ddd", 'd', EnderpowerItems.dou_powder, 'g', EnderpowerItems.glass_orb);
		GameRegistry.addShapedRecipe(new ItemStack(ToolRegistratie.douwand), "  o", " s ", "s  ", 's', EnderpowerItems.doustick, 'o', EnderpowerItems.douorb);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerItems.fieorb), "fff", "fgf", "fff", 'f', EnderpowerItems.fie_dust, 'g', EnderpowerItems.glass_orb);
		GameRegistry.addShapedRecipe(new ItemStack(ToolRegistratie.blastwand), "  o", " s ", "s  ", 'o', EnderpowerItems.fieorb, 's', EnderpowerItems.fiestick);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerItems.compressedblastpowder), "bbb", "bbb", "bbb", 'b', EnderpowerItems.blastpowder);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerItems.explosiveorb), "fff", "fgf", "fff", 'f', EnderpowerItems.compressedblastpowder, 'g', EnderpowerItems.glass_orb);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerItems.enderorb), "fff", "fgf", "fff", 'f', EnderpowerItems.enderpowder, 'g', EnderpowerItems.glass_orb);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerItems.cursedorb), "www", "ege", "ddd", 'w', EnderpowerItems.witherpowder, 'e', EnderpowerItems.enderpowder, 'g', EnderpowerItems.glass_orb, 'd', EnderpowerItems.dou_powder);
		GameRegistry.addShapedRecipe(new ItemStack(ToolRegistratie.cavingwand), "  o", " s ", "s  ", 'o', EnderpowerItems.explosiveorb, 's', EnderpowerItems.fiestick);
		GameRegistry.addShapedRecipe(new ItemStack(ToolRegistratie.cursewand), "  o", " s ", "s  ", 's', EnderpowerItems.cursedstick, 'o', EnderpowerItems.cursedorb);
		GameRegistry.addShapedRecipe(new ItemStack(ToolRegistratie.teleporter), "  o", " s ", "s  ", 's', EnderpowerItems.enderstick, 'o', EnderpowerItems.enderorb);
		GameRegistry.addShapedRecipe(new ItemStack(ToolRegistratie.cursedsword), " c ", " c ", " s ", 'c', EnderpowerItems.cursedmetal, 's', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerItems.lightningorb), "fff", "fgf", "fff", 'f', EnderpowerItems.lightningpowder, 'g', EnderpowerItems.glass_orb);
		GameRegistry.addShapedRecipe(new ItemStack(ToolRegistratie.lightningwand), "o  ", " s ", "s  ", 'o', EnderpowerItems.lightningorb, 's', EnderpowerItems.lightningstick);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerItems.geeorb), "fff", "fgf", "fff", 'f', EnderpowerItems.gee_powder, 'g', EnderpowerItems.glass_orb);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerItems.holyorb), "fff", "fgf", "fff", 'f', EnderpowerItems.holypowder, 'g', EnderpowerItems.geeorb);
		GameRegistry.addShapedRecipe(new ItemStack(ToolRegistratie.holywand), "  o", " s ", "s  ", 's', EnderpowerItems.holystick, 'o', EnderpowerItems.holyorb);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerItems.magichandle), "tit", "tit", "tit", 't', EnderpowerItems.thau_powder, 'i', Items.iron_ingot);
		GameRegistry.addShapedRecipe(new ItemStack(ToolRegistratie.thausaber), " t ", " t ", " h ", 'h', EnderpowerItems.magichandle, 't', EnderpowerItems.thau_powder);
		GameRegistry.addShapedRecipe(new ItemStack(ToolRegistratie.fiesaber), " t ", " t ", " h ", 'h', EnderpowerItems.magichandle, 't', EnderpowerItems.fie_powder);
		GameRegistry.addShapedRecipe(new ItemStack(ToolRegistratie.flywand), "  o", " s ", "s  ", 'o', EnderpowerItems.flyorb, 's', EnderpowerItems.flystick);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerItems.thauorb), "fff", "fgf", "fff", 'f', EnderpowerItems.thau_powder, 'g', EnderpowerItems.glass_orb);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerItems.speedorb), "fff", "fgf", "fff", 'f', EnderpowerItems.speedpowder, 'g', EnderpowerItems.glass_orb);
		GameRegistry.addShapedRecipe(new ItemStack(ToolRegistratie.speedwand),"  o", " s ", "s  ", 'o', EnderpowerItems.speedorb, 's', EnderpowerItems.speedstick);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerItems.barrierorb), "fsf", "sgs", "fsf", 'f', EnderpowerItems.thau_powder, 'g', EnderpowerItems.glass_orb, 's', EnderpowerItems.sie_powder);
		GameRegistry.addShapedRecipe(new ItemStack(ToolRegistratie.barrierwand), "  o", " s ", "s  ", 's', EnderpowerItems.barrierstick, 'o', EnderpowerItems.barrierorb);
		
		//sied blocks
		
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerBlocks.sieobsidian), "sss", "sos", "sss", 's', EnderpowerItems.sie_powder, 'o', Blocks.obsidian);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerBlocks.siedstone, 8), "sss", "sds", "sss", 's', Blocks.stone, 'd', EnderpowerItems.sie_powder);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerBlocks.siedcobblestone, 8), "sss", "sds", "sss", 's', Blocks.cobblestone, 'd', EnderpowerItems.sie_powder);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerBlocks.siedstonebricks, 8), "sss", "sds", "sss", 's', Blocks.stonebrick, 'd', EnderpowerItems.sie_powder);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerBlocks.siedoakplanks, 8), "sss", "sds", "sss", 's', new ItemStack(Blocks.planks, 1, 0), 'd', EnderpowerItems.sie_powder);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerBlocks.siedspruceplanks, 8), "sss", "sds", "sss", 's', new ItemStack(Blocks.planks, 1, 1), 'd', EnderpowerItems.sie_powder);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerBlocks.siedbirchplanks, 8), "sss", "sds", "sss", 's', new ItemStack(Blocks.planks, 1, 2), 'd', EnderpowerItems.sie_powder);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerBlocks.siedjungleplanks, 8), "sss", "sds", "sss", 's', new ItemStack(Blocks.planks, 1, 3), 'd', EnderpowerItems.sie_powder);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerBlocks.siedacaciaplanks, 8), "sss", "sds", "sss", 's', new ItemStack(Blocks.planks, 1, 4), 'd', EnderpowerItems.sie_powder);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerBlocks.sieddarkoakplanks, 8), "sss", "sds", "sss", 's', new ItemStack(Blocks.planks, 1, 5), 'd', EnderpowerItems.sie_powder);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerBlocks.siedsandstone, 8), "sss", "sds", "sss", 's', new ItemStack(Blocks.sandstone, 1, 0), 'd', EnderpowerItems.sie_powder);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerBlocks.siedsmoothsandstone, 8), "sss", "sds", "sss", 's', new ItemStack(Blocks.sandstone, 1, 2), 'd', EnderpowerItems.sie_powder);
		GameRegistry.addShapedRecipe(new ItemStack(EnderpowerBlocks.siedchiseledsandstone, 8), "sss", "sds", "sss", 's', new ItemStack(Blocks.sandstone, 1, 2), 'd', EnderpowerItems.sie_powder);
		
	}

}
