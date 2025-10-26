package com.zbc.zsecret_realm.datagen;

import com.zbc.zsecret_realm.Main;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = Main.MOD_ID)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        // Data generators may require some of these as constructor parameters.
        // See below for more details on each of these.
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        // 注册工作台合成配方
        generator.addProvider(event.includeServer(), new ModRecipeProvider(output));
        // 物品模型
        generator.addProvider(event.includeClient(), new ModItemModelProvider(output, existingFileHelper));
        // 注册 BlockTag 和 ItemTag
        BlockTagsProvider blockTagsProvider = new ModBlockTagProvider(output, lookupProvider, existingFileHelper);
        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), new ModItemTagProvider(output, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));
    }
}
