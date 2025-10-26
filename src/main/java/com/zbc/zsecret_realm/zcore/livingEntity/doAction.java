package com.zbc.zsecret_realm.zcore.livingEntity;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;

public class doAction {

    // 如果生物身上没有某效果，给玩家身上加效果
    // 如果生物身上有该效果但剩余秒数不足，给玩家身上加固定秒数的效果
    // 如果生物身上有该效果且剩余秒数充足，则拉倒
    public static void addEffectToLivingEntity(LivingEntity livingEntity, MobEffect effect, int ticks, int amplifier) {
        MobEffectInstance currEffectInstance = livingEntity.getEffect(effect);

        if (currEffectInstance != null) {
            int tickLeast = currEffectInstance.getDuration();
            if (tickLeast < ticks) {
                livingEntity.addEffect(new MobEffectInstance(effect, ticks, amplifier));
            }
        } else {
            // 直接添加
            livingEntity.addEffect(new MobEffectInstance(effect, ticks, amplifier));
        }
    }

    // 如果生物身上有某种效果且其效用为无穷大，则移除之
    public static void removeInfiniteEffect(LivingEntity livingEntity, MobEffect effect) {
        MobEffectInstance currEffectInstance = livingEntity.getEffect(effect);
        if (currEffectInstance != null) {
            int tickLeast = currEffectInstance.getDuration();
            if (tickLeast == -1) {
                livingEntity.removeEffect(effect);
            }
        }
    }

    // 如果生物身上有某种效果，则移除之
    public static void tryToRemoveEffect(LivingEntity livingEntity, MobEffect effect) {
        MobEffectInstance currEffectInstance = livingEntity.getEffect(effect);
        if (currEffectInstance != null) {
            livingEntity.removeEffect(effect);
        }
    }


}
