package net.climate.craft;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;


public class ClimateCraft implements ModInitializer {

	// Item Group to hold items from mod
	public static final ItemGroup CLIMATE_GROUP =
			FabricItemGroupBuilder.build(new Identifier("climatecraft", "items"),
					() -> new ItemStack(Blocks.COAL_ORE));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		MyItems.init();
		MyBlocks.init();
	}
}
