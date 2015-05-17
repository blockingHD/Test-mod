package com.blockingHD.test.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes {
	public static void init(){
		//Shaped
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.WoodLamp), "sgs", "gsg", "srs",'s', new ItemStack(ModItems.DryStick),'g', new ItemStack(Blocks.glass),'r', new ItemStack(Items.redstone)));
		
		//Shapeless
		
		//Smelting 
	}
}
