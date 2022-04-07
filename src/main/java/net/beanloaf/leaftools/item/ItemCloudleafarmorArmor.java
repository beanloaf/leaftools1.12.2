
package net.beanloaf.leaftools.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.beanloaf.leaftools.procedure.ProcedureCloudleafarmorArmorBodyTickEvent;
import net.beanloaf.leaftools.creativetab.TabLeaftools;
import net.beanloaf.leaftools.ElementsLeafToolsMod;

import java.util.Map;
import java.util.HashMap;

@ElementsLeafToolsMod.ModElement.Tag
public class ItemCloudleafarmorArmor extends ElementsLeafToolsMod.ModElement {
	@GameRegistry.ObjectHolder("leaf_tools:cloudleafarmor_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("leaf_tools:cloudleafarmor_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("leaf_tools:cloudleafarmor_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("leaf_tools:cloudleafarmor_armorboots")
	public static final Item boots = null;
	public ItemCloudleafarmorArmor(ElementsLeafToolsMod instance) {
		super(instance, 53);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("CLOUDLEAFARMOR_ARMOR", "leaf_tools:cloudleafarmor", 18, new int[]{2, 7, 6, 2},
				11, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0.44f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("cloudleafarmor_armorhelmet")
				.setRegistryName("cloudleafarmor_armorhelmet").setCreativeTab(TabLeaftools.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureCloudleafarmorArmorBodyTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("cloudleafarmor_armorbody").setRegistryName("cloudleafarmor_armorbody").setCreativeTab(TabLeaftools.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("cloudleafarmor_armorlegs")
				.setRegistryName("cloudleafarmor_armorlegs").setCreativeTab(TabLeaftools.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("cloudleafarmor_armorboots")
				.setRegistryName("cloudleafarmor_armorboots").setCreativeTab(TabLeaftools.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("leaf_tools:cloudleafarmor_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("leaf_tools:cloudleafarmor_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("leaf_tools:cloudleafarmor_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("leaf_tools:cloudleafarmor_armorboots", "inventory"));
	}
}
