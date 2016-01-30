package com.bjorniavelli.breeding.init;

import com.bjorniavelli.breeding.item.ItemBreedingTag;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemBreedingTag breedingTag = new ItemBreedingTag();

    public static void init()
    {
        registerItem(breedingTag);
    }

    private static void registerItem (Item item)
    {
        GameRegistry.registerItem(item, item.getUnlocalizedName());
    }
}
