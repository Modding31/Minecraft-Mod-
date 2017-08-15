package conner.gearsplusmod.init;

import conner.gearsplusmod.GearsPlusMod;
import conner.gearsplusmod.Reference;
import conner.gearsplusmod.init.armour.CustomArmour;
import conner.gearsplusmod.init.items.ItemRuby;
import conner.gearsplusmod.init.items.ItemSapphire;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ArmourInit 
{
	public static final ArmorMaterial ruby_armour = EnumHelper.addArmorMaterial("ruby_armour", Reference.MODID + ":ruby_armour", 36, new int[]{4, 7, 9, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	public static final ArmorMaterial sapphire_armour = EnumHelper.addArmorMaterial("sapphire_armour", Reference.MODID + ":sapphire_armour", 36, new int[]{4, 7, 9, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	
	public static Item ruby_helmet, ruby_chestplate, ruby_leggings, ruby_boots;
	public static Item sapphire_helmet, sapphire_chestplate, sapphire_leggings, sapphire_boots;
	
	
    public static void init()
    {
    	ruby_helmet = new CustomArmour("ruby_helmet", ruby_armour, 1, EntityEquipmentSlot.HEAD);
    	ruby_chestplate = new CustomArmour("ruby_chestplate", ruby_armour, 1, EntityEquipmentSlot.CHEST);
    	ruby_leggings = new CustomArmour("ruby_leggings", ruby_armour, 2, EntityEquipmentSlot.LEGS);
    	ruby_boots = new CustomArmour("ruby_boots", ruby_armour, 1, EntityEquipmentSlot.FEET);
    	
    	sapphire_helmet = new CustomArmour("sapphire_helmet", sapphire_armour, 1, EntityEquipmentSlot.HEAD);
    	sapphire_chestplate = new CustomArmour("sapphire_chestplate", sapphire_armour, 1, EntityEquipmentSlot.CHEST);
    	sapphire_leggings = new CustomArmour("sapphire_leggings", sapphire_armour, 2, EntityEquipmentSlot.LEGS);
    	sapphire_boots = new CustomArmour("sapphire_boots", sapphire_armour, 1, EntityEquipmentSlot.FEET);
    }
    
    public static void register()
    {
    	registerItem(ruby_helmet);
    	registerItem(ruby_chestplate);
    	registerItem(ruby_leggings);
    	registerItem(ruby_boots);
    	
    	registerItem(sapphire_helmet);
    	registerItem(sapphire_chestplate);
    	registerItem(sapphire_leggings);
    	registerItem(sapphire_boots);
    }
    
    public static void registerItem(Item item)
    {
    	ForgeRegistries.ITEMS.register(item);
    	item.setCreativeTab(GearsPlusMod.gearsplustab);
    	ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}


