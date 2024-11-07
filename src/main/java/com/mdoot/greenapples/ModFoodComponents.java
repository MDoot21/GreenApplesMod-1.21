package com.mdoot.greenapples;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent CARAMEL_CUBE = new FoodComponent.Builder().nutrition(2)
            .saturationModifier(0.175f).build();

    public static final FoodComponent CANDIED_GREEN_APPLE = new FoodComponent.Builder().nutrition(6).saturationModifier(1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 200), 1.0f).build();

    public static final FoodComponent GREEN_APPLE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200), 0.15f).build();

}

