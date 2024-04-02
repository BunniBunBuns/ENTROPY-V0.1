package net.bunni.entropy.items;

import net.bunni.entropy.Entropy;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Entropy.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GLOWING_ORB = ITEMS.register("glowing_orb",
            () -> new Item(new Item.Properties()));

    public  static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
