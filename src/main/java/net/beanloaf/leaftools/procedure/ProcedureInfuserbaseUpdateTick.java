package net.beanloaf.leaftools.procedure;

import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumParticleTypes;

import net.beanloaf.leaftools.block.BlockInfuser;
import net.beanloaf.leaftools.ElementsLeafToolsMod;

import java.util.Map;

@ElementsLeafToolsMod.ModElement.Tag
public class ProcedureInfuserbaseUpdateTick extends ElementsLeafToolsMod.ModElement {
	public ProcedureInfuserbaseUpdateTick(ElementsLeafToolsMod instance) {
		super(instance, 192);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure InfuserbaseUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure InfuserbaseUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure InfuserbaseUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure InfuserbaseUpdateTick!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == BlockInfuser.block.getDefaultState().getBlock())) {
			if (world instanceof WorldServer)
				((WorldServer) world).spawnParticle(EnumParticleTypes.CRIT, (x + 0.5), (y + 2.5), (z + 0.5), (int) 5, 0, 0, 0, 0, new int[0]);
		}
	}
}
