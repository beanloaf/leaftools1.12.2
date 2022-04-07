
package net.beanloaf.leaftools.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.beanloaf.leaftools.item.ItemDiamondmulch;
import net.beanloaf.leaftools.item.ItemDiamondleaf;
import net.beanloaf.leaftools.ElementsLeafToolsMod;

@ElementsLeafToolsMod.ModElement.Tag
public class RecipeDiamondleafrecipe extends ElementsLeafToolsMod.ModElement {
	public RecipeDiamondleafrecipe(ElementsLeafToolsMod instance) {
		super(instance, 101);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemDiamondmulch.block, (int) (1)), new ItemStack(ItemDiamondleaf.block, (int) (1)), 1F);
	}
}
