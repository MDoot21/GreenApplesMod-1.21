package com.mdoot.greenapples.item;

import com.mdoot.greenapples.GreenApples;
import com.mdoot.greenapples.ModFoodComponents;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import com.mdoot.greenapples.GreenApples;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModItems {
    public static final Item CANDIED_GREEN_APPLE = registerItem("candied_green_apple", new Item(new Item.Settings()
            .food(ModFoodComponents.CANDIED_GREEN_APPLE)));

    public static final Item CARAMEL_CUBE = registerItem("caramel_cube", new Item(new Item.Settings()
            .food(ModFoodComponents.CARAMEL_CUBE)));

    public static final Item GREEN_APPLE = registerItem("green_apple", new Item(new Item.Settings()
            .food(ModFoodComponents.GREEN_APPLE)) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            if(Screen.hasShiftDown()) {
                tooltip.add(Text.translatable("tooltip.greenapples.green_apple.tooltip.shift_down"));
            } else {
                tooltip.add(Text.translatable("tooltip.greenapples.green_apple.tooltip"));
                tooltip.add(Text.translatable("tooltip.greenapples.green_apple.tooltip.1"));

                super.appendTooltip(stack, context, tooltip, type);
            }
        }
    });

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(GreenApples.MOD_ID, name), item);
    }

    public static void registerModItems() {
        GreenApples.LOGGER.info("Registering Mod Items for " + GreenApples.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(GREEN_APPLE);
            entries.add(CANDIED_GREEN_APPLE);
            entries.add(CARAMEL_CUBE);
        });
    }
}
