package com.zbc.zsecret_realm.zcore.collect;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;

import java.util.ArrayList;
import java.util.List;

public class BlockPositions {

    // 收集以某点为中心，r为放半径的正方体点位
    public static List<BlockPos> getRectPointsByRadius(BlockPos center, int r) {
        List<BlockPos> result = new ArrayList<>();
        // 从上东北角开始到下西南角逐层收集点位
        BlockPos startPosition = center.north(r).above(r).east(r);
        for (int i = 0; i < 2 * r + 1; i++) {
            BlockPos sp1 = startPosition.below(i);
            for (int j = 0; j < 2 * r + 1; j++) {
                BlockPos sp2 = sp1.south(j);
                for (int k = 0; k < 2 * r + 1; k++) {
                    result.add(sp2.west(k));
                }
            }
        }

        return result;
    }

    // 收集以某点为球心，半径为r的球形点位
    public static List<BlockPos> getSpherePointsByRadius(BlockPos center, int r) {
        List<BlockPos> result;
        // 先收集以center为中心，r为方半径点位
        List<BlockPos> rectPoints = getRectPointsByRadius(center, r);
        // 在筛选xyz=r2的球星点位
        result = rectPoints.stream().filter((pos) -> {
            int x = center.getX() - pos.getX();
            int y = center.getY() - pos.getY();
            int z = center.getZ() - pos.getZ();

            return ((x * x) + (y * y) + (z * z)) <= (r * r);
        }).toList();

        return result;
    }

    // 获取以玩家当前位置为起始点位，前方每间隔x距离取n个点位
    public static List<BlockPos> getFrontPoints(Player player, double d, int n) {
        List<BlockPos> result = new ArrayList<>();
        // 起始位置
        BlockPos startPosition = player.blockPosition();
        Vec3 vec3 = player.getLookAngle();

        for (int i = 0; i < n; i++) {
            result.add(
                    new BlockPos(
                            (int) (startPosition.getX() + (i + 1) * vec3.x * d),
                            (int) (startPosition.getY() + (i + 1) * vec3.y * d),
                            (int) (startPosition.getZ() + (i + 1) * vec3.z * d)
                    )
            );
        }

        return result;
    }

    // 获取以玩家当前位置为起始点位，同一Y轴圆边上的8个点
    // 正方向、正斜方向
    public static List<BlockPos> getRoundPoses(Player player, int radius) {
        List<BlockPos> result = new ArrayList<>();
        // 起始位置
        BlockPos startPosition = player.blockPosition();

        result.add(startPosition.east(radius));
        result.add(startPosition.west(radius));
        result.add(startPosition.south(radius));
        result.add(startPosition.north(radius));

        result.add(startPosition.east(radius).north((int) (0.7 * radius)));
        result.add(startPosition.west(radius).north((int) (0.7 * radius)));
        result.add(startPosition.east(radius).south((int) (0.7 * radius)));
        result.add(startPosition.west(radius).south((int) (0.7 * radius)));

        return result;
    }

    // 获取以某点为起始位置，向下8格，向上16格，每隔3格垂直方向，下两点，上四点加本身共计取7个点
    public static List<BlockPos> getVerticalPoints(BlockPos start) {
        List<BlockPos> result = new ArrayList<>();
        result.add(start);
        result.add(start.below(4));
        result.add(start.below(8));
        result.add(start.above(4));
        result.add(start.above(8));
        result.add(start.above(12));
        result.add(start.above(16));
        return result;
    }


}
