package com.zbc.zsecret_realm;

import com.zbc.zsecret_realm.modItems.ModItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(Main.MOD_ID)
public class Main {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "zsecret_realm";

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public Main() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // 注册模组物品
        ModItems.ITEMS.register(modEventBus);
        // 注册模组创造模式物品栏TAB
        ModItemCreativeTabs.CREATIVE_MODE_TAB.register(modEventBus);

        // 注册模组事件
//        MinecraftForge.EVENT_BUS.register(new onAnvilUpdateEvent());
//        MinecraftForge.EVENT_BUS.register(new onRegisterBrewingRecipesEvent());
//        MinecraftForge.EVENT_BUS.register(new onPlayerAttackEntityEvent());
//        MinecraftForge.EVENT_BUS.register(new onPlayerTickEvent());
//        MinecraftForge.EVENT_BUS.register(new onLivingDamageEvent());


        // 注册模组实体类别
//        ModEntityType.ENTITY_TYPES.register(modEventBus);

        // 注册模组声效
//        ModSounds.SOUND_EVENTS.register(modEventBus);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        MinecraftForge.EVENT_BUS.register(this);
    }


    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    // 通常，这里用于注册新实体渲染器
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            // register Renderers
//            EntityRenderers.register(ModEntityType.TEST7BALL.get(), ThrownItemRenderer::new);
//            EntityRenderers.register(ModEntityType.ICE_AXE_CHARGE.get(), IceAxeChargeRenderer::new);
//            EntityRenderers.register(ModEntityType.ENDER_SWORD_CHARGE.get(), EnderSwordChargeRenderer::new);
//            EntityRenderers.register(ModEntityType.WIND_SWORD_CHARGE.get(), WindSwordChargeRenderer::new);
//            EntityRenderers.register(ModEntityType.WORLD_DESTRUCT_SWORD_CHARGE.get(), WorldDestructSwordChargeRenderer::new);

            // 珍珠
//            EntityRenderers.register(ModEntityType.WIND_PEARL.get(), WindPearlRenderer::new);
//            EntityRenderers.register(ModEntityType.FIRE_PEARL.get(), FirePearlRenderer::new);
//            EntityRenderers.register(ModEntityType.ICE_PEARL.get(), IcePearlRenderer::new);
//            EntityRenderers.register(ModEntityType.THUNDER_PEARL.get(), ThunderPearlRenderer::new);
//            EntityRenderers.register(ModEntityType.LIGHT_PEARL.get(), LightPearlRenderer::new);

        }
    }


}
