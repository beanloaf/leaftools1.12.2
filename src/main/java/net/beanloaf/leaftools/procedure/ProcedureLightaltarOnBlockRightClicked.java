package net.beanloaf.leaftools.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.beanloaf.leaftools.block.BlockSolarcast;
import net.beanloaf.leaftools.block.BlockLightaltar;
import net.beanloaf.leaftools.ElementsLeafToolsMod;

import java.util.Random;
import java.util.Map;

@ElementsLeafToolsMod.ModElement.Tag
public class ProcedureLightaltarOnBlockRightClicked extends ElementsLeafToolsMod.ModElement {
	public ProcedureLightaltarOnBlockRightClicked(ElementsLeafToolsMod instance) {
		super(instance, 170);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure LightaltarOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure LightaltarOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure LightaltarOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure LightaltarOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure LightaltarOnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == BlockLightaltar.block.getDefaultState().getBlock())) {
			if (((((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof TileEntityLockableLoot)
						return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) (y + 1), (int) z), (int) (0)))).getItemDamage()) < 20)) {
				if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == new ItemStack(Items.STICK, (int) (1)).getItem())) {
					if (entity instanceof EntityPlayer)
						((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Items.STICK, (int) (1)).getItem(), -1, (int) 1, null);
					if (!world.isRemote) {
						EntityItem entityToSpawn = new EntityItem(world, x, (y + 2), z, new ItemStack(BlockSolarcast.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
					{
						TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y + 1), (int) z));
						if (inv != null && (inv instanceof TileEntityLockableLoot)) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot((int) (0));
							if (stack != null) {
								if (stack.attemptDamageItem((int) 1, new Random(), null)) {
									stack.shrink(1);
									stack.setItemDamage(0);
								}
							}
						}
					}
				}
			}
		}
	}
}
