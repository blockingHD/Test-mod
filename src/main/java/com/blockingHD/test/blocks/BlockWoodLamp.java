package com.blockingHD.test.blocks;

import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockWoodLamp extends BlockTest {

	public BlockWoodLamp() {

		super(Material.wood);
		GameRegistry.registerBlock(this, "WoodLamp");
		this.setUnlocalizedName("WoodLamp");
		this.setHardness(2);
		this.setResistance(5);
		this.setLightLevel(1);

	}

}
