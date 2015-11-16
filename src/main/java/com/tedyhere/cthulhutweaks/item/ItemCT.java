package com.tedyhere.cthulhutweaks.item;

import com.tedyhere.cthulhutweaks.creativetab.CreativeTabCthulhu;
import com.tedyhere.cthulhutweaks.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by Alan on 11/16/2015.
 */
public class ItemCT extends Item
{
    public ItemCT()
    {
        super();
        this.setCreativeTab(CreativeTabCthulhu.CT_TAB);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnLocalizedName(super.getUnlocalizedName()));
    }
    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnLocalizedName(super.getUnlocalizedName()));
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnLocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);

    }



}
