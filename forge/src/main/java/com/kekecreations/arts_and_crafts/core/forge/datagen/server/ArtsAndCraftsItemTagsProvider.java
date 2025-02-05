package com.kekecreations.arts_and_crafts.core.forge.datagen.server;

import com.kekecreations.arts_and_crafts.common.util.ArtsAndCraftsTags;
import com.kekecreations.arts_and_crafts.core.registry.KekeBlocks;
import com.kekecreations.arts_and_crafts.core.registry.KekeItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.DyeItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ArtsAndCraftsItemTagsProvider extends ItemTagsProvider {


    public ArtsAndCraftsItemTagsProvider(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, modId, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        appendPlanks();
        appendLogsThatBurn();
        appendWoodenButtons();
        appendWoodenSlabs();
        appendWoodenDoors();
        appendWoodenFences();
        appendWoodenStairs();
        appendWoodenPressurePlates();
        appendWoodenTrapdoors();
        appendDecoratedPotSherds();
        appendDecoratedPots();
        appendDyes();
        appendChalkSticks();
        appendBoats();
        appendChestBoats();
        appendWoolCarpets();
        appendPaintbrushes();
        appendSigns();
        appendHangingSigns();
        appendSaplings();
        appendFenceGates();
    }
    private void appendFenceGates() {
        this.tag(ItemTags.FENCE_GATES)
                .add(KekeBlocks.CORK_FENCE_GATE.get().asItem());
    }
    private void appendWoodenSlabs() {
        this.tag(ItemTags.WOODEN_SLABS)
                .add(KekeBlocks.CORK_SLAB.get().asItem());
    }
    private void appendWoodenDoors() {
        this.tag(ItemTags.WOODEN_DOORS)
                .add(KekeBlocks.CORK_DOOR.get().asItem());
    }
    private void appendWoodenFences() {
        this.tag(ItemTags.WOODEN_FENCES)
                .add(KekeBlocks.CORK_FENCE.get().asItem());
    }
    private void appendWoodenStairs() {
        this.tag(ItemTags.WOODEN_STAIRS)
                .add(KekeBlocks.CORK_STAIRS.get().asItem());
    }
    private void appendWoodenPressurePlates() {
        this.tag(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(KekeBlocks.CORK_PRESSURE_PLATE.get().asItem());
    }
    private void appendWoodenTrapdoors() {
        this.tag(ItemTags.WOODEN_TRAPDOORS)
                .add(KekeBlocks.CORK_TRAPDOOR.get().asItem());
    }
    private void appendSigns() {
        this.tag(ItemTags.SIGNS)
                .add(KekeItems.CORK_SIGN.get());
    }
    private void appendHangingSigns() {
        this.tag(ItemTags.HANGING_SIGNS)
                .add(KekeItems.CORK_HANGING_SIGN.get());
    }
    private void appendSaplings() {
        this.tag(ItemTags.SAPLINGS)
                .add(KekeBlocks.CORK_SAPLING.get().asItem());
    }
    private void appendPaintbrushes() {
        for (DyeColor colours : DyeColor.values()) {
            this.tag(ArtsAndCraftsTags.ItemTags.PAINTBRUSHES)
                    .add(KekeItems.getPaintBrush(colours.getId()));
        }
        this.tag(ArtsAndCraftsTags.ItemTags.PAINTBRUSHES)
                .add(KekeItems.BLEACHDEW_PAINTBRUSH.get());
    }

    private void appendWoolCarpets() {
        this.tag(ItemTags.WOOL_CARPETS)
                .add(KekeBlocks.BLEACHED_CARPET.get().asItem());
    }
    private void appendBoats() {
        this.tag(ItemTags.BOATS)
                .add(KekeItems.CORK_BOAT.get());
    }
    private void appendChestBoats() {
        this.tag(ItemTags.CHEST_BOATS)
                .add(KekeItems.CORK_CHEST_BOAT.get());
    }

    private void appendDyes() {
        for (DyeColor colours : DyeColor.values()) {
            this.tag(ArtsAndCraftsTags.ItemTags.DYES)
                    .add(DyeItem.byColor(colours));
        }
    }
    private void appendChalkSticks() {
        for (DyeColor colours : DyeColor.values()) {
            this.tag(ArtsAndCraftsTags.ItemTags.CHALK_STICKS)
                    .add(KekeItems.getChalkStick(colours.getId()));
        }
        this.tag(ArtsAndCraftsTags.ItemTags.CHALK_STICKS)
                .add(KekeItems.BLEACHED_CHALK_STICK.get());
    }
    private void appendDecoratedPots() {
        for (DyeColor colours : DyeColor.values()) {
            this.tag(ArtsAndCraftsTags.ItemTags.DECORATED_POTS)
                    .add(Items.DECORATED_POT)
                    .add(KekeItems.getDyedDecoratedPotBlockItem(colours));
        }
    }
    private void appendDecoratedPotSherds() {
        this.tag(ItemTags.DECORATED_POT_SHERDS)
                .add(KekeItems.ROLL_POTTERY_SHERD.get())
                .add(KekeItems.RUINED_POTTERY_SHERD.get())
                .add(KekeItems.FINALE_POTTERY_SHERD.get())
                .add(KekeItems.GATEWAY_POTTERY_SHERD.get())
                .add(KekeItems.POTTERY_SHERD.get());
    }

    private void appendPlanks() {
        this.tag(ItemTags.PLANKS)
                .add(KekeBlocks.CORK_PLANKS.get().asItem());
    }
    private void appendWoodenButtons() {
        this.tag(ItemTags.WOODEN_BUTTONS)
                .add(KekeBlocks.CORK_BUTTON.get().asItem());
    }
    private void appendLogsThatBurn() {
        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(KekeBlocks.CORK_LOG.get().asItem())
                .add(KekeBlocks.STRIPPED_CORK_LOG.get().asItem())
                .add(KekeBlocks.CORK_WOOD.get().asItem())
                .add(KekeBlocks.STRIPPED_CORK_WOOD.get().asItem());
    }
}
