package me.onyx.agriculture;

import me.onyx.agriculture.items.CornItem;
import me.onyx.agriculture.items.StrawberryItem;
import me.onyx.agriculture.items.TomatoItem;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;

public class AgricultureMod implements ModInitializer {

    private static final Item CORN = new CornItem(new Item.Settings().group(ItemGroup.FOOD).maxCount(64));
    private static final Item TOMATO = new TomatoItem(new Item.Settings().group(ItemGroup.FOOD).maxCount(64));
    private static final Item STRAWBERRY = new StrawberryItem(new Item.Settings().group(ItemGroup.FOOD).maxCount(64));
	@Override
	public void onInitialize() {
	    Registry.register(Registry.ITEM, new Identifier("agriculture", "corn"), CORN);
        Registry.register(Registry.ITEM, new Identifier("agriculture", "tomato"), TOMATO);
        Registry.register(Registry.ITEM, new Identifier("agriculture", "strawberry"), STRAWBERRY);

		System.out.println("bean time");
	}
}
