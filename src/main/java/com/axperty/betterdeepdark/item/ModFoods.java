package com.axperty.betterdeepdark.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties DARK_RAW_MEAT = new FoodProperties.Builder().nutrition(1)
            .saturationMod(0.1f).effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 200), 1.0f).build();

    public static final FoodProperties COOKED_DARK_RAW_MEAT = new FoodProperties.Builder().nutrition(1)
            .saturationMod(0.1f).effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 200), 1.0f).build();
}
