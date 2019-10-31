package net.climate.craft.blocks;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class SolarPanelBlock extends Block {

    public SolarPanelBlock() {
        super(FabricBlockSettings.of(Material.GLASS).breakByHand(true)
                .sounds(BlockSoundGroup.GLASS).strength(1, 0.2f).build());
    }
}
