package com.zbc.zsecret_realm.datagen;

import com.zbc.zsecret_realm.Main;
import com.zbc.zsecret_realm.modItems.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, Main.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        tag(ItemTags.HOES)
                .add(ModItems.ALLOY_HOE.get())
                .add(ModItems.UZI_HOE.get());

        tag(ItemTags.SHOVELS)
                .add(ModItems.ALLOY_SHOVEL.get())
                .add(ModItems.UZI_SHOVEL.get());

        tag(ItemTags.PICKAXES)
                .add(ModItems.ALLOY_PICKAXE.get())
                .add(ModItems.UZI_PICKAXE.get());

        tag(ItemTags.AXES)
//                .add(ModItems.ICE_AXE.get())
                .add(ModItems.ALLOY_AXE.get())
                .add(ModItems.UZI_AXE.get());

        tag(ItemTags.SWORDS)
//                .add(ModItems.ENDER_SWORD.get())
//                .add(ModItems.WIND_SWORD.get())
//                .add(ModItems.BLAZE_SWORD.get())
                .add(ModItems.ALLOY_SWORD.get())
                .add(ModItems.UZI_SWORD.get());

        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.ALLOY_HELMET.get())
                .add(ModItems.ALLOY_CHESTPLATE.get())
                .add(ModItems.ALLOY_LEGGINGS.get())
                .add(ModItems.ALLOY_BOOTS.get())
                .add(ModItems.UZI_HELMET.get())
                .add(ModItems.UZI_CHESTPLATE.get())
                .add(ModItems.UZI_LEGGINGS.get())
                .add(ModItems.UZI_BOOTS.get());

    }
}
