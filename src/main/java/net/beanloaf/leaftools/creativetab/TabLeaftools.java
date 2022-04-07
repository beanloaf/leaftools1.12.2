
package net.beanloaf.leaftools.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.beanloaf.leaftools.item.ItemIronleaf;
import net.beanloaf.leaftools.ElementsLeafToolsMod;

@ElementsLeafToolsMod.ModElement.Tag
public class TabLeaftools extends ElementsLeafToolsMod.ModElement {
	public TabLeaftools(ElementsLeafToolsMod instance) {
		super(instance, 86);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tableaftools") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemIronleaf.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
