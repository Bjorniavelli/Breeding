package com.bjorniavelli.breeding;

import com.bjorniavelli.breeding.handler.ConfigurationHandler;
import com.bjorniavelli.breeding.init.ModEntities;
import com.bjorniavelli.breeding.init.ModItems;
import com.bjorniavelli.breeding.init.ModTabs;
import com.bjorniavelli.breeding.proxy.IProxy;
import com.bjorniavelli.breeding.reference.Reference;
import com.bjorniavelli.breeding.utility.Log;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class Breeding
{
    @Mod.Instance(Reference.MOD_ID)
    public static Breeding instance;

    @SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void PreInit(FMLPreInitializationEvent E)
    {
        Log.log("Breeding PreInit");
        ConfigurationHandler.init(E.getSuggestedConfigurationFile());
        ModEntities.init();
        ModItems.init();
        ModTabs.preInit();
        Log.log("Breeding Finished PreInit");
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent E)
    {
        Log.log("Breeding Init");
        Log.log("Breeding Finished Init");
    }

    @Mod.EventHandler
    public void PostInit(FMLPostInitializationEvent E)
    {
        Log.log("Breeding PostInit");
        ModTabs.postInit();
        Log.log("Breeding Finished PostInit");
    }

}
