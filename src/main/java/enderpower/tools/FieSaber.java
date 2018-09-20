package enderpower.tools;

import enderpower.magic.Magic;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class FieSaber extends Item{
	@Override
	public boolean onLeftClickEntity(ItemStack itemstack, EntityPlayer player, Entity entity){
		if(Magic.get(player.worldObj).useMana(0, 0, 15, 0, 0, 0)){
		((EntityLivingBase) entity).attackEntityFrom(DamageSource.causePlayerDamage(player), 10.0F);
		}
		
		return true;
		
	}


}
