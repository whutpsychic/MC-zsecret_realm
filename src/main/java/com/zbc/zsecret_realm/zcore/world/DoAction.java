package com.zbc.zsecret_realm.zcore.world;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;

public class DoAction {

    // 在某位置起爆，爆炸威力和模式等同于TNT，即爆炸半径为4
    // 伤害来源为entity，是否起火causeFire
    public static void genDefaultExplode(Level world, BlockPos position, Entity entity, boolean causeFire) {
        world.explode(entity, position.getX(), position.getY(), position.getZ(), 4.0F, causeFire, Level.ExplosionInteraction.TNT);
    }

    // 在某位置起爆，爆炸半径为r
    // 伤害来源为entity，是否起火causeFire
    public static void genExplode(Level world, BlockPos position, Entity entity, boolean causeFire, float r) {
        world.explode(entity, position.getX(), position.getY(), position.getZ(), r, causeFire, Level.ExplosionInteraction.TNT);
    }

    // 将天气改为雷暴
    public static void turnWeatherToThunder(Level world) {
        world.getServer().overworld().setWeatherParameters(0, 20 * 60 * 7, true, true);
    }

    // 将天气改为降雨
    public static void turnWeatherToRain(Level world) {
        world.getServer().overworld().setWeatherParameters(0, 20 * 60 * 7, true, false);
    }

    // 将天气改为晴天
    public static void turnWeatherToClear(Level world) {
        world.getServer().overworld().setWeatherParameters(0, 20 * 60 * 20, false, false);
    }


}
