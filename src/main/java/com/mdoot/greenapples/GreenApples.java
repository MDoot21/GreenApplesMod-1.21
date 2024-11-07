package com.mdoot.greenapples;

import com.mdoot.greenapples.item.ModItemGroups;
import com.mdoot.greenapples.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GreenApples implements ModInitializer {
	public static final String MOD_ID = "greenapples";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();

	}
}