package com.tomod.obsidure.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class OCreativeModeTab {
    public static final CreativeModeTab OBSIDURE_TAB = new CreativeModeTab("obsidureTab"){
        @Override
        public ItemStack makeIcon(){
            return new ItemStack(ModItems.OBSIDURE_INGOT.get());
        }
    };
}
