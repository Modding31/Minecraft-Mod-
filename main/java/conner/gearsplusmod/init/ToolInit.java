package conner.gearsplusmod.init;

import conner.gearsplusmod.GearsPlusMod;
import conner.gearsplusmod.init.tools.CustomAxe;
import conner.gearsplusmod.init.tools.CustomHoe;
import conner.gearsplusmod.init.tools.CustomPickaxe;
import conner.gearsplusmod.init.tools.CustomShovel;
import conner.gearsplusmod.init.tools.CustomSword;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ToolInit 
{
	public static final ToolMaterial ruby = EnumHelper.addToolMaterial("ruby", 4, 1700, 9.0F, 4.0F, 10);
	public static final ToolMaterial sapphire = EnumHelper.addToolMaterial("sapphire", 5, 2000, 10.0F, 6.0F, 10);
	
	
	public static Item ruby_pickaxe, ruby_axe, ruby_hoe, ruby_shovel, ruby_sword;
	public static Item sapphire_pickaxe, sapphire_axe, sapphire_hoe, sapphire_shovel, sapphire_sword;
	
	
    public static void init()
    {
    	ruby_pickaxe = new CustomPickaxe("ruby_pickaxe", ruby);
    	ruby_axe = new CustomAxe("ruby_axe", ruby);
    	ruby_hoe = new CustomHoe("ruby_hoe", ruby);
    	ruby_shovel = new CustomShovel("ruby_shovel", ruby);
    	ruby_sword = new CustomSword("ruby_sword", ruby);
    	
    	sapphire_pickaxe = new CustomPickaxe("sapphire_pickaxe", sapphire);
    	sapphire_axe = new CustomAxe("sapphire_axe", sapphire);
    	sapphire_hoe = new CustomHoe("sapphire_hoe", sapphire);
    	sapphire_shovel = new CustomShovel("sapphire_shovel", sapphire);
    	sapphire_sword = new CustomSword("sapphire_sword", sapphire);
    }
    
    public static void register()
    {
    	registerItem(ruby_pickaxe);
    	registerItem(ruby_axe);
    	registerItem(ruby_hoe);
    	registerItem(ruby_shovel);
    	registerItem(ruby_sword);
    	
    	registerItem(sapphire_pickaxe);
    	registerItem(sapphire_axe);
    	registerItem(sapphire_hoe);
    	registerItem(sapphire_shovel);
    	registerItem(sapphire_sword);
    }
    
    public static void registerItem(Item item)
    {
    	ForgeRegistries.ITEMS.register(item);
    	item.setCreativeTab(GearsPlusMod.gearsplustab);
    	ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}


