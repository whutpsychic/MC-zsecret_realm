package com.zbc.zsecret_realm.datagen.itemRecipes;

import com.zbc.zsecret_realm.datagen.equipmentRecipes.alloySteelSeries;
import com.zbc.zsecret_realm.datagen.equipmentRecipes.uziSeries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class allShapedCraftRecipes extends RecipeProvider {

    public allShapedCraftRecipes(PackOutput p_248933_) {
        super(p_248933_);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
    }

    public static void register(Consumer<FinishedRecipe> consumer) {
        // 乌兹钢套装
        uziSeries.register(consumer);
        // 合金钢套装
        alloySteelSeries.register(consumer);
    }

}
