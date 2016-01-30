package com.bjorniavelli.breeding.handler;

import com.bjorniavelli.breeding.utility.Log;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void init (File configFile)
    {
        Configuration config = new Configuration(configFile);

        try {
            config.load();

            boolean disableVanillaBreeding = false;
            boolean autoConvertVanillaEntity = false;
        }
        catch (Exception e)
        {
            Log.log (e.getMessage());
        }
        finally
        {
            config.save();
        }
    }
}
