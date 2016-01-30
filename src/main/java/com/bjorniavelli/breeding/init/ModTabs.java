package com.bjorniavelli.breeding.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModTabs extends CreativeTabs
{
    private ItemStack stack;

    public ModTabs(String label)
    {
        super(label);
    }

    // Dunno what they do, but they're all required?
    public Item getTabIconItem()
    {
        return stack.getItem();
    }
    public void setTabIconItem(ItemStack item)
    {
        this.stack = stack;
    }
    public ItemStack getIconItemStack()
    {
        return stack;
    }

    public static final ModTabs tabBreeding = new ModTabs("tabBreeding");

    public static void preInit() {};
    public static void postInit() {
        tabBreeding.setTabIconItem(new ItemStack(Items.apple));
    };
}
