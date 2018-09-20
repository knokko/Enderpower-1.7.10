package enderpower.worldgen;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;
import enderpower.blocks.EnderpowerBlocks;

public class Enderpowergenerator implements IWorldGenerator {
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case 0:
			generateSurface( world, random, chunkX * 16, chunkZ * 16);
		}
		switch (world.provider.dimensionId) {
		case -1:
			generateNether( world, random, chunkX * 16, chunkZ * 16);
		}
		switch (world.provider.dimensionId) {
		case 1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}

	}
	
	
	private void generateSurface(World world, Random random, int BlockX, int BlockZ) {
		
		
		
	}
	private void generateEnd(World world, Random random, int BlockX, int BlockZ){
		for (int i = 0; i < 10; i++) { //hoe vaak de ader voorkomt
			int Xcoord = BlockX + random.nextInt(16);
			int Zcoord = BlockZ + random.nextInt(16);
			int Ycoord = random.nextInt(255);
			(new WorldGenEndMinable(EnderpowerBlocks.enderore, 20)).generate(world, random, Xcoord, Ycoord, Zcoord); //hoe groot de ader is
		}
	}
	
	private void generateNether(World world, Random random, int BlockX, int BlockZ) {
		for (int i = 0; i < 5; i++) { //hoe vaak de ader voorkomt
			int Xcoord = BlockX + random.nextInt(16);
			int Zcoord = BlockZ + random.nextInt(16);
			int Ycoord = random.nextInt(255);
			(new WorldGenNetherMinable(EnderpowerBlocks.douore, 20)).generate(world, random, Xcoord, Ycoord, Zcoord); //hoe groot de ader is
		}
		for (int i = 0; i < 5; i++) {
			int Xcoord = BlockX + random.nextInt(16);
			int Zcoord = BlockZ + random.nextInt(16);
			int Ycoord = random.nextInt(255);
			(new WorldGenNetherMinable(EnderpowerBlocks.geeore, 20)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		for (int i = 0; i < 5; i++) {
			int Xcoord = BlockX + random.nextInt(16);
			int Zcoord = BlockZ + random.nextInt(16);
			int Ycoord = random.nextInt(255);
			(new WorldGenNetherMinable(EnderpowerBlocks.sieore, 20)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		for (int i = 0; i < 5; i++) {
			int Xcoord = BlockX + random.nextInt(16);
			int Zcoord = BlockZ + random.nextInt(16);
			int Ycoord = random.nextInt(255);
			(new WorldGenNetherMinable(EnderpowerBlocks.thauore, 20)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		for (int i = 0; i < 5; i++) {
			int Xcoord = BlockX + random.nextInt(16);
			int Zcoord = BlockZ + random.nextInt(16);
			int Ycoord = random.nextInt(255);
			(new WorldGenNetherMinable(EnderpowerBlocks.fieore, 20)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
	}

}
