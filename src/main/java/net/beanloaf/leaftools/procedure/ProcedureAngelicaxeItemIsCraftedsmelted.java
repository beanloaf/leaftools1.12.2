package net.beanloaf.leaftools.procedure;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.item.ItemStack;

import net.beanloaf.leaftools.ElementsLeafToolsMod;

import java.util.Map;

@ElementsLeafToolsMod.ModElement.Tag
public class ProcedureAngelicaxeItemIsCraftedsmelted extends ElementsLeafToolsMod.ModElement {
	public ProcedureAngelicaxeItemIsCraftedsmelted(ElementsLeafToolsMod instance) {
		super(instance, 244);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure AngelicaxeItemIsCraftedsmelted!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		{
			ItemStack _stack = (itemstack);
			if (!_stack.hasTagCompound())
				_stack.setTagCompound(new NBTTagCompound());
			_stack.getTagCompound().setBoolean("AS", (false));
		}
		{
			ItemStack _stack = (itemstack);
			if (!_stack.hasTagCompound())
				_stack.setTagCompound(new NBTTagCompound());
			_stack.getTagCompound().setBoolean("ST", (false));
		}
	}
}
