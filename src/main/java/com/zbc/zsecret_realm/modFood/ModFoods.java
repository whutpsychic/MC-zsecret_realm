package com.zbc.zsecret_realm.modFood;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {

    // 兵粮肉丸
    public static final FoodProperties MILITARY_MEATBALL = buildMeatProperty(10, 0.9F).fast().build();
    // 夹心面包
    public static final FoodProperties SANDWICH_BREAD = buildFoodProperty(5, 0.9F).build();
    // 生肉串
    public static final FoodProperties RAW_SKEWER = buildMeatProperty(2, 0.3F)
            .effect(new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3F).fast().build();
    // 烤肉串
    public static final FoodProperties SKEWER = buildMeatProperty(5, 0.5F).fast().build();
    // 河豚煲
    public static final FoodProperties PUFFERFISH_STEW = buildMeatProperty(6, 0.6F)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20 * 60, 0), 1)
            .effect(new MobEffectInstance(MobEffects.JUMP, 20 * 60, 0), 1).build();
    // 水果捞
    public static final FoodProperties FRUIT_MIX = buildFoodProperty(7, 0.5F).build();


    // 常规食物注册器
    private static FoodProperties.Builder buildFoodProperty(int nutrition, float saturationMod) {
        return (new FoodProperties.Builder()).nutrition(nutrition).saturationMod(saturationMod);
    }

    // 肉类食物注册器
    private static FoodProperties.Builder buildMeatProperty(int nutrition, float saturationMod) {
        return (new FoodProperties.Builder()).nutrition(nutrition).saturationMod(saturationMod).meat();
    }
}
