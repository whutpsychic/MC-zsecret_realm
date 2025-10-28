package com.zbc.zsecret_realm.datagen.itemRecipes;

import com.zbc.zsecret_realm.Main;
import com.zbc.zsecret_realm.modItem.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class allShapelessCraftRecipes extends RecipeProvider {

    public allShapelessCraftRecipes(PackOutput p_248933_) {
        super(p_248933_);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
    }

    public static void register(Consumer<FinishedRecipe> consumer) {
        // 煤炭 -> 碳粉
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COAL_POWDER.get(), 2) // 合成结果
                .requires(Items.COAL) // 需要生铁
                .unlockedBy("has_coal", has(Items.COAL)) // 解锁条件
                .save(consumer, new ResourceLocation(Main.MOD_ID, "coal_powder")); // 保存配方

        // 碳粉 + 生铁 -> 加碳生铁
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_IRON_WITH_CARBON.get()) // 合成结果
                .requires(Items.RAW_IRON) // 需要生铁
                .requires(ModItems.COAL_POWDER.get()) // 需要碳粉
                .unlockedBy("has_raw_iron", has(Items.RAW_IRON)) // 解锁条件
                .save(consumer, new ResourceLocation(Main.MOD_ID, "raw_iron_with_carbon")); // 保存配方

        // 碳粉 + 金粒 + 生铁 -> 合金材料
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ALLOY_MATERIAL.get()) // 合成结果
                .requires(Items.RAW_IRON) // 需要生铁
                .requires(Items.GOLD_NUGGET, 4) // 需要金粒
                .requires(ModItems.COAL_POWDER.get()) // 需要碳粉
                .unlockedBy("has_raw_iron", has(Items.RAW_IRON)) // 解锁条件
                .save(consumer, new ResourceLocation(Main.MOD_ID, "alloy_material")); // 保存配方
    }

}
