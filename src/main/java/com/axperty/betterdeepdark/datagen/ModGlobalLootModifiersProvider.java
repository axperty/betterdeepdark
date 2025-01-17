package com.axperty.betterdeepdark.datagen;

import com.axperty.betterdeepdark.BetterDeepDark;
import com.axperty.betterdeepdark.loot.AddItemModifier;
import com.axperty.betterdeepdark.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output, String modid) {
        super(output, BetterDeepDark.MOD_ID);
    }

    @Override
    protected void start() {
        add("warden_soul_piece_from_warden", new AddItemModifier(new LootItemCondition[]{
               new LootTableIdCondition.Builder(new ResourceLocation("entities/warden")).build() }, ModItems.SOUL_PIECE.get()));
    }
}
