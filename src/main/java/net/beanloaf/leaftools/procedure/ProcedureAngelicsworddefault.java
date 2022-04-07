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
public class ProcedureAngelicsworddefault extends ElementsLeafToolsMod.ModElement {
	public ProcedureAngelicsworddefault(ElementsLeafToolsMod instance) {
		super(instance, 239);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Angelicsworddefault!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Map<Enchantment, Integer> _enchantments = EnchantmentHelper
				.getEnchantments(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY));
		{
			ItemStack _stack = ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY);
			if (!_stack.hasTagCompound())
				_stack.setTagCompound(new NBTTagCompound());
			_stack.getTagCompound().setBoolean("FA", (false));
		} /* remove fire aspect */
		if (_enchantments.containsKey(Enchantments.FIRE_ASPECT)) {
			_enchantments.remove(Enchantments.FIRE_ASPECT);
			EnchantmentHelper.setEnchantments(_enchantments,
					((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY));
		}
		{
			ItemStack _stack = ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY);
			if (!_stack.hasTagCompound())
				_stack.setTagCompound(new NBTTagCompound());
			_stack.getTagCompound().setBoolean("SMITE", (false));
		} /* remove smite */
		if (_enchantments.containsKey(Enchantments.SMITE)) {
			_enchantments.remove(Enchantments.SMITE);
			EnchantmentHelper.setEnchantments(_enchantments,
					((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY));
		}
		{
			ItemStack _stack = ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY);
			if (!_stack.hasTagCompound())
				_stack.setTagCompound(new NBTTagCompound());
			_stack.getTagCompound().setBoolean("BOA", (false));
		} /* remove bane of arthropods */
		if (_enchantments.containsKey(Enchantments.BANE_OF_ARTHROPODS)) {
			_enchantments.remove(Enchantments.BANE_OF_ARTHROPODS);
			EnchantmentHelper.setEnchantments(_enchantments,
					((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY));
		}
	}
}
