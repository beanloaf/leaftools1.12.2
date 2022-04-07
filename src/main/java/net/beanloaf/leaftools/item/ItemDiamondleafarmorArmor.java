
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
public class ItemDiamondleafarmorArmor extends ElementsLeafToolsMod.ModElement {
	@GameRegistry.ObjectHolder("leaf_tools:diamondleafarmor_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("leaf_tools:diamondleafarmor_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("leaf_tools:diamondleafarmor_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("leaf_tools:diamondleafarmor_armorboots")
	public static final Item boots = null;
	public ItemDiamondleafarmorArmor(ElementsLeafToolsMod instance) {
		super(instance, 52);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("DIAMONDLEAFARMOR_ARMOR", "leaf_tools:diamondleafarmor", 38,
				new int[]{5, 11, 7, 5}, 23,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 2.25f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("diamondleafarmor_armorhelmet")
				.setRegistryName("diamondleafarmor_armorhelmet").setCreativeTab(TabLeaftools.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("diamondleafarmor_armorbody")
				.setRegistryName("diamondleafarmor_armorbody").setCreativeTab(TabLeaftools.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("diamondleafarmor_armorlegs")
				.setRegistryName("diamondleafarmor_armorlegs").setCreativeTab(TabLeaftools.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("diamondleafarmor_armorboots")
				.setRegistryName("diamondleafarmor_armorboots").setCreativeTab(TabLeaftools.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("leaf_tools:diamondleafarmor_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("leaf_tools:diamondleafarmor_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("leaf_tools:diamondleafarmor_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("leaf_tools:diamondleafarmor_armorboots", "inventory"));
	}
}
