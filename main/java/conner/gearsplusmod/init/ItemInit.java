package conner.gearsplusmod.init;

import conner.gearsplusmod.GearsPlusMod;
import conner.gearsplusmod.init.items.ItemRuby;
import conner.gearsplusmod.init.items.ItemSapphire;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class ItemInit 
{
	public static Item ruby;
	public static Item sapphire;
	
	
    public static void init()
    {
    	ruby = new ItemRuby("ruby");
    	sapphire = new ItemSapphire("sapphire");
    }
    
    public static void register()
    {
    	registerItem(ruby);
    	registerItem(sapphire);
    }
    
    public static void registerItem(Item item)
    {
    	ForgeRegistries.ITEMS.register(item);
    	item.setCreativeTab(GearsPlusMod.gearsplustab);
    	ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
