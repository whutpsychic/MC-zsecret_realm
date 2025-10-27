package com.zbc.zsecret_realm.modItems.magicRing;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.List;

public class RingItem extends Item {
    private String subtitle;  // 副标题文字
    private final ChatFormatting subtitleColor = ChatFormatting.DARK_PURPLE;  // 副标题默认是紫色的

    // 默认声明方式
    public RingItem(Properties p_41383_) {
        super(p_41383_);
    }

    // 副标题声明方式
    public RingItem(Properties p_41383_, String subtitle) {
        super(p_41383_);
        this.subtitle = "subtitle." + subtitle;
    }

    @Override
    public void appendHoverText(@NotNull ItemStack p_41421_, @Nullable Level p_41422_, @NotNull List<Component> toolTips, @NotNull TooltipFlag p_41424_) {
        MutableComponent mutablecomponent = Component.translatable(subtitle);
        toolTips.add(mutablecomponent.withStyle(subtitleColor));
    }

    @Override
    public boolean isFoil(@NotNull ItemStack p_41453_) {
        return true;
    }

}
