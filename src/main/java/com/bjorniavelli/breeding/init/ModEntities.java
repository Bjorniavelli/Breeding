package com.bjorniavelli.breeding.init;

import com.bjorniavelli.breeding.Breeding;
import com.bjorniavelli.breeding.entity.EntityBreedableCow;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities
{
    public static int id = 0;

    public static void init()
    {
        EntityRegistry.registerModEntity(EntityBreedableCow.class, "Cow", id++, Breeding.instance, EntityBreedableCow.trackingRange, 1, true);
    }

}
