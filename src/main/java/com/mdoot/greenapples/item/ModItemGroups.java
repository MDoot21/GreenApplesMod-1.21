package com.mdoot.greenapples.item;

import com.mdoot.greenapples.GreenApples;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup GREEN_APPLE_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GreenApples.MOD_ID, "green_apple_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.GREEN_APPLE))
                    .displayName(Text.translatable("itemgroup.greenapples.green_apple_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.GREEN_APPLE);
                        entries.add(ModItems.CANDIED_GREEN_APPLE);
                        entries.add(ModItems.GREEN_APPLE_SLICES);
                        entries.add(ModItems.GREEN_APPLE_PIE);
                        entries.add(ModItems.CARAMEL_CUBE);
                    }).build());


    public static void registerItemGroups(){
        GreenApples.LOGGER.info("Registering Item Groups for " + GreenApples.MOD_ID);
    }
}

