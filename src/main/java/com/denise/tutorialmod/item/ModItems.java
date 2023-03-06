package com.denise.tutorialmod.item;

import  net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import com.denise.tutorialmod.*;
import com.denise.tutorialmod.block.ModCreativeModeTab;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    // Creates a new Item with the id "examplemod:example_block", //combining the namespace and path

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS,
                    TutorialMod.MODID);

    public static final RegistryObject<Item> ACMIUM =
            ITEMS.register("acmium", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    //  ITEMS.register("acmium", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
//            ITEMS.register("acmium", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

//            ITEMS.register("acmium", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

}


/*
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS,
                    TutorialMod.MODID);

    public static final DeferredRegister<Item> ACMIUM =
            ITEMS.register("acmium", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

 */