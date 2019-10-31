package net.climate.craft.blocks;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class AirScrubberBlock extends Block {

    public AirScrubberBlock() {
        super(FabricBlockSettings.of(Material.STONE).breakByHand(false).breakByTool(FabricToolTags.PICKAXES)
                .sounds(BlockSoundGroup.STONE).strength(2, 0.2f).build());
    }
}
