
package net.beanloaf.leaftools.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.beanloaf.leaftools.item.ItemGoldmulch;
import net.beanloaf.leaftools.item.ItemGoldleaf;
import net.beanloaf.leaftools.ElementsLeafToolsMod;

@ElementsLeafToolsMod.ModElement.Tag
public class RecipeGoldleafrecipe extends ElementsLeafToolsMod.ModElement {
	public RecipeGoldleafrecipe(ElementsLeafToolsMod instance) {
		super(instance, 96);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemGoldmulch.block, (int) (1)), new ItemStack(ItemGoldleaf.block, (int) (1)), 1F);
	}
}
