
package net.beanloaf.leaftools.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.beanloaf.leaftools.item.ItemIronmulch;
import net.beanloaf.leaftools.item.ItemIronleaf;
import net.beanloaf.leaftools.ElementsLeafToolsMod;

@ElementsLeafToolsMod.ModElement.Tag
public class RecipeIronleafrecipe extends ElementsLeafToolsMod.ModElement {
	public RecipeIronleafrecipe(ElementsLeafToolsMod instance) {
		super(instance, 87);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemIronmulch.block, (int) (1)), new ItemStack(ItemIronleaf.block, (int) (1)), 1F);
	}
}
