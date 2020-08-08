package me.onyx.agriculture.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class ScytheBase extends PickaxeItem {
    public ScytheBase(ToolMaterial toolMaterial_1) {
        super(toolMaterial_1, -1, -2.2f, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
