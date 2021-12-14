package com.tomod.obsidure.item;

import com.tomod.obsidure.Obsidure;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Obsidure.MOD_ID);

    public static final RegistryObject<Item> OBSIDURE_INGOT = ITEMS.register("obsidure_ingot",()
    -> new Item (new Item.Properties().tab(OCreativeModeTab.OBSIDURE_TAB)));
    public static final RegistryObject<Item> OBSIDURE_FRAGMENT = ITEMS.register("obsidure_fragment",()
            -> new Item (new Item.Properties().tab(OCreativeModeTab.OBSIDURE_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
