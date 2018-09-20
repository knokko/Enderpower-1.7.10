package enderpower.wands;

import java.util.Random;

import enderpower.blocks.EnderpowerBlocks;
import enderpower.magic.Magic;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.world.World;

public class CurseWand extends Item {
	
	public CurseWand(){
		super();
		setCreativeTab(CreativeTabs.tabCombat);
	}
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world,EntityPlayer player){
		MovingObjectPosition objectMouseOver;
        Minecraft mc = Minecraft.getMinecraft();

        objectMouseOver = mc.thePlayer.rayTrace(300, 1);
		if(Magic.get(world).useMana(3000, 0, 0, 25000, 0, 0) && objectMouseOver != null && objectMouseOver.typeOfHit == MovingObjectType.BLOCK){

        	

           int i = objectMouseOver.blockX;
           int j = objectMouseOver.blockY;
           int k = objectMouseOver.blockZ;
           
           
           if (!world.isRemote && world.getBlock(i, j, k) == Blocks.grass || world.getBlock(i, j, k) == Blocks.dirt || world.getBlock(i, j, k) == Blocks.mycelium) {
        	   world.setBlock(i, j, k, EnderpowerBlocks.cursedgrass);
           	Random rand=new Random();
           	int num=rand.nextInt(6);
           	
           	
              
              
           }
           else if(!world.isRemote && world.getBlock(i, j, k) == Blocks.tallgrass){
        	   world.setBlock(i, j - 1, k, EnderpowerBlocks.cursedgrass);
           }
           else if(!world.isRemote && world.getBlock(i, j, k) == Blocks.double_plant && world.getBlock(i, j - 1, k) == Blocks.grass || world.getBlock(i, j, k) == Blocks.dirt || world.getBlock(i, j, k) == Blocks.mycelium){
        	   world.setBlock(i, j - 1, k, EnderpowerBlocks.cursedgrass);
           }
           else if(!world.isRemote && world.getBlock(i, j, k) == Blocks.double_plant && world.getBlock(i, j - 2, k) == Blocks.grass || world.getBlock(i, j, k) == Blocks.dirt || world.getBlock(i, j, k) == Blocks.mycelium){
        	   world.setBlock(i, j - 2, k, EnderpowerBlocks.cursedgrass);
           }
           else{
        	   Magic.get(world).editMana(3000, 0, 0, 25000, 0, 0);
           }
		}
		return itemstack;
		
	}

}
