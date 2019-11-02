package net.climate.craft;

import net.climate.craft.entities.AirScrubberEntity;
import net.climate.craft.entities.ElectricFurnaceEntity;
import net.climate.craft.entities.SolarPanelEntity;
import net.climate.craft.entities.WaterCleanerEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.registry.Registry;

public class MyEntities {

    public static BlockEntityType<ElectricFurnaceEntity> ELECTRIC_FURNACE_ENTITY = Registry.register
            (Registry.BLOCK_ENTITY, "climatecraft:electric_furnace", BlockEntityType
            .Builder.create(ElectricFurnaceEntity::new, MyBlocks.ELECTRIC_FURNACE).build(null));

    public static BlockEntityType<AirScrubberEntity> AIR_SCRUBBER_ENTITY = Registry.register
            (Registry.BLOCK_ENTITY, "climatecraft:air_scrubber", BlockEntityType
            .Builder.create(AirScrubberEntity::new, MyBlocks.AIR_SCRUBBER).build(null));

    public static BlockEntityType<WaterCleanerEntity> WATER_CLEANER_ENTITY = Registry.register
            (Registry.BLOCK_ENTITY, "climatecraft:water_cleaner", BlockEntityType
            .Builder.create(WaterCleanerEntity::new, MyBlocks.WATER_CLEANER).build(null));

    public static BlockEntityType<SolarPanelEntity> SOLAR_PANEL_ENTITY = Registry.register
            (Registry.BLOCK_ENTITY, "climatecraft:solar_panel", BlockEntityType
            .Builder.create(SolarPanelEntity::new, MyBlocks.SOLAR_PANEL).build(null));

    public static void init(){
    }
}
