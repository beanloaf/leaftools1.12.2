package net.beanloaf.leaftools.procedure;

import net.minecraft.world.gen.structure.template.Template;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Rotation;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Mirror;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.Block;

import net.beanloaf.leaftools.ElementsLeafToolsMod;

import java.util.Map;

@ElementsLeafToolsMod.ModElement.Tag
public class ProcedureEnchantedtreesaplingOnBlockRightClicked extends ElementsLeafToolsMod.ModElement {
	public ProcedureEnchantedtreesaplingOnBlockRightClicked(ElementsLeafToolsMod instance) {
		super(instance, 120);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure EnchantedtreesaplingOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure EnchantedtreesaplingOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure EnchantedtreesaplingOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure EnchantedtreesaplingOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure EnchantedtreesaplingOnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(Items.DYE, (int) (1), 15).getItem())) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Items.DYE, (int) (1), 15).getItem(), 15, (int) 1, null);
			if ((Math.random() < 0.25)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
				if (!world.isRemote) {
					Template template = ((WorldServer) world).getStructureTemplateManager().getTemplate(world.getMinecraftServer(),
							new ResourceLocation("leaf_tools", "enchantedtree1"));
					if (template != null) {
						BlockPos spawnTo = new BlockPos((int) x, (int) y, (int) z);
						IBlockState iblockstate = world.getBlockState(spawnTo);
						world.notifyBlockUpdate(spawnTo, iblockstate, iblockstate, 3);
						template.addBlocksToWorldChunk(world, spawnTo, new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE)
								.setChunk((ChunkPos) null).setReplacedBlock((Block) null).setIgnoreStructureBlock(false).setIgnoreEntities(false));
					}
				}
				if (!world.isRemote) {
					Template template = ((WorldServer) world).getStructureTemplateManager().getTemplate(world.getMinecraftServer(),
							new ResourceLocation("leaf_tools", "enchantedtree2"));
					if (template != null) {
						BlockPos spawnTo = new BlockPos((int) (x - 2), (int) (y + 2), (int) (z - 2));
						IBlockState iblockstate = world.getBlockState(spawnTo);
						world.notifyBlockUpdate(spawnTo, iblockstate, iblockstate, 3);
						template.addBlocksToWorldChunk(world, spawnTo, new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE)
								.setChunk((ChunkPos) null).setReplacedBlock((Block) null).setIgnoreStructureBlock(false).setIgnoreEntities(false));
					}
				}
				if (!world.isRemote) {
					Template template = ((WorldServer) world).getStructureTemplateManager().getTemplate(world.getMinecraftServer(),
							new ResourceLocation("leaf_tools", "enchantedtree3"));
					if (template != null) {
						BlockPos spawnTo = new BlockPos((int) (x - 1), (int) (y + 4), (int) (z - 1));
						IBlockState iblockstate = world.getBlockState(spawnTo);
						world.notifyBlockUpdate(spawnTo, iblockstate, iblockstate, 3);
						template.addBlocksToWorldChunk(world, spawnTo, new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE)
								.setChunk((ChunkPos) null).setReplacedBlock((Block) null).setIgnoreStructureBlock(false).setIgnoreEntities(false));
					}
				}
			}
		}
	}
}
