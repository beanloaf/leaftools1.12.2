package net.beanloaf.leaftools.procedure;

import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumParticleTypes;

import net.beanloaf.leaftools.block.BlockNaturecore;
import net.beanloaf.leaftools.block.BlockDustholder;
import net.beanloaf.leaftools.ElementsLeafToolsMod;

import java.util.Map;

@ElementsLeafToolsMod.ModElement.Tag
public class ProcedureEssencecondenserUpdateTick extends ElementsLeafToolsMod.ModElement {
	public ProcedureEssencecondenserUpdateTick(ElementsLeafToolsMod instance) {
		super(instance, 211);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure EssencecondenserUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure EssencecondenserUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure EssencecondenserUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure EssencecondenserUpdateTick!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockNaturecore.block.getDefaultState().getBlock())) {
			if (((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)))).getBlock() == BlockDustholder.block.getDefaultState()
					.getBlock())
					&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)))).getBlock() == BlockDustholder.block
							.getDefaultState().getBlock()))
					&& (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z))).getBlock() == BlockDustholder.block
							.getDefaultState().getBlock())
							&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z))).getBlock() == BlockDustholder.block
									.getDefaultState().getBlock())))) {
				if (world instanceof WorldServer)
					((WorldServer) world).spawnParticle(EnumParticleTypes.CRIT, (x + 0.5), (y + 1.5), (z + 0.5), (int) 5, 0, 0, 0, 0, new int[0]);
			}
		}
	}
}
