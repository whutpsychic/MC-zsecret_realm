package com.zbc.zsecret_realm.zcore.check;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class BlockChecker {

    // 判断方块是否为空气
    // 空气、洞穴空气、虚空
    public static boolean isAirBlock(Block block) {
        return block.equals(Blocks.AIR) || block.equals(Blocks.CAVE_AIR) || block.equals(Blocks.VOID_AIR);
    }

    // 判断方块是否为杂草
    // 草丛、高草丛、蕨类、大型蕨类
    // 各种下界菌索、各种下界藤蔓
    // 发光地衣
    public static boolean isGrassBlock(Block block) {
        boolean isGrass = block.equals(Blocks.GRASS) || block.equals(Blocks.TALL_GRASS) ||
                block.equals(Blocks.FERN) || block.equals(Blocks.LARGE_FERN);
        boolean isNetherPlant = block.equals(Blocks.CRIMSON_ROOTS) || block.equals(Blocks.WARPED_ROOTS) || block.equals(Blocks.NETHER_SPROUTS) || block.equals(Blocks.WEEPING_VINES) || block.equals(Blocks.TWISTING_VINES);

        return isGrass || isNetherPlant || block.equals(Blocks.GLOW_LICHEN);
    }

    // 基本上可以算是空气的方块
    // 空气、杂草系列
    public static boolean isAlmostEmpty(Block block) {
        boolean isAir = isAirBlock(block);
        boolean isGrass = isGrassBlock(block);

        return isAir || isGrass;
    }

}
