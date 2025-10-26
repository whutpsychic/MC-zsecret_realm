package com.zbc.zsecret_realm;

import com.zbc.zsecret_realm.modItems.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModItemCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Main.MOD_ID);

    // 秘境传说：常规
    public static final Supplier<CreativeModeTab> MOD_TAB = CREATIVE_MODE_TAB.register("main_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.UZI_STEEL_INGOT.get()))
                    .title(Component.translatable("itemGroup.zsecret_realm.main_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.COAL_POWDER.get());
                        output.accept(ModItems.RAW_IRON_WITH_CARBON.get());
                        output.accept(ModItems.ALLOY_MATERIAL.get());
                        output.accept(ModItems.UZI_STEEL_INGOT.get());
                        output.accept(ModItems.ALLOY_STEEL_INGOT.get());
                        output.accept(ModItems.METEORITE_STEEL_INGOT.get());

                    }).build());

//    // 秘境传说：魔法
//    public static final Supplier<CreativeModeTab> MAGIC_TAB = CREATIVE_MODE_TAB.register("magic_tab",
//            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.ENCHANTED_GOLDEN_APPLE))
//                    .title(Component.translatable("itemGroup.zsecret_realm.magic_tab"))
//                    .displayItems((itemDisplayParameters, output) -> {
//
//
//                    }).build());
//
//    // 秘境传说：科技
//    public static final Supplier<CreativeModeTab> TECH_TAB = CREATIVE_MODE_TAB.register("tech_tab",
//            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.ENCHANTED_GOLDEN_APPLE))
//                    .title(Component.translatable("itemGroup.zsecret_realm.tech_tab"))
//                    .displayItems((itemDisplayParameters, output) -> {
//
//
//                    }).build());

}
