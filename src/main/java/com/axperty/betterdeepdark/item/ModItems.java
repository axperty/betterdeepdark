package com.axperty.betterdeepdark.item;

import com.axperty.betterdeepdark.BetterDeepDark;
import com.axperty.betterdeepdark.item.custom.ModArmorItem;
import com.mojang.datafixers.util.Pair;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BetterDeepDark.MOD_ID);

    public static final RegistryObject<Item> ECHO = ITEMS.register("echo",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SLIMED_WARDENS_HORN = ITEMS.register("slimed_wardens_horn",
            () -> new Item(new Item.Properties().food(ModFoods.SLIMED_WARDENS_HORN).stacksTo(16)));

    public static final RegistryObject<Item> WARDENS_HORN = ITEMS.register("wardens_horn",
            () -> new Item(new Item.Properties().food(ModFoods.WARDENS_HORN).stacksTo(16)));

    public static final RegistryObject<Item> ECHO_STICK = ITEMS.register("echo_stick",
            () -> new Item(new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> SOUL_PIECE = ITEMS.register("soul_piece",
            () -> new Item(new Item.Properties().fireResistant().stacksTo(16)));

    public static final RegistryObject<Item> ECHO_STONE = ITEMS.register("echo_stone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DARK_INGOT = ITEMS.register("dark_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ECHO_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("echo_upgrade_smithing_template",
            () -> new SmithingTemplateItem(
                    Component.translatable("item.betterdeepdark.echo_upgrade_smithing_template.appearance"),
                    Component.translatable("item.betterdeepdark.echo_upgrade_smithing_template.appearance.tooltip"),
                    Component.translatable("item.betterdeepdark.echo_upgrade_smithing_template.appearance.result_slot"),
                    Component.translatable("item.betterdeepdark.echo_upgrade_smithing_template.appearance.addition_slot"),
                    Component.translatable("item.betterdeepdark.echo_upgrade_smithing_template.appearance.base_slot"),
                    List.of(
                            new ResourceLocation("minecraft", "item/empty_armor_slot_helmet"),
                            new ResourceLocation("minecraft", "item/empty_slot_sword"),
                            new ResourceLocation("minecraft", "item/empty_armor_slot_chestplate"),
                            new ResourceLocation("minecraft", "item/empty_slot_pickaxe"),
                            new ResourceLocation("minecraft", "item/empty_armor_slot_leggings"),
                            new ResourceLocation("minecraft", "item/empty_slot_axe"),
                            new ResourceLocation("minecraft", "item/empty_armor_slot_boots"),
                            new ResourceLocation("minecraft", "item/empty_slot_hoe"),
                            new ResourceLocation("minecraft", "item/empty_slot_shovel")

                    ),
                    List.of(
                            new ResourceLocation("minecraft", "item/empty_slot_ingot")
                    )
            )
    );

    public static final RegistryObject<Item> ECHO_SWORD = ITEMS.register("echo_sword",
            () -> new SwordItem(ModToolTiers.ECHO_TIER, 4, .2f, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> ECHO_PICKAXE = ITEMS.register("echo_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ECHO_TIER, 0, 0, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> ECHO_AXE = ITEMS.register("echo_axe",
            () -> new AxeItem(ModToolTiers.ECHO_TIER, 4, .2f, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> ECHO_SHOVEL = ITEMS.register("echo_shovel",
            () -> new ShovelItem(ModToolTiers.ECHO_TIER, 0, 0, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> ECHO_HOE = ITEMS.register("echo_hoe",
            () -> new HoeItem(ModToolTiers.ECHO_TIER, 0, 0, new Item.Properties().fireResistant()));

//    This will have to get done in a separate mod.
//    public static final RegistryObject<Item> ECHO_KNIFE = ITEMS.register("echo_knife",
//            () -> new KnifeItem(ModToolTiers.ECHO_TIER, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> ECHO_HELMET = ITEMS.register("echo_helmet",
            () -> new ModArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> ECHO_CHESTPLATE = ITEMS.register("echo_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> ECHO_LEGGINGS = ITEMS.register("echo_leggings",
            () -> new ArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> ECHO_BOOTS = ITEMS.register("echo_boots",
            () -> new ArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
