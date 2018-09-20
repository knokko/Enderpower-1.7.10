package enderpower.tools;

import enderpower.magic.Magic;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;

public class ThauSaber extends Item {
	
	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity){
		if(Magic.get(player.worldObj).useMana(5, 0, 0, 0, 0, 0)){
			((EntityLivingBase)entity).attackEntityFrom(DamageSource.causePlayerDamage(player), 5.0F);
		}
		return true;
		
	}

}
