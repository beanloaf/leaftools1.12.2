package net.beanloaf.leaftools.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.beanloaf.leaftools.item.ItemSolaressence;
import net.beanloaf.leaftools.item.ItemPackedsolardust;
import net.beanloaf.leaftools.item.ItemPackedenchanteddust;
import net.beanloaf.leaftools.item.ItemPackedclouddust;
import net.beanloaf.leaftools.item.ItemPackedcharreddust;
import net.beanloaf.leaftools.item.ItemEssencebase;
import net.beanloaf.leaftools.item.ItemEnchantedessence;
import net.beanloaf.leaftools.item.ItemCloudessence;
import net.beanloaf.leaftools.item.ItemCharredessence;
import net.beanloaf.leaftools.block.BlockNaturecore;
import net.beanloaf.leaftools.block.BlockDustholder;
import net.beanloaf.leaftools.ElementsLeafToolsMod;

import java.util.Map;

@ElementsLeafToolsMod.ModElement.Tag
public class ProcedureEssencecondenserOnBlockRightClicked extends ElementsLeafToolsMod.ModElement {
	public ProcedureEssencecondenserOnBlockRightClicked(ElementsLeafToolsMod instance) {
		super(instance, 160);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure EssencecondenserOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure EssencecondenserOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure EssencecondenserOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure EssencecondenserOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure EssencecondenserOnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
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
				if (((((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)), (int) (0)))
						.getItem() == new ItemStack(ItemPackedenchanteddust.block, (int) (1)).getItem()) && ((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) (x - 1), (int) (y - 1), (int) z), (int) (0)))
								.getItem() == new ItemStack(ItemPackedenchanteddust.block, (int) (1)).getItem()))
						&& (((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) (x + 1), (int) (y - 1), (int) z), (int) (0)))
								.getItem() == new ItemStack(ItemPackedenchanteddust.block, (int) (1)).getItem()) && ((new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof TileEntityLockableLoot)
											return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)), (int) (0)))
										.getItem() == new ItemStack(ItemPackedenchanteddust.block, (int) (1)).getItem())))) {
					if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getItem() == new ItemStack(ItemEssencebase.block, (int) (1)).getItem())) {
						if (entity instanceof EntityPlayer)
							((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemEssencebase.block, (int) (1)).getItem(), -1,
									(int) 1, null);
						if (!world.isRemote) {
							EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(ItemEnchantedessence.block, (int) (1)));
							entityToSpawn.setPickupDelay(10);
							world.spawnEntity(entityToSpawn);
						}
						{
							TileEntity inv = world.getTileEntity(new BlockPos((int) (x + 1), (int) (y - 1), (int) z));
							if (inv instanceof TileEntityLockableLoot)
								((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
						}
						{
							TileEntity inv = world.getTileEntity(new BlockPos((int) (x - 1), (int) (y - 1), (int) z));
							if (inv instanceof TileEntityLockableLoot)
								((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
						}
						{
							TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)));
							if (inv instanceof TileEntityLockableLoot)
								((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
						}
						{
							TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)));
							if (inv instanceof TileEntityLockableLoot)
								((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
						}
					}
				}
				if (((((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)), (int) (0)))
						.getItem() == new ItemStack(ItemPackedcharreddust.block, (int) (1)).getItem()) && ((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) (x - 1), (int) (y - 1), (int) z), (int) (0)))
								.getItem() == new ItemStack(ItemPackedcharreddust.block, (int) (1)).getItem()))
						&& (((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) (x + 1), (int) (y - 1), (int) z), (int) (0)))
								.getItem() == new ItemStack(ItemPackedcharreddust.block, (int) (1)).getItem()) && ((new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof TileEntityLockableLoot)
											return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)), (int) (0)))
										.getItem() == new ItemStack(ItemPackedcharreddust.block, (int) (1)).getItem())))) {
					if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getItem() == new ItemStack(ItemEssencebase.block, (int) (1)).getItem())) {
						if (entity instanceof EntityPlayer)
							((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemEssencebase.block, (int) (1)).getItem(), -1,
									(int) 1, null);
						if (!world.isRemote) {
							EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(ItemCharredessence.block, (int) (1)));
							entityToSpawn.setPickupDelay(10);
							world.spawnEntity(entityToSpawn);
						}
						{
							TileEntity inv = world.getTileEntity(new BlockPos((int) (x + 1), (int) (y - 1), (int) z));
							if (inv instanceof TileEntityLockableLoot)
								((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
						}
						{
							TileEntity inv = world.getTileEntity(new BlockPos((int) (x - 1), (int) (y - 1), (int) z));
							if (inv instanceof TileEntityLockableLoot)
								((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
						}
						{
							TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)));
							if (inv instanceof TileEntityLockableLoot)
								((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
						}
						{
							TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)));
							if (inv instanceof TileEntityLockableLoot)
								((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
						}
					}
				}
				if (((((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)), (int) (0)))
						.getItem() == new ItemStack(ItemPackedclouddust.block, (int) (1)).getItem()) && ((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) (x - 1), (int) (y - 1), (int) z), (int) (0)))
								.getItem() == new ItemStack(ItemPackedclouddust.block, (int) (1)).getItem()))
						&& (((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) (x + 1), (int) (y - 1), (int) z), (int) (0)))
								.getItem() == new ItemStack(ItemPackedclouddust.block, (int) (1)).getItem()) && ((new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof TileEntityLockableLoot)
											return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)), (int) (0)))
										.getItem() == new ItemStack(ItemPackedclouddust.block, (int) (1)).getItem())))) {
					if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getItem() == new ItemStack(ItemEssencebase.block, (int) (1)).getItem())) {
						if (entity instanceof EntityPlayer)
							((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemEssencebase.block, (int) (1)).getItem(), -1,
									(int) 1, null);
						if (!world.isRemote) {
							EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(ItemCloudessence.block, (int) (1)));
							entityToSpawn.setPickupDelay(10);
							world.spawnEntity(entityToSpawn);
						}
						{
							TileEntity inv = world.getTileEntity(new BlockPos((int) (x + 1), (int) (y - 1), (int) z));
							if (inv instanceof TileEntityLockableLoot)
								((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
						}
						{
							TileEntity inv = world.getTileEntity(new BlockPos((int) (x - 1), (int) (y - 1), (int) z));
							if (inv instanceof TileEntityLockableLoot)
								((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
						}
						{
							TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)));
							if (inv instanceof TileEntityLockableLoot)
								((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
						}
						{
							TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)));
							if (inv instanceof TileEntityLockableLoot)
								((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
						}
					}
				}
				if (((((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)), (int) (0)))
						.getItem() == new ItemStack(ItemPackedsolardust.block, (int) (1)).getItem()) && ((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) (x - 1), (int) (y - 1), (int) z), (int) (0)))
								.getItem() == new ItemStack(ItemPackedsolardust.block, (int) (1)).getItem()))
						&& (((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) (x + 1), (int) (y - 1), (int) z), (int) (0)))
								.getItem() == new ItemStack(ItemPackedsolardust.block, (int) (1)).getItem()) && ((new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof TileEntityLockableLoot)
											return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)), (int) (0)))
										.getItem() == new ItemStack(ItemPackedsolardust.block, (int) (1)).getItem())))) {
					if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getItem() == new ItemStack(ItemEssencebase.block, (int) (1)).getItem())) {
						if (entity instanceof EntityPlayer)
							((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemEssencebase.block, (int) (1)).getItem(), -1,
									(int) 1, null);
						if (!world.isRemote) {
							EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(ItemSolaressence.block, (int) (1)));
							entityToSpawn.setPickupDelay(10);
							world.spawnEntity(entityToSpawn);
						}
						{
							TileEntity inv = world.getTileEntity(new BlockPos((int) (x + 1), (int) (y - 1), (int) z));
							if (inv instanceof TileEntityLockableLoot)
								((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
						}
						{
							TileEntity inv = world.getTileEntity(new BlockPos((int) (x - 1), (int) (y - 1), (int) z));
							if (inv instanceof TileEntityLockableLoot)
								((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
						}
						{
							TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)));
							if (inv instanceof TileEntityLockableLoot)
								((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
						}
						{
							TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)));
							if (inv instanceof TileEntityLockableLoot)
								((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
						}
					}
				}
			}
		}
	}
}
