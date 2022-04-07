
package net.beanloaf.leaftools.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.beanloaf.leaftools.creativetab.TabLeaftools;
import net.beanloaf.leaftools.ElementsLeafToolsMod;

@ElementsLeafToolsMod.ModElement.Tag
public class ItemEnchantedleafarmorArmor extends ElementsLeafToolsMod.ModElement {
	@GameRegistry.ObjectHolder("leaf_tools:enchantedleafarmor_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("leaf_tools:enchantedleafarmor_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("leaf_tools:enchantedleafarmor_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("leaf_tools:enchantedleafarmor_armorboots")
	public static final Item boots = null;
	public ItemEnchantedleafarmorArmor(ElementsLeafToolsMod instance) {
		super(instance, 55);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("ENCHANTEDLEAFARMOR_ARMOR", "leaf_tools:enchantedleafarmor", 45,
				new int[]{6, 12, 8, 6}, 25,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 2.75f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("enchantedleafarmor_armorhelmet")
				.setRegistryName("enchantedleafarmor_armorhelmet").setCreativeTab(TabLeaftools.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("enchantedleafarmor_armorbody")
				.setRegistryName("enchantedleafarmor_armorbody").setCreativeTab(TabLeaftools.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("enchantedleafarmor_armorlegs")
				.setRegistryName("enchantedleafarmor_armorlegs").setCreativeTab(TabLeaftools.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("enchantedleafarmor_armorboots")
				.setRegistryName("enchantedleafarmor_armorboots").setCreativeTab(TabLeaftools.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("leaf_tools:enchantedleafarmor_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("leaf_tools:enchantedleafarmor_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("leaf_tools:enchantedleafarmor_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("leaf_tools:enchantedleafarmor_armorboots", "inventory"));
	}
}
