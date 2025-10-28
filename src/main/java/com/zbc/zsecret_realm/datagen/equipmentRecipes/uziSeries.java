package com.zbc.zsecret_realm.datagen.equipmentRecipes;

import com.zbc.zsecret_realm.modItem.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

import static com.zbc.zsecret_realm.datagen.ModRecipeProvider.genNameByItemOrBlock;

public class uziSeries extends RecipeProvider {
    public uziSeries(PackOutput p_248933_) {
        super(p_248933_);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
    }

    public static void register(Consumer<FinishedRecipe> recipeOutput) {
        // 钢锄
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.UZI_HOE.get())
                .pattern(" AA")
                .pattern(" B ")
                .pattern(" B ").define('A', ModItems.UZI_STEEL_INGOT.get()).define('B', Items.STICK)
                .unlockedBy("has_uzi", has(ModItems.UZI_STEEL_INGOT.get()))
                .save(recipeOutput, genNameByItemOrBlock("crafting_shaped", ModItems.UZI_HOE.get()));
        // 钢铲
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.UZI_SHOVEL.get())
                .pattern(" A ")
                .pattern(" B ")
                .pattern(" B ").define('A', ModItems.UZI_STEEL_INGOT.get()).define('B', Items.STICK)
                .unlockedBy("has_uzi", has(ModItems.UZI_STEEL_INGOT.get()))
                .save(recipeOutput, genNameByItemOrBlock("crafting_shaped", ModItems.UZI_SHOVEL.get()));

        // 钢镐
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.UZI_PICKAXE.get())
                .pattern("AAA")
                .pattern(" B ")
                .pattern(" B ").define('A', ModItems.UZI_STEEL_INGOT.get()).define('B', Items.STICK)
                .unlockedBy("has_uzi", has(ModItems.UZI_STEEL_INGOT.get()))
                .save(recipeOutput, genNameByItemOrBlock("crafting_shaped", ModItems.UZI_PICKAXE.get()));

        // 钢斧
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.UZI_AXE.get())
                .pattern(" AA")
                .pattern(" BA")
                .pattern(" B ").define('A', ModItems.UZI_STEEL_INGOT.get()).define('B', Items.STICK)
                .unlockedBy("has_uzi", has(ModItems.UZI_STEEL_INGOT.get()))
                .save(recipeOutput, genNameByItemOrBlock("crafting_shaped", ModItems.UZI_AXE.get()));

        // 钢剑
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.UZI_SWORD.get())
                .pattern(" A ")
                .pattern(" A ")
                .pattern(" B ").define('A', ModItems.UZI_STEEL_INGOT.get()).define('B', Items.STICK)
                .unlockedBy("has_uzi", has(ModItems.UZI_STEEL_INGOT.get()))
                .save(recipeOutput, genNameByItemOrBlock("crafting_shaped", ModItems.UZI_SWORD.get()));

        // 钢头盔
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.UZI_HELMET.get())
                .pattern("AAA")
                .pattern("A A").define('A', ModItems.UZI_STEEL_INGOT.get())
                .unlockedBy("has_uzi", has(ModItems.UZI_STEEL_INGOT.get()))
                .save(recipeOutput, genNameByItemOrBlock("crafting_shaped", ModItems.UZI_HELMET.get()));

        // 钢胸甲
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.UZI_CHESTPLATE.get())
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA").define('A', ModItems.UZI_STEEL_INGOT.get())
                .unlockedBy("has_uzi", has(ModItems.UZI_STEEL_INGOT.get()))
                .save(recipeOutput, genNameByItemOrBlock("crafting_shaped", ModItems.UZI_CHESTPLATE.get()));

        // 钢护腿
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.UZI_LEGGINGS.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A").define('A', ModItems.UZI_STEEL_INGOT.get())
                .unlockedBy("has_uzi", has(ModItems.UZI_STEEL_INGOT.get()))
                .save(recipeOutput, genNameByItemOrBlock("crafting_shaped", ModItems.UZI_LEGGINGS.get()));

        // 钢靴子
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.UZI_BOOTS.get())
                .pattern("A A")
                .pattern("A A").define('A', ModItems.UZI_STEEL_INGOT.get())
                .unlockedBy("has_uzi", has(ModItems.UZI_STEEL_INGOT.get()))
                .save(recipeOutput, genNameByItemOrBlock("crafting_shaped", ModItems.UZI_BOOTS.get()));

    }

}
