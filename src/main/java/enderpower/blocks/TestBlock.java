package enderpower.blocks;


import java.util.Random;

import enderpower.magic.Magic;
import enderpower.main.Enderpower;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityFireworkRocket;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.scoreboard.IScoreObjectiveCriteria;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;

public class TestBlock extends Block{

	public NBTTagCompound Fireworks = new NBTTagCompound();
	public ItemStack itemstack = new ItemStack(Items.fireworks, 1);
	public NBTTagCompound fireworks1 = new NBTTagCompound();
	public NBTTagList explosions = new NBTTagList();
	
	protected TestBlock() {
		super(Material.rock);
		itemstack.setTagCompound(Fireworks);
		Fireworks.setTag("Fireworks", fireworks1 );
		
	}
	public boolean onBlockActivated(World world, int x, int y,int z, EntityPlayer player, int i4, float f1, float f2, float f3){
		if(world.isRemote){
			world.spawnParticle("reddust", x, y + 1, z, 10, 0, 10);
		}
		return true;
	}
}
