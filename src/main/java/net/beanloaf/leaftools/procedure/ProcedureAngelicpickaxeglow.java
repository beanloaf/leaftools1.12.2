package net.beanloaf.leaftools.procedure;

import net.minecraft.item.ItemStack;

import net.beanloaf.leaftools.ElementsLeafToolsMod;

import java.util.Map;

@ElementsLeafToolsMod.ModElement.Tag
public class ProcedureAngelicpickaxeglow extends ElementsLeafToolsMod.ModElement {
	public ProcedureAngelicpickaxeglow(ElementsLeafToolsMod instance) {
		super(instance, 234);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure Angelicpickaxeglow!");
			return false;
		}
		
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");


		
		
		if (((itemstack).hasTagCompound() && (itemstack).getTagCompound().getBoolean("BST")) == (true) ||
			((itemstack).hasTagCompound() && (itemstack).getTagCompound().getBoolean("AS")) == (true)) {
			return (true);
		}
		return (false);


	}
}