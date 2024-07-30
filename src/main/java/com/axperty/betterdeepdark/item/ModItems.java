package com.axperty.betterdeepdark.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import com.axperty.betterdeepdark.BetterDeepDark;
import com.axperty.betterdeepdark.item.custom.ModArmorItem;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModItems {
    public static final Item SLIMED_WARDENS_HORN = registerItem("slimed_wardens_horn",
            new Item(new FabricItemSettings().food(ModFoodComponents.SLIMED_WARDENS_HORN).maxCount(16)));

    public static final Item WARDENS_HORN = registerItem("wardens_horn",
            new Item(new FabricItemSettings().food(ModFoodComponents.WARDENS_HORN).maxCount(16)));

    public static final Item SOUL_PIECE = registerItem("soul_piece",
            new Item(new FabricItemSettings().fireproof().maxCount(16)));

    public static final Item ECHO_STONE = registerItem("echo_stone",
            new Item(new FabricItemSettings()));

    public static final Item DARK_INGOT = registerItem("dark_ingot",
            new Item(new FabricItemSettings()));

    public static final Item ECHO_UPGRADE_SMITHING_TEMPLATE = registerItem("echo_upgrade_smithing_template",
            new SmithingTemplateItem(Text.translatable("item.betterdeepdark.echo_upgrade_smithing_template.appearance"),
                    Text.translatable("item.betterdeepdark.echo_upgrade_smithing_template.appearance.tooltip"),
                    Text.translatable("item.betterdeepdark.echo_upgrade_smithing_template.appearance.result_slot"),
                    Text.translatable("item.betterdeepdark.echo_upgrade_smithing_template.appearance.addition_slot"),
                    Text.translatable("item.betterdeepdark.echo_upgrade_smithing_template.appearance.base_slot"),
                    List.of(
                            new Identifier("minecraft", "item/empty_armor_slot_helmet"),
                            new Identifier("minecraft", "item/empty_slot_sword"),
                            new Identifier("minecraft", "item/empty_armor_slot_chestplate"),
                            new Identifier("minecraft", "item/empty_slot_pickaxe"),
                            new Identifier("minecraft", "item/empty_armor_slot_leggings"),
                            new Identifier("minecraft", "item/empty_slot_axe"),
                            new Identifier("minecraft", "item/empty_armor_slot_boots"),
                            new Identifier("minecraft", "item/empty_slot_hoe"),
                            new Identifier("minecraft", "item/empty_slot_shovel")

                    ),
                    List.of(
                            new Identifier("minecraft", "item/empty_slot_ingot")
                    )
            )
    );

    public static final Item DEEP_DARK_SWORD = registerItem("deep_dark_sword",
            new SwordItem(ModToolMaterial.DEEP_DARK_MATERIAL, 9, -2.0f, new FabricItemSettings().fireproof()));
    public static final Item DEEP_DARK_PICKAXE = registerItem("deep_dark_pickaxe",
            new PickaxeItem(ModToolMaterial.DEEP_DARK_MATERIAL, 6, -2.0f, new FabricItemSettings().fireproof()));
    public static final Item DEEP_DARK_AXE = registerItem("deep_dark_axe",
            new AxeItem(ModToolMaterial.DEEP_DARK_MATERIAL, 10, -3.0f, new FabricItemSettings().fireproof()));
    public static final Item DEEP_DARK_SHOVEL = registerItem("deep_dark_shovel",
            new ShovelItem(ModToolMaterial.DEEP_DARK_MATERIAL, 6.5f, -3.0f, new FabricItemSettings().fireproof()));
    public static final Item DEEP_DARK_HOE = registerItem("deep_dark_hoe",
            new HoeItem(ModToolMaterial.DEEP_DARK_MATERIAL, 1, 1f, new FabricItemSettings().fireproof()));

    public static final Item ECHO_HELMET = registerItem("echo_helmet",
            new ModArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item ECHO_CHESTPLATE = registerItem("echo_chestplate",
            new ArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item ECHO_LEGGINGS = registerItem("echo_leggings",
            new ArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item ECHO_BOOTS = registerItem("echo_boots",
            new ArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BetterDeepDark.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BetterDeepDark.LOGGER.info("Registering Mod Items for " + BetterDeepDark.MOD_ID);
    }
}
