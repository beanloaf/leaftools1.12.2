package net.beanloaf.leaftools.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.init.Enchantments;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.beanloaf.leaftools.item.ItemSolargem;
import net.beanloaf.leaftools.item.ItemSolaressence;
import net.beanloaf.leaftools.item.ItemIronleafsword;
import net.beanloaf.leaftools.item.ItemIronleafshovel;
import net.beanloaf.leaftools.item.ItemIronleafpickaxe;
import net.beanloaf.leaftools.item.ItemIronleafmultitool;
import net.beanloaf.leaftools.item.ItemIronleafhoe;
import net.beanloaf.leaftools.item.ItemIronleafaxe;
import net.beanloaf.leaftools.item.ItemIronleafarmorArmor;
import net.beanloaf.leaftools.item.ItemIronleaf;
import net.beanloaf.leaftools.item.ItemGoldleafsword;
import net.beanloaf.leaftools.item.ItemGoldleafshovel;
import net.beanloaf.leaftools.item.ItemGoldleafpickaxe;
import net.beanloaf.leaftools.item.ItemGoldleafmultitool;
import net.beanloaf.leaftools.item.ItemGoldleafhoe;
import net.beanloaf.leaftools.item.ItemGoldleafaxe;
import net.beanloaf.leaftools.item.ItemGoldleafarmorArmor;
import net.beanloaf.leaftools.item.ItemGoldleaf;
import net.beanloaf.leaftools.item.ItemEnchantedmulch;
import net.beanloaf.leaftools.item.ItemEnchantedleafsword;
import net.beanloaf.leaftools.item.ItemEnchantedleafshovel;
import net.beanloaf.leaftools.item.ItemEnchantedleafpickaxe;
import net.beanloaf.leaftools.item.ItemEnchantedleafmultitool;
import net.beanloaf.leaftools.item.ItemEnchantedleafhoe;
import net.beanloaf.leaftools.item.ItemEnchantedleafaxe;
import net.beanloaf.leaftools.item.ItemEnchantedleafarmorArmor;
import net.beanloaf.leaftools.item.ItemEnchantedleaf;
import net.beanloaf.leaftools.item.ItemEnchantedessence;
import net.beanloaf.leaftools.item.ItemDiamondmulch;
import net.beanloaf.leaftools.item.ItemDiamondleafsword;
import net.beanloaf.leaftools.item.ItemDiamondleafshovel;
import net.beanloaf.leaftools.item.ItemDiamondleafpickaxe;
import net.beanloaf.leaftools.item.ItemDiamondleafmultitool;
import net.beanloaf.leaftools.item.ItemDiamondleafaxe;
import net.beanloaf.leaftools.item.ItemDiamondleafarmorArmor;
import net.beanloaf.leaftools.item.ItemDiamondleaf;
import net.beanloaf.leaftools.item.ItemCloudmulch;
import net.beanloaf.leaftools.item.ItemCloudleafsword;
import net.beanloaf.leaftools.item.ItemCloudleafshovel;
import net.beanloaf.leaftools.item.ItemCloudleafpickaxe;
import net.beanloaf.leaftools.item.ItemCloudleafmultitool;
import net.beanloaf.leaftools.item.ItemCloudleafhoe;
import net.beanloaf.leaftools.item.ItemCloudleafaxe;
import net.beanloaf.leaftools.item.ItemCloudleafarmorArmor;
import net.beanloaf.leaftools.item.ItemCloudleaf;
import net.beanloaf.leaftools.item.ItemCloudessence;
import net.beanloaf.leaftools.item.ItemCharredmulch;
import net.beanloaf.leaftools.item.ItemCharredleafsword;
import net.beanloaf.leaftools.item.ItemCharredleafshovel;
import net.beanloaf.leaftools.item.ItemCharredleafpickaxe;
import net.beanloaf.leaftools.item.ItemCharredleafmultitool;
import net.beanloaf.leaftools.item.ItemCharredleafhoe;
import net.beanloaf.leaftools.item.ItemCharredleafaxe;
import net.beanloaf.leaftools.item.ItemCharredleafarmorArmor;
import net.beanloaf.leaftools.item.ItemCharredleaf;
import net.beanloaf.leaftools.item.ItemCharredessence;
import net.beanloaf.leaftools.block.BlockInfuserbase;
import net.beanloaf.leaftools.block.BlockEnchantedtreesapling;
import net.beanloaf.leaftools.ElementsLeafToolsMod;

import java.util.Map;

@ElementsLeafToolsMod.ModElement.Tag
public class ProcedureInfuserOnBlockRightClicked extends ElementsLeafToolsMod.ModElement {
	public ProcedureInfuserOnBlockRightClicked(ElementsLeafToolsMod instance) {
		super(instance, 116);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure InfuserOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure InfuserOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure InfuserOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure InfuserOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure InfuserOnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemDiamondmulch.block, (int) (1)).getItem()) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))).getItem() == new ItemStack(ItemDiamondleaf.block, (int) (1))
						.getItem()))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))) > 0)
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockInfuserbase.block
								.getDefaultState().getBlock())))) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(BlockEnchantedtreesapling.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(
						((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(), -1,
						(int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
			}
		}
		if ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemDiamondleaf.block, (int) (1)).getItem()) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0)))
						.getItem() == new ItemStack(ItemEnchantedessence.block, (int) (1)).getItem()))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))) > 0)
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockInfuserbase.block
								.getDefaultState().getBlock())))) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(ItemEnchantedmulch.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(
						((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(), -1,
						(int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
			}
		}
		if ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemGoldleaf.block, (int) (1)).getItem()) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0)))
						.getItem() == new ItemStack(ItemCharredessence.block, (int) (1)).getItem()))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))) > 0)
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockInfuserbase.block
								.getDefaultState().getBlock())))) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(ItemCharredmulch.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(
						((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(), -1,
						(int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
			}
		}
		if ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemIronleaf.block, (int) (1)).getItem()) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0)))
						.getItem() == new ItemStack(ItemCloudessence.block, (int) (1)).getItem()))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))) > 0)
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockInfuserbase.block
								.getDefaultState().getBlock())))) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(ItemCloudmulch.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(
						((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(), -1,
						(int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
			}
		}
		if ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(Items.EMERALD, (int) (1)).getItem()) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0)))
						.getItem() == new ItemStack(ItemSolaressence.block, (int) (1)).getItem()))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))) > 0)
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockInfuserbase.block
								.getDefaultState().getBlock())))) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(ItemSolargem.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(
						((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(), -1,
						(int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
			}
		}
		if ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemDiamondleafpickaxe.block, (int) (1)).getItem()) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0)))
						.getItem() == new ItemStack(ItemEnchantedleaf.block, (int) (1)).getItem()))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))) >= 3)
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockInfuserbase.block
								.getDefaultState().getBlock())))) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(ItemEnchantedleafpickaxe.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(
						((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(), -1,
						(int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (3));
			}
		}
		if ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemDiamondleafaxe.block, (int) (1)).getItem()) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0)))
						.getItem() == new ItemStack(ItemEnchantedleaf.block, (int) (1)).getItem()))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))) >= 3)
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockInfuserbase.block
								.getDefaultState().getBlock())))) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(ItemEnchantedleafaxe.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(
						((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(), -1,
						(int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (3));
			}
		}
		if ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemDiamondleafsword.block, (int) (1)).getItem()) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0)))
						.getItem() == new ItemStack(ItemEnchantedleaf.block, (int) (1)).getItem()))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))) >= 2)
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockInfuserbase.block
								.getDefaultState().getBlock())))) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(ItemEnchantedleafsword.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(
						((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(), -1,
						(int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (2));
			}
		}
		if ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemDiamondleafshovel.block, (int) (1)).getItem()) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0)))
						.getItem() == new ItemStack(ItemEnchantedleaf.block, (int) (1)).getItem()))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))) >= 1)
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockInfuserbase.block
								.getDefaultState().getBlock())))) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(ItemEnchantedleafshovel.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(
						((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(), -1,
						(int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
			}
		}
		if ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemIronleafhoe.block, (int) (1)).getItem()) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0)))
						.getItem() == new ItemStack(ItemEnchantedleaf.block, (int) (1)).getItem()))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))) >= 2)
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockInfuserbase.block
								.getDefaultState().getBlock())))) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(ItemEnchantedleafhoe.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(
						((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(), -1,
						(int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (2));
			}
		}
		if ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemDiamondleafmultitool.block, (int) (1)).getItem()) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0)))
						.getItem() == new ItemStack(ItemEnchantedleaf.block, (int) (1)).getItem()))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))) >= 7)
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockInfuserbase.block
								.getDefaultState().getBlock())))) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(ItemEnchantedleafmultitool.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(
						((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(), -1,
						(int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (7));
			}
		}
		if ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemIronleafpickaxe.block, (int) (1)).getItem()) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))).getItem() == new ItemStack(ItemCloudleaf.block, (int) (1))
						.getItem()))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))) >= 3)
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockInfuserbase.block
								.getDefaultState().getBlock())))) {
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv != null && (inv instanceof TileEntityLockableLoot)) {
					ItemStack _setstack = new ItemStack(ItemCloudleafpickaxe.block, (int) (1));
					_setstack.setCount(1);
					((TileEntityLockableLoot) inv).setInventorySlotContents((int) (1), _setstack);
				}
			}
			((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof TileEntityLockableLoot)
						return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (1)))).addEnchantment(Enchantments.SILK_TOUCH, (int) 1);
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, (new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (1))));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(
						((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(), -1,
						(int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (3));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).removeStackFromSlot((int) (1));
			}
		}
		if ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemIronleafshovel.block, (int) (1)).getItem()) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))).getItem() == new ItemStack(ItemCloudleaf.block, (int) (1))
						.getItem()))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))) >= 1)
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockInfuserbase.block
								.getDefaultState().getBlock())))) {
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv != null && (inv instanceof TileEntityLockableLoot)) {
					ItemStack _setstack = new ItemStack(ItemCloudleafshovel.block, (int) (1));
					_setstack.setCount(1);
					((TileEntityLockableLoot) inv).setInventorySlotContents((int) (1), _setstack);
				}
			}
			((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof TileEntityLockableLoot)
						return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (1)))).addEnchantment(Enchantments.SILK_TOUCH, (int) 1);
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, (new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (1))));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(
						((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(), -1,
						(int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).removeStackFromSlot((int) (1));
			}
		}
		if ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemIronleafaxe.block, (int) (1)).getItem()) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))).getItem() == new ItemStack(ItemCloudleaf.block, (int) (1))
						.getItem()))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))) >= 3)
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockInfuserbase.block
								.getDefaultState().getBlock())))) {
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv != null && (inv instanceof TileEntityLockableLoot)) {
					ItemStack _setstack = new ItemStack(ItemCloudleafaxe.block, (int) (1));
					_setstack.setCount(1);
					((TileEntityLockableLoot) inv).setInventorySlotContents((int) (1), _setstack);
				}
			}
			((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof TileEntityLockableLoot)
						return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (1)))).addEnchantment(Enchantments.SILK_TOUCH, (int) 1);
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, (new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (1))));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(
						((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(), -1,
						(int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (3));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).removeStackFromSlot((int) (1));
			}
		}
		if ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemIronleafsword.block, (int) (1)).getItem()) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))).getItem() == new ItemStack(ItemCloudleaf.block, (int) (1))
						.getItem()))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))) >= 2)
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockInfuserbase.block
								.getDefaultState().getBlock())))) {
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv != null && (inv instanceof TileEntityLockableLoot)) {
					ItemStack _setstack = new ItemStack(ItemCloudleafsword.block, (int) (1));
					_setstack.setCount(1);
					((TileEntityLockableLoot) inv).setInventorySlotContents((int) (1), _setstack);
				}
			}
			((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof TileEntityLockableLoot)
						return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (1)))).addEnchantment(Enchantments.SILK_TOUCH, (int) 1);
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, (new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (1))));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(
						((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(), -1,
						(int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (2));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).removeStackFromSlot((int) (1));
			}
		}
		if ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemIronleafhoe.block, (int) (1)).getItem()) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))).getItem() == new ItemStack(ItemCloudleaf.block, (int) (1))
						.getItem()))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))) >= 2)
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockInfuserbase.block
								.getDefaultState().getBlock())))) {
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv != null && (inv instanceof TileEntityLockableLoot)) {
					ItemStack _setstack = new ItemStack(ItemCloudleafhoe.block, (int) (1));
					_setstack.setCount(1);
					((TileEntityLockableLoot) inv).setInventorySlotContents((int) (1), _setstack);
				}
			}
			((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof TileEntityLockableLoot)
						return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (1)))).addEnchantment(Enchantments.SILK_TOUCH, (int) 1);
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, (new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (1))));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(
						((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(), -1,
						(int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (2));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).removeStackFromSlot((int) (1));
			}
		}
		if ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemIronleafmultitool.block, (int) (1)).getItem()) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))).getItem() == new ItemStack(ItemCloudleaf.block, (int) (1))
						.getItem()))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))) >= 7)
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockInfuserbase.block
								.getDefaultState().getBlock())))) {
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv != null && (inv instanceof TileEntityLockableLoot)) {
					ItemStack _setstack = new ItemStack(ItemCloudleafmultitool.block, (int) (1));
					_setstack.setCount(1);
					((TileEntityLockableLoot) inv).setInventorySlotContents((int) (1), _setstack);
				}
			}
			((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof TileEntityLockableLoot)
						return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (1)))).addEnchantment(Enchantments.SILK_TOUCH, (int) 1);
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, (new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (1))));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(
						((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(), -1,
						(int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (7));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).removeStackFromSlot((int) (1));
			}
		}
		if ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemGoldleafpickaxe.block, (int) (1)).getItem()) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))).getItem() == new ItemStack(ItemCharredleaf.block, (int) (1))
						.getItem()))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))) >= 3)
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockInfuserbase.block
								.getDefaultState().getBlock())))) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(ItemCharredleafpickaxe.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(
						((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(), -1,
						(int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (3));
			}
		}
		if ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemGoldleafsword.block, (int) (1)).getItem()) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))).getItem() == new ItemStack(ItemCharredleaf.block, (int) (1))
						.getItem()))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))) >= 2)
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockInfuserbase.block
								.getDefaultState().getBlock())))) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(ItemCharredleafsword.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(
						((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(), -1,
						(int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (2));
			}
		}
		if ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemGoldleafshovel.block, (int) (1)).getItem()) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))).getItem() == new ItemStack(ItemCharredleaf.block, (int) (1))
						.getItem()))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))) >= 1)
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockInfuserbase.block
								.getDefaultState().getBlock())))) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(ItemCharredleafshovel.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(
						((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(), -1,
						(int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
			}
		}
		if ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemGoldleafaxe.block, (int) (1)).getItem()) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))).getItem() == new ItemStack(ItemCharredleaf.block, (int) (1))
						.getItem()))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))) >= 3)
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockInfuserbase.block
								.getDefaultState().getBlock())))) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(ItemCharredleafaxe.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(
						((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(), -1,
						(int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (3));
			}
		}
		if ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemGoldleafhoe.block, (int) (1)).getItem()) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))).getItem() == new ItemStack(ItemCharredleaf.block, (int) (1))
						.getItem()))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))) >= 2)
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockInfuserbase.block
								.getDefaultState().getBlock())))) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(ItemCharredleafhoe.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(
						((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(), -1,
						(int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (2));
			}
		}
		if ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemGoldleafmultitool.block, (int) (1)).getItem()) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))).getItem() == new ItemStack(ItemCharredleaf.block, (int) (1))
						.getItem()))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))) >= 7)
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockInfuserbase.block
								.getDefaultState().getBlock())))) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(ItemCharredleafmultitool.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(
						((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(), -1,
						(int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (7));
			}
		}
		if ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemDiamondleafarmorArmor.helmet, (int) (1)).getItem()) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0)))
						.getItem() == new ItemStack(ItemEnchantedleaf.block, (int) (1)).getItem()))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))) >= 5)
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockInfuserbase.block
								.getDefaultState().getBlock())))) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(ItemEnchantedleafarmorArmor.helmet, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(
						((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(), -1,
						(int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (5));
			}
		}
		if ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemDiamondleafarmorArmor.body, (int) (1)).getItem()) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0)))
						.getItem() == new ItemStack(ItemEnchantedleaf.block, (int) (1)).getItem()))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))) >= 8)
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockInfuserbase.block
								.getDefaultState().getBlock())))) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(ItemEnchantedleafarmorArmor.body, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(
						((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(), -1,
						(int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (8));
			}
		}
		if ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemDiamondleafarmorArmor.legs, (int) (1)).getItem()) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0)))
						.getItem() == new ItemStack(ItemEnchantedleaf.block, (int) (1)).getItem()))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))) >= 7)
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockInfuserbase.block
								.getDefaultState().getBlock())))) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(ItemEnchantedleafarmorArmor.legs, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(
						((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(), -1,
						(int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (7));
			}
		}
		if ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemDiamondleafarmorArmor.boots, (int) (1)).getItem()) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0)))
						.getItem() == new ItemStack(ItemEnchantedleaf.block, (int) (1)).getItem()))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))) >= 4)
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockInfuserbase.block
								.getDefaultState().getBlock())))) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(ItemEnchantedleafarmorArmor.boots, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(
						((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(), -1,
						(int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (4));
			}
		}
		if ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemIronleafarmorArmor.helmet, (int) (1)).getItem()) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))).getItem() == new ItemStack(ItemCloudleaf.block, (int) (1))
						.getItem()))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))) >= 5)
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockInfuserbase.block
								.getDefaultState().getBlock())))) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(ItemCloudleafarmorArmor.helmet, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(
						((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(), -1,
						(int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (5));
			}
		}
		if ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemIronleafarmorArmor.body, (int) (1)).getItem()) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))).getItem() == new ItemStack(ItemCloudleaf.block, (int) (1))
						.getItem()))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))) >= 8)
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockInfuserbase.block
								.getDefaultState().getBlock())))) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(ItemCloudleafarmorArmor.body, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(
						((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(), -1,
						(int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (8));
			}
		}
		if ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemIronleafarmorArmor.legs, (int) (1)).getItem()) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))).getItem() == new ItemStack(ItemCloudleaf.block, (int) (1))
						.getItem()))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))) >= 7)
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockInfuserbase.block
								.getDefaultState().getBlock())))) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(ItemCloudleafarmorArmor.legs, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(
						((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(), -1,
						(int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (7));
			}
		}
		if ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemIronleafarmorArmor.boots, (int) (1)).getItem()) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))).getItem() == new ItemStack(ItemCloudleaf.block, (int) (1))
						.getItem()))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))) >= 4)
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockInfuserbase.block
								.getDefaultState().getBlock())))) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(ItemCloudleafarmorArmor.boots, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(
						((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(), -1,
						(int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (4));
			}
		}
		if ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemGoldleafarmorArmor.helmet, (int) (1)).getItem()) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))).getItem() == new ItemStack(ItemCharredleaf.block, (int) (1))
						.getItem()))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))) >= 5)
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockInfuserbase.block
								.getDefaultState().getBlock())))) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(ItemCharredleafarmorArmor.helmet, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(
						((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(), -1,
						(int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (5));
			}
		}
		if ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemGoldleafarmorArmor.body, (int) (1)).getItem()) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))).getItem() == new ItemStack(ItemCharredleaf.block, (int) (1))
						.getItem()))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))) >= 8)
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockInfuserbase.block
								.getDefaultState().getBlock())))) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(ItemCharredleafarmorArmor.body, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(
						((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(), -1,
						(int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (8));
			}
		}
		if ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemGoldleafarmorArmor.legs, (int) (1)).getItem()) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))).getItem() == new ItemStack(ItemCharredleaf.block, (int) (1))
						.getItem()))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))) >= 7)
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockInfuserbase.block
								.getDefaultState().getBlock())))) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(ItemCharredleafarmorArmor.legs, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(
						((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(), -1,
						(int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (7));
			}
		}
		if ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemGoldleafarmorArmor.boots, (int) (1)).getItem()) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))).getItem() == new ItemStack(ItemCharredleaf.block, (int) (1))
						.getItem()))
				&& (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) (y - 1), (int) z), (int) (0))) >= 4)
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockInfuserbase.block
								.getDefaultState().getBlock())))) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, (y + 1), z, new ItemStack(ItemCharredleafarmorArmor.boots, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(
						((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(), -1,
						(int) 1, null);
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (4));
			}
		}
	}
}
