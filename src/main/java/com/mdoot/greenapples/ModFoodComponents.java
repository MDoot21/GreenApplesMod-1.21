package com.mdoot.greenapples;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent GREEN_APPLE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200), 0.15f).build();

    public static final FoodComponent GREEN_APPLE_SLICES = new FoodComponent.Builder().nutrition(1).saturationModifier(0.125f).snack().build();

    public static final FoodComponent CANDIED_GREEN_APPLE = new FoodComponent.Builder().nutrition(6).saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 5), 0.10f).build();

    public static final FoodComponent GREEN_APPLE_PIE = new FoodComponent.Builder().nutrition(8).saturationModifier(0.6f).snack().build();

    public static final FoodComponent CARAMEL_CUBE = new FoodComponent.Builder().nutrition(1)
            .saturationModifier(0.1f).build();
}
