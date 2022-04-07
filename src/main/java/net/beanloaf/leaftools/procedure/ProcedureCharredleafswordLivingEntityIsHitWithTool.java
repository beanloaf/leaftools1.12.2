package net.beanloaf.leaftools.procedure;

import net.minecraft.entity.Entity;

import net.beanloaf.leaftools.ElementsLeafToolsMod;

import java.util.Map;

@ElementsLeafToolsMod.ModElement.Tag
public class ProcedureCharredleafswordLivingEntityIsHitWithTool extends ElementsLeafToolsMod.ModElement {
	public ProcedureCharredleafswordLivingEntityIsHitWithTool(ElementsLeafToolsMod instance) {
		super(instance, 162);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure CharredleafswordLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setFire((int) 8);
	}
}
