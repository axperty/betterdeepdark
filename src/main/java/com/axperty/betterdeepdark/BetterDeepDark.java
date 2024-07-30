package com.axperty.betterdeepdark;

import com.axperty.betterdeepdark.block.ModBlocks;
import com.axperty.betterdeepdark.item.ModItemGroups;
import com.axperty.betterdeepdark.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterDeepDark implements ModInitializer {
	public static final String MOD_ID = "betterdeepdark";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}