package com.lucas.farmmod;

import com.lucas.farmmod.block.ModBlocks;
import com.lucas.farmmod.item.ModItems;
import com.lucas.farmmod.tab.ModCreativeModeTab;
import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(FarmMod.MOD_ID)
public class FarmMod {
    public static final String MOD_ID = "farmmod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public FarmMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTab.register(modEventBus);

        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    public void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == ModCreativeModeTab.FARM_MOD_TAB.get()) {

            // items
            event.accept(ModItems.DILDO);
            event.accept(ModItems.CONDOM);
            event.accept(ModItems.PLATINUM_INGOT);
            event.accept(ModItems.RAW_PLATINUM_ORE);
            event.accept(ModItems.PLATINUM_NUGGET);

            // blocks
            event.accept(ModBlocks.IRRIGATOR);
        }
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
