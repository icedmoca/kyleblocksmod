package net.mcreator.kyleblocks;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@Elementskyleblocks.ModElement.Tag
public class MCreatorKylesblocks extends Elementskyleblocks.ModElement {
	public MCreatorKylesblocks(Elementskyleblocks instance) {
		super(instance, 10);
	}
	public static CreativeTabs tab = new CreativeTabs("tabkylesblocks") {
		@SideOnly(Side.CLIENT)
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(MCreatorCeilingtile.block, (int) (1));
		}

		@SideOnly(Side.CLIENT)
		public boolean hasSearchBar() {
			return false;
		}
	};
}
