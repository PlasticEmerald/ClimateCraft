package net.climate.craft;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class Items {

    // Item Group to hold items from mod
    public static final ItemGroup CLIMATE_GROUP =
            FabricItemGroupBuilder.build(new Identifier("climatecraft", "items"),
                    () -> new ItemStack(Blocks.COAL_ORE));

    // List of items
    public static final Item THERMOMETER =
            register("thermometer", new Item(new Item.Settings().group(Items.CLIMATE_GROUP)));
    public static final Item PH_TESTER =
            register("ph_tester", new Item(new Item.Settings().group(Items.CLIMATE_GROUP)));
    public static final Item AIR_TESTER =
            register("air_tester", new Item(new Item.Settings().group(Items.CLIMATE_GROUP)));
    public static final Item AIR_SCRUBBER =
            register("air_scrubber", new Item(new Item.Settings().group(Items.CLIMATE_GROUP)));
    public static final Item WATER_CLEANER =
            register("water_cleaner", new Item(new Item.Settings().group(Items.CLIMATE_GROUP)));
    public static final Item SOLAR_PANEL =
            register("solar_panel", new Item(new Item.Settings().group(Items.CLIMATE_GROUP)));

    // Create a new item in the registry
    public static Item register(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier("climatecraft", name), item);
    }

    public static void init(){
    }
}
