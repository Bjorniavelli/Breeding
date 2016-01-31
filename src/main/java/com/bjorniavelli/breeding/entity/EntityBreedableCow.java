package com.bjorniavelli.breeding.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.world.World;

public class EntityBreedableCow extends EntityCow
{
    public static int trackingRange = 80;  //Why 80?  No idea how to find what a Cow's is.

    public EntityBreedableCow (World worldIn)
    {
        super (worldIn);
    }

    public EntityBreedableCow (EntityLivingBase target)
    {

        //Copy information from target cow?  Or just create a new one... ?
        super (target.getEntityWorld());
    }
}
