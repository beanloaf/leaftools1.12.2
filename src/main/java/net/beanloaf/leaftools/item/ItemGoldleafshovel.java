
package net.beanloaf.leaftools.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.beanloaf.leaftools.creativetab.TabLeaftools;
import net.beanloaf.leaftools.ElementsLeafToolsMod;

import java.util.Set;
import java.util.HashMap;

@ElementsLeafToolsMod.ModElement.Tag
public class ItemGoldleafshovel extends ElementsLeafToolsMod.ModElement {
	@GameRegistry.ObjectHolder("leaf_tools:goldleafshovel")
	public static final Item block = null;
	public ItemGoldleafshovel(ElementsLeafToolsMod instance) {
		super(instance, 23);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("GOLDLEAFSHOVEL", 3, 150, 11f, -2f, 23)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 3);
				return ret.keySet();
			}
		}.setUnlocalizedName("goldleafshovel").setRegistryName("goldleafshovel").setCreativeTab(TabLeaftools.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("leaf_tools:goldleafshovel", "inventory"));
	}
}
