package com.zbc.zsecret_realm.modItems;

import com.zbc.zsecret_realm.Main;

import net.minecraft.ChatFormatting;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);

    // --------------------------------------------------------- 以上为测试系列 ---------------------------------------------------------
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

//    // 钢锄
//    public static final DeferredItem<Item> UZI_HOE = ITEMS.register("uzi_hoe", () -> new HoeItem(ModTiers.UZI_STEEL, new Item.Properties().attributes(HoeItem.createAttributes(ModTiers.UZI_STEEL, -2.0F, -1.0F))));
//    // 钢铲
//    public static final DeferredItem<Item> UZI_SHOVEL = ITEMS.register("uzi_shovel", () -> new ShovelItem(ModTiers.UZI_STEEL, new Item.Properties().attributes(ShovelItem.createAttributes(ModTiers.UZI_STEEL, 1.5F, -3.0F))));
//    // 钢镐
//    public static final DeferredItem<Item> UZI_PICKAXE = ITEMS.register("uzi_pickaxe", () -> new PickaxeItem(ModTiers.UZI_STEEL, new Item.Properties().attributes(PickaxeItem.createAttributes(ModTiers.UZI_STEEL, 1.0F, -2.8F))));
//    // 钢斧
//    public static final DeferredItem<Item> UZI_AXE = ITEMS.register("uzi_axe", () -> new AxeItem(ModTiers.UZI_STEEL, new Item.Properties().attributes(AxeItem.createAttributes(ModTiers.UZI_STEEL, 6.0F, -3.1F))));
//    // 钢剑
//    public static final DeferredItem<Item> UZI_SWORD = ITEMS.register("uzi_sword", () -> new SwordItem(ModTiers.UZI_STEEL, new Item.Properties().attributes(SwordItem.createAttributes(ModTiers.UZI_STEEL, 3.0F, -2.4F))));
//    // 钢头盔
//    public static final DeferredItem<ArmorItem> UZI_HELMET = ITEMS.register("uzi_helmet", () -> new ArmorItem(ModArmorMaterials.UZI, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(18))));
//    // 钢胸甲
//    public static final DeferredItem<ArmorItem> UZI_CHESTPLATE = ITEMS.register("uzi_chestplate", () -> new ArmorItem(ModArmorMaterials.UZI, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(18))));
//    // 钢护腿
//    public static final DeferredItem<ArmorItem> UZI_LEGGINGS = ITEMS.register("uzi_leggings", () -> new ArmorItem(ModArmorMaterials.UZI, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(18))));
//    // 钢靴子
//    public static final DeferredItem<ArmorItem> UZI_BOOTS = ITEMS.register("uzi_boots", () -> new ArmorItem(ModArmorMaterials.UZI, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(18))));
//
//    // 合金钢锄
//    public static final DeferredItem<Item> ALLOY_STEEL_HOE = ITEMS.register("alloy_steel_hoe", () -> new HoeItem(ModTiers.ALLOY_STEEL, new Item.Properties().attributes(HoeItem.createAttributes(ModTiers.ALLOY_STEEL, -3.0F, 0.0F))));
//    // 合金钢铲
//    public static final DeferredItem<Item> ALLOY_STEEL_SHOVEL = ITEMS.register("alloy_steel_shovel", () -> new ShovelItem(ModTiers.ALLOY_STEEL, new Item.Properties().attributes(ShovelItem.createAttributes(ModTiers.ALLOY_STEEL, 1.5F, -3.0F))));
//    // 合金钢镐
//    public static final DeferredItem<Item> ALLOY_STEEL_PICKAXE = ITEMS.register("alloy_steel_pickaxe", () -> new PickaxeItem(ModTiers.ALLOY_STEEL, new Item.Properties().attributes(PickaxeItem.createAttributes(ModTiers.ALLOY_STEEL, 1.0F, -2.8F))));
//    // 合金钢斧
//    public static final DeferredItem<Item> ALLOY_STEEL_AXE = ITEMS.register("alloy_steel_axe", () -> new AxeItem(ModTiers.ALLOY_STEEL, new Item.Properties().attributes(AxeItem.createAttributes(ModTiers.ALLOY_STEEL, 5.0F, -3.0F))));
//    // 合金钢剑
//    public static final DeferredItem<Item> ALLOY_STEEL_SWORD = ITEMS.register("alloy_steel_sword", () -> new SwordItem(ModTiers.ALLOY_STEEL, new Item.Properties().attributes(SwordItem.createAttributes(ModTiers.ALLOY_STEEL, 4, -2.0F))));
//    // 合金钢头盔
//    public static final DeferredItem<ArmorItem> ALLOY_STEEL_HELMET = ITEMS.register("alloy_steel_helmet", () -> new ArmorItem(ModArmorMaterials.ALLOY_STEEL, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(38))));
//    // 合金钢胸甲
//    public static final DeferredItem<ArmorItem> ALLOY_STEEL_CHESTPLATE = ITEMS.register("alloy_steel_chestplate", () -> new ArmorItem(ModArmorMaterials.ALLOY_STEEL, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(38))));
//    // 合金钢护腿
//    public static final DeferredItem<ArmorItem> ALLOY_STEEL_LEGGINGS = ITEMS.register("alloy_steel_leggings", () -> new ArmorItem(ModArmorMaterials.ALLOY_STEEL, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(38))));
//    // 合金钢靴子
//    public static final DeferredItem<ArmorItem> ALLOY_STEEL_BOOTS = ITEMS.register("alloy_steel_boots", () -> new ArmorItem(ModArmorMaterials.ALLOY_STEEL, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(38))));
//
//    // 烈焰剑
//    public static final DeferredItem<Item> BLAZE_SWORD = ITEMS.register("blaze_sword", () -> new BlazeSwordItem(Tiers.NETHERITE, new Item.Properties()));
//    // 寒冰斧
//    public static final DeferredItem<Item> ICE_AXE = ITEMS.register("ice_axe", () -> new IceAxeItem(Tiers.NETHERITE, new Item.Properties()));
//    // 疾风剑
//    public static final DeferredItem<Item> WIND_SWORD = ITEMS.register("wind_sword", () -> new WindSwordItem(Tiers.NETHERITE, new Item.Properties()));
//    // 暗影剑
//    public static final DeferredItem<Item> ENDER_SWORD = ITEMS.register("ender_sword", () -> new EnderSwordItem(Tiers.NETHERITE, new Item.Properties()));
//    // 灭世魔刀
//    public static final DeferredItem<Item> WORLD_DESTRUCT_SWORD = ITEMS.register("world_destruct_sword", () -> new WorldDestructSwordItem(ModTiers.METEORITE, new Item.Properties()));

//    // CD - TIT(This is THRUD)
//    public static final DeferredItem<Item> CD_TIT = ITEMS.register("cd_tit", () -> new Item(new Item.Properties().rarity(Rarity.RARE).jukeboxPlayable(ModSounds.CD_TIT_KEY).stacksTo(1)));
//    // CD - GLORY
//    public static final DeferredItem<Item> CD_GLORY = ITEMS.register("cd_glory", () -> new Item(new Item.Properties().rarity(Rarity.RARE).jukeboxPlayable(ModSounds.CD_GLORY_KEY).stacksTo(1)));
//    // CD - ASHA
//    public static final DeferredItem<Item> CD_ASHA = ITEMS.register("cd_asha", () -> new Item(new Item.Properties().rarity(Rarity.RARE).jukeboxPlayable(ModSounds.CD_ASHA_KEY).stacksTo(1)));
//    // CD - MAGICA
//    public static final DeferredItem<Item> CD_MAGICA = ITEMS.register("cd_magica", () -> new Item(new Item.Properties().rarity(Rarity.RARE).jukeboxPlayable(ModSounds.CD_MAGICA_KEY).stacksTo(1)));
//    // CD - HARVEST
//    public static final DeferredItem<Item> CD_HARVEST = ITEMS.register("cd_harvest", () -> new Item(new Item.Properties().rarity(Rarity.RARE).jukeboxPlayable(ModSounds.CD_HARVEST_KEY).stacksTo(1)));
//
//    // 风之戒
//    public static final DeferredItem<Item> WIND_RING = ITEMS.register("wind_ring", () -> new RingItem(new Item.Properties().rarity(Rarity.EPIC).stacksTo(1)).subtitle("wind_ring"));
//    // 火之戒
//    public static final DeferredItem<Item> FIRE_RING = ITEMS.register("fire_ring", () -> new RingItem(new Item.Properties().rarity(Rarity.EPIC).stacksTo(1)).subtitle("fire_ring"));
//    // 冰之戒
//    public static final DeferredItem<Item> ICE_RING = ITEMS.register("ice_ring", () -> new RingItem(new Item.Properties().rarity(Rarity.EPIC).stacksTo(1)).subtitle("ice_ring"));
//    // 雷之戒
//    public static final DeferredItem<Item> THUNDER_RING = ITEMS.register("thunder_ring", () -> new RingItem(new Item.Properties().rarity(Rarity.EPIC).stacksTo(1)).subtitle("thunder_ring"));
//    // 暗之戒
//    public static final DeferredItem<Item> ENDER_RING = ITEMS.register("ender_ring", () -> new EnderRingItem(new Item.Properties().rarity(Rarity.EPIC).stacksTo(1)).subtitle("ender_ring"));
//    // 光之戒
//    public static final DeferredItem<Item> LIGHT_RING = ITEMS.register("light_ring", () -> new LightRingItem(new Item.Properties().rarity(Rarity.EPIC).stacksTo(1)).subtitle("light_ring"));
//
//    // 聚风灵珠
//    public static final DeferredItem<Item> WIND_PEARL = ITEMS.register("wind_pearl", () -> new WindPearlItem(new Item.Properties().stacksTo(16)));
//    // 爆炎魔珠
//    public static final DeferredItem<Item> FIRE_PEARL = ITEMS.register("fire_pearl", () -> new FirePearlItem(new Item.Properties().stacksTo(16)));
//    // 霜冰灵珠
//    public static final DeferredItem<Item> ICE_PEARL = ITEMS.register("ice_pearl", () -> new IcePearlItem(new Item.Properties().stacksTo(16)));
//    // 唤雷魔珠
//    public static final DeferredItem<Item> THUNDER_PEARL = ITEMS.register("thunder_pearl", () -> new ThunderPearlItem(new Item.Properties().stacksTo(16)));
//    // 极光霞珠
//    public static final DeferredItem<Item> LIGHT_PEARL = ITEMS.register("light_pearl", () -> new LightPearlItem(new Item.Properties().stacksTo(16)));
//
//
//


}
