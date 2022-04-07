
package net.beanloaf.leaftools.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.beanloaf.leaftools.item.ItemCloudmulch;
import net.beanloaf.leaftools.item.ItemCloudleaf;
import net.beanloaf.leaftools.ElementsLeafToolsMod;

@ElementsLeafToolsMod.ModElement.Tag
public class RecipeCloudleafrecipe extends ElementsLeafToolsMod.ModElement {
	public RecipeCloudleafrecipe(ElementsLeafToolsMod instance) {
		super(instance, 155);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemCloudmulch.block, (int) (1)), new ItemStack(ItemCloudleaf.block, (int) (1)), 1F);
	}
}
