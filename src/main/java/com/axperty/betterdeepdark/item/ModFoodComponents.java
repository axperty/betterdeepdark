package com.axperty.betterdeepdark.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent WARDENS_HORN = new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(0.3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 600, 4), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 2), 1.0f)
            .build();

    public static final FoodComponent SLIMED_WARDENS_HORN = new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(0.3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 600, 4), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 400, 2), 1.0f)
            .build();

}
