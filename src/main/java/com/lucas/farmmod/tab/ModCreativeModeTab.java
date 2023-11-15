package com.lucas.farmmod.tab;

import com.lucas.farmmod.FarmMod;
import com.lucas.farmmod.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
            FarmMod.MOD_ID);

    public static RegistryObject<CreativeModeTab> FARM_MOD_TAB = CREATIVE_MODE_TABS.register("farm_mod_tab", () ->
            CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DILDO.get())).title(Component.translatable("farmmodtab.farm_mod_tab")).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
