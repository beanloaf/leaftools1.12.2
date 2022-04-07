
package net.beanloaf.leaftools.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.beanloaf.leaftools.block.BlockEnchantedwood;
import net.beanloaf.leaftools.ElementsLeafToolsMod;

@ElementsLeafToolsMod.ModElement.Tag
public class OreDictLogBlocks extends ElementsLeafToolsMod.ModElement {
	public OreDictLogBlocks(ElementsLeafToolsMod instance) {
		super(instance, 116);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("logs", new ItemStack(BlockEnchantedwood.block, (int) (1)));
	}
}
