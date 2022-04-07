
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
public class ItemGoldleafarmorArmor extends ElementsLeafToolsMod.ModElement {
	@GameRegistry.ObjectHolder("leaf_tools:goldleafarmor_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("leaf_tools:goldleafarmor_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("leaf_tools:goldleafarmor_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("leaf_tools:goldleafarmor_armorboots")
	public static final Item boots = null;
	public ItemGoldleafarmorArmor(ElementsLeafToolsMod instance) {
		super(instance, 50);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("GOLDLEAFARMOR_ARMOR", "leaf_tools:goldleafarmor", 27, new int[]{4, 10, 7, 4}, 18,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 1f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("goldleafarmor_armorhelmet")
				.setRegistryName("goldleafarmor_armorhelmet").setCreativeTab(TabLeaftools.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("goldleafarmor_armorbody")
				.setRegistryName("goldleafarmor_armorbody").setCreativeTab(TabLeaftools.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("goldleafarmor_armorlegs")
				.setRegistryName("goldleafarmor_armorlegs").setCreativeTab(TabLeaftools.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("goldleafarmor_armorboots")
				.setRegistryName("goldleafarmor_armorboots").setCreativeTab(TabLeaftools.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("leaf_tools:goldleafarmor_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("leaf_tools:goldleafarmor_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("leaf_tools:goldleafarmor_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("leaf_tools:goldleafarmor_armorboots", "inventory"));
	}
}
