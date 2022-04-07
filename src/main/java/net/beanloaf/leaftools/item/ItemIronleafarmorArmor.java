
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
public class ItemIronleafarmorArmor extends ElementsLeafToolsMod.ModElement {
	@GameRegistry.ObjectHolder("leaf_tools:ironleafarmor_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("leaf_tools:ironleafarmor_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("leaf_tools:ironleafarmor_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("leaf_tools:ironleafarmor_armorboots")
	public static final Item boots = null;
	public ItemIronleafarmorArmor(ElementsLeafToolsMod instance) {
		super(instance, 51);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("IRONLEAFARMOR_ARMOR", "leaf_tools:ironleafarmor", 15, new int[]{2, 5, 4, 2}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0.25f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("ironleafarmor_armorhelmet")
				.setRegistryName("ironleafarmor_armorhelmet").setCreativeTab(TabLeaftools.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("ironleafarmor_armorbody")
				.setRegistryName("ironleafarmor_armorbody").setCreativeTab(TabLeaftools.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("ironleafarmor_armorlegs")
				.setRegistryName("ironleafarmor_armorlegs").setCreativeTab(TabLeaftools.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("ironleafarmor_armorboots")
				.setRegistryName("ironleafarmor_armorboots").setCreativeTab(TabLeaftools.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("leaf_tools:ironleafarmor_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("leaf_tools:ironleafarmor_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("leaf_tools:ironleafarmor_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("leaf_tools:ironleafarmor_armorboots", "inventory"));
	}
}
