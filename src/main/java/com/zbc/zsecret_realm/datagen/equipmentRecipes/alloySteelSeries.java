//package com.zbc.zsecret_realm.datagen.equipmentRecipes;
//
//import com.zbc.zsecret_realm.modItems.ModItems;
//import net.minecraft.core.HolderLookup;
//import net.minecraft.data.PackOutput;
//import net.minecraft.data.recipes.FinishedRecipe;
//import net.minecraft.data.recipes.RecipeCategory;
//import net.minecraft.data.recipes.RecipeProvider;
//import net.minecraft.data.recipes.ShapedRecipeBuilder;
//import net.minecraft.world.item.Items;
//
//import java.util.concurrent.CompletableFuture;
//import java.util.function.Consumer;
//
//import static com.zbc.zsecret_realm.datagen.ModRecipeProvider.genNameByItemOrBlock;
//
//public class alloySteelSeries extends RecipeProvider {
//
//    public alloySteelSeries(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
//        super(output, registries);
//    }
//
//    public static void register(RecipeOutput recipeOutput) {
//        // 不锈钢锄
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALLOY_STEEL_HOE)
//                .pattern(" AA")
//                .pattern(" B ")
//                .pattern(" B ").define('A', ModItems.ALLOY_STEEL_INGOT).define('B', Items.STICK)
//                .unlockedBy("has_alloy_steel", has(ModItems.ALLOY_STEEL_INGOT))
//                .save(recipeOutput, genNameByItemOrBlock("crafting_shaped", ModItems.ALLOY_STEEL_HOE.get()));
//        // 不锈钢铲
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALLOY_STEEL_SHOVEL)
//                .pattern(" A ")
//                .pattern(" B ")
//                .pattern(" B ").define('A', ModItems.ALLOY_STEEL_INGOT).define('B', Items.STICK)
//                .unlockedBy("has_alloy_steel", has(ModItems.ALLOY_STEEL_INGOT))
//                .save(recipeOutput, genNameByItemOrBlock("crafting_shaped", ModItems.ALLOY_STEEL_SHOVEL.get()));
//
//        // 不锈钢镐
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALLOY_STEEL_PICKAXE)
//                .pattern("AAA")
//                .pattern(" B ")
//                .pattern(" B ").define('A', ModItems.ALLOY_STEEL_INGOT).define('B', Items.STICK)
//                .unlockedBy("has_alloy_steel", has(ModItems.ALLOY_STEEL_INGOT))
//                .save(recipeOutput, genNameByItemOrBlock("crafting_shaped", ModItems.ALLOY_STEEL_PICKAXE.get()));
//
//        // 不锈钢斧
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALLOY_STEEL_AXE)
//                .pattern(" AA")
//                .pattern(" BA")
//                .pattern(" B ").define('A', ModItems.ALLOY_STEEL_INGOT).define('B', Items.STICK)
//                .unlockedBy("has_alloy_steel", has(ModItems.ALLOY_STEEL_INGOT))
//                .save(recipeOutput, genNameByItemOrBlock("crafting_shaped", ModItems.ALLOY_STEEL_AXE.get()));
//
//        // 不锈钢剑
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALLOY_STEEL_SWORD)
//                .pattern(" A ")
//                .pattern(" A ")
//                .pattern(" B ").define('A', ModItems.ALLOY_STEEL_INGOT).define('B', Items.STICK)
//                .unlockedBy("has_alloy_steel", has(ModItems.ALLOY_STEEL_INGOT))
//                .save(recipeOutput, genNameByItemOrBlock("crafting_shaped", ModItems.ALLOY_STEEL_SWORD.get()));
//
//        // 钢头盔
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALLOY_STEEL_HELMET)
//                .pattern("AAA")
//                .pattern("A A").define('A', ModItems.ALLOY_STEEL_INGOT)
//                .unlockedBy("has_uzi", has(ModItems.ALLOY_STEEL_INGOT))
//                .save(recipeOutput, genNameByItemOrBlock("crafting_shaped", ModItems.ALLOY_STEEL_HELMET.get()));
//
//        // 钢胸甲
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALLOY_STEEL_CHESTPLATE)
//                .pattern("A A")
//                .pattern("AAA")
//                .pattern("AAA").define('A', ModItems.ALLOY_STEEL_INGOT)
//                .unlockedBy("has_uzi", has(ModItems.ALLOY_STEEL_INGOT))
//                .save(recipeOutput, genNameByItemOrBlock("crafting_shaped", ModItems.ALLOY_STEEL_CHESTPLATE.get()));
//
//        // 钢护腿
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALLOY_STEEL_LEGGINGS)
//                .pattern("AAA")
//                .pattern("A A")
//                .pattern("A A").define('A', ModItems.ALLOY_STEEL_INGOT)
//                .unlockedBy("has_uzi", has(ModItems.ALLOY_STEEL_INGOT))
//                .save(recipeOutput, genNameByItemOrBlock("crafting_shaped", ModItems.ALLOY_STEEL_LEGGINGS.get()));
//
//        // 钢靴子
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALLOY_STEEL_BOOTS)
//                .pattern("A A")
//                .pattern("A A").define('A', ModItems.ALLOY_STEEL_INGOT)
//                .unlockedBy("has_uzi", has(ModItems.ALLOY_STEEL_INGOT))
//                .save(recipeOutput, genNameByItemOrBlock("crafting_shaped", ModItems.ALLOY_STEEL_BOOTS.get()));
//
//    }
//
//    @Override
//    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
//
//    }
//}
