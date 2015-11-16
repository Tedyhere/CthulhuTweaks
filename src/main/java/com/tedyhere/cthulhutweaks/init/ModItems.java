package com.tedyhere.cthulhutweaks.init;

import com.tedyhere.cthulhutweaks.item.ItemAluminumPlate;
import com.tedyhere.cthulhutweaks.item.ItemCT;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Alan on 11/16/2015.
 */
public class ModItems {
    public static final ItemCT plateAluminum = new ItemAluminumPlate();

    public static void init()
    {
        GameRegistry.registerItem(plateAluminum, "AluminumPlate");
    }
}
