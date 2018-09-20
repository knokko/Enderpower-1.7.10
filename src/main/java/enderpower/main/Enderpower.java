package enderpower.main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import enderpower.blocks.EnderpowerBlocks;
import enderpower.blocks.tileentity.EnderpowerTileEntities;
import enderpower.blocks.tileentity.TileEntityMoondrainer;
import enderpower.items.EnderpowerItems;
import enderpower.mobs.EntityEnderhunter;
import enderpower.mobs.EntityHandler;
import enderpower.mobs.EntityUndeadMage;
import enderpower.projectiles.BlastBall;
import enderpower.projectiles.BlastBall2;
import enderpower.projectiles.BlastBall3;
import enderpower.projectiles.DouBall;
import enderpower.recipes.EnderpowerSmeltingRecipes;
import enderpower.tabs.EnderpowerSietab;
import enderpower.tabs.Enderpowertab;
import enderpower.tools.ToolRegistratie;
import enderpower.worldgen.Enderpowerworldgen;

@Mod(modid = R.MODID, name = R.MODNAME, version = R.VERSION)

public class Enderpower {


	
	
	
	
	
	
	
	@SidedProxy(clientSide = "enderpower.main.ClientProxy", serverSide = "enderpower.main.ServerProxy")
	public static ServerProxy proxy;
	
	
	
	
	

	
	
	
	//creative tabblad
	public static CreativeTabs enderpowermagicitemstab = new Enderpowertab(CreativeTabs.getNextID(), "enderpowermagicitems" + R.TABNAME);
	public static CreativeTabs enderpowersieblockstab = new EnderpowerSietab(CreativeTabs.getNextID(), "enderpowersieblocksTab");
	
	@Instance(R.MODID)
	public static Enderpower modInstance;


	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.RegisterRenderThings();
		EnderpowerBlocks.load();
		EnderpowerBlocks.Registeritems();
		EnderpowerItems.load();
		EnderpowerItems.RegisterItems();
		ToolRegistratie.load();
		ToolRegistratie.RegisterItem();
	}
	
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		Enderpowerworldgen.load();
		EnderpowerSmeltingRecipes.load();
		EntityHandler.RegisterMonsters(EntityEnderhunter.class, "enderhunter");
		EntityHandler.RegisterUndead(EntityUndeadMage.class, "undeadmage");
		EntityHandler.registerProjectiles(BlastBall2.class, "blastball2");
		EntityHandler.registerProjectiles(BlastBall.class, "blastball");
		EntityHandler.registerProjectiles(DouBall.class, "douball");
		EntityHandler.registerProjectiles(BlastBall3.class, "blastball3");
		MinecraftForge.EVENT_BUS.register(new EnderpowerEventHandler());
		EnderpowerTileEntities.RegisterTileEntities();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {}
	
}
