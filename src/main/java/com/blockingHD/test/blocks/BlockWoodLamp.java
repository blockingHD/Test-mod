package com.blockingHD.test.blocks;

import com.blockingHD.test.creativetab.CreativeTabTest;

import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockWoodLamp extends BlockTest{
	
	public BlockWoodLamp(){
		
		super(Material.wood);
		GameRegistry.registerBlock(this, "WoodLamp");
		this.setUnlocalizedName("WoodLamp");
		this.setHardness(3);
		this.setResistance(2);
		this.setLightLevel(1);
		
	}

}
