package conner.gearsplusmod.init.items;

import conner.gearsplusmod.GearsPlusMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemSapphire extends Item 
{
	public ItemSapphire(String name)
    {
    	setUnlocalizedName(name);
    	setRegistryName(name);
    	setCreativeTab(GearsPlusMod.gearsplustab);
    }
}

