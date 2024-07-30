package com.axperty.betterdeepdark.item;

import com.axperty.betterdeepdark.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import com.axperty.betterdeepdark.BetterDeepDark;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.awt.*;

public class ModItemGroups {
    public static final ItemGroup BETTERDEEPDARK_TAB = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BetterDeepDark.MOD_ID, "betterdeepdark"),
            FabricItemGroup.builder().displayName(Text.translatable("creativetab.betterdeepdark"))
                    .icon(() -> new ItemStack(ModItems.DARK_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SLIMED_WARDENS_HORN);
                        entries.add(ModItems.WARDENS_HORN);
                        entries.add(ModItems.SOUL_PIECE);
                        entries.add(ModItems.ECHO_STONE);
                        entries.add(ModItems.DARK_INGOT);
                        entries.add(ModItems.ECHO_UPGRADE_SMITHING_TEMPLATE);
                        entries.add(ModBlocks.ECHO_STONE_BLOCK);

                        entries.add(ModItems.DEEP_DARK_SWORD);
                        entries.add(ModItems.DEEP_DARK_PICKAXE);
                        entries.add(ModItems.DEEP_DARK_AXE);
                        entries.add(ModItems.DEEP_DARK_SHOVEL);
                        entries.add(ModItems.DEEP_DARK_HOE);

                        entries.add(ModItems.ECHO_HELMET);
                        entries.add(ModItems.ECHO_CHESTPLATE);
                        entries.add(ModItems.ECHO_LEGGINGS);
                        entries.add(ModItems.ECHO_BOOTS);
                    }).build());


    public static void registerItemGroups() {
        BetterDeepDark.LOGGER.info("Registering Item Groups for " + BetterDeepDark.MOD_ID);
    }
}
