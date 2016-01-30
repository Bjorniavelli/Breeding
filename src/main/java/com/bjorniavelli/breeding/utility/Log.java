package com.bjorniavelli.breeding.utility;

import com.bjorniavelli.breeding.reference.Reference;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.*;

// Right now, we're just dumping a string to the log.
// Later, we'll want to make this more utile, and hide some of the debugging stuff.
// but for now, it just dumps a string to the log.
public class Log
{
    private static Logger logger = LogManager.getLogger(Reference.MOD_ID);

    public static void log (String message)
    {
        // Am I supposed to have Markers?  Re: MarkerManager
        logger.log(Level.INFO, message);
    }
}
