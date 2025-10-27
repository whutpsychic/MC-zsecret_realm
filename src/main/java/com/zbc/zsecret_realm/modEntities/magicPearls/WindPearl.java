package com.zbc.zsecret_realm.modEntities.magicPearls;

import com.zbc.zsecret_realm.modEntities.ModEntityTypes;
import com.zbc.zsecret_realm.modItems.ModItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;

import static com.zbc.zsecret_realm.zcore.world.DoAction.genDefaultExplode;

public class WindPearl extends ThrowableItemProjectile {

    public WindPearl(EntityType<? extends ThrowableItemProjectile> p_37442_, Level p_37443_) {
        super(p_37442_, p_37443_);
    }

    public WindPearl(Level p_37499_, LivingEntity p_37500_) {
        super(ModEntityTypes.WIND_PEARL.get(), p_37500_, p_37499_);
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.WIND_PEARL.get();
    }

    protected void onHitEntity(EntityHitResult p_37502_) {
        super.onHitEntity(p_37502_);
        // 效果逻辑
        genDefaultExplode(this.level(), this.blockPosition(), this.getOwner(), false);
    }

    // 触及地面/生物效果函数
    protected void onHit(HitResult p_37504_) {
        super.onHit(p_37504_);
        // 效果逻辑
        genDefaultExplode(this.level(), this.blockPosition(), this.getOwner(), false);
    }
}
