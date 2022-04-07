package net.beanloaf.leaftools.procedure;

import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.ItemStack;

import net.beanloaf.leaftools.item.ItemSolargem;
import net.beanloaf.leaftools.block.BlockLightaltarbase;
import net.beanloaf.leaftools.ElementsLeafToolsMod;

import java.util.Map;

@ElementsLeafToolsMod.ModElement.Tag
public class ProcedureLightaltarupdatetick1 extends ElementsLeafToolsMod.ModElement {
	public ProcedureLightaltarupdatetick1(ElementsLeafToolsMod instance) {
		super(instance, 169);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Lightaltarupdatetick1!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Lightaltarupdatetick1!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Lightaltarupdatetick1!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Lightaltarupdatetick1!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double num = 0;
		boolean digits = false;
		num = (double) (world.getWorldTime());
		int timeDigit = (int) num % 100;
		if ((((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof TileEntityLockableLoot)
					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(ItemSolargem.block, (int) (1)).getItem())
				&& ((((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))).getItemDamage()) > 0))) {
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockLightaltarbase.block.getDefaultState()
					.getBlock()) && ((world.isDaytime()) && ((timeDigit >= 50) && (timeDigit <= 60))))) {
				((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))).setItemDamage((int) ((((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))).getItemDamage()) - 1));
			}
		}
		if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockLightaltarbase.block.getDefaultState()
				.getBlock()) && (world.isDaytime()))) {
			if (world instanceof WorldServer)
				((WorldServer) world).spawnParticle(EnumParticleTypes.CRIT, (x + 0.5), (y + 1.5), (z + 0.5), (int) 5, 0, 0, 0, 0, new int[0]);
		}
	}
}
