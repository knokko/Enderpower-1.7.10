package enderpower.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.init.Blocks;
import net.minecraft.world.IBlockAccess;

public class EnderOre extends Block {

	protected EnderOre() {
		super(Material.rock);
	}
	public boolean canEntityDestroy(IBlockAccess world, int x, int y, int z, Entity entity)
    {
        
        if (entity instanceof EntityDragon)
        {
            return this != Blocks.obsidian && this != Blocks.end_stone && this != Blocks.bedrock && this != EnderpowerBlocks.enderore && this != EnderpowerBlocks.sieobsidian && this != Blocks.command_block && this != Blocks.dragon_egg; 
        }
        else if (entity instanceof EntityWither)
        {
            return this != Blocks.bedrock && this != Blocks.end_portal && this != Blocks.end_portal_frame && this != Blocks.command_block && this != EnderpowerBlocks.sieobsidian;
        }

        return true;
    }

}
