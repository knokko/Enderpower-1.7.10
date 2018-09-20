package enderpower.wands;

import enderpower.magic.Magic;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class FlyWand extends Item {
	public FlyWand(){
		super();
	}
	private int mana;
	
	@Override
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player){
		if(mana >= 5){
		player.jumpMovementFactor = 0.5F;
		player.fallDistance = 0.0F;
		player.motionY = player.rotationPitch * -0.025;
		Magic.get(world).editMana(-5, 0, 0, 0, 0, 0);
		}
		return item;
	} 
	
	public void onUpdate(ItemStack item, World world, Entity entity, int a, boolean b){
		if(!world.isRemote){
			this.mana = Magic.get(world).getThauMana();
		}
	}	
}
