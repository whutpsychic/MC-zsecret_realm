package com.zbc.zsecret_realm.modMaterial;

import com.zbc.zsecret_realm.modItem.ModItems;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public enum ModTiers implements Tier {

    // 乌兹钢
    UZI(2, 500, 6.0F, 2.0F, 14, () -> Ingredient.of(ModItems.UZI_STEEL_INGOT.get())),
    // 合金钢
    ALLOY(3, 1200, 8.0F, 3.0F, 14, () -> Ingredient.of(ModItems.ALLOY_STEEL_INGOT.get())),
    // 天外陨铁
    METEORITE(4, 3032, 9.0F, 4.0F, 15, () -> Ingredient.of(ModItems.METEORITE_STEEL_INGOT.get()));

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    private ModTiers(int p_43332_, int p_43333_, float p_43334_, float p_43335_, int p_43336_, Supplier p_43337_) {
        this.level = p_43332_;
        this.uses = p_43333_;
        this.speed = p_43334_;
        this.damage = p_43335_;
        this.enchantmentValue = p_43336_;
        this.repairIngredient = new LazyLoadedValue(p_43337_);
    }

    public int getUses() {
        return this.uses;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getAttackDamageBonus() {
        return this.damage;
    }

    public int getLevel() {
        return this.level;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public @NotNull Ingredient getRepairIngredient() {
        return (Ingredient) this.repairIngredient.get();
    }

    public @Nullable TagKey<Block> getTag() {
        return getTagFromVanillaTier(this);
    }

    // ------------------------------------ tool ------------------------------------
    private static TagKey<Block> getTagFromVanillaTier(ModTiers tier) {
        TagKey var10000;
        switch (tier) {
            case UZI, ALLOY -> var10000 = BlockTags.NEEDS_IRON_TOOL;
            case METEORITE -> var10000 = Tags.Blocks.NEEDS_NETHERITE_TOOL;
            default -> throw new IncompatibleClassChangeError();
        }
        return var10000;
    }


}
