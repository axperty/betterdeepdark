package com.axperty.echosmith.item;

import com.axperty.echosmith.EchoSmith;
import com.axperty.echosmith.item.custom.ModArmorItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EchoSmith.MOD_ID);

    public static final RegistryObject<Item> ECHO = ITEMS.register("echo",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ECHO_SWORD = ITEMS.register("echo_sword",
            () -> new SwordItem(ModToolTiers.ECHO_TIER, 4, .2f, new Item.Properties()));

    public static final RegistryObject<Item> ECHO_PICKAXE = ITEMS.register("echo_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ECHO_TIER, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> ECHO_AXE = ITEMS.register("echo_axe",
            () -> new AxeItem(ModToolTiers.ECHO_TIER, 4, .2f, new Item.Properties()));

    public static final RegistryObject<Item> ECHO_SHOVEL = ITEMS.register("echo_shovel",
            () -> new ShovelItem(ModToolTiers.ECHO_TIER, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> ECHO_HOE = ITEMS.register("echo_hoe",
            () -> new HoeItem(ModToolTiers.ECHO_TIER, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> ECHO_HELMET = ITEMS.register("echo_helmet",
            () -> new ModArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> ECHO_CHESTPLATE = ITEMS.register("echo_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> ECHO_LEGGINGS = ITEMS.register("echo_leggings",
            () -> new ArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> ECHO_BOOTS = ITEMS.register("echo_boots",
            () -> new ArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> WARDEN_SOUL_PIECE = ITEMS.register("warden_soul_piece",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ECHO_STICK = ITEMS.register("echo_stick",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
