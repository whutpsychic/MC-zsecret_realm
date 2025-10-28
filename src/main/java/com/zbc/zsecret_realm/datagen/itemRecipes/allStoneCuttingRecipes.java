package com.zbc.zsecret_realm.datagen.itemRecipes;

import com.zbc.zsecret_realm.modItem.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

import static com.zbc.zsecret_realm.datagen.ModRecipeProvider.genNameByItemOrBlock;

public class allStoneCuttingRecipes extends RecipeProvider {

    public allStoneCuttingRecipes(PackOutput p_248933_) {
        super(p_248933_);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
    }

    public static void register(Consumer<FinishedRecipe> consumer) {
        // 煤炭 -> 碳粉
        registerStoneCuttingRecipe(consumer, Items.COAL, ModItems.COAL_POWDER.get(), 2);
    }

    public static void registerStoneCuttingRecipe(Consumer<FinishedRecipe> recipeOutput, ItemLike ingredient, ItemLike result, int count) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ingredient.asItem()), RecipeCategory.MISC, result, count).unlockedBy(getHasName(ingredient), has(ingredient)).save(recipeOutput, genNameByItemOrBlock("stonecutting", ingredient.asItem()));
    }

}
