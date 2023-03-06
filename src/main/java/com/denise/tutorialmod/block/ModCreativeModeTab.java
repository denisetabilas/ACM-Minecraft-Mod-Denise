package com.denise.tutorialmod.block;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import com.denise.tutorialmod.item.ModItems;

public class ModCreativeModeTab {
    public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab("tutorialtab"){
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ACMIUM.get());
        }

    };

}
