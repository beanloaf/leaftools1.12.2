
package net.beanloaf.leaftools.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.beanloaf.leaftools.item.ItemEnchantedmulch;
import net.beanloaf.leaftools.item.ItemEnchantedleaf;
import net.beanloaf.leaftools.ElementsLeafToolsMod;

@ElementsLeafToolsMod.ModElement.Tag
public class RecipeEnchantedleafrecipe extends ElementsLeafToolsMod.ModElement {
	public RecipeEnchantedleafrecipe(ElementsLeafToolsMod instance) {
		super(instance, 127);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemEnchantedmulch.block, (int) (1)), new ItemStack(ItemEnchantedleaf.block, (int) (1)), 1F);
	}
}
