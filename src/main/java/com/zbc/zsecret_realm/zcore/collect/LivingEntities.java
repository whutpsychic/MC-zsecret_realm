package com.zbc.zsecret_realm.zcore.collect;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Slime;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

import java.util.List;
import java.util.function.Predicate;

public class LivingEntities {

    // 获取附近所有的生物
    public static List<LivingEntity> getNearbyLivingEntities(Level world, Player player, double distance) {
        Predicate<LivingEntity> LIVING_ENTITY_SELECTOR = LivingEntity::attackable;
        TargetingConditions TARGETING_CONDITIONS = TargetingConditions.forCombat().range(distance).selector(LIVING_ENTITY_SELECTOR);
        return world.getNearbyEntities(LivingEntity.class, TARGETING_CONDITIONS, player, player.getBoundingBox().inflate(20.0, 8.0, 20.0));
    }

    // 获取附近所有的玩家敌对生物
    public static List<LivingEntity> getAllEnemyMobsInRange(Level world, Player player, double distance) {
        Predicate<LivingEntity> LIVING_ENTITY_SELECTOR = p_348303_ -> ((p_348303_ instanceof Monster) || p_348303_ instanceof Slime) && p_348303_.attackable();
        TargetingConditions TARGETING_CONDITIONS = TargetingConditions.forCombat().range(distance).selector(LIVING_ENTITY_SELECTOR);
        return world.getNearbyEntities(LivingEntity.class, TARGETING_CONDITIONS, player, player.getBoundingBox().inflate(20.0, 8.0, 20.0));
    }
}
