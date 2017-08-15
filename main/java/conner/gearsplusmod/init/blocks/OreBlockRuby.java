package conner.gearsplusmod.init.blocks;

import java.util.Random;

import conner.gearsplusmod.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class OreBlockRuby extends Block 
{
    public OreBlockRuby(String name, float hardness, float resistance, int harvestLevel)
    {
    	super(Material.ROCK);
    	setUnlocalizedName(name);
    	setRegistryName(name);
    	setHardness(hardness);
    	setResistance(resistance);
    	setHarvestLevel("pickaxe", 3);
    }
    
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return ItemInit.ruby;
    }
    
    
    @Override
    public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
    	
    	return 3;
    }
}
