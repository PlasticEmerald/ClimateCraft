package net.climate.craft;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import java.io.*;
import java.util.Scanner;


public class ClimateCraft implements ModInitializer {

	// Item Group to hold items from mod
	public static final ItemGroup CLIMATE_GROUP =
			FabricItemGroupBuilder.build(new Identifier("climatecraft", "items"),
					() -> new ItemStack(Blocks.COAL_ORE));

	public static double carbonCount = 0.0;

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		// Create file and scanner to check the saved carbon
		File file = new File("climatecraft.txt");
		Scanner scanner;

		try {
			if (file.exists()) {
				scanner = new Scanner(file);
				if (scanner.hasNextDouble()) {
					carbonCount = scanner.nextDouble();
				}
				scanner.close();
			} else {
				PrintWriter writer = new PrintWriter("climatecraft.txt", "UTF-8");
				writer.print(carbonCount);
				writer.close();
			}
		}
		catch (IOException e) {
			System.out.println("ERROR: COULD NOT OPEN FILE WITH SCANNER");
			System.exit(1);
		}

		MyItems.init();
		MyBlocks.init();
		MyEntities.init();
	}
}
