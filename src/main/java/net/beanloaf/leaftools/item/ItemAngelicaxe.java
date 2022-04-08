
package net.beanloaf.leaftools.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ActionResult;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;

import net.beanloaf.leaftools.procedure.ProcedureAngelicaxeRightClickedInAir;
import net.beanloaf.leaftools.procedure.ProcedureAngelicaxeItemIsCraftedsmelted;
import net.beanloaf.leaftools.procedure.ProcedureAngelicaxeBlockDestroyedWithTool;
import net.beanloaf.leaftools.creativetab.TabLeaftools;
import net.beanloaf.leaftools.ElementsLeafToolsMod;

import java.util.Set;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import net.minecraft.item.ItemTool;

@ElementsLeafToolsMod.ModElement.Tag
public class ItemAngelicaxe extends ElementsLeafToolsMod.ModElement {
	@GameRegistry.ObjectHolder("leaf_tools:angelicaxe")
	public static final Item block = null;
	public ItemAngelicaxe(ElementsLeafToolsMod instance) {
		super(instance, 238);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemToolCustom() {
			@Override
			public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer entity, EnumHand hand) {
				ActionResult<ItemStack> retval = super.onItemRightClick(world, entity, hand);
				ItemStack itemstack = retval.getResult();
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					ProcedureAngelicaxeRightClickedInAir.executeProcedure($_dependencies);
				}
				return retval;
			}

			@Override
			public boolean onBlockDestroyed(ItemStack itemstack, World world, IBlockState bl, BlockPos pos, EntityLivingBase entity) {
				boolean retval = super.onBlockDestroyed(itemstack, world, bl, pos, entity);
				int x = pos.getX();
				int y = pos.getY();
				int z = pos.getZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("itemstack", itemstack);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					ProcedureAngelicaxeBlockDestroyedWithTool.executeProcedure($_dependencies);
				}
				return retval;
			}

			@Override
			public void onCreated(ItemStack itemstack, World world, EntityPlayer entity) {
				super.onCreated(itemstack, world, entity);
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("itemstack", itemstack);
					ProcedureAngelicaxeItemIsCraftedsmelted.executeProcedure($_dependencies);
				}
			}

			@Override
			@SideOnly(Side.CLIENT)
			public boolean hasEffect(ItemStack itemstack) {
				return true;
			}

			@Override
			public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
				if ((((itemstack).hasTagCompound() && (itemstack).getTagCompound().getBoolean("AS")) == (true))) {
					super.addInformation(itemstack, world, list, flag);
					list.add("Auto-Smelt");
				}
			}
		}.setUnlocalizedName("angelicaxe").setRegistryName("angelicaxe").setCreativeTab(TabLeaftools.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("leaf_tools:angelicaxe", "inventory"));
	}
	private static class ItemToolCustom extends ItemTool {
	
		protected ItemToolCustom() {
			super(EnumHelper.addToolMaterial("ANGELICAXE", 9, 2500, 4f, 18f, 15), effective_items_set);
			this.attackDamage = 18f;
			this.attackSpeed = -2.9f;
		}

	
		private static final Set<Block> effective_items_set = com.google.common.collect.Sets
				.newHashSet(new Block[]{Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN,
						Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE});


		@Override
		public float getDestroySpeed(ItemStack stack, IBlockState state) {
			Material material = state.getMaterial();
			return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE
					? super.getDestroySpeed(stack, state)
					: this.efficiency;
		}
	}
}
