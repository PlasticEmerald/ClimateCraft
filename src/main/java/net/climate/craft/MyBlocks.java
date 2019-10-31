package net.climate.craft;

import net.climate.craft.blocks.AirScrubberBlock;
import net.climate.craft.blocks.SolarPanelBlock;
import net.climate.craft.blocks.WaterCleanerBlock;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MyBlocks {

    // List of Blocks
    public static final Block SOLAR_PANEL =
            register("solar_panel", new SolarPanelBlock());
    public static final Block AIR_SCRUBBER =
            register("air_scrubber", new AirScrubberBlock());
    public static final Block WATER_CLEANER =
            register("water_cleaner", new WaterCleanerBlock());

    // Create a new block and block item in the registry
    public static Block register(String name, Block block) {
        Registry.register(Registry.BLOCK, new Identifier("climatecraft", name), block);
        Registry.register(Registry.ITEM, new Identifier("climatecraft", name),
                new BlockItem(block, new Item.Settings().group(ClimateCraft.CLIMATE_GROUP)));
        return block;
    }

    public static void init(){
    }
}
