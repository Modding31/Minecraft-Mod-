package conner.gearsplusmod.handlers;


import conner.gearsplusmod.init.ArmourInit;
import conner.gearsplusmod.init.ItemInit;
import conner.gearsplusmod.init.ToolInit;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler 
{
    public static void registerCrafting()
    {
      GameRegistry.addShapedRecipe(new ResourceLocation("gp:ruby_pickaxe"), new ResourceLocation("gp:gearsplus_tools"), new ItemStack(ToolInit.ruby_pickaxe), new Object[]{"RRR"," S "," S ",'R', ItemInit.ruby, 'S', Items.STICK});
      GameRegistry.addShapedRecipe(new ResourceLocation("gp:ruby_axe"), new ResourceLocation("gp:gearsplus_tools"), new ItemStack(ToolInit.ruby_axe), new Object[]{"RR ","RS "," S ",'R', ItemInit.ruby, 'S', Items.STICK});
      GameRegistry.addShapedRecipe(new ResourceLocation("gp:ruby_hoe"), new ResourceLocation("gp:gearsplus_tools"), new ItemStack(ToolInit.ruby_hoe), new Object[]{"RR "," S "," S ",'R', ItemInit.ruby, 'S', Items.STICK});
      GameRegistry.addShapedRecipe(new ResourceLocation("gp:ruby_shovel"), new ResourceLocation("gp:gearsplus_tools"), new ItemStack(ToolInit.ruby_shovel), new Object[]{" R "," S "," S ",'R', ItemInit.ruby, 'S', Items.STICK});
      GameRegistry.addShapedRecipe(new ResourceLocation("gp:ruby_sword"), new ResourceLocation("gp:gearsplus_tools"), new ItemStack(ToolInit.ruby_sword), new Object[]{" R "," R "," S ",'R', ItemInit.ruby, 'S', Items.STICK});
      
      GameRegistry.addShapedRecipe(new ResourceLocation("gp:sapphire_pickaxe"), new ResourceLocation("gp:gearsplus_tools"), new ItemStack(ToolInit.sapphire_pickaxe), new Object[]{"SSS"," T "," T ",'S', ItemInit.sapphire, 'T', Items.STICK});
      GameRegistry.addShapedRecipe(new ResourceLocation("gp:sapphire_axe"), new ResourceLocation("gp:gearsplus_tools"), new ItemStack(ToolInit.sapphire_axe), new Object[]{"SS ","ST "," T ",'S', ItemInit.sapphire, 'T', Items.STICK});
      GameRegistry.addShapedRecipe(new ResourceLocation("gp:sapphire_hoe"), new ResourceLocation("gp:gearsplus_tools"), new ItemStack(ToolInit.sapphire_hoe), new Object[]{"SS "," T "," T ",'S', ItemInit.sapphire, 'T', Items.STICK});
      GameRegistry.addShapedRecipe(new ResourceLocation("gp:sapphire_shovel"), new ResourceLocation("gp:gearsplus_tools"), new ItemStack(ToolInit.sapphire_shovel), new Object[]{" S "," T "," T ",'S', ItemInit.sapphire, 'T', Items.STICK});
      GameRegistry.addShapedRecipe(new ResourceLocation("gp:sapphire_sword"), new ResourceLocation("gp:gearsplus_tools"), new ItemStack(ToolInit.sapphire_sword), new Object[]{" S "," S "," T ",'S', ItemInit.sapphire, 'T', Items.STICK});
      
      GameRegistry.addShapedRecipe(new ResourceLocation("gp:ruby_helmet"), new ResourceLocation("gp:gearsplus_armour"), new ItemStack(ArmourInit.ruby_helmet), new Object[]{"RRR","R R","   ",'R', ItemInit.ruby});
      GameRegistry.addShapedRecipe(new ResourceLocation("gp:ruby_chestplate"), new ResourceLocation("gp:gearsplus_armour"), new ItemStack(ArmourInit.ruby_chestplate), new Object[]{"R R","RRR","RRR",'R', ItemInit.ruby});
      GameRegistry.addShapedRecipe(new ResourceLocation("gp:ruby_leggings"), new ResourceLocation("gp:gearsplus_armour"), new ItemStack(ArmourInit.ruby_leggings), new Object[]{"RRR","R R","R R",'R', ItemInit.ruby});
      GameRegistry.addShapedRecipe(new ResourceLocation("gp:ruby_boots"), new ResourceLocation("gp:gearsplus_armour"), new ItemStack(ArmourInit.ruby_boots), new Object[]{"   ","R R","R R",'R', ItemInit.ruby});
      
      GameRegistry.addShapedRecipe(new ResourceLocation("gp:sapphire_helmet"), new ResourceLocation("gp:gearsplus_armour"), new ItemStack(ArmourInit.sapphire_helmet), new Object[]{"SSS","S S","   ",'S', ItemInit.sapphire});
      GameRegistry.addShapedRecipe(new ResourceLocation("gp:sapphire_chestplate"), new ResourceLocation("gp:gearsplus_armour"), new ItemStack(ArmourInit.sapphire_chestplate), new Object[]{"S S","SSS","SSS",'S', ItemInit.sapphire});
      GameRegistry.addShapedRecipe(new ResourceLocation("gp:sapphire_leggings"), new ResourceLocation("gp:gearsplus_armour"), new ItemStack(ArmourInit.sapphire_leggings), new Object[]{"SSS","S S","S S",'S', ItemInit.sapphire});
      GameRegistry.addShapedRecipe(new ResourceLocation("gp:sapphire_boots"), new ResourceLocation("gp:gearsplus_armour"), new ItemStack(ArmourInit.sapphire_boots), new Object[]{"   ","S S","S S",'S', ItemInit.sapphire});
      
    }
    
    public static void registerSmelting()
    {
    	
    }
    
    }  
   
    
    
    
    
    
