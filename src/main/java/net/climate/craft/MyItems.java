package net.climate.craft;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.Item;

public class MyItems {

    // List of Items
    public static final Item THERMOMETER =
            register("thermometer", new Item(new Item.Settings().group(ClimateCraft.CLIMATE_GROUP)));
    public static final Item PH_TESTER =
            register("ph_tester", new Item(new Item.Settings().group(ClimateCraft.CLIMATE_GROUP)));
    public static final Item AIR_TESTER =
            register("air_tester", new Item(new Item.Settings().group(ClimateCraft.CLIMATE_GROUP)));
    public static final Item SOLAR_CELL =
            register("solar_cell", new Item(new Item.Settings().group(ClimateCraft.CLIMATE_GROUP)));
    public static final Item FILTER =
            register("filter", new Item(new Item.Settings().group(ClimateCraft.CLIMATE_GROUP)));

    // Create a new item in the registry
    public static Item register(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier("climatecraft", name), item);
    }

    public static void init(){
    }
}
