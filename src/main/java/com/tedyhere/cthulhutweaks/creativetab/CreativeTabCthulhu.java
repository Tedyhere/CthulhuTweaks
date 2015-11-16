package com.tedyhere.cthulhutweaks.creativetab;

import com.tedyhere.cthulhutweaks.init.ModItems;
import com.tedyhere.cthulhutweaks.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Alan on 11/16/2015.
 */
public class CreativeTabCthulhu
{
    public static final CreativeTabs CT_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.plateAluminum;
        }
    };
}
