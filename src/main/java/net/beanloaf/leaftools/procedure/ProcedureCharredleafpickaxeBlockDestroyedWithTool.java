package net.beanloaf.leaftools.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.EntityItem;

import net.beanloaf.leaftools.ElementsLeafToolsMod;

import java.util.Map;

@ElementsLeafToolsMod.ModElement.Tag
public class ProcedureCharredleafpickaxeBlockDestroyedWithTool extends ElementsLeafToolsMod.ModElement {
	public ProcedureCharredleafpickaxeBlockDestroyedWithTool(ElementsLeafToolsMod instance) {
		super(instance, 161);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure CharredleafpickaxeBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure CharredleafpickaxeBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure CharredleafpickaxeBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure CharredleafpickaxeBlockDestroyedWithTool!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		boolean removeBlock = false;
		if ((FurnaceRecipes.instance()
				.getSmeltingResult((new ItemStack((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))) != ItemStack.EMPTY)) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, (x + 0.5), (y + 0.5), (z + 0.5), (FurnaceRecipes.instance()
						.getSmeltingResult((new ItemStack((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))).copy()));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
		} else {
			world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock().dropBlockAsItem(world, new BlockPos((int) x, (int) y, (int) z),
					world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), 1);
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
		}
	}
}
