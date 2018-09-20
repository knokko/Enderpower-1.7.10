package enderpower.blocks.tileentity;

import cpw.mods.fml.common.registry.GameRegistry;

public class EnderpowerTileEntities {
	public static void RegisterTileEntities(){
		GameRegistry.registerTileEntity(TileEntityMoondrainer.class, "TileEntityMoondrainer");
		GameRegistry.registerTileEntity(TileEntityGravityBrickS.class, "TileEntityGravityBrickS");
		GameRegistry.registerTileEntity(TileEntityGravityBrickN.class, "TileEntityGravityBrickN");
		GameRegistry.registerTileEntity(TileEntityGravityBrickE.class, "TileEntityGravityBrickE");
		GameRegistry.registerTileEntity(TileEntityGravityBrickW.class, "TileEntityGravityBrickW");
		GameRegistry.registerTileEntity(TileEntityGravityBrickU.class, "TileEntityGravityBrickU");
		GameRegistry.registerTileEntity(TileEntityGravityBrickD.class, "TileEntityGravityBrickD");
		GameRegistry.registerTileEntity(TileEntityEnderLift.class, "TileEntityEnderLift");
		GameRegistry.registerTileEntity(TileEntityMetalEnchanter.class, "TileEntityMetalEnchanter");
	}
}
