package me.onyx.agriculture;

import me.onyx.agriculture.crops.CornCrop;
import me.onyx.agriculture.plants.Tomato;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.CropBlock;
import net.minecraft.block.Material;
import net.minecraft.block.PlantBlock;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;

public class AgricultureMod implements ModInitializer {

    public static final PlantBlock TOMATO = new Tomato(AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().sounds(BlockSoundGroup.CROP).nonOpaque());
    public static final CropBlock CORN_CROP = new CornCrop(AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).nonOpaque());
	@Override
	public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier("agriculture", "tomato"), TOMATO);
        Registry.register(Registry.ITEM, new Identifier("agriculture", "tomato"), new BlockItem(TOMATO, new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(3).saturationModifier(6f).build())));
        Registry.register(Registry.BLOCK, new Identifier("agriculture", "corn_crop"), CORN_CROP);
        Registry.register(Registry.ITEM, new Identifier("agriculture", "corn_crop"), new BlockItem(CORN_CROP, new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(3).saturationModifier(6f).build())));
        BlockRenderLayerMap.INSTANCE.putBlock(AgricultureMod.CORN_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AgricultureMod.TOMATO, RenderLayer.getCutout());
	}
}