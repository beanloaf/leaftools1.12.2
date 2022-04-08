package net.beanloaf.leaftools.procedure;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Enchantments;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantment;

import net.beanloaf.leaftools.ElementsLeafToolsMod;

import java.util.Map;

@ElementsLeafToolsMod.ModElement.Tag
public class ProcedureAngelicaxedefaultbutton extends ElementsLeafToolsMod.ModElement {
	public ProcedureAngelicaxedefaultbutton(ElementsLeafToolsMod instance) {
		super(instance, 243);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Angelicaxedefaultbutton!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			ItemStack _stack = ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY);
			if (!_stack.hasTagCompound())
				_stack.setTagCompound(new NBTTagCompound());
			_stack.getTagCompound().setBoolean("AS", (false));
		}
		{
			ItemStack _stack = ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY);
			if (!_stack.hasTagCompound())
				_stack.setTagCompound(new NBTTagCompound());
			_stack.getTagCompound().setBoolean("ST", (false));
		} /* remove silk touch */
		Map<Enchantment, Integer> _enchantments = EnchantmentHelper
				.getEnchantments(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY));
		if (_enchantments.containsKey(Enchantments.SILK_TOUCH)) {
			_enchantments.remove(Enchantments.SILK_TOUCH);
			EnchantmentHelper.setEnchantments(_enchantments,
					((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY));
		}
	}
}
