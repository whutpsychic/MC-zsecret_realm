package com.zbc.zsecret_realm.datagen.itemRecipes;

import com.zbc.zsecret_realm.modItem.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

import static com.zbc.zsecret_realm.datagen.ModRecipeProvider.genNameByItemOrBlock;

public class allBlastingRecipes extends RecipeProvider {
    public allBlastingRecipes(PackOutput p_248933_) {
        super(p_248933_);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
    }

    public static void register(Consumer<FinishedRecipe> consumer) {
        // 加碳生铁 -> 乌兹钢锭
        registerDefaultBlastingRecipe(consumer, ModItems.RAW_IRON_WITH_CARBON.get(), RecipeCategory.MISC, ModItems.UZI_STEEL_INGOT.get());
        // 合金材料 -> 合金钢锭
        registerDefaultBlastingRecipe(consumer, ModItems.ALLOY_MATERIAL.get(), RecipeCategory.MISC, ModItems.ALLOY_STEEL_INGOT.get());

    }

    // ----------------------------------------------------
    // 默认经验值和时间的配方
    public static void registerDefaultSmeltingRecipe(Consumer<FinishedRecipe> recipeOutput, ItemLike ingredient, RecipeCategory category, ItemLike result) {
        registerSmeltingRecipe(recipeOutput, ingredient, category, result, 1f, 200);
    }

    public static void registerDefaultBlastingRecipe(Consumer<FinishedRecipe> recipeOutput, ItemLike ingredient, RecipeCategory category, ItemLike result) {
        registerBlastingRecipe(recipeOutput, ingredient, category, result, 1f, 100);
    }

    // ----------------------------------------------------
    public static void registerSmeltingRecipe(Consumer<FinishedRecipe> recipeOutput, ItemLike ingredient, RecipeCategory category, ItemLike result, float experience, int cookingTime) {
        SimpleCookingRecipeBuilder.generic(Ingredient.of(ingredient), category, result, experience, cookingTime, RecipeSerializer.SMELTING_RECIPE).unlockedBy(getHasName(ingredient), has(ingredient)).save(recipeOutput, genNameByItemOrBlock("smelting", ingredient.asItem()));
    }

    public static void registerBlastingRecipe(Consumer<FinishedRecipe> recipeOutput, ItemLike ingredient, RecipeCategory category, ItemLike result, float experience, int cookingTime) {
        SimpleCookingRecipeBuilder.generic(Ingredient.of(ingredient), category, result, experience, cookingTime, RecipeSerializer.BLASTING_RECIPE).unlockedBy(getHasName(ingredient), has(ingredient)).save(recipeOutput, genNameByItemOrBlock("blasting", ingredient.asItem()));
    }

    //
//    public static void registerSmokingRecipe(RecipeOutput recipeOutput, ItemLike ingredient, RecipeCategory category, ItemLike result, float experience, int cookingTime) {
//        SimpleCookingRecipeBuilder.generic(Ingredient.of(ingredient), category, result, experience, cookingTime, RecipeSerializer.SMOKING_RECIPE, SmokingRecipe::new).unlockedBy(getHasName(ingredient), has(ingredient)).save(recipeOutput, genNameByItemOrBlock("smoking", ingredient.asItem()));
//    }
}
