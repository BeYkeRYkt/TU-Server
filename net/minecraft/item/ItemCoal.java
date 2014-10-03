package net.minecraft.item;

import net.minecraft.creativetab.CreativeTabs;

public class ItemCoal extends Item
{
    private static final String __OBFID = "CL_00000002";

    public ItemCoal()
    {
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }

    /**
     * Returns the unlocalized name of this item. This version accepts an ItemStack so different stacks can have
     * different names based on their damage or NBT.
     */
    public String getUnlocalizedName(ItemStack stack)
    {
        return stack.getMetadata() == 1 ? "item.charcoal" : "item.coal";
    }
}
