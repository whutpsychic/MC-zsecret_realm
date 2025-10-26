package com.zbc.zsecret_realm.datagen.equipmentRecipes;

import com.zbc.zsecret_realm.modItems.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

import static com.zbc.zsecret_realm.datagen.ModRecipeProvider.genNameByItemOrBlock;

public class alloySteelSeries extends RecipeProvider {

    public alloySteelSeries(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
    }

    public static void register(Consumer<FinishedRecipe> recipeOutput) {
        // 合金钢锄
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALLOY_HOE.get())
                .pattern(" AA")
                .pattern(" B ")
                .pattern(" B ").define('A', ModItems.ALLOY_STEEL_INGOT.get()).define('B', Items.STICK)
                .unlockedBy("has_alloy", has(ModItems.ALLOY_STEEL_INGOT.get()))
                .save(recipeOutput, genNameByItemOrBlock("crafting_shaped", ModItems.ALLOY_HOE.get()));
        // 合金钢铲
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALLOY_SHOVEL.get())
                .pattern(" A ")
                .pattern(" B ")
                .pattern(" B ").define('A', ModItems.ALLOY_STEEL_INGOT.get()).define('B', Items.STICK)
                .unlockedBy("has_alloy", has(ModItems.ALLOY_STEEL_INGOT.get()))
                .save(recipeOutput, genNameByItemOrBlock("crafting_shaped", ModItems.ALLOY_SHOVEL.get()));

        // 合金钢镐
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALLOY_PICKAXE.get())
                .pattern("AAA")
                .pattern(" B ")
                .pattern(" B ").define('A', ModItems.ALLOY_STEEL_INGOT.get()).define('B', Items.STICK)
                .unlockedBy("has_alloy", has(ModItems.ALLOY_STEEL_INGOT.get()))
                .save(recipeOutput, genNameByItemOrBlock("crafting_shaped", ModItems.ALLOY_PICKAXE.get()));

        // 合金钢斧
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALLOY_AXE.get())
                .pattern(" AA")
                .pattern(" BA")
                .pattern(" B ").define('A', ModItems.ALLOY_STEEL_INGOT.get()).define('B', Items.STICK)
                .unlockedBy("has_alloy", has(ModItems.ALLOY_STEEL_INGOT.get()))
                .save(recipeOutput, genNameByItemOrBlock("crafting_shaped", ModItems.ALLOY_AXE.get()));

        // 合金钢剑
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALLOY_SWORD.get())
                .pattern(" A ")
                .pattern(" A ")
                .pattern(" B ").define('A', ModItems.ALLOY_STEEL_INGOT.get()).define('B', Items.STICK)
                .unlockedBy("has_alloy", has(ModItems.ALLOY_STEEL_INGOT.get()))
                .save(recipeOutput, genNameByItemOrBlock("crafting_shaped", ModItems.ALLOY_SWORD.get()));

        // 合金钢头盔
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALLOY_HELMET.get())
                .pattern("AAA")
                .pattern("A A").define('A', ModItems.ALLOY_STEEL_INGOT.get())
                .unlockedBy("has_alloy", has(ModItems.ALLOY_STEEL_INGOT.get()))
                .save(recipeOutput, genNameByItemOrBlock("crafting_shaped", ModItems.ALLOY_HELMET.get()));

        // 合金钢胸甲
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALLOY_CHESTPLATE.get())
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA").define('A', ModItems.ALLOY_STEEL_INGOT.get())
                .unlockedBy("has_alloy", has(ModItems.ALLOY_STEEL_INGOT.get()))
                .save(recipeOutput, genNameByItemOrBlock("crafting_shaped", ModItems.ALLOY_CHESTPLATE.get()));

        // 合金钢护腿
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALLOY_LEGGINGS.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A").define('A', ModItems.ALLOY_STEEL_INGOT.get())
                .unlockedBy("has_alloy", has(ModItems.ALLOY_STEEL_INGOT.get()))
                .save(recipeOutput, genNameByItemOrBlock("crafting_shaped", ModItems.ALLOY_LEGGINGS.get()));

        // 合金钢靴子
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALLOY_BOOTS.get())
                .pattern("A A")
                .pattern("A A").define('A', ModItems.ALLOY_STEEL_INGOT.get())
                .unlockedBy("has_alloy", has(ModItems.ALLOY_STEEL_INGOT.get()))
                .save(recipeOutput, genNameByItemOrBlock("crafting_shaped", ModItems.ALLOY_BOOTS.get()));

    }


}
