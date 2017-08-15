package conner.gearsplusmod.init;

import conner.gearsplusmod.GearsPlusMod;

import conner.gearsplusmod.init.blocks.OreBlockRuby;
import conner.gearsplusmod.init.blocks.OreBlockSapphire;
import conner.gearsplusmod.init.blocks.CustomMaterialBlock;


import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BlockInit 
{
	//Ores
	public static Block ruby_ore;
	public static Block sapphire_ore;
	
	//Material Blocks
	public static Block ruby_block;
	public static Block sapphire_block;
	
    public static void init()
    {
    	//Ores
    	ruby_ore = new OreBlockRuby("ruby_ore", 3.0F, 4.0F, 3);
    	sapphire_ore = new OreBlockSapphire("sapphire_ore", 3.5F, 4.0F, 4);
    	
    	//Material Blocks
    	ruby_block = new CustomMaterialBlock("ruby_block", 4.0F, 4.0F, 3);
    	sapphire_block = new CustomMaterialBlock("sapphire_block", 4.5F, 4.5F, 4);
    }
    
    public static void register()
    {
    	//Ores
    	registerBlock(ruby_ore);
    	registerBlock(sapphire_ore);
    	
    	//Material Blocks
    	registerBlock(ruby_block);
    	registerBlock(sapphire_block);
    }
    
    public static void registerBlock(Block block) 
    {
    	ForgeRegistries.BLOCKS.register(block);
    	block.setCreativeTab(GearsPlusMod.gearsplustab);
    	 ItemBlock item = new ItemBlock(block);
    	 item.setRegistryName(block.getRegistryName());
    	 ForgeRegistries.ITEMS.register(item);
		
    	 ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
}    
	
    	 
    	 



