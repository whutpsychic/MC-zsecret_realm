package com.zbc.zsecret_realm.modItem.epicWeapon;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.LargeFireball;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.List;

public class LightLargeSwordItem extends SwordItem {

    public LightLargeSwordItem(Tier p_43269_, int p_43270_, float p_43271_, Properties p_43272_) {
        super(p_43269_, p_43270_, p_43271_, p_43272_);
    }

    @Override
    public void appendHoverText(@NotNull ItemStack p_41421_, @Nullable Level p_41422_, @NotNull List<Component> toolTips, @NotNull TooltipFlag p_41424_) {
        MutableComponent mutablecomponent = Component.translatable("subtitle.blazeSword");
        toolTips.add(mutablecomponent.withStyle(ChatFormatting.YELLOW));
    }

    @Override
    public boolean isFoil(@NotNull ItemStack p_41453_) {
        return true;
    }

    private void shoot(Level level, Player player) {
        Vec3 vec3 = player.getLookAngle();
        LargeFireball largefireball = new LargeFireball(level, player, vec3.x, vec3.y, vec3.z, 3);
        largefireball.setPos(player.getX() + vec3.x * 4.0, player.getY(0.5) + 0.5, largefireball.getZ() + vec3.z * 4.0);
        level.addFreshEntity(largefireball);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand) {
        // 创造模式可直接发射
        if (player.isCreative()) {
            shoot(level, player);
            ItemStack itemstack = player.getItemInHand(usedHand);
            return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
        }
        // 生存模式消耗经验
        else {
            // 经验值高时消耗的点数
            int expCost = 50;
            // 剩余经验连1级都没有达到
            if (player.experienceLevel < 1) {
                return super.use(level, player, usedHand);
            }
            // 花费经验点数或等级发射火球
            else {
                if (player.totalExperience < 200) {
                    player.giveExperienceLevels(-1);
                } else {
                    player.giveExperiencePoints(-expCost);
                }
                shoot(level, player);
                ItemStack itemstack = player.getItemInHand(usedHand);
                return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
            }
        }
    }


}
