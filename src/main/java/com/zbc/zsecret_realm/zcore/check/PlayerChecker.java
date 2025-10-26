package com.zbc.zsecret_realm.zcore.check;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;

public class PlayerChecker {

    // 判断玩家是否佩戴某物品
    // 物品存在于玩家的物品快捷栏或是副手持有则认为是正在佩戴
    public static boolean isCarrying(Player player, Item item) {
        // 副手持有
        Item offHandHolding = player.getOffhandItem().getItem();
        if (offHandHolding.equals(item)) {
            return true;
        }
        // 快捷栏存在
        for (int i = 0; i < 9; i++) {
            Item target = player.getInventory().getItem(i).getItem();
            if (target.equals(item)) {
                return true;
            }
        }
        return false;
    }


}
