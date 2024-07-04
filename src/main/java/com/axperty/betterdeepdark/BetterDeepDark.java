package com.axperty.betterdeepdark;

import com.axperty.betterdeepdark.loot.ModLootModifiers;
import com.mojang.logging.LogUtils;
import com.axperty.betterdeepdark.block.ModBlocks;
import com.axperty.betterdeepdark.item.ModCreativeModTabs;
import com.axperty.betterdeepdark.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(BetterDeepDark.MOD_ID)
public class BetterDeepDark {
    public static final String MOD_ID = "betterdeepdark";
    public static final Logger LOGGER = LogUtils.getLogger();

    public BetterDeepDark() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModLootModifiers.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }
}
