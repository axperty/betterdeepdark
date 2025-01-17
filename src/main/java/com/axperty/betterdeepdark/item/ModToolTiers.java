package com.axperty.betterdeepdark.item;

import com.axperty.betterdeepdark.BetterDeepDark;
import com.axperty.betterdeepdark.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier DEEP_DARK_TIER = TierSortingRegistry.registerTier(
            new ForgeTier(5, 3031, 9f, 0f, 25,
                    ModTags.Blocks.NEEDS_ECHO_TOOL, () -> Ingredient.of(ModItems.ECHO_STONE.get())),
            new ResourceLocation(BetterDeepDark.MOD_ID, "deep_dark"), List.of(Tiers.NETHERITE), List.of());

}
