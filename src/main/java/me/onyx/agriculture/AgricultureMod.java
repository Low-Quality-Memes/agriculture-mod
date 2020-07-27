package me.onyx.agriculture;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;

public class AgricultureMod implements ModInitializer {

    private static final Item CORN = new CornItem(new Item.Settings().group(ItemGroup.FOOD).maxCount(64));

	@Override
	public void onInitialize() {
	    Registry.register(Registry.ITEM, new Identifier("agriculture", "corn"), CORN);
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("bean time");
	}
}
