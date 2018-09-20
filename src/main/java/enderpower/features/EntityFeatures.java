package enderpower.features;

import java.util.List;
import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class EntityFeatures {
	public static Entity getRandomEntityWithinAABB(Class entityClass, AxisAlignedBB aabb, World world){
		Random random = new Random();
		Entity entity = null;
		if(entityClass != null && aabb != null && world != null){
			List entities = world.getEntitiesWithinAABB(entityClass, aabb);
			if(entities != null){
				if(entities.size() > 0){
					entity = (Entity) entities.get(random.nextInt(entities.size()));
				}
			}
		}
		return entity;
	}
}
