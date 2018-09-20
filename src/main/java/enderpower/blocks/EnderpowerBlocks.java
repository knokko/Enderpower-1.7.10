package enderpower.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import enderpower.main.R;
import enderpower.main.Enderpower;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

public class EnderpowerBlocks {
	
	

	public static void load() {
		
		thauore = new enderpowerore().setBlockTextureName(R.T + R.UNLOCALIZED_BLOCK_THAUORE).setBlockName(R.T + R.UNLOCALIZED_BLOCK_THAUORE);
		sieore = new Enderpowersieore().setBlockTextureName(R.T + R.UNLOCALIZED_BLOCK_SIEORE).setBlockName(R.T + R.UNLOCALIZED_BLOCK_SIEORE);
		thaublock = new Thaublock().setBlockTextureName(R.T + R.UNLOCALIZED_BLOCK_THAUBLOCK).setBlockName(R.T + R.UNLOCALIZED_BLOCK_THAUBLOCK);
		sieblock = new SieBlock().setBlockTextureName(R.T + R.UNLOCALIZED_BLOCK_SIEBLOCK).setBlockName(R.T + R.UNLOCALIZED_BLOCK_SIEBLOCK);
		thaulamp = new ThauLamp().setBlockTextureName(R.T + R.UNLOCALIZED_BLOCK_THAULAMP).setBlockName(R.T + R.UNLOCALIZED_BLOCK_THAULAMP);
		sielamp = new SieLamp().setBlockTextureName(R.T + R.UNLOCALIZED_BLOCK_SIELAMP).setBlockName(R.T + R.UNLOCALIZED_BLOCK_SIELAMP);
		thaulamp2 = new ThauLamp().setBlockTextureName(R.T + R.UNLOCALIZED_BLOCK_THAULAMP2).setBlockName(R.T + R.UNLOCALIZED_BLOCK_THAULAMP2);
		sielamp2 = new SieLamp().setBlockTextureName(R.T + R.UNLOCALIZED_BLOCK_SIELAMP2).setBlockName(R.T + R.UNLOCALIZED_BLOCK_SIELAMP2);
		douore = new Douore().setBlockTextureName(R.T + R.DOUORE).setBlockName(R.T + R.DOUORE);
		geeore = new GeeOre().setBlockTextureName(R.T + "geeore").setBlockName("geeore");
		test = new TestBlock().setBlockTextureName(R.T + "geeblock").setBlockName("test").setCreativeTab(CreativeTabs.tabMisc);
		sieobsidian = new SieObsidian().setBlockTextureName(R.T + "sieobsidian").setBlockName("sieobsidian");
		siedstone = new SiedStone().setBlockTextureName(R.T + "siedstone").setBlockName("siedstone");
		siedcobblestone = new SiedStone().setBlockTextureName(R.T + "siedcobblestone").setBlockName("siedcobblestone");
		siedstonebricks = new SiedStone().setBlockTextureName(R.T + "siedstonebricks").setBlockName("siedstonebricks");
		siedoakplanks = new SiedWood().setBlockTextureName(R.T + "siedoakplanks").setBlockName("siedoakplanks");
		siedspruceplanks = new SiedWood().setBlockTextureName(R.T + "siedspruceplanks").setBlockName("siedspruceplanks");
		siedbirchplanks = new SiedWood().setBlockTextureName(R.T + "siedbirchplanks").setBlockName("siedbirchplanks");
		siedjungleplanks = new SiedWood().setBlockTextureName(R.T + "siedjungleplanks").setBlockName("siedjungleplanks");
		siedacaciaplanks = new SiedWood().setBlockTextureName(R.T + "siedacaciaplanks").setBlockName("siedacaciaplanks");
		sieddarkoakplanks = new SiedWood().setBlockTextureName(R.T + "sieddarkoakplanks").setBlockName("sieddarkoakplanks");
		siedsandstone = new SiedStone().setBlockTextureName("minecraft:sandstone_normal").setBlockName("siedsandstone");
		siedsmoothsandstone = new SiedStone().setBlockTextureName("minecraft:sandstone_smooth").setBlockName("siedsmoothsandstone");
		siedchiseledsandstone = new SiedStone().setBlockTextureName("minecraft:sandstone_carved").setBlockName("siedchiseledsandstone");
		fieore = new FieOre().setBlockTextureName(R.T + "fieore").setBlockName("fieore");
		geeblock = new Thaublock().setBlockTextureName(R.T + "geeblock").setBlockName("geeblock");
		doublock = new Thaublock().setBlockTextureName(R.T + "doublock").setBlockName("doublock");
		fieblock = new Thaublock().setBlockTextureName(R.T + "fieblock").setBlockName("fieblock");
		fielamp = new ThauLamp().setBlockTextureName(R.T + "fielamp").setBlockName("fielamp");
		fielamp2 = new ThauLamp().setBlockTextureName(R.T + "fielamp2").setBlockName("fielamp2");
		geelamp = new ThauLamp().setBlockTextureName(R.T + "geelamp").setBlockName("geelamp");
		geelamp2 = new ThauLamp().setBlockTextureName(R.T + "geelamp2").setBlockName("geelamp2");
		manameter = new Manameter().setBlockTextureName(R.T + "manameter").setBlockName("manameter");
		thaugenerator = new ThauGenerator().setBlockTextureName(R.T + "thaugenerator").setBlockName("thaugenerator");
		geegenerator = new GeeGenerator().setBlockTextureName(R.T + "geegenerator").setBlockName("geegenerator");
		dougenerator = new DouGenerator().setBlockTextureName(R.T + "dougenerator").setBlockName("dougenerator");
		fiegenerator = new FieGenerator().setBlockTextureName(R.T + "fiegenerator").setBlockName("fiegenerator");
		endergenerator = new EnderGenerator().setBlockTextureName(R.T + "endergenerator").setBlockName("endergenerator");
		enderblock = new Thaublock().setBlockTextureName(R.T + "enderblock").setBlockName("enderblock");
		cursedgrass = new CursedGrass().setBlockName("cursedgrass").setBlockTextureName(R.T + "cursedgrass");
		enderore = new EnderOre().setBlockName("enderore").setBlockTextureName(R.T + "enderore");
		fakeair = new FakeAir().setBlockName("fakeair").setBlockTextureName("minecraft:air").setCreativeTab(CreativeTabs.tabAllSearch);
		holygrass = new HolyGrass().setBlockName("holygrass").setBlockTextureName(R.T + "holygrass");
		siegenerator = new SieGenerator().setBlockName("siegenerator").setBlockTextureName(R.T + "siegenerator");
		thaubarrier = new Barrier().setBlockName("thaubarrier").setBlockTextureName(R.T + "thaubarrier");
		lifeplant = new LifePlant2().setBlockName("lifeplant").setBlockTextureName(R.T + "lifeplant");
		moondrainer = new Moondrainer().setBlockName("moondrainer").setBlockTextureName(R.T + "moondrainer").setCreativeTab(Enderpower.enderpowermagicitemstab);
		gravitybrickS = new GravityBrickS().setBlockName("gravitybricks").setBlockTextureName(R.T + "gravitybrick").setCreativeTab(Enderpower.enderpowermagicitemstab);
		gravitybrickN = new GravityBrickN().setBlockName("gravitybrickn").setBlockTextureName(R.T + "gravitybrick").setCreativeTab(Enderpower.enderpowermagicitemstab);
		gravitybrickW = new GravityBrickW().setBlockName("gravitybrickw").setBlockTextureName(R.T + "gravitybrick").setCreativeTab(Enderpower.enderpowermagicitemstab);
		gravitybrickE = new GravityBrickE().setBlockName("gravitybricke").setBlockTextureName(R.T + "gravitybrick").setCreativeTab(Enderpower.enderpowermagicitemstab);
		gravitybrickU = new GravityBrickU().setBlockName("gravitybricku").setBlockTextureName(R.T + "gravitybrick").setCreativeTab(Enderpower.enderpowermagicitemstab);
		gravitybrickD = new GravityBrickD().setBlockName("gravitybrickd").setBlockTextureName(R.T + "gravitybrick").setCreativeTab(Enderpower.enderpowermagicitemstab);
		enderlift = new EnderLift().setBlockName("enderlift").setBlockTextureName(R.T + "enderlift").setCreativeTab(Enderpower.enderpowermagicitemstab);
		metalenchanter = new MetalEnchanter().setBlockName("metalenchanter").setBlockTextureName(R.T + "metalenchanter").setCreativeTab(Enderpower.enderpowermagicitemstab);
		
		
		
		
		
	}

	public static void Registeritems() {
		GameRegistry.registerBlock(thauore, R.UNLOCALIZED_BLOCK_THAUORE);
		GameRegistry.registerBlock(sieore, R.UNLOCALIZED_BLOCK_SIEORE);
		GameRegistry.registerBlock(thaublock, R.UNLOCALIZED_BLOCK_THAUBLOCK);
		GameRegistry.registerBlock(enderblock, "enderblock");
		GameRegistry.registerBlock(sieblock,  R.UNLOCALIZED_BLOCK_SIEBLOCK);
		GameRegistry.registerBlock(thaulamp, R.UNLOCALIZED_BLOCK_THAULAMP);
		GameRegistry.registerBlock(sielamp, R.UNLOCALIZED_BLOCK_SIELAMP);
		GameRegistry.registerBlock(thaulamp2, R.UNLOCALIZED_BLOCK_THAULAMP2);
		GameRegistry.registerBlock(sielamp2, R.UNLOCALIZED_BLOCK_SIELAMP2);
		GameRegistry.registerBlock(douore, R.DOUORE);
		GameRegistry.registerBlock(geeore, "geeore");
		GameRegistry.registerBlock(test, "test");
		GameRegistry.registerBlock(sieobsidian, "sieobsidian");
		GameRegistry.registerBlock(siedstone, "siedstone");
		GameRegistry.registerBlock(siedstonebricks, "siedstonebricks");
		GameRegistry.registerBlock(siedcobblestone, "siedcobblestone");
		GameRegistry.registerBlock(siedoakplanks, "siedoakplanks");
		GameRegistry.registerBlock(siedspruceplanks, "siedspruceplanks");
		GameRegistry.registerBlock(siedbirchplanks, "siedbirchplanks");
		GameRegistry.registerBlock(siedjungleplanks, "siedjungleplanks");
		GameRegistry.registerBlock(siedacaciaplanks, "siedacaciaplanks");
		GameRegistry.registerBlock(sieddarkoakplanks, "sieddarkoakplanks");
		GameRegistry.registerBlock(siedsandstone, "siedsandstone");
		GameRegistry.registerBlock(siedsmoothsandstone, "siedsmoothsandstone");
		GameRegistry.registerBlock(siedchiseledsandstone, "siedchiseledsandstone");
		GameRegistry.registerBlock(fieore, "fieore");
		GameRegistry.registerBlock(geeblock, "geeblock");
		GameRegistry.registerBlock(doublock, "doublock");
		GameRegistry.registerBlock(fieblock, "fieblock");
		GameRegistry.registerBlock(geelamp, "geelamp");
		GameRegistry.registerBlock(geelamp2, "geelamp2");
		GameRegistry.registerBlock(fielamp, "fielamp");
		GameRegistry.registerBlock(fielamp2, "fielamp2");
		GameRegistry.registerBlock(manameter, "manameter");
		GameRegistry.registerBlock(thaugenerator, "thaugenerator");
		GameRegistry.registerBlock(geegenerator, "geegenerator");
		GameRegistry.registerBlock(dougenerator, "dougenerator");
		GameRegistry.registerBlock(fiegenerator, "fiegenerator");
		GameRegistry.registerBlock(endergenerator, "endergenerator");
		GameRegistry.registerBlock(cursedgrass, "cursedgrass");
		GameRegistry.registerBlock(enderore, "enderore");
		GameRegistry.registerBlock(fakeair, "fakeair");
		GameRegistry.registerBlock(holygrass, "holygrass");
		GameRegistry.registerBlock(siegenerator, "siegenerator");
		GameRegistry.registerBlock(thaubarrier, "thaubarrier");
		GameRegistry.registerBlock(lifeplant, "lifeplant");
		GameRegistry.registerBlock(moondrainer, "moondrainer");
		GameRegistry.registerBlock(gravitybrickS, "gravitybrickS");
		GameRegistry.registerBlock(gravitybrickN, "gravitybrickN");
		GameRegistry.registerBlock(gravitybrickE, "gravitybrickE");
		GameRegistry.registerBlock(gravitybrickW, "gravitybrickW");
		GameRegistry.registerBlock(gravitybrickU, "gravitybrickU");
		GameRegistry.registerBlock(gravitybrickD, "gravitybrickD");
		GameRegistry.registerBlock(enderlift, "enderlift");
		GameRegistry.registerBlock(metalenchanter, "metalenchanter");
		
		
	}
	public static Block sieore;
	public static Block thaublock;
	public static Block sieblock;
	public static Block thauore;
	public static Block thaulamp;
	public static Block sielamp;
	public static Block thaulamp2;
	public static Block sielamp2;
	public static Block douore;
	public static Block geeore;
	public static Block fieore;
	public static Block test;
	public static Block geeblock;
	public static Block doublock;
	public static Block fieblock;
	public static Block enderblock; 
	public static Block geelamp;
	public static Block geelamp2;
	public static Block fielamp;
	public static Block fielamp2;
	public static Block manameter;
	public static Block thaugenerator;
	public static Block dougenerator;
	public static Block geegenerator;
	public static Block fiegenerator;
	public static Block endergenerator;
	public static Block cursedgrass;
	public static Block enderore;
	public static Block fakeair;
	public static Block holygrass;
	public static Block siegenerator;
	public static Block thaubarrier;
	public static Block lifeplant;
	public static Block moondrainer;
	public static Block gravitybrickS;
	public static Block gravitybrickN;
	public static Block gravitybrickW;
	public static Block gravitybrickE;
	public static Block gravitybrickU;
	public static Block gravitybrickD;
	public static Block enderlift;
	public static Block metalenchanter;
	
	//sied blocks
	public static Block sieobsidian;
	public static Block siedstone;
	public static Block siedstonebricks;
	public static Block siedcobblestone;
	public static Block siedoakplanks;
	public static Block siedspruceplanks;
	public static Block siedbirchplanks;
	public static Block siedjungleplanks;
	public static Block siedacaciaplanks;
	public static Block sieddarkoakplanks;
	public static Block siedbrick;
	public static Block siedsandstone;
	public static Block siedsmoothsandstone;
	public static Block siedchiseledsandstone;
	
		
	
		

}
