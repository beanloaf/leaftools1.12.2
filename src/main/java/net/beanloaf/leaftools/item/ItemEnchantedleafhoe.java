
package net.beanloaf.leaftools.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.beanloaf.leaftools.creativetab.TabLeaftools;
import net.beanloaf.leaftools.ElementsLeafToolsMod;

import java.util.Set;
import java.util.HashMap;

@ElementsLeafToolsMod.ModElement.Tag
public class ItemEnchantedleafhoe extends ElementsLeafToolsMod.ModElement {
	@GameRegistry.ObjectHolder("leaf_tools:enchantedleafhoe")
	public static final Item block = null;
	public ItemEnchantedleafhoe(ElementsLeafToolsMod instance) {
		super(instance, 48);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemHoe(EnumHelper.addToolMaterial("ENCHANTEDLEAFHOE", 5, 2000, 15f, 0f, 25)) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("hoe", 5);
				return ret.keySet();
			}
		}.setUnlocalizedName("enchantedleafhoe").setRegistryName("enchantedleafhoe").setCreativeTab(TabLeaftools.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("leaf_tools:enchantedleafhoe", "inventory"));
	}
}
