package com.zbc.zsecret_realm.modItems.magicRing;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.List;

import static com.zbc.zsecret_realm.Config.developing;

public class EnderRingItem extends Item {
    private String subtitle;  // 副标题文字
    private final ChatFormatting subtitleColor = ChatFormatting.YELLOW;  // 副标题默认是黄色的

    // 物品使用冷却时间
    private final int coolDownTicks = developing ? 20 : 20 * 10;

    // 默认声明方式
    public EnderRingItem(Properties p_41383_) {
        super(p_41383_);
    }

    // 副标题声明方式
    public EnderRingItem(Properties p_41383_, String subtitle) {
        super(p_41383_);
        this.subtitle = "subtitle." + subtitle;
    }

    @Override
    public void appendHoverText(@NotNull ItemStack p_41421_, @Nullable Level p_41422_, @NotNull List<Component> toolTips, @NotNull TooltipFlag p_41424_) {
        MutableComponent mutablecomponent = Component.translatable(subtitle);
        toolTips.add(mutablecomponent.withStyle(subtitleColor));
    }

    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand usedHand) {
        if (player.isCreative()) {
            return doAction(world, player, usedHand);
        } else {
            // 玩家等级超过20级才可用
            int lvl = player.experienceLevel;
            if (lvl < 20) {
                return super.use(world, player, usedHand);
            }
            // 否则
            else {
                // 消耗20级并立即生成经验球
                player.giveExperienceLevels(-20);
                return doAction(world, player, usedHand);
            }
        }
    }


    private InteractionResultHolder<ItemStack> doAction(Level world, Player player, InteractionHand usedHand) {
        // 提供的经验值
        int expOrbValue = 555;
        player.getCooldowns().addCooldown(this, this.coolDownTicks);
        world.addFreshEntity(new ExperienceOrb(world, player.getX(), player.getY(), player.getZ(), expOrbValue));
        ItemStack itemstack = player.getItemInHand(usedHand);
        return InteractionResultHolder.sidedSuccess(itemstack, world.isClientSide());
    }

    @Override
    public boolean isFoil(@NotNull ItemStack p_41453_) {
        return true;
    }

}
