
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
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import net.beanloaf.leaftools.procedure.ProcedureAngelicshovelRightClickedInAir;
import net.beanloaf.leaftools.procedure.ProcedureAngelicshovelItemIsCraftedsmelted;
import net.beanloaf.leaftools.procedure.ProcedureAngelicshovelBlockDestroyedWithTool;
import net.beanloaf.leaftools.creativetab.TabLeaftools;
import net.beanloaf.leaftools.ElementsLeafToolsMod;

import java.util.Set;
import java.util.Map;
import java.util.List;
import java.util.HashMap;

@ElementsLeafToolsMod.ModElement.Tag
public class ItemAngelicshovel extends ElementsLeafToolsMod.ModElement {
	@GameRegistry.ObjectHolder("leaf_tools:angelicshovel")
	public static final Item block = null;
	public ItemAngelicshovel(ElementsLeafToolsMod instance) {
		super(instance, 246);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("ANGELICSHOVEL", 9, 2500, 15f, 1f, 25)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 9);
				return ret.keySet();
			}

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
					ProcedureAngelicshovelRightClickedInAir.executeProcedure($_dependencies);
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
					ProcedureAngelicshovelBlockDestroyedWithTool.executeProcedure($_dependencies);
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
					ProcedureAngelicshovelItemIsCraftedsmelted.executeProcedure($_dependencies);
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
		}.setUnlocalizedName("angelicshovel").setRegistryName("angelicshovel").setCreativeTab(TabLeaftools.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("leaf_tools:angelicshovel", "inventory"));
	}
}
