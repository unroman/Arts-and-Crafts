package com.kekecreations.arts_and_crafts.core.forge.mixin;

import com.kekecreations.arts_and_crafts.client.renderer.bewlr.ArtsAndCraftsBEWLR;
import com.kekecreations.arts_and_crafts.common.item.CustomBedBlockItem;
import com.kekecreations.arts_and_crafts.common.item.DyedDecoratedPotBlockItem;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import org.spongepowered.asm.mixin.Mixin;

import java.util.function.Consumer;

@Mixin(CustomBedBlockItem.class)
public class CustomBedBlockItemSelfMixin extends Item {

    public CustomBedBlockItemSelfMixin(Properties arg) {
        super(arg);
    }


    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {

            @Override
            public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                return new ArtsAndCraftsBEWLR();
            }
        });
    }
}
