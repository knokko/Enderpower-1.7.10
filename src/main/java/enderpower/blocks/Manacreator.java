package enderpower.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

public class Manacreator extends Block {

	protected Manacreator() {
		super(Material.rock);
	}
	public int tickRate(World world)
    {
        return 10;
    }
}
