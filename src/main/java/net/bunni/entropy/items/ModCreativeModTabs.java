package net.bunni.entropy.items;

import net.bunni.entropy.Entropy;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public  static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Entropy.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ENTROPY_TAB = CREATIVE_MODE_TABS.register("entropy_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GLOWING_ORB.get()))
                    .title(Component.translatable("creativetab.entropy_tab"))
                    .displayItems((pParameters, pOutput) ->{
                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.GLOWING_ORB.get());
                    })
                    .build());


    public static void  register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
