package enderpower.tools;

import enderpower.magic.Magic;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EnderBlade extends Item {
	public int mana;
	public int cooldown;
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player){
		if(mana >= 5){
			player.motionX *= 20;
			player.motionZ *= 20;
			Magic.get(world).useMana(0, 0, 0, 0, 5, 0);
			cooldown = 40;
		}
		return item;
	}
	public boolean onLeftClickEntity(ItemStack item, EntityPlayer player, Entity entity){
		entity.attackEntityFrom(DamageSource.causePlayerDamage(player), 5);
		if(mana >= 20){
			double x = ((entity.posX - player.posX) * 2) + player.posX;
			double z = ((entity.posZ - player.posZ) * 2) + player.posZ;
			player.setPosition(x, entity.posY, z);
			if(player.rotationYaw >= 180 || player.rotationYaw <= -180){
				player.rotationYaw *= 0.5;
			}
			else {
				player.rotationYaw *= 2;
			}
			Magic.get(player.worldObj).useMana(0, 0, 0, 0, 20, 0);
		}
		return false;
	}
	public void onUpdate(ItemStack item, World world, Entity entity, int i, boolean b){
		if(!world.isRemote){
			mana = Magic.get(world).getEnderMana();
		}
		if(cooldown > 0){
			cooldown -= 1;
		}
	}
}
