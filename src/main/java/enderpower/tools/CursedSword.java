package enderpower.tools;

import enderpower.magic.Magic;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class CursedSword extends ItemSword{

	public CursedSword(ToolMaterial iron) {
		super(ToolMaterial.IRON);
		setCreativeTab(CreativeTabs.tabCombat);
	}
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity){
		((EntityLivingBase) entity).addPotionEffect(new PotionEffect(20, 100, 3, true));
        return false;
    }
}
