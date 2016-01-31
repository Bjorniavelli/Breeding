package com.bjorniavelli.breeding.item;

import com.bjorniavelli.breeding.entity.EntityBreedableCow;
import com.bjorniavelli.breeding.init.ModTabs;
import com.bjorniavelli.breeding.utility.Log;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBreedingTag extends Item
{
    public ItemBreedingTag ()
    {
        super();
        setUnlocalizedName("breedingtag");
        setCreativeTab(ModTabs.tabBreeding);
    }

    public boolean itemInteractionForEntity(ItemStack stack, EntityPlayer playerIn, EntityLivingBase target)
    {
        if (target instanceof EntityCow)
        {
            if (target instanceof EntityBreedableCow)
            {
                Log.log(playerIn.getName() + " tried to convert a breedable cow!");
                return false;
            }

            if (!playerIn.capabilities.isCreativeMode)
                stack.stackSize -= 1;

            if (!playerIn.worldObj.isRemote) {
                EntityBreedableCow newTarget = new EntityBreedableCow(target);
                newTarget.setPositionAndRotation(
                        target.posX,
                        target.posY,
                        target.posZ,
                        target.rotationYaw,
                        target.rotationPitch
                        ); // BreedableCows are always facing North(?)
                playerIn.worldObj.spawnEntityInWorld(newTarget);
                target.setDead();
            }
            return true;
        }
        else
        {
            return super.itemInteractionForEntity(stack, playerIn, target);
        }
    }
}
