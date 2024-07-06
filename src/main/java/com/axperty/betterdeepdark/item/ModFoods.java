package com.axperty.betterdeepdark.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties WARDEN_HORN = new FoodProperties.Builder().nutrition(4)
            .saturationMod(0.3f).effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 500), 1.0f).build();

    public static final FoodProperties KNOWLEDGE_SOUP = new FoodProperties.Builder().nutrition(4)
            .saturationMod(0.3f).effect(() -> new MobEffectInstance(MobEffects.DARKNESS, 600), 1.0f).build();
}
