package enderpower.main;

import net.minecraft.client.model.ModelBiped;
import cpw.mods.fml.client.registry.RenderingRegistry;
import enderpower.mobs.EntityEnderhunter;
import enderpower.mobs.EntityUndeadMage;
import enderpower.mobs.ModelEnderhunter;
import enderpower.mobs.RenderEnderhunter;
import enderpower.mobs.RenderUndeadMage;
import enderpower.projectiles.BlastBall;
import enderpower.projectiles.BlastBall2;
import enderpower.projectiles.BlastBall3;
import enderpower.projectiles.DouBall;
import enderpower.projectiles.RenderProjectiles;



public class ClientProxy extends ServerProxy{
	
	@Override
	public void RegisterRenderThings(){
		RenderingRegistry.registerEntityRenderingHandler(EntityEnderhunter.class, new RenderEnderhunter(new ModelEnderhunter(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityUndeadMage.class, new RenderUndeadMage(new ModelBiped(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(BlastBall2.class, new RenderProjectiles());
		RenderingRegistry.registerEntityRenderingHandler(BlastBall.class, new RenderProjectiles());
		RenderingRegistry.registerEntityRenderingHandler(DouBall.class, new RenderProjectiles());
		RenderingRegistry.registerEntityRenderingHandler(BlastBall3.class, new RenderProjectiles());

	}

}
