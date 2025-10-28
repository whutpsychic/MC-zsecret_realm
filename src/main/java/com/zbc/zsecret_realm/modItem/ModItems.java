package com.zbc.zsecret_realm.modItem;

import com.zbc.zsecret_realm.Main;

import com.zbc.zsecret_realm.modFood.ModFoods;
import com.zbc.zsecret_realm.modItem.epicWeapon.*;
import com.zbc.zsecret_realm.modItem.magicPearl.*;
import com.zbc.zsecret_realm.modItem.magicRing.EnderRingItem;
import com.zbc.zsecret_realm.modItem.magicRing.LightRingItem;
import com.zbc.zsecret_realm.modItem.magicRing.RingItem;
import com.zbc.zsecret_realm.modMaterial.ModArmorMaterials;
import com.zbc.zsecret_realm.modMaterial.ModTiers;
import net.minecraft.ChatFormatting;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);

    // 碳粉
    public static final RegistryObject<Item> COAL_POWDER = ITEMS.register("coal_powder", () -> new ModItem(new Item.Properties(), "coal_powder"));
    // 加碳生铁
    public static final RegistryObject<Item> RAW_IRON_WITH_CARBON = ITEMS.register("raw_iron_with_carbon", () -> new ModItem(new Item.Properties(), "raw_iron_with_carbon"));
    // 合金材料
    public static final RegistryObject<Item> ALLOY_MATERIAL = ITEMS.register("alloy_material", () -> new ModItem(new Item.Properties(), "alloy_material"));
    // 乌兹钢
    public static final RegistryObject<Item> UZI_STEEL_INGOT = ITEMS.register("uzi_steel_ingot", () -> new ModItem(new Item.Properties(), "uzi_steel_ingot"));
    // 合金钢
    public static final RegistryObject<Item> ALLOY_STEEL_INGOT = ITEMS.register("alloy_steel_ingot", () -> new ModItem(new Item.Properties(), "alloy_steel_ingot"));
    // 天外陨铁
    public static final RegistryObject<Item> METEORITE_STEEL_INGOT = ITEMS.register("meteorite_steel_ingot", () -> new ModItem(new Item.Properties(), "meteorite_steel_ingot", ChatFormatting.YELLOW, true));

    // 兵粮肉丸
    public static final RegistryObject<Item> MILITARY_MEATBALL = ITEMS.register("military_meatball", () -> new ModItem(new Item.Properties().food(ModFoods.MILITARY_MEATBALL), "military_meatball"));
    // 夹心面包
    public static final RegistryObject<Item> SANDWICH_BREAD = ITEMS.register("sandwich_bread", () -> new ModItem(new Item.Properties().food(ModFoods.SANDWICH_BREAD), "sandwich_bread"));
    // 生肉串
    public static final RegistryObject<Item> RAW_SKEWER = ITEMS.register("raw_skewer", () -> new ModItem(new Item.Properties().food(ModFoods.RAW_SKEWER), "raw_skewer"));
    // 烤肉串
    public static final RegistryObject<Item> SKEWER = ITEMS.register("skewer", () -> new ModItem(new Item.Properties().food(ModFoods.SKEWER), "skewer"));
    // 河豚煲
    public static final RegistryObject<Item> PUFFERFISH_STEW = ITEMS.register("pufferfish_stew", () -> new ModItem(new Item.Properties().food(ModFoods.PUFFERFISH_STEW), "pufferfish_stew"));
    // 水果捞
    public static final RegistryObject<Item> FRUIT_MIX = ITEMS.register("fruit_mix", () -> new ModItem(new Item.Properties().food(ModFoods.FRUIT_MIX), "fruit_mix"));

    // 钢锄
    public static final RegistryObject<Item> UZI_HOE = ITEMS.register("uzi_hoe", () -> new HoeItem(ModTiers.UZI, -2, -1.0F, new Item.Properties()));
    // 钢铲
    public static final RegistryObject<Item> UZI_SHOVEL = ITEMS.register("uzi_shovel", () -> new ShovelItem(ModTiers.UZI, 1.5F, -3.0F, new Item.Properties()));
    // 钢镐
    public static final RegistryObject<Item> UZI_PICKAXE = ITEMS.register("uzi_pickaxe", () -> new PickaxeItem(ModTiers.UZI, 1, -2.8F, new Item.Properties()));
    // 钢斧
    public static final RegistryObject<Item> UZI_AXE = ITEMS.register("uzi_axe", () -> new AxeItem(ModTiers.UZI, 6.0F, -3.1F, new Item.Properties()));
    // 钢剑
    public static final RegistryObject<Item> UZI_SWORD = ITEMS.register("uzi_sword", () -> new SwordItem(ModTiers.UZI, 3, -2.4F, new Item.Properties()));
    // 钢头盔
    public static final RegistryObject<ArmorItem> UZI_HELMET = ITEMS.register("uzi_helmet", () -> new ArmorItem(ModArmorMaterials.UZI, ArmorItem.Type.HELMET, new Item.Properties()));
    // 钢胸甲
    public static final RegistryObject<ArmorItem> UZI_CHESTPLATE = ITEMS.register("uzi_chestplate", () -> new ArmorItem(ModArmorMaterials.UZI, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    // 钢护腿
    public static final RegistryObject<ArmorItem> UZI_LEGGINGS = ITEMS.register("uzi_leggings", () -> new ArmorItem(ModArmorMaterials.UZI, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    // 钢靴子
    public static final RegistryObject<ArmorItem> UZI_BOOTS = ITEMS.register("uzi_boots", () -> new ArmorItem(ModArmorMaterials.UZI, ArmorItem.Type.BOOTS, new Item.Properties()));

    // 合金钢锄
    public static final RegistryObject<Item> ALLOY_HOE = ITEMS.register("alloy_hoe", () -> new HoeItem(ModTiers.ALLOY, -3, 0.0F, new Item.Properties()));
    // 合金钢铲
    public static final RegistryObject<Item> ALLOY_SHOVEL = ITEMS.register("alloy_shovel", () -> new ShovelItem(ModTiers.ALLOY, 1.5F, -3.0F, new Item.Properties()));
    // 合金钢镐
    public static final RegistryObject<Item> ALLOY_PICKAXE = ITEMS.register("alloy_pickaxe", () -> new PickaxeItem(ModTiers.ALLOY, 1, -2.8F, new Item.Properties()));
    // 合金钢斧
    public static final RegistryObject<Item> ALLOY_AXE = ITEMS.register("alloy_axe", () -> new AxeItem(ModTiers.ALLOY, 5.0F, -3.0F, new Item.Properties()));
    // 合金钢剑
    public static final RegistryObject<Item> ALLOY_SWORD = ITEMS.register("alloy_sword", () -> new SwordItem(ModTiers.ALLOY, 3, -2.4F, new Item.Properties()));
    // 合金钢头盔
    public static final RegistryObject<ArmorItem> ALLOY_HELMET = ITEMS.register("alloy_helmet", () -> new ArmorItem(ModArmorMaterials.ALLOY, ArmorItem.Type.HELMET, new Item.Properties()));
    // 合金钢胸甲
    public static final RegistryObject<ArmorItem> ALLOY_CHESTPLATE = ITEMS.register("alloy_chestplate", () -> new ArmorItem(ModArmorMaterials.ALLOY, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    // 合金钢护腿
    public static final RegistryObject<ArmorItem> ALLOY_LEGGINGS = ITEMS.register("alloy_leggings", () -> new ArmorItem(ModArmorMaterials.ALLOY, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    // 合金钢靴子
    public static final RegistryObject<ArmorItem> ALLOY_BOOTS = ITEMS.register("alloy_boots", () -> new ArmorItem(ModArmorMaterials.ALLOY, ArmorItem.Type.BOOTS, new Item.Properties()));

    // 风之戒
    public static final RegistryObject<Item> WIND_RING = ITEMS.register("wind_ring", () -> new RingItem(new Item.Properties().rarity(Rarity.EPIC).stacksTo(1), "wind_ring"));
    // 火之戒
    public static final RegistryObject<Item> FIRE_RING = ITEMS.register("fire_ring", () -> new RingItem(new Item.Properties().rarity(Rarity.EPIC).stacksTo(1), "fire_ring"));
    // 冰之戒
    public static final RegistryObject<Item> ICE_RING = ITEMS.register("ice_ring", () -> new RingItem(new Item.Properties().rarity(Rarity.EPIC).stacksTo(1), "ice_ring"));
    // 雷之戒
    public static final RegistryObject<Item> THUNDER_RING = ITEMS.register("thunder_ring", () -> new RingItem(new Item.Properties().rarity(Rarity.EPIC).stacksTo(1), "thunder_ring"));
    // 暗之戒
    public static final RegistryObject<Item> ENDER_RING = ITEMS.register("ender_ring", () -> new EnderRingItem(new Item.Properties().rarity(Rarity.EPIC).stacksTo(1), "ender_ring"));
    // 光之戒
    public static final RegistryObject<Item> LIGHT_RING = ITEMS.register("light_ring", () -> new LightRingItem(new Item.Properties().rarity(Rarity.EPIC).stacksTo(1), "light_ring"));

    // 聚风灵珠
    public static final RegistryObject<Item> WIND_PEARL = ITEMS.register("wind_pearl", () -> new WindPearlItem(new Item.Properties().stacksTo(16)));
    // 爆炎魔珠
    public static final RegistryObject<Item> FIRE_PEARL = ITEMS.register("fire_pearl", () -> new FirePearlItem(new Item.Properties().stacksTo(16)));
    // 霜冰凝珠
    public static final RegistryObject<Item> ICE_PEARL = ITEMS.register("ice_pearl", () -> new IcePearlItem(new Item.Properties().stacksTo(16)));
    // 唤雷法珠
    public static final RegistryObject<Item> THUNDER_PEARL = ITEMS.register("thunder_pearl", () -> new ThunderPearlItem(new Item.Properties().stacksTo(16)));
    // 极光霞珠
    public static final RegistryObject<Item> LIGHT_PEARL = ITEMS.register("light_pearl", () -> new LightPearlItem(new Item.Properties().stacksTo(16)));

    // 疾风剑
    public static final RegistryObject<Item> WIND_SWORD = ITEMS.register("wind_sword", () -> new WindSwordItem(ModTiers.METEORITE, 4, 2, (new Item.Properties().rarity(Rarity.EPIC)).fireResistant()));
    // 烈焰剑
    public static final RegistryObject<Item> BLAZE_SWORD = ITEMS.register("blaze_sword", () -> new BlazeSwordItem(ModTiers.METEORITE, 4, -2.4F, (new Item.Properties().rarity(Rarity.EPIC)).fireResistant()));
    // 寒冰斧
    public static final RegistryObject<Item> ICE_AXE = ITEMS.register("ice_axe", () -> new IceAxeItem(ModTiers.METEORITE, 6, -3, (new Item.Properties().rarity(Rarity.EPIC)).fireResistant()));
    // 奔雷斧
    public static final RegistryObject<Item> THUNDER_AXE = ITEMS.register("thunder_axe", () -> new ThunderAxeItem(ModTiers.METEORITE, 6, -3, (new Item.Properties().rarity(Rarity.EPIC)).fireResistant()));
    // 暗影剑
    public static final RegistryObject<Item> ENDER_SWORD = ITEMS.register("ender_sword", () -> new EnderSwordItem(ModTiers.METEORITE, 4, -2.4F, (new Item.Properties().rarity(Rarity.EPIC)).fireResistant()));
    // 光之大剑
    public static final RegistryObject<Item> LIGHT_LARGE_SWORD = ITEMS.register("light_large_sword", () -> new LightLargeSwordItem(ModTiers.METEORITE, 5, -3F, (new Item.Properties().rarity(Rarity.EPIC)).fireResistant()));
    // 灭世魔刀
    public static final RegistryObject<Item> WORLD_DESTRUCT_SWORD = ITEMS.register("world_destruct_sword", () -> new WorldDestructSwordItem(ModTiers.METEORITE, 4, -2.7F, (new Item.Properties().rarity(Rarity.EPIC)).fireResistant()));


//    // CD - TIT(This is THRUD)
//    public static final RegistryObject<Item> CD_TIT = ITEMS.register("cd_tit", () -> new Item(new Item.Properties().rarity(Rarity.RARE).jukeboxPlayable(ModSounds.CD_TIT_KEY).stacksTo(1)));
//    // CD - GLORY
//    public static final RegistryObject<Item> CD_GLORY = ITEMS.register("cd_glory", () -> new Item(new Item.Properties().rarity(Rarity.RARE).jukeboxPlayable(ModSounds.CD_GLORY_KEY).stacksTo(1)));
//    // CD - ASHA
//    public static final RegistryObject<Item> CD_ASHA = ITEMS.register("cd_asha", () -> new Item(new Item.Properties().rarity(Rarity.RARE).jukeboxPlayable(ModSounds.CD_ASHA_KEY).stacksTo(1)));
//    // CD - MAGICA
//    public static final RegistryObject<Item> CD_MAGICA = ITEMS.register("cd_magica", () -> new Item(new Item.Properties().rarity(Rarity.RARE).jukeboxPlayable(ModSounds.CD_MAGICA_KEY).stacksTo(1)));
//    // CD - HARVEST
//    public static final RegistryObject<Item> CD_HARVEST = ITEMS.register("cd_harvest", () -> new Item(new Item.Properties().rarity(Rarity.RARE).jukeboxPlayable(ModSounds.CD_HARVEST_KEY).stacksTo(1)));

}
