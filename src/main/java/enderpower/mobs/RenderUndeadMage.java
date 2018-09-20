package enderpower.mobs;

import enderpower.main.R;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderUndeadMage extends RenderLiving{

	private static final ResourceLocation texture = new ResourceLocation(R.T + "textures/entities/undeadmage.png");
	protected ModelBiped modelEntity;

	public RenderUndeadMage(ModelBase modelbase, float a) {
		super(modelbase, a);
		modelEntity = ((ModelBiped) mainModel);
	}
	public void renderUndeadMage(EntityUndeadMage entity, double x, double y, double z, float u, float v){
		super.doRender(entity, x, y, z, u, v);
	}
	public void doRenderLiving(EntityLiving entityLiving, double x, double y, double z, float u, float v){
		renderUndeadMage((EntityUndeadMage)entityLiving, x, y, z, u, v);
	}
	public void doRender(Entity entity, double x, double y, double z, float u, float v){
		renderUndeadMage((EntityUndeadMage)entity, x, y, z, u, v);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return texture;
	}

}
