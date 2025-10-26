package com.zbc.zsecret_realm.zcore.math;

import java.util.Random;

public class RandomNumber {

    // 生成一个随机概率数值
    // percent 取值范围为 0-100（带小数）
    public static boolean generatePercent(double percent) {
        int rand = new Random().nextInt(1000);
        return rand <= percent * 10;
    }

    // 生成一个介于最大最小值之间的随机数值
    public static int genRandomInt(int min, int max) {
        int rand = new Random().nextInt(max - min);
        return min + rand;
    }

    // 以某点位为中心，加入随机偏移量返回一个旁边的点位
    public static double genRandomOffset(int value, double random) {
        double rand = new Random().nextDouble(random);
        if (generatePercent(50)) {
            return value + rand;
        } else {
            return value - rand;
        }
    }

}
