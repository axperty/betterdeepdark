package com.axperty.betterdeepdark.item;

import com.axperty.betterdeepdark.BetterDeepDark;
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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ECHO_SWORD.get()))
                    .title(Component.translatable("creativetab.betterdeepdark"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SLIMED_WARDENS_HORN.get());
                        pOutput.accept(ModItems.WARDENS_HORN.get());
                        pOutput.accept(ModItems.ECHO_STICK.get());
                        pOutput.accept(ModItems.SOUL_PIECE.get());
                        pOutput.accept(ModItems.ECHO_STONE.get());
                        pOutput.accept(ModItems.DARK_INGOT.get());
                        pOutput.accept(ModItems.ECHO_UPGRADE_SMITHING_TEMPLATE.get());

                        pOutput.accept(ModItems.ECHO_SWORD.get());
                        pOutput.accept(ModItems.ECHO_PICKAXE.get());
                        pOutput.accept(ModItems.ECHO_AXE.get());
                        pOutput.accept(ModItems.ECHO_SHOVEL.get());
                        pOutput.accept(ModItems.ECHO_HOE.get());

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
