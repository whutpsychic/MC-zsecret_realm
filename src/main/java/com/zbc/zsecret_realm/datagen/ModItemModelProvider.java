package com.zbc.zsecret_realm.datagen;

import com.zbc.zsecret_realm.Main;
import com.zbc.zsecret_realm.modItems.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();

    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Main.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        // 纯物品
        basicItem(ModItems.COAL_POWDER.get());
        basicItem(ModItems.RAW_IRON_WITH_CARBON.get());
        basicItem(ModItems.ALLOY_MATERIAL.get());
        basicItem(ModItems.UZI_STEEL_INGOT.get());
        basicItem(ModItems.ALLOY_STEEL_INGOT.get());
        basicItem(ModItems.METEORITE_STEEL_INGOT.get());

        // 注册物品模型
        // 乌兹套
        handheldItem(ModItems.UZI_HOE);
        handheldItem(ModItems.UZI_SHOVEL);
        handheldItem(ModItems.UZI_PICKAXE);
        handheldItem(ModItems.UZI_AXE);
        handheldItem(ModItems.UZI_SWORD);
        trimmedArmorItem(ModItems.UZI_HELMET);
        trimmedArmorItem(ModItems.UZI_CHESTPLATE);
        trimmedArmorItem(ModItems.UZI_LEGGINGS);
        trimmedArmorItem(ModItems.UZI_BOOTS);

        // 合金钢套
        handheldItem(ModItems.ALLOY_HOE);
        handheldItem(ModItems.ALLOY_SHOVEL);
        handheldItem(ModItems.ALLOY_PICKAXE);
        handheldItem(ModItems.ALLOY_AXE);
        handheldItem(ModItems.ALLOY_SWORD);
        trimmedArmorItem(ModItems.ALLOY_HELMET);
        trimmedArmorItem(ModItems.ALLOY_CHESTPLATE);
        trimmedArmorItem(ModItems.ALLOY_LEGGINGS);
        trimmedArmorItem(ModItems.ALLOY_BOOTS);

        // 戒指
        basicItem(ModItems.WIND_RING.get());
        basicItem(ModItems.FIRE_RING.get());
        basicItem(ModItems.ICE_RING.get());
        basicItem(ModItems.THUNDER_RING.get());
        basicItem(ModItems.ENDER_RING.get());
        basicItem(ModItems.LIGHT_RING.get());

//        // 传说武器
//        handheldItem(ModItems.BLAZE_SWORD.get());
//        handheldItem(ModItems.ICE_AXE.get());
//        handheldItem(ModItems.WIND_SWORD.get());
//        handheldItem(ModItems.ENDER_SWORD.get());
//        handheldItem(ModItems.WORLD_DESTRUCT_SWORD.get());
//
//        // 原材料
//        basicItem(ModItems.UZI_STEEL_INGOT.get());
//        basicItem(ModItems.ALLOY_INGOT.get());
//        basicItem(ModItems.METEORITE_STEEL_INGOT.get());
//
//        // 珍珠
//        basicItem(ModItems.WIND_PEARL.get());
//        basicItem(ModItems.FIRE_PEARL.get());
//        basicItem(ModItems.ICE_PEARL.get());
//        basicItem(ModItems.THUNDER_PEARL.get());
//        basicItem(ModItems.LIGHT_PEARL.get());
//

//
//        // CD
//        basicItem(ModItems.CD_TIT.get());
//        basicItem(ModItems.CD_GLORY.get());
//        basicItem(ModItems.CD_ASHA.get());
//        basicItem(ModItems.CD_MAGICA.get());
//        basicItem(ModItems.CD_HARVEST.get());
    }

    // Shoutout to El_Redstoniano for making this
    private void trimmedArmorItem(RegistryObject<ArmorItem> itemDeferredItem) {
        ArmorItem armorItem = itemDeferredItem.get();
        if (armorItem instanceof ArmorItem) {
            trimMaterials.forEach((trimMaterial, value) -> {
                float trimValue = value;

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = armorItem.toString();
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = new ResourceLocation(armorItemPath);
                ResourceLocation trimResLoc = new ResourceLocation(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = new ResourceLocation(Main.MOD_ID + ":" + currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName).parent(new ModelFile.UncheckedModelFile("item/generated")).texture("layer0", Main.MOD_ID + ":item/" + armorItemResLoc.getPath()).texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemDeferredItem.getId().getPath(), mcLoc("item/generated")).override().model(new ModelFile.UncheckedModelFile(Main.MOD_ID + ":item/" + trimNameResLoc.getPath())).predicate(mcLoc("trim_type"), trimValue).end().texture("layer0", new ResourceLocation(Main.MOD_ID, "item/" + itemDeferredItem.getId().getPath()));
            });
        }
    }

    private ItemModelBuilder handheldItem(RegistryObject<?> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Main.MOD_ID, "item/" + item.getId().getPath()));
    }
}
