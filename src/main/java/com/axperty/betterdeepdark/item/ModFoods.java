package com.axperty.betterdeepdark.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties WARDENS_HORN = new FoodProperties.Builder()
            .nutrition(4)
            .saturationMod(0.3f)
            .effect(() -> new MobEffectInstance(MobEffects.DARKNESS, 300, 5), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 300, 1), 1.0f)
            .build();

    public static final FoodProperties SLIMED_WARDENS_HORN = new FoodProperties.Builder()
            .nutrition(4)
            .saturationMod(0.3f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 300, 5), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 300, 1), 1.0f)
            .build();
}
