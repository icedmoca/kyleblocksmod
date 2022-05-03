package net.mcreator.kyleblocks;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.Entity;

import java.util.HashMap;

@Elementskyleblocks.ModElement.Tag
public class MCreatorDrywallBlockDestroyedByPlayer extends Elementskyleblocks.ModElement {
	public MCreatorDrywallBlockDestroyedByPlayer(Elementskyleblocks instance) {
		super(instance, 12);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorDrywallBlockDestroyedByPlayer!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayerMP)
			MCreatorBrokedrywall.trigger.triggerAdvancement((EntityPlayerMP) entity);
	}
}
