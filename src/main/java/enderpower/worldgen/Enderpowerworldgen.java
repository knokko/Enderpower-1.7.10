package enderpower.worldgen;

import cpw.mods.fml.common.registry.GameRegistry;

public class Enderpowerworldgen {

	public static void load() {
		GameRegistry.registerWorldGenerator(new Enderpowergenerator(), 1);
		
	}

}
