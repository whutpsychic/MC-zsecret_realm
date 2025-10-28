package com.zbc.zsecret_realm.modItem;

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

public class ModItem extends Item {
    private String subtitle;  // 副标题文字
    private ChatFormatting subtitleColor = ChatFormatting.GRAY;  // 副标题默认是灰色的
    private boolean isFoiled = false;  // 默认没有附魔光晕

    // 默认声明方式
    public ModItem(Properties p_41383_) {
        super(p_41383_);
    }

    // 副标题声明方式
    public ModItem(Properties p_41383_, String subtitle) {
        super(p_41383_);
        this.subtitle = "subtitle." + subtitle;
    }

    // 副标题声明方式
    public ModItem(Properties p_41383_, String subtitle, ChatFormatting color) {
        super(p_41383_);
        this.subtitle = "subtitle." + subtitle;
        this.subtitleColor = color;
    }

    // 附魔光晕声明方式
    // 默认认为这种物品的稀有程度是较高的
    public ModItem(Properties p_41383_, String subtitle, @Nullable ChatFormatting color, boolean isFoiled) {
        super(p_41383_);
        this.subtitle = "subtitle." + subtitle;
        this.subtitleColor = color;
        this.isFoiled = isFoiled;
    }


    @Override
    public void appendHoverText(@NotNull ItemStack p_41421_, @Nullable Level p_41422_, @NotNull List<Component> toolTips, @NotNull TooltipFlag p_41424_) {
        MutableComponent mutablecomponent = Component.translatable(subtitle);
        toolTips.add(mutablecomponent.withStyle(subtitleColor));
    }


    @Override
    public boolean isFoil(@NotNull ItemStack p_41453_) {
        return this.isFoiled || p_41453_.isEnchanted();
    }

}
