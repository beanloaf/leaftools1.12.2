
package net.beanloaf.leaftools.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.beanloaf.leaftools.item.ItemCharredmulch;
import net.beanloaf.leaftools.item.ItemCharredleaf;
import net.beanloaf.leaftools.ElementsLeafToolsMod;

@ElementsLeafToolsMod.ModElement.Tag
public class RecipeCharredleafrecipe extends ElementsLeafToolsMod.ModElement {
	public RecipeCharredleafrecipe(ElementsLeafToolsMod instance) {
		super(instance, 156);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemCharredmulch.block, (int) (1)), new ItemStack(ItemCharredleaf.block, (int) (1)), 1F);
	}
}
