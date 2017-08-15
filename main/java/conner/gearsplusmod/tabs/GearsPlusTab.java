package conner.gearsplusmod.tabs;

import conner.gearsplusmod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class GearsPlusTab extends CreativeTabs
{
    public GearsPlusTab(String label) { super ("gearsplustab");
    this.setBackgroundImageName("gearsplus.png"); }
    public ItemStack getTabIconItem() { return new ItemStack(ItemInit.ruby);
    }    
}
    	
       

   
	

		
		
	
