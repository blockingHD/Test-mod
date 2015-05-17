package com.blockingHD.test.blocks;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockOreNickel extends BlockTest {

	public BlockOreNickel() {

		super();
		GameRegistry.registerBlock(this, "Nickel_ore");
		this.setUnlocalizedName("Nickel_ore");
		this.setHardness(3F);
		this.setResistance(10F);
		this.setHarvestLevel("pickaxe", 2);

	}

}
