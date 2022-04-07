package net.beanloaf.leaftools.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.beanloaf.leaftools.item.ItemCloudleafarmorArmor;
import net.beanloaf.leaftools.ElementsLeafToolsMod;

import java.util.Map;

@ElementsLeafToolsMod.ModElement.Tag
public class ProcedureCloudleafarmorArmorBodyTickEvent extends ElementsLeafToolsMod.ModElement {
	public ProcedureCloudleafarmorArmorBodyTickEvent(ElementsLeafToolsMod instance) {
		super(instance, 164);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure CloudleafarmorArmorBodyTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(3) : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemCloudleafarmorArmor.helmet, (int) (1)).getItem())
				&& (((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(2) : ItemStack.EMPTY)
						.getItem() == new ItemStack(ItemCloudleafarmorArmor.body, (int) (1)).getItem()))
				&& ((((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(1) : ItemStack.EMPTY)
						.getItem() == new ItemStack(ItemCloudleafarmorArmor.legs, (int) (1)).getItem())
						&& (((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(0) : ItemStack.EMPTY)
								.getItem() == new ItemStack(ItemCloudleafarmorArmor.boots, (int) (1)).getItem())))) {
			entity.fallDistance = (float) (0);
		}
	}
}
