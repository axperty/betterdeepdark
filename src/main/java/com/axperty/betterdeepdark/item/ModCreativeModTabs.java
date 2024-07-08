package com.axperty.betterdeepdark.item;

import com.axperty.betterdeepdark.BetterDeepDark;
import com.axperty.betterdeepdark.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterDeepDark.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BETTERDEEPDARK_TAB = CREATIVE_MODE_TABS.register("betterdeepdark_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DARK_INGOT.get()))
                    .title(Component.translatable("creativetab.betterdeepdark"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SLIMED_WARDENS_HORN.get());
                        pOutput.accept(ModItems.WARDENS_HORN.get());
                        pOutput.accept(ModItems.SOUL_PIECE.get());
                        pOutput.accept(ModItems.ECHO_STONE.get());
                        pOutput.accept(ModItems.DARK_INGOT.get());
                        pOutput.accept(ModItems.ECHO_UPGRADE_SMITHING_TEMPLATE.get());
                        pOutput.accept(ModBlocks.ECHO_STONE_BLOCK.get());

                        pOutput.accept(ModItems.DEEP_DARK_SWORD.get());
                        pOutput.accept(ModItems.DEEP_DARK_PICKAXE.get());
                        pOutput.accept(ModItems.DEEP_DARK_AXE.get());
                        pOutput.accept(ModItems.DEEP_DARK_SHOVEL.get());
                        pOutput.accept(ModItems.DEEP_DARK_HOE.get());

                        pOutput.accept(ModItems.ECHO_HELMET.get());
                        pOutput.accept(ModItems.ECHO_CHESTPLATE.get());
                        pOutput.accept(ModItems.ECHO_LEGGINGS.get());
                        pOutput.accept(ModItems.ECHO_BOOTS.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
