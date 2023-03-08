package com.denise.tutorialmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import com.denise.tutorialmod.*;
import com.denise.tutorialmod.item.ModCreativeModTab;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    // Creates a new Item with the id "examplemod:example_block", //combining the namespace and path

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS,
                    TutorialMod.MODID);

//    public static final DeferredRegister<Item> ACMIUM =
//            ITEMS.register("acmium", () -> new Item(new ITEM.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
//    public static final RegistryObject<Item> ACMIUM =
//            ITEMS.register("acmium", () -> new Item(new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB)));
// object that will be placed in register
    public static final RegistryObject<Item> ACMIUM = ITEMS.register("acmium",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB)));
//                    Properties().tab(ModCreativeModTab.TAB_MISC)));


    public static void register(IEventBus eventBus){ITEMS.register(eventBus);}


}


/*
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS,
                    TutorialMod.MODID);

    public static final DeferredRegister<Item> ACMIUM =
            ITEMS.register("acmium", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

 */