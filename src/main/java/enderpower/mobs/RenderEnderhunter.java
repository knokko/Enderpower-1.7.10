package enderpower.mobs;
import enderpower.main.R;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderEnderhunter extends RenderLiving {
	
	private static final ResourceLocation texture = new ResourceLocation(R.T + "textures/entities/enderhunter.png");
	
	protected ModelEnderhunter modelEntity;

	public RenderEnderhunter(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		modelEntity = ((ModelEnderhunter) mainModel);
	}
	public void renderEnderhunter(EntityEnderhunter entity, double x, double y, double z, float u, float v){
		super.doRender(entity, x, y, z, u, v);
	}
	public void doRenderLiving(EntityLiving entityLiving, double x, double y, double z, float u, float v){
		renderEnderhunter((EntityEnderhunter)entityLiving, x, y, z, u, v);
	}
	public void doRender(Entity entity, double x, double y, double z, float u, float v){
		renderEnderhunter((EntityEnderhunter)entity, x, y, z, u, v);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
		return texture;
	}

	

}
