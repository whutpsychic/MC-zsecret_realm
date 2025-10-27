package com.zbc.zsecret_realm.modEntities;

import com.zbc.zsecret_realm.Main;
import com.zbc.zsecret_realm.modEntities.magicPearls.*;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModEntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Main.MOD_ID);

    // 聚风灵珠
    public static Supplier<EntityType<WindPearl>> WIND_PEARL = ENTITY_TYPES.register("wind_pearl",
            () -> EntityType.Builder.<WindPearl>of(WindPearl::new, MobCategory.MISC)
                    .sized(0.25F, 0.25F).clientTrackingRange(4).updateInterval(10).build("wind_pearl"));

    // 爆炎魔珠
    public static Supplier<EntityType<FirePearl>> FIRE_PEARL = ENTITY_TYPES.register("fire_pearl",
            () -> EntityType.Builder.<FirePearl>of(FirePearl::new, MobCategory.MISC)
                    .sized(0.25F, 0.25F).clientTrackingRange(4).updateInterval(10).build("fire_pearl"));

    // 冰霜凝珠
    public static Supplier<EntityType<IcePearl>> ICE_PEARL = ENTITY_TYPES.register("ice_pearl",
            () -> EntityType.Builder.<IcePearl>of(IcePearl::new, MobCategory.MISC)
                    .sized(0.25F, 0.25F).clientTrackingRange(4).updateInterval(10).build("ice_pearl"));

    // 唤雷法珠
    public static Supplier<EntityType<ThunderPearl>> THUNDER_PEARL = ENTITY_TYPES.register("thunder_pearl",
            () -> EntityType.Builder.<ThunderPearl>of(ThunderPearl::new, MobCategory.MISC)
                    .sized(0.25F, 0.25F).clientTrackingRange(4).updateInterval(10).build("thunder_pearl"));

    // 极光霞珠
    public static Supplier<EntityType<LightPearl>> LIGHT_PEARL = ENTITY_TYPES.register("light_pearl",
            () -> EntityType.Builder.<LightPearl>of(LightPearl::new, MobCategory.MISC)
                    .sized(0.25F, 0.25F).clientTrackingRange(4).updateInterval(10).build("light_pearl"));


}
