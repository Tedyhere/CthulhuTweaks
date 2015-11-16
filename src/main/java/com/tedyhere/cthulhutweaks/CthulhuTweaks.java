package com.tedyhere.cthulhutweaks;

import com.tedyhere.cthulhutweaks.init.ModItems;
import com.tedyhere.cthulhutweaks.init.Recipes;
import com.tedyhere.cthulhutweaks.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by TedyHere on 11/16/2015.
 */
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version= Reference.VERSION)
public class CthulhuTweaks
{

    @Mod.Instance(Reference.MOD_ID)
    public static CthulhuTweaks instance;



    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ModItems.init();

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        Recipes.init();
    }

    @Mod.EventHandler
    public void init(FMLPostInitializationEvent event)
    {

    }
}
