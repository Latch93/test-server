package net.minecraft.server;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class WorldGenFeatureDesertVillage {

    public static void a() {}

    static {
        ImmutableList<DefinedStructureProcessor> immutablelist = ImmutableList.of(new DefinedStructureProcessorRule(ImmutableList.of(new DefinedStructureProcessorPredicates(new DefinedStructureTestTag(TagsBlock.DOORS), DefinedStructureTestTrue.a, Blocks.AIR.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestBlock(Blocks.TORCH), DefinedStructureTestTrue.a, Blocks.AIR.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestBlock(Blocks.WALL_TORCH), DefinedStructureTestTrue.a, Blocks.AIR.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.SMOOTH_SANDSTONE, 0.08F), DefinedStructureTestTrue.a, Blocks.COBWEB.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.CUT_SANDSTONE, 0.1F), DefinedStructureTestTrue.a, Blocks.COBWEB.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.TERRACOTTA, 0.08F), DefinedStructureTestTrue.a, Blocks.COBWEB.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.SMOOTH_SANDSTONE_STAIRS, 0.08F), DefinedStructureTestTrue.a, Blocks.COBWEB.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.SMOOTH_SANDSTONE_SLAB, 0.08F), DefinedStructureTestTrue.a, Blocks.COBWEB.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.WHEAT, 0.2F), DefinedStructureTestTrue.a, Blocks.BEETROOTS.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.WHEAT, 0.1F), DefinedStructureTestTrue.a, Blocks.MELON_STEM.getBlockData()))));

        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/desert/town_centers"), new MinecraftKey("empty"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/town_centers/desert_meeting_point_1"), 98), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/town_centers/desert_meeting_point_2"), 98), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/town_centers/desert_meeting_point_3"), 49), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/zombie/town_centers/desert_meeting_point_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/zombie/town_centers/desert_meeting_point_2", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/zombie/town_centers/desert_meeting_point_3", immutablelist), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/desert/streets"), new MinecraftKey("village/desert/terminators"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/streets/corner_01"), 3), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/streets/corner_02"), 3), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/streets/straight_01"), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/streets/straight_02"), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/streets/straight_03"), 3), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/streets/crossroad_01"), 3), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/streets/crossroad_02"), 3), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/streets/crossroad_03"), 3), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/streets/square_01"), 3), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/streets/square_02"), 3), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/streets/turn_01"), 3)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.TERRAIN_MATCHING));
        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/desert/zombie/streets"), new MinecraftKey("village/desert/zombie/terminators"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/zombie/streets/corner_01"), 3), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/zombie/streets/corner_02"), 3), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/zombie/streets/straight_01"), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/zombie/streets/straight_02"), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/zombie/streets/straight_03"), 3), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/zombie/streets/crossroad_01"), 3), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/zombie/streets/crossroad_02"), 3), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/zombie/streets/crossroad_03"), 3), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/zombie/streets/square_01"), 3), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/zombie/streets/square_02"), 3), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/zombie/streets/turn_01"), 3)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.TERRAIN_MATCHING));
        ImmutableList<DefinedStructureProcessor> immutablelist1 = ImmutableList.of(new DefinedStructureProcessorRule(ImmutableList.of(new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.WHEAT, 0.2F), DefinedStructureTestTrue.a, Blocks.BEETROOTS.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.WHEAT, 0.1F), DefinedStructureTestTrue.a, Blocks.MELON_STEM.getBlockData()))));

        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/desert/houses"), new MinecraftKey("village/desert/terminators"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_small_house_1"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_small_house_2"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_small_house_3"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_small_house_4"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_small_house_5"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_small_house_6"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_small_house_7"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_small_house_8"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_medium_house_1"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_medium_house_2"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_butcher_shop_1"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_tool_smith_1"), 2), new Pair[]{new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_fletcher_house_1"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_shepherd_house_1"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_armorer_1"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_fisher_1"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_tannery_1"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_cartographer_house_1"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_library_1"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_mason_1"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_weaponsmith_1"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_temple_1"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_temple_2"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_large_farm_1", immutablelist1), 11), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_farm_1", immutablelist1), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_farm_2", immutablelist1), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_animal_pen_1"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_animal_pen_2"), 2), Pair.of(WorldGenFeatureDefinedStructurePoolEmpty.a, 5)}), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/desert/zombie/houses"), new MinecraftKey("village/desert/zombie/terminators"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/zombie/houses/desert_small_house_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/zombie/houses/desert_small_house_2", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/zombie/houses/desert_small_house_3", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/zombie/houses/desert_small_house_4", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/zombie/houses/desert_small_house_5", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/zombie/houses/desert_small_house_6", immutablelist), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/zombie/houses/desert_small_house_7", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/zombie/houses/desert_small_house_8", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/zombie/houses/desert_medium_house_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/zombie/houses/desert_medium_house_2", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_butcher_shop_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_tool_smith_1", immutablelist), 2), new Pair[]{new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_fletcher_house_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_shepherd_house_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_armorer_1", immutablelist), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_fisher_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_tannery_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_cartographer_house_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_library_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_mason_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_weaponsmith_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_temple_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_temple_2", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_large_farm_1", immutablelist), 7), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_farm_1", immutablelist), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_farm_2", immutablelist), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_animal_pen_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/houses/desert_animal_pen_2", immutablelist), 2), Pair.of(WorldGenFeatureDefinedStructurePoolEmpty.a, 5)}), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/desert/terminators"), new MinecraftKey("empty"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/terminators/terminator_01"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/terminators/terminator_02"), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.TERRAIN_MATCHING));
        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/desert/zombie/terminators"), new MinecraftKey("empty"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/terminators/terminator_01"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/zombie/terminators/terminator_02"), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.TERRAIN_MATCHING));
        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/desert/decor"), new MinecraftKey("empty"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/desert_lamp_1"), 10), new Pair(new WorldGenFeatureDefinedStructurePoolFeature(new WorldGenFeatureConfigured<>(WorldGenerator.CACTUS, WorldGenFeatureConfiguration.e)), 4), new Pair(new WorldGenFeatureDefinedStructurePoolFeature(new WorldGenFeatureConfigured<>(WorldGenerator.HAY_PILE, WorldGenFeatureConfiguration.e)), 4), Pair.of(WorldGenFeatureDefinedStructurePoolEmpty.a, 10)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/desert/zombie/decor"), new MinecraftKey("empty"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/desert_lamp_1", immutablelist), 10), new Pair(new WorldGenFeatureDefinedStructurePoolFeature(new WorldGenFeatureConfigured<>(WorldGenerator.CACTUS, WorldGenFeatureConfiguration.e)), 4), new Pair(new WorldGenFeatureDefinedStructurePoolFeature(new WorldGenFeatureConfigured<>(WorldGenerator.HAY_PILE, WorldGenFeatureConfiguration.e)), 4), Pair.of(WorldGenFeatureDefinedStructurePoolEmpty.a, 10)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/desert/villagers"), new MinecraftKey("empty"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/villagers/nitwit"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/villagers/baby"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/villagers/unemployed"), 10)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/desert/zombie/villagers"), new MinecraftKey("empty"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/zombie/villagers/nitwit"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/desert/zombie/villagers/unemployed"), 10)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
    }
}
