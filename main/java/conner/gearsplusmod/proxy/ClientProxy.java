package conner.gearsplusmod.proxy;

import conner.gearsplusmod.handlers.RegistryHandler;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{
	
    public void preInit(FMLPreInitializationEvent event)
    {
    	super.preInit(event);
    }
	
	
    public void init(FMLInitializationEvent event)
    {
    	super.init(event);
    	RegistryHandler.Client();
    }
	
	
    public void postInit(FMLPostInitializationEvent event)
    {
    	super.postInit(event);
    }
}
