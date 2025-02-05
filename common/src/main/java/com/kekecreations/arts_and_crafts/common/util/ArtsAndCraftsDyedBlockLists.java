package com.kekecreations.arts_and_crafts.common.util;

import com.kekecreations.arts_and_crafts.core.registry.KekeBlocks;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.HashMap;

public class ArtsAndCraftsDyedBlockLists {

    public static HashMap<StringRepresentable, Block> DYED_TERRACOTTA = new HashMap<>();
    public static HashMap<StringRepresentable, Block> DYED_GLAZED_TERRACOTTA = new HashMap<>();
    public static HashMap<StringRepresentable, Block> DYED_WOOL = new HashMap<>();
    public static HashMap<StringRepresentable, Block> DYED_CONCRETE = new HashMap<>();
    public static HashMap<StringRepresentable, Block> DYED_CONCRETE_POWDER = new HashMap<>();
    public static HashMap<StringRepresentable, Block> DYED_CANDLES = new HashMap<>();
    public static HashMap<StringRepresentable, Block> DYED_GLASS = new HashMap<>();
    public static HashMap<StringRepresentable, Block> DYED_GLASS_PANES = new HashMap<>();
    public static HashMap<StringRepresentable, Block> DYED_SHULKER_BOX = new HashMap<>();
    public static HashMap<StringRepresentable, Block> DYED_BANNER = new HashMap<>();
    public static HashMap<StringRepresentable, Block> DYED_BED = new HashMap<>();
    public static HashMap<StringRepresentable, Block> DYED_CARPET = new HashMap<>();



    public static void registerLists() {
        terracottaList();
        glazedTerracottaList();
        woolList();
        concreteList();
        concretePowderList();
        candlesList();
        glassList();
        glassPanesList();
        shulkerBoxList();
        bannerList();
        bedList();
        carpetList();
    }

    public static void carpetList() {
        DYED_CARPET.put(DyeColor.WHITE, Blocks.WHITE_CARPET);
        DYED_CARPET.put(DyeColor.ORANGE, Blocks.ORANGE_CARPET);
        DYED_CARPET.put(DyeColor.MAGENTA, Blocks.MAGENTA_CARPET);
        DYED_CARPET.put(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_CARPET);
        DYED_CARPET.put(DyeColor.YELLOW, Blocks.YELLOW_CARPET);
        DYED_CARPET.put(DyeColor.LIME, Blocks.LIME_CARPET);
        DYED_CARPET.put(DyeColor.PINK, Blocks.PINK_CARPET);
        DYED_CARPET.put(DyeColor.GRAY, Blocks.GRAY_CARPET);
        DYED_CARPET.put(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_CARPET);
        DYED_CARPET.put(DyeColor.CYAN, Blocks.CYAN_CARPET);
        DYED_CARPET.put(DyeColor.PURPLE, Blocks.PURPLE_CARPET);
        DYED_CARPET.put(DyeColor.BLUE, Blocks.BLUE_CARPET);
        DYED_CARPET.put(DyeColor.BROWN, Blocks.BROWN_CARPET);
        DYED_CARPET.put(DyeColor.GREEN, Blocks.GREEN_CARPET);
        DYED_CARPET.put(DyeColor.RED, Blocks.RED_CARPET);
        DYED_CARPET.put(DyeColor.BLACK, Blocks.BLACK_CARPET);
    }

    public static void bedList() {
        DYED_BED.put(DyeColor.WHITE, Blocks.WHITE_BED);
        DYED_BED.put(DyeColor.ORANGE, Blocks.ORANGE_BED);
        DYED_BED.put(DyeColor.MAGENTA, Blocks.MAGENTA_BED);
        DYED_BED.put(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_BED);
        DYED_BED.put(DyeColor.YELLOW, Blocks.YELLOW_BED);
        DYED_BED.put(DyeColor.LIME, Blocks.LIME_BED);
        DYED_BED.put(DyeColor.PINK, Blocks.PINK_BED);
        DYED_BED.put(DyeColor.GRAY, Blocks.GRAY_BED);
        DYED_BED.put(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_BED);
        DYED_BED.put(DyeColor.CYAN, Blocks.CYAN_BED);
        DYED_BED.put(DyeColor.PURPLE, Blocks.PURPLE_BED);
        DYED_BED.put(DyeColor.BLUE, Blocks.BLUE_BED);
        DYED_BED.put(DyeColor.BROWN, Blocks.BROWN_BED);
        DYED_BED.put(DyeColor.GREEN, Blocks.GREEN_BED);
        DYED_BED.put(DyeColor.RED, Blocks.RED_BED);
        DYED_BED.put(DyeColor.BLACK, Blocks.BLACK_BED);
    }

    public static void bannerList() {
        DYED_BANNER.put(DyeColor.WHITE, Blocks.WHITE_BANNER);
        DYED_BANNER.put(DyeColor.ORANGE, Blocks.ORANGE_BANNER);
        DYED_BANNER.put(DyeColor.MAGENTA, Blocks.MAGENTA_BANNER);
        DYED_BANNER.put(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_BANNER);
        DYED_BANNER.put(DyeColor.YELLOW, Blocks.YELLOW_BANNER);
        DYED_BANNER.put(DyeColor.LIME, Blocks.LIME_BANNER);
        DYED_BANNER.put(DyeColor.PINK, Blocks.PINK_BANNER);
        DYED_BANNER.put(DyeColor.GRAY, Blocks.GRAY_BANNER);
        DYED_BANNER.put(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_BANNER);
        DYED_BANNER.put(DyeColor.CYAN, Blocks.CYAN_BANNER);
        DYED_BANNER.put(DyeColor.PURPLE, Blocks.PURPLE_BANNER);
        DYED_BANNER.put(DyeColor.BLUE, Blocks.BLUE_BANNER);
        DYED_BANNER.put(DyeColor.BROWN, Blocks.BROWN_BANNER);
        DYED_BANNER.put(DyeColor.GREEN, Blocks.GREEN_BANNER);
        DYED_BANNER.put(DyeColor.RED, Blocks.RED_BANNER);
        DYED_BANNER.put(DyeColor.BLACK, Blocks.BLACK_BANNER);
    }

    public static void terracottaList() {
        DYED_TERRACOTTA.put(DyeColor.WHITE, Blocks.WHITE_TERRACOTTA);
        DYED_TERRACOTTA.put(DyeColor.ORANGE, Blocks.ORANGE_TERRACOTTA);
        DYED_TERRACOTTA.put(DyeColor.MAGENTA, Blocks.MAGENTA_TERRACOTTA);
        DYED_TERRACOTTA.put(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_TERRACOTTA);
        DYED_TERRACOTTA.put(DyeColor.YELLOW, Blocks.YELLOW_TERRACOTTA);
        DYED_TERRACOTTA.put(DyeColor.LIME, Blocks.LIME_TERRACOTTA);
        DYED_TERRACOTTA.put(DyeColor.PINK, Blocks.PINK_TERRACOTTA);
        DYED_TERRACOTTA.put(DyeColor.GRAY, Blocks.GRAY_TERRACOTTA);
        DYED_TERRACOTTA.put(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_TERRACOTTA);
        DYED_TERRACOTTA.put(DyeColor.CYAN, Blocks.CYAN_TERRACOTTA);
        DYED_TERRACOTTA.put(DyeColor.PURPLE, Blocks.PURPLE_TERRACOTTA);
        DYED_TERRACOTTA.put(DyeColor.BLUE, Blocks.BLUE_TERRACOTTA);
        DYED_TERRACOTTA.put(DyeColor.BROWN, Blocks.BROWN_TERRACOTTA);
        DYED_TERRACOTTA.put(DyeColor.GREEN, Blocks.GREEN_TERRACOTTA);
        DYED_TERRACOTTA.put(DyeColor.RED, Blocks.RED_TERRACOTTA);
        DYED_TERRACOTTA.put(DyeColor.BLACK, Blocks.BLACK_TERRACOTTA);
    }

    public static void glazedTerracottaList() {
        DYED_GLAZED_TERRACOTTA.put(DyeColor.WHITE, Blocks.WHITE_GLAZED_TERRACOTTA);
        DYED_GLAZED_TERRACOTTA.put(DyeColor.ORANGE, Blocks.ORANGE_GLAZED_TERRACOTTA);
        DYED_GLAZED_TERRACOTTA.put(DyeColor.MAGENTA, Blocks.MAGENTA_GLAZED_TERRACOTTA);
        DYED_GLAZED_TERRACOTTA.put(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA);
        DYED_GLAZED_TERRACOTTA.put(DyeColor.YELLOW, Blocks.YELLOW_GLAZED_TERRACOTTA);
        DYED_GLAZED_TERRACOTTA.put(DyeColor.LIME, Blocks.LIME_GLAZED_TERRACOTTA);
        DYED_GLAZED_TERRACOTTA.put(DyeColor.PINK, Blocks.PINK_GLAZED_TERRACOTTA);
        DYED_GLAZED_TERRACOTTA.put(DyeColor.GRAY, Blocks.GRAY_GLAZED_TERRACOTTA);
        DYED_GLAZED_TERRACOTTA.put(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA);
        DYED_GLAZED_TERRACOTTA.put(DyeColor.CYAN, Blocks.CYAN_GLAZED_TERRACOTTA);
        DYED_GLAZED_TERRACOTTA.put(DyeColor.PURPLE, Blocks.PURPLE_GLAZED_TERRACOTTA);
        DYED_GLAZED_TERRACOTTA.put(DyeColor.BLUE, Blocks.BLUE_GLAZED_TERRACOTTA);
        DYED_GLAZED_TERRACOTTA.put(DyeColor.BROWN, Blocks.BROWN_GLAZED_TERRACOTTA);
        DYED_GLAZED_TERRACOTTA.put(DyeColor.GREEN, Blocks.GREEN_GLAZED_TERRACOTTA);
        DYED_GLAZED_TERRACOTTA.put(DyeColor.RED, Blocks.RED_GLAZED_TERRACOTTA);
        DYED_GLAZED_TERRACOTTA.put(DyeColor.BLACK, Blocks.BLACK_GLAZED_TERRACOTTA);
    }

    public static void woolList() {
        DYED_WOOL.put(DyeColor.WHITE, Blocks.WHITE_WOOL);
        DYED_WOOL.put(DyeColor.ORANGE, Blocks.ORANGE_WOOL);
        DYED_WOOL.put(DyeColor.MAGENTA, Blocks.MAGENTA_WOOL);
        DYED_WOOL.put(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_WOOL);
        DYED_WOOL.put(DyeColor.YELLOW, Blocks.YELLOW_WOOL);
        DYED_WOOL.put(DyeColor.LIME, Blocks.LIME_WOOL);
        DYED_WOOL.put(DyeColor.PINK, Blocks.PINK_WOOL);
        DYED_WOOL.put(DyeColor.GRAY, Blocks.GRAY_WOOL);
        DYED_WOOL.put(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_WOOL);
        DYED_WOOL.put(DyeColor.CYAN, Blocks.CYAN_WOOL);
        DYED_WOOL.put(DyeColor.PURPLE, Blocks.PURPLE_WOOL);
        DYED_WOOL.put(DyeColor.BLUE, Blocks.BLUE_WOOL);
        DYED_WOOL.put(DyeColor.BROWN, Blocks.BROWN_WOOL);
        DYED_WOOL.put(DyeColor.GREEN, Blocks.GREEN_WOOL);
        DYED_WOOL.put(DyeColor.RED, Blocks.RED_WOOL);
        DYED_WOOL.put(DyeColor.BLACK, Blocks.BLACK_WOOL);
    }

    public static void concreteList() {
        DYED_CONCRETE.put(DyeColor.WHITE, Blocks.WHITE_CONCRETE);
        DYED_CONCRETE.put(DyeColor.ORANGE, Blocks.ORANGE_CONCRETE);
        DYED_CONCRETE.put(DyeColor.MAGENTA, Blocks.MAGENTA_CONCRETE);
        DYED_CONCRETE.put(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_CONCRETE);
        DYED_CONCRETE.put(DyeColor.YELLOW, Blocks.YELLOW_CONCRETE);
        DYED_CONCRETE.put(DyeColor.LIME, Blocks.LIME_CONCRETE);
        DYED_CONCRETE.put(DyeColor.PINK, Blocks.PINK_CONCRETE);
        DYED_CONCRETE.put(DyeColor.GRAY, Blocks.GRAY_CONCRETE);
        DYED_CONCRETE.put(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_CONCRETE);
        DYED_CONCRETE.put(DyeColor.CYAN, Blocks.CYAN_CONCRETE);
        DYED_CONCRETE.put(DyeColor.PURPLE, Blocks.PURPLE_CONCRETE);
        DYED_CONCRETE.put(DyeColor.BLUE, Blocks.BLUE_CONCRETE);
        DYED_CONCRETE.put(DyeColor.BROWN, Blocks.BROWN_CONCRETE);
        DYED_CONCRETE.put(DyeColor.GREEN, Blocks.GREEN_CONCRETE);
        DYED_CONCRETE.put(DyeColor.RED, Blocks.RED_CONCRETE);
        DYED_CONCRETE.put(DyeColor.BLACK, Blocks.BLACK_CONCRETE);
    }

    public static void concretePowderList() {
        DYED_CONCRETE_POWDER.put(DyeColor.WHITE, Blocks.WHITE_CONCRETE_POWDER);
        DYED_CONCRETE_POWDER.put(DyeColor.ORANGE, Blocks.ORANGE_CONCRETE_POWDER);
        DYED_CONCRETE_POWDER.put(DyeColor.MAGENTA, Blocks.MAGENTA_CONCRETE_POWDER);
        DYED_CONCRETE_POWDER.put(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_CONCRETE_POWDER);
        DYED_CONCRETE_POWDER.put(DyeColor.YELLOW, Blocks.YELLOW_CONCRETE_POWDER);
        DYED_CONCRETE_POWDER.put(DyeColor.LIME, Blocks.LIME_CONCRETE_POWDER);
        DYED_CONCRETE_POWDER.put(DyeColor.PINK, Blocks.PINK_CONCRETE_POWDER);
        DYED_CONCRETE_POWDER.put(DyeColor.GRAY, Blocks.GRAY_CONCRETE_POWDER);
        DYED_CONCRETE_POWDER.put(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_CONCRETE_POWDER);
        DYED_CONCRETE_POWDER.put(DyeColor.CYAN, Blocks.CYAN_CONCRETE_POWDER);
        DYED_CONCRETE_POWDER.put(DyeColor.PURPLE, Blocks.PURPLE_CONCRETE_POWDER);
        DYED_CONCRETE_POWDER.put(DyeColor.BLUE, Blocks.BLUE_CONCRETE_POWDER);
        DYED_CONCRETE_POWDER.put(DyeColor.BROWN, Blocks.BROWN_CONCRETE_POWDER);
        DYED_CONCRETE_POWDER.put(DyeColor.GREEN, Blocks.GREEN_CONCRETE_POWDER);
        DYED_CONCRETE_POWDER.put(DyeColor.RED, Blocks.RED_CONCRETE_POWDER);
        DYED_CONCRETE_POWDER.put(DyeColor.BLACK, Blocks.BLACK_CONCRETE_POWDER);
    }

    public static void candlesList() {
        DYED_CANDLES.put(DyeColor.WHITE, Blocks.WHITE_CANDLE);
        DYED_CANDLES.put(DyeColor.ORANGE, Blocks.ORANGE_CANDLE);
        DYED_CANDLES.put(DyeColor.MAGENTA, Blocks.MAGENTA_CANDLE);
        DYED_CANDLES.put(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_CANDLE);
        DYED_CANDLES.put(DyeColor.YELLOW, Blocks.YELLOW_CANDLE);
        DYED_CANDLES.put(DyeColor.LIME, Blocks.LIME_CANDLE);
        DYED_CANDLES.put(DyeColor.PINK, Blocks.PINK_CANDLE);
        DYED_CANDLES.put(DyeColor.GRAY, Blocks.GRAY_CANDLE);
        DYED_CANDLES.put(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_CANDLE);
        DYED_CANDLES.put(DyeColor.CYAN, Blocks.CYAN_CANDLE);
        DYED_CANDLES.put(DyeColor.PURPLE, Blocks.PURPLE_CANDLE);
        DYED_CANDLES.put(DyeColor.BLUE, Blocks.BLUE_CANDLE);
        DYED_CANDLES.put(DyeColor.BROWN, Blocks.BROWN_CANDLE);
        DYED_CANDLES.put(DyeColor.GREEN, Blocks.GREEN_CANDLE);
        DYED_CANDLES.put(DyeColor.RED, Blocks.RED_CANDLE);
        DYED_CANDLES.put(DyeColor.BLACK, Blocks.BLACK_CANDLE);
    }

    public static void glassList() {
        DYED_GLASS.put(DyeColor.WHITE, Blocks.WHITE_STAINED_GLASS);
        DYED_GLASS.put(DyeColor.ORANGE, Blocks.ORANGE_STAINED_GLASS);
        DYED_GLASS.put(DyeColor.MAGENTA, Blocks.MAGENTA_STAINED_GLASS);
        DYED_GLASS.put(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_STAINED_GLASS);
        DYED_GLASS.put(DyeColor.YELLOW, Blocks.YELLOW_STAINED_GLASS);
        DYED_GLASS.put(DyeColor.LIME, Blocks.LIME_STAINED_GLASS);
        DYED_GLASS.put(DyeColor.PINK, Blocks.PINK_STAINED_GLASS);
        DYED_GLASS.put(DyeColor.GRAY, Blocks.GRAY_STAINED_GLASS);
        DYED_GLASS.put(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_STAINED_GLASS);
        DYED_GLASS.put(DyeColor.CYAN, Blocks.CYAN_STAINED_GLASS);
        DYED_GLASS.put(DyeColor.PURPLE, Blocks.PURPLE_STAINED_GLASS);
        DYED_GLASS.put(DyeColor.BLUE, Blocks.BLUE_STAINED_GLASS);
        DYED_GLASS.put(DyeColor.BROWN, Blocks.BROWN_STAINED_GLASS);
        DYED_GLASS.put(DyeColor.GREEN, Blocks.GREEN_STAINED_GLASS);
        DYED_GLASS.put(DyeColor.RED, Blocks.RED_STAINED_GLASS);
        DYED_GLASS.put(DyeColor.BLACK, Blocks.BLACK_STAINED_GLASS);
    }

    public static void glassPanesList() {
        DYED_GLASS_PANES.put(DyeColor.WHITE, Blocks.WHITE_STAINED_GLASS_PANE);
        DYED_GLASS_PANES.put(DyeColor.ORANGE, Blocks.ORANGE_STAINED_GLASS_PANE);
        DYED_GLASS_PANES.put(DyeColor.MAGENTA, Blocks.MAGENTA_STAINED_GLASS_PANE);
        DYED_GLASS_PANES.put(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_STAINED_GLASS_PANE);
        DYED_GLASS_PANES.put(DyeColor.YELLOW, Blocks.YELLOW_STAINED_GLASS_PANE);
        DYED_GLASS_PANES.put(DyeColor.LIME, Blocks.LIME_STAINED_GLASS_PANE);
        DYED_GLASS_PANES.put(DyeColor.PINK, Blocks.PINK_STAINED_GLASS_PANE);
        DYED_GLASS_PANES.put(DyeColor.GRAY, Blocks.GRAY_STAINED_GLASS_PANE);
        DYED_GLASS_PANES.put(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_STAINED_GLASS_PANE);
        DYED_GLASS_PANES.put(DyeColor.CYAN, Blocks.CYAN_STAINED_GLASS_PANE);
        DYED_GLASS_PANES.put(DyeColor.PURPLE, Blocks.PURPLE_STAINED_GLASS_PANE);
        DYED_GLASS_PANES.put(DyeColor.BLUE, Blocks.BLUE_STAINED_GLASS_PANE);
        DYED_GLASS_PANES.put(DyeColor.BROWN, Blocks.BROWN_STAINED_GLASS_PANE);
        DYED_GLASS_PANES.put(DyeColor.GREEN, Blocks.GREEN_STAINED_GLASS_PANE);
        DYED_GLASS_PANES.put(DyeColor.RED, Blocks.RED_STAINED_GLASS_PANE);
        DYED_GLASS_PANES.put(DyeColor.BLACK, Blocks.BLACK_STAINED_GLASS_PANE);
    }

    public static void shulkerBoxList() {
        DYED_SHULKER_BOX.put(DyeColor.WHITE, Blocks.WHITE_SHULKER_BOX);
        DYED_SHULKER_BOX.put(DyeColor.ORANGE, Blocks.ORANGE_SHULKER_BOX);
        DYED_SHULKER_BOX.put(DyeColor.MAGENTA, Blocks.MAGENTA_SHULKER_BOX);
        DYED_SHULKER_BOX.put(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_SHULKER_BOX);
        DYED_SHULKER_BOX.put(DyeColor.YELLOW, Blocks.YELLOW_SHULKER_BOX);
        DYED_SHULKER_BOX.put(DyeColor.LIME, Blocks.LIME_SHULKER_BOX);
        DYED_SHULKER_BOX.put(DyeColor.PINK, Blocks.PINK_SHULKER_BOX);
        DYED_SHULKER_BOX.put(DyeColor.GRAY, Blocks.GRAY_SHULKER_BOX);
        DYED_SHULKER_BOX.put(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_SHULKER_BOX);
        DYED_SHULKER_BOX.put(DyeColor.CYAN, Blocks.CYAN_SHULKER_BOX);
        DYED_SHULKER_BOX.put(DyeColor.PURPLE, Blocks.PURPLE_SHULKER_BOX);
        DYED_SHULKER_BOX.put(DyeColor.BLUE, Blocks.BLUE_SHULKER_BOX);
        DYED_SHULKER_BOX.put(DyeColor.BROWN, Blocks.BROWN_SHULKER_BOX);
        DYED_SHULKER_BOX.put(DyeColor.GREEN, Blocks.GREEN_SHULKER_BOX);
        DYED_SHULKER_BOX.put(DyeColor.RED, Blocks.RED_SHULKER_BOX);
        DYED_SHULKER_BOX.put(DyeColor.BLACK, Blocks.BLACK_SHULKER_BOX);
    }

    public static Block getDyedCarpet(int colours) {
        return DYED_CARPET.get(DyeColor.byId(colours));
    }

    public static Block getDyedBed(int colours) {
        return DYED_BED.get(DyeColor.byId(colours));
    }

    public static Block getDyedBanner(int colours) {
        return DYED_BANNER.get(DyeColor.byId(colours));
    }

    public static Block getDyedTerracotta(int colours) {
        return DYED_TERRACOTTA.get(DyeColor.byId(colours));
    }

    public static Block getDyedGlazedTerracotta(int colours) {
        return DYED_GLAZED_TERRACOTTA.get(DyeColor.byId(colours));
    }
    public static Block getDyedWool(int colours) {
        return DYED_WOOL.get(DyeColor.byId(colours));
    }

    public static Block getDyedConcrete(int colours) {
        return DYED_CONCRETE.get(DyeColor.byId(colours));
    }
    public static Block getDyedConcretePowder(int colours) {
        return DYED_CONCRETE_POWDER.get(DyeColor.byId(colours));
    }

    public static Block getDyedCandles(int colours) {
        return DYED_CANDLES.get(DyeColor.byId(colours));
    }
    public static Block getDyedGlass(int colours) {
        return DYED_GLASS.get(DyeColor.byId(colours));
    }
    public static Block getDyedGlassPanes(int colours) {
        return DYED_GLASS_PANES.get(DyeColor.byId(colours));
    }
    public static Block getDyedShulkerBox(int colours) {
        return DYED_SHULKER_BOX.get(DyeColor.byId(colours));
    }
}
