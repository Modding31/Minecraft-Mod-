package conner.gearsplusmod.handlers;

import conner.gearsplusmod.gen.GearsPlusOreGen;
import conner.gearsplusmod.init.ArmourInit;
import conner.gearsplusmod.init.BlockInit;
import conner.gearsplusmod.init.ItemInit;
import conner.gearsplusmod.init.ToolInit;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegistryHandler 
{
    public static void Client()
    {
    	RecipeHandler.registerCrafting();
    	RecipeHandler.registerSmelting();
    	
    }
    
    public static void Common() 
    {
    	ItemInit.init();
    	ItemInit.register();
    	
    	BlockInit.init();
    	BlockInit.register();
    	
    	ArmourInit.init();
    	ArmourInit.register();
    	
    	ToolInit.init();
    	ToolInit.register();
    	
    	GameRegistry.registerWorldGenerator(new GearsPlusOreGen(), 0);
    }
}
