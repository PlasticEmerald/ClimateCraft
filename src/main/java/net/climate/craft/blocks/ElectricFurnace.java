package net.climate.craft.blocks;

import net.climate.craft.entities.ElectricFurnaceEntity;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.world.BlockView;

public class ElectricFurnace extends BlockWithEntity {

    public ElectricFurnace() {
        super(FabricBlockSettings.of(Material.STONE).breakByHand(false).breakByTool(FabricToolTags.PICKAXES)
                .sounds(BlockSoundGroup.STONE).strength(2, 0.2f).build());

    }

    @Override
    public BlockEntity createBlockEntity(BlockView blockView) {
        return new ElectricFurnaceEntity();
    }
}
