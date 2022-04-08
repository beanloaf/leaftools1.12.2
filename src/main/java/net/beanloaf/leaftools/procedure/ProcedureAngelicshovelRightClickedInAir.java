package net.beanloaf.leaftools.procedure;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.beanloaf.leaftools.gui.GuiAngelicshovelgui;
import net.beanloaf.leaftools.LeafToolsMod;
import net.beanloaf.leaftools.ElementsLeafToolsMod;

import java.util.Map;

@ElementsLeafToolsMod.ModElement.Tag
public class ProcedureAngelicshovelRightClickedInAir extends ElementsLeafToolsMod.ModElement {
	public ProcedureAngelicshovelRightClickedInAir(ElementsLeafToolsMod instance) {
		super(instance, 249);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure AngelicshovelRightClickedInAir!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure AngelicshovelRightClickedInAir!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure AngelicshovelRightClickedInAir!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure AngelicshovelRightClickedInAir!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure AngelicshovelRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemOffhand() : ItemStack.EMPTY)
				.getItem() == (ItemStack.EMPTY).getItem())) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).openGui(LeafToolsMod.instance, GuiAngelicshovelgui.GUIID, world, x, y, z);
		}
	}
}
