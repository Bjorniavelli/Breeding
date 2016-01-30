package com.bjorniavelli.breeding.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.world.World;

public class EntityBreedableCow extends EntityCow
{
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
