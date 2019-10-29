package net.climate.craft;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class Items {

    // List of items
    public static final Item THERMOMETER =
            register("thermometer", new Item(new Item.Settings().group(ItemGroup.MISC)));
    public static final Item SOLAR_PANEL =
            register("solar_panel", new Item(new Item.Settings().group(ItemGroup.MISC)));

    // Create a new item in the registry
    public static Item register(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier("climatecraft", name), item);
    }

    public static void init(){
    }
}
