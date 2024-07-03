package com.axperty.echosmith.item;

import com.axperty.echosmith.EchoSmith;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EchoSmith.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ECHOSMITH_TAB = CREATIVE_MODE_TABS.register("echosmith_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ECHO_SWORD.get()))
                    .title(Component.translatable("creativetab.echosmith"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.ECHO_SWORD.get());
                        pOutput.accept(ModItems.ECHO_PICKAXE.get());
                        pOutput.accept(ModItems.ECHO_AXE.get());
                        pOutput.accept(ModItems.ECHO_SHOVEL.get());
                        pOutput.accept(ModItems.ECHO_HOE.get());

                        pOutput.accept(ModItems.ECHO_HELMET.get());
                        pOutput.accept(ModItems.ECHO_CHESTPLATE.get());
                        pOutput.accept(ModItems.ECHO_LEGGINGS.get());
                        pOutput.accept(ModItems.ECHO_BOOTS.get());

                        pOutput.accept(ModItems.WARDEN_SOUL_PIECE.get());
                        pOutput.accept(ModItems.ECHO_STICK.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
