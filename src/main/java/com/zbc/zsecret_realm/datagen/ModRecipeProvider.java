package com.zbc.zsecret_realm.datagen;

import com.zbc.zsecret_realm.Main;
import com.zbc.zsecret_realm.datagen.itemRecipes.allBlastingRecipes;
import com.zbc.zsecret_realm.datagen.itemRecipes.allShapedCraftRecipes;
import com.zbc.zsecret_realm.datagen.itemRecipes.allShapelessCraftRecipes;
import com.zbc.zsecret_realm.datagen.itemRecipes.allStoneCuttingRecipes;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(PackOutput p_248933_) {
        super(p_248933_);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> consumer) {

        // ---------------- 注册工作台无序合成配方 ----------------
        allShapelessCraftRecipes.register(consumer);

        // ---------------- 注册工作台有序合成配方 ----------------
        allShapedCraftRecipes.register(consumer);

        // ---------------- 注册高炉配方 ----------------
        allBlastingRecipes.register(consumer);

        // ---------------- 注册切石机配方 ----------------
        allStoneCuttingRecipes.register(consumer);
    }


    // ------------------------------- tool -------------------------------
    public static String genNameByItemOrBlock(String recipeType, Block block) {
        String desId = block.getDescriptionId();
        return genName(recipeType, desId.split("\\.")[2]);
    }

    public static String genNameByItemOrBlock(String recipeType, Item item) {
        String desId = item.getDescriptionId();
        return genName(recipeType, desId.split("\\.")[2]);
    }

    public static String genName(String recipeType, String fileName) {
        return Main.MOD_ID + ":" + recipeType + "_" + fileName;
    }

}
