package net.climate.craft;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class MyItems {

    // List of Items
    public static final Item THERMOMETER =
            register("thermometer", new Item(new Item.Settings().group(ClimateCraft.CLIMATE_GROUP)));
    public static final Item PH_TESTER =
            register("ph_tester", new Item(new Item.Settings().group(ClimateCraft.CLIMATE_GROUP)));
    public static final Item AIR_TESTER =
            register("air_tester", new Item(new Item.Settings().group(ClimateCraft.CLIMATE_GROUP)));

    // Create a new item in the registry
    public static Item register(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier("climatecraft", name), item);
    }

    public static void init(){
    }
}
