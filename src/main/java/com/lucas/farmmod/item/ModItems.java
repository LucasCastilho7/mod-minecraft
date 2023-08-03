package com.lucas.farmmod.item;

import com.lucas.farmmod.FarmMod;
import com.lucas.farmmod.tab.ModCreativeModeTab;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FarmMod.MOD_ID);

    public static final RegistryObject<Item> DILDO = ITEMS.register("dildo",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FARM_MOD_TAB)));
    public static final RegistryObject<Item> CONDOM = ITEMS.register("condom",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FARM_MOD_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}