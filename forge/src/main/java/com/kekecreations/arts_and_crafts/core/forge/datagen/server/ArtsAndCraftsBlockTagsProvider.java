package com.kekecreations.arts_and_crafts.core.forge.datagen.server;

import com.kekecreations.arts_and_crafts.common.util.ArtsAndCraftsTags;
import com.kekecreations.arts_and_crafts.core.registry.KekeBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ArtsAndCraftsBlockTagsProvider extends BlockTagsProvider {
    public ArtsAndCraftsBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, modId, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        appendPickaxes();
        appendHoes();
        appendWalls();
        appendSlabs();
        appendStairs();
        appendHoglinRepellents();
        appendFlowerPots();
        appendWoodenDoors();
        appendSaplings();
        appendLogsThatBurn();
        appendLeaves();
        appendWoodenStairs();
        appendWoodenSlabs();
        appendWoodenButtons();
        appendWoodenFences();
        appendWoodenPressurePlates();
        appendWoodenTrapdoors();
        appendFenceGates();
        appendPlanks();
        appendAxes();
        appendChalkDust();
        appendLilyPads();
        appendWoolCarpets();
        appendWool();
    }

    private void appendWool() {
        this.tag(BlockTags.WOOL)
                .add(KekeBlocks.BLEACHED_WOOL.get());
    }
    private void appendWoolCarpets() {
        this.tag(BlockTags.WOOL_CARPETS)
                .add(KekeBlocks.BLEACHED_CARPET.get());
    }

    private void appendLilyPads() {
        this.tag(ArtsAndCraftsTags.BlockTags.LILY_PADS)
                .add(Blocks.LILY_PAD);
    }


    private void appendChalkDust() {
        for (DyeColor colours : DyeColor.values()) {
            this.tag(ArtsAndCraftsTags.BlockTags.CHALK_DUST)
                    .add(KekeBlocks.getChalkDust(colours.getId()));
        }
        this.tag(ArtsAndCraftsTags.BlockTags.CHALK_DUST)
                .add(KekeBlocks.BLEACHED_CHALK_DUST.get());
    }

    private void appendHoglinRepellents() {
        for (DyeColor colours : DyeColor.values()) {
            this.tag(BlockTags.HOGLIN_REPELLENTS)
                    .add(KekeBlocks.getDyedPottedWarpedFungus(colours));
        }
    }
    private void appendPlanks() {
        this.tag(BlockTags.PLANKS)
                .add(KekeBlocks.CORK_PLANKS.get());
    }
    private void appendWoodenButtons() {
        this.tag(BlockTags.WOODEN_BUTTONS)
                .add(KekeBlocks.CORK_BUTTON.get());
    }
    private void appendWoodenFences() {
        this.tag(BlockTags.WOODEN_FENCES)
                .add(KekeBlocks.CORK_FENCE.get());
    }
    private void appendWoodenPressurePlates() {
        this.tag(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(KekeBlocks.CORK_PRESSURE_PLATE.get());
    }
    private void appendWoodenTrapdoors() {
        this.tag(BlockTags.WOODEN_TRAPDOORS)
                .add(KekeBlocks.CORK_TRAPDOOR.get());
    }
    private void appendFenceGates() {
        this.tag(BlockTags.FENCE_GATES)
                .add(KekeBlocks.CORK_FENCE_GATE.get());
    }
    private void appendWoodenDoors() {
        this.tag(BlockTags.WOODEN_DOORS)
                .add(KekeBlocks.CORK_DOOR.get());
    }
    private void appendWoodenSlabs() {
        this.tag(BlockTags.WOODEN_SLABS)
                .add(KekeBlocks.CORK_SLAB.get());
    }
    private void appendWoodenStairs() {
        this.tag(BlockTags.WOODEN_STAIRS)
                .add(KekeBlocks.CORK_STAIRS.get());
    }
    private void appendAxes() {
        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(KekeBlocks.CORK.get())
                .add(KekeBlocks.SMOOTH_CORK.get());
    }
    private void appendHoes() {
        this.tag(BlockTags.MINEABLE_WITH_HOE)
                .add(KekeBlocks.CORK_LEAVES.get());
    }
    private void appendLeaves() {
        this.tag(BlockTags.LEAVES)
                .add(KekeBlocks.CORK_LEAVES.get());
    }
    private void appendLogsThatBurn() {
        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(KekeBlocks.CORK_LOG.get())
                .add(KekeBlocks.STRIPPED_CORK_LOG.get())
                .add(KekeBlocks.CORK_WOOD.get())
                .add(KekeBlocks.STRIPPED_CORK_WOOD.get());
    }
    private void appendSaplings() {
        this.tag(BlockTags.SAPLINGS)
                .add(KekeBlocks.CORK_SAPLING.get());
    }

    private void appendWalls() {
        this.tag(BlockTags.WALLS)
                .add(KekeBlocks.TERRACOTTA_SHINGLE_WALL.get())
                .add(KekeBlocks.SOAPSTONE_WALL.get())
                .add(KekeBlocks.SOAPSTONE_BRICK_WALL.get())
                .add(KekeBlocks.POLISHED_SOAPSTONE_WALL.get())
                .add(KekeBlocks.GYPSUM_WALL.get())
                .add(KekeBlocks.GYPSUM_BRICK_WALL.get())
                .add(KekeBlocks.POLISHED_GYPSUM_WALL.get());
        for (DyeColor colours : DyeColor.values()) {
            tag(BlockTags.WALLS)
                    .add(KekeBlocks.getDyedTerracottaShingleWall(colours.getId()))
                    .add(KekeBlocks.getDyedSoapstoneWall(colours.getId()))
                    .add(KekeBlocks.getDyedSoapstoneBrickWall(colours.getId()))
                    .add(KekeBlocks.getDyedPolishedSoapstoneWall(colours.getId()))
                    .add(KekeBlocks.getDyedMudBrickWall(colours.getId()));
        }
    }

    private void appendSlabs() {
        this.tag(BlockTags.SLABS)
                .add(KekeBlocks.TERRACOTTA_SHINGLE_SLAB.get())
                .add(KekeBlocks.SOAPSTONE_SLAB.get())
                .add(KekeBlocks.SOAPSTONE_BRICK_SLAB.get())
                .add(KekeBlocks.POLISHED_SOAPSTONE_SLAB.get())
                .add(KekeBlocks.GYPSUM_SLAB.get())
                .add(KekeBlocks.GYPSUM_BRICK_SLAB.get())
                .add(KekeBlocks.POLISHED_GYPSUM_SLAB.get());
        for (DyeColor colours : DyeColor.values()) {
            tag(BlockTags.SLABS)
                    .add(KekeBlocks.getDyedTerracottaShingleSlab(colours.getId()))
                    .add(KekeBlocks.getDyedSoapstoneSlab(colours.getId()))
                    .add(KekeBlocks.getDyedSoapstoneBrickSlab(colours.getId()))
                    .add(KekeBlocks.getDyedPolishedSoapstoneSlab(colours.getId()))
                    .add(KekeBlocks.getDyedMudBrickSlab(colours.getId()));
        }
    }
    private void appendStairs() {
        this.tag(BlockTags.STAIRS)
                .add(KekeBlocks.TERRACOTTA_SHINGLE_STAIRS.get())
                .add(KekeBlocks.SOAPSTONE_STAIRS.get())
                .add(KekeBlocks.SOAPSTONE_BRICK_STAIRS.get())
                .add(KekeBlocks.POLISHED_SOAPSTONE_STAIRS.get())
                .add(KekeBlocks.GYPSUM_STAIRS.get())
                .add(KekeBlocks.GYPSUM_BRICK_STAIRS.get())
                .add(KekeBlocks.POLISHED_GYPSUM_STAIRS.get());
        for (DyeColor colours : DyeColor.values()) {
            tag(BlockTags.STAIRS)
                    .add(KekeBlocks.getDyedTerracottaShingleStairs(colours.getId()))
                    .add(KekeBlocks.getDyedSoapstoneStairs(colours.getId()))
                    .add(KekeBlocks.getDyedSoapstoneBrickStairs(colours.getId()))
                    .add(KekeBlocks.getDyedPolishedSoapstoneStairs(colours.getId()))
                    .add(KekeBlocks.getDyedMudBrickStairs(colours.getId()));
        }
    }


    private void appendPickaxes() {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(KekeBlocks.TERRACOTTA_SHINGLES.get())
                .add(KekeBlocks.TERRACOTTA_SHINGLE_SLAB.get())
                .add(KekeBlocks.TERRACOTTA_SHINGLE_STAIRS.get())
                .add(KekeBlocks.TERRACOTTA_SHINGLE_WALL.get())
                .add(KekeBlocks.SOAPSTONE.get())
                .add(KekeBlocks.SOAPSTONE_SLAB.get())
                .add(KekeBlocks.SOAPSTONE_STAIRS.get())
                .add(KekeBlocks.SOAPSTONE_WALL.get())
                .add(KekeBlocks.SOAPSTONE_BRICKS.get())
                .add(KekeBlocks.SOAPSTONE_BRICK_SLAB.get())
                .add(KekeBlocks.SOAPSTONE_BRICK_STAIRS.get())
                .add(KekeBlocks.SOAPSTONE_BRICK_WALL.get())
                .add(KekeBlocks.POLISHED_SOAPSTONE.get())
                .add(KekeBlocks.POLISHED_SOAPSTONE_SLAB.get())
                .add(KekeBlocks.POLISHED_SOAPSTONE_STAIRS.get())
                .add(KekeBlocks.POLISHED_SOAPSTONE_WALL.get())
                .add(KekeBlocks.PLASTER.get())
                .add(KekeBlocks.GYPSUM.get())
                .add(KekeBlocks.GYPSUM_SLAB.get())
                .add(KekeBlocks.GYPSUM_STAIRS.get())
                .add(KekeBlocks.GYPSUM_WALL.get())
                .add(KekeBlocks.GYPSUM_BRICKS.get())
                .add(KekeBlocks.GYPSUM_BRICK_SLAB.get())
                .add(KekeBlocks.GYPSUM_BRICK_STAIRS.get())
                .add(KekeBlocks.GYPSUM_BRICK_WALL.get())
                .add(KekeBlocks.POLISHED_GYPSUM.get())
                .add(KekeBlocks.POLISHED_GYPSUM_SLAB.get())
                .add(KekeBlocks.POLISHED_GYPSUM_STAIRS.get())
                .add(KekeBlocks.POLISHED_GYPSUM_WALL.get());
        for (DyeColor colours : DyeColor.values()) {
            this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                    .add(KekeBlocks.getDyedTerracottaShingles(colours.getId()))
                    .add(KekeBlocks.getDyedTerracottaShingleStairs(colours.getId()))
                    .add(KekeBlocks.getDyedTerracottaShingleSlab(colours.getId()))
                    .add(KekeBlocks.getDyedTerracottaShingleWall(colours.getId()))

                    .add(KekeBlocks.getDyedSoapstone(colours.getId()))
                    .add(KekeBlocks.getDyedSoapstoneStairs(colours.getId()))
                    .add(KekeBlocks.getDyedSoapstoneSlab(colours.getId()))
                    .add(KekeBlocks.getDyedSoapstoneWall(colours.getId()))

                    .add(KekeBlocks.getDyedSoapstoneBricks(colours.getId()))
                    .add(KekeBlocks.getDyedSoapstoneBrickStairs(colours.getId()))
                    .add(KekeBlocks.getDyedSoapstoneBrickSlab(colours.getId()))
                    .add(KekeBlocks.getDyedSoapstoneBrickWall(colours.getId()))

                    .add(KekeBlocks.getDyedPolishedSoapstone(colours.getId()))
                    .add(KekeBlocks.getDyedPolishedSoapstoneStairs(colours.getId()))
                    .add(KekeBlocks.getDyedPolishedSoapstoneSlab(colours.getId()))
                    .add(KekeBlocks.getDyedPolishedSoapstoneWall(colours.getId()))

                    .add(KekeBlocks.getDyedMudBricks(colours.getId()))
                    .add(KekeBlocks.getDyedMudBrickStairs(colours.getId()))
                    .add(KekeBlocks.getDyedMudBrickSlab(colours.getId()))
                    .add(KekeBlocks.getDyedMudBrickWall(colours.getId()))

                    .add(KekeBlocks.getChalk(colours.getId()))

                    .add(KekeBlocks.getDyedPlaster(colours.getId()));
        }
    }
    private void appendFlowerPots() {
        for (DyeColor colours : DyeColor.values()) {
            this.tag(BlockTags.FLOWER_POTS)
                    .add(KekeBlocks.getDyedFlowerPot(colours.getId()))
                    .add(KekeBlocks.getDyedPottedCrimsonFungus(colours))
                    .add(KekeBlocks.getDyedPottedCrimsonRoots(colours))
                    .add(KekeBlocks.getDyedPottedWarpedFungus(colours))
                    .add(KekeBlocks.getDyedPottedWarpedRoots(colours))
                    .add(KekeBlocks.getDyedPottedOakSapling(colours))
                    .add(KekeBlocks.getDyedPottedSpruceSapling(colours))
                    .add(KekeBlocks.getDyedPottedBirchSapling(colours))
                    .add(KekeBlocks.getDyedPottedJungleSapling(colours))
                    .add(KekeBlocks.getDyedPottedAcaciaSapling(colours))
                    .add(KekeBlocks.getDyedPottedCherrySapling(colours))
                    .add(KekeBlocks.getDyedPottedDarkOakSapling(colours))
                    .add(KekeBlocks.getDyedPottedMangrovePropagule(colours))
                    .add(KekeBlocks.getDyedPottedFern(colours))
                    .add(KekeBlocks.getDyedPottedDandelion(colours))
                    .add(KekeBlocks.getDyedPottedPoppy(colours))
                    .add(KekeBlocks.getDyedPottedBlueOrchid(colours))
                    .add(KekeBlocks.getDyedPottedAllium(colours))
                    .add(KekeBlocks.getDyedPottedAzureBluet(colours))
                    .add(KekeBlocks.getDyedPottedRedTulip(colours))
                    .add(KekeBlocks.getDyedPottedOrangeTulip(colours))
                    .add(KekeBlocks.getDyedPottedWhiteTulip(colours))
                    .add(KekeBlocks.getDyedPottedPinkTulip(colours))
                    .add(KekeBlocks.getDyedPottedOxeyeDaisy(colours))
                    .add(KekeBlocks.getDyedPottedCornflower(colours))
                    .add(KekeBlocks.getDyedPottedLilyOfTheValley(colours))
                    .add(KekeBlocks.getDyedPottedWitherRose(colours))
                    .add(KekeBlocks.getDyedPottedRedMushroom(colours))
                    .add(KekeBlocks.getDyedPottedBrownMushroom(colours))
                    .add(KekeBlocks.getDyedPottedDeadBush(colours))
                    .add(KekeBlocks.getDyedPottedCactus(colours))
                    .add(KekeBlocks.getDyedPottedBamboo(colours))
                    .add(KekeBlocks.getDyedPottedAzalea(colours))
                    .add(KekeBlocks.getDyedPottedFloweringAzalea(colours))
                    .add(KekeBlocks.getDyedPottedTorchFlower(colours))
                    .add(KekeBlocks.getDyedPottedCorkSapling(colours));
        }
    }
}