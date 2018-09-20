package enderpower.tools;

import cpw.mods.fml.common.registry.GameRegistry;
import enderpower.main.R;
import enderpower.wands.BarrierWand;
import enderpower.wands.BlastWand;
import enderpower.wands.CavingWand;
import enderpower.wands.CurseWand;
import enderpower.wands.DestructionWand;
import enderpower.wands.DouWand;
import enderpower.wands.FlyWand;
import enderpower.wands.HolyWand;
import enderpower.wands.LightningWand;
import enderpower.wands.NecromancyWand;
import enderpower.wands.SpeedWand;
import enderpower.wands.Teleporter;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ToolRegistratie {
	
	public static Item bataxe;
	public static Item batsword;
	public static Item batspade;
	public static Item batpickaxe;
	public static Item bathoe;
	
	public static Item cursedsword;
	public static Item thausaber;
	public static Item fiesaber;
	public static Item enderblade;
	
	
	//armor
	
	public static Item bathelmet;
	public static Item batchestplate;
	public static Item batleggings;
	public static Item batboots;
	
	
	public static int bathelmetID;
	public static int batchestplateID;
	public static int batleggingsID;
	public static int batbootsID;
	
	
	//wands
	
	public static Item blastwand;
	public static Item douwand;
	public static Item cavingwand;
	public static Item destructionwand;
	public static Item lightningwand;
	public static Item cursewand;
	public static Item teleporter;
	public static Item holywand;
	public static Item flywand;
	public static Item speedwand;
	public static Item barrierwand;
	public static Item necromancywand;
	
	
	public static void RegisterItem(){
	GameRegistry.registerItem(bataxe, "bat_axe");
	GameRegistry.registerItem(batsword, "batsword");
	GameRegistry.registerItem(batspade, "batspade");
	GameRegistry.registerItem(batpickaxe, "batpickaxe");
	GameRegistry.registerItem(bathoe, "bathoe");
	
	GameRegistry.registerItem(cursedsword, "cursedsword");
	GameRegistry.registerItem(thausaber, "thausaber");
	GameRegistry.registerItem(fiesaber, "fiesaber");
	GameRegistry.registerItem(enderblade, "enderblade");
	
	//armor
	
	GameRegistry.registerItem(bathelmet, "bathelmet");
	GameRegistry.registerItem(batchestplate, "batchestplate");
	GameRegistry.registerItem(batleggings, "batleggings");
	GameRegistry.registerItem(batboots, "batboots");
	
	
	
	//wands
	
	GameRegistry.registerItem(blastwand, "blastwand");
	GameRegistry.registerItem(douwand, "douwand");
	GameRegistry.registerItem(cavingwand, "cavingwand");
	GameRegistry.registerItem(destructionwand, "destructionwand");
	GameRegistry.registerItem(lightningwand, "lightningwand");
	GameRegistry.registerItem(cursewand, "cursewand");
	GameRegistry.registerItem(teleporter, "teleporter");
	GameRegistry.registerItem(holywand, "holywand");
	GameRegistry.registerItem(flywand, "flywand");
	GameRegistry.registerItem(speedwand, "speedwand");
	GameRegistry.registerItem(barrierwand, "barrierwand");
	GameRegistry.registerItem(necromancywand, "necromancywand");
	
	
	}
	
	public static void load(){
	bataxe = new BatAxe(BatMaterial).setUnlocalizedName("bat axe").setTextureName(R.T + "bataxe");
	batsword = new BatSword(BatMaterial).setUnlocalizedName("bat sword").setTextureName(R.T + "batsword");
	batspade = new BatShovel(BatMaterial).setUnlocalizedName("bat spade").setTextureName(R.T + "batspade");
	batpickaxe = new BatPickaxe(BatMaterial).setUnlocalizedName("batpickaxe").setTextureName(R.T + "batpickaxe");
	bathoe = new Bathoe(BatMaterial).setUnlocalizedName("bat hoe").setTextureName(R.T + "bathoe");
	
	cursedsword = new CursedSword(ToolMaterial.IRON).setUnlocalizedName("cursedsword").setTextureName(R.T + "cursedsword");
	thausaber = new ThauSaber().setTextureName(R.T + "thausaber").setUnlocalizedName("thausaber").setCreativeTab(CreativeTabs.tabCombat);
	fiesaber = new FieSaber().setTextureName(R.T + "fiesaber").setUnlocalizedName("fiesaber").setCreativeTab(CreativeTabs.tabCombat);
	enderblade = new EnderBlade().setTextureName(R.T + "enderblade").setUnlocalizedName("enderblade").setCreativeTab(CreativeTabs.tabCombat);
	
	//armor
	
	bathelmet = new BatArmor(BatArmorMaterial, bathelmetID, 0).setUnlocalizedName("bathelmet");
	batchestplate = new BatArmor(BatArmorMaterial, batchestplateID, 1).setUnlocalizedName("batchestplate");
	batleggings = new BatArmor(BatArmorMaterial, batleggingsID, 2).setUnlocalizedName("batleggings");
	batboots = new BatArmor(BatArmorMaterial, batbootsID, 3).setUnlocalizedName("batboots");


	
	
	//wands
	
	blastwand = new BlastWand().setUnlocalizedName("blastwand").setTextureName(R.T + "blastwand");
	douwand = new DouWand().setUnlocalizedName("douwand").setTextureName(R.T + "douwand").setCreativeTab(CreativeTabs.tabCombat);
	cavingwand = new CavingWand().setUnlocalizedName("cavingwand").setTextureName(R.T + "cavingwand");
	destructionwand = new DestructionWand().setUnlocalizedName("destructionwand").setTextureName(R.T + "destructionwand");
	lightningwand = new LightningWand().setUnlocalizedName("lightningwand").setTextureName(R.T + "lightningwand").setCreativeTab(CreativeTabs.tabCombat);
	cursewand = new CurseWand().setUnlocalizedName("cursewand").setTextureName(R.T + "cursewand");
	teleporter = new Teleporter().setUnlocalizedName("teleporter").setTextureName(R.T + "teleporter");
	holywand = new HolyWand().setCreativeTab(CreativeTabs.tabTools).setTextureName(R.T + "holywand").setUnlocalizedName("holywand");
	flywand = new FlyWand().setUnlocalizedName("flywand").setTextureName(R.T + "flywand").setCreativeTab(CreativeTabs.tabTools);
	speedwand = new SpeedWand().setUnlocalizedName("speedwand").setTextureName(R.T + "speedwand").setCreativeTab(CreativeTabs.tabTools);
	barrierwand = new BarrierWand().setUnlocalizedName("barrierwand").setTextureName(R.T + "barrierwand").setCreativeTab(CreativeTabs.tabTools);
	necromancywand = new NecromancyWand().setUnlocalizedName("necromancywand").setTextureName(R.T + "necromancywand").setCreativeTab(CreativeTabs.tabTools);
	}
	
	//Materials
	public static ToolMaterial BatMaterial = EnumHelper.addToolMaterial("bat material", 1, 225, 3.5F, 1.0F, 15);
	
	public static ArmorMaterial BatArmorMaterial = EnumHelper.addArmorMaterial("BatArmorMaterial", 20, new int[] {2, 4, 3, 1}, 10);
	

}
