package com.blockingHD.test.item;

import com.blockingHD.test.creativetab.CreativeTabTest;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemDryStick extends ItemTest{
	public ItemDryStick(){
		super();
		OreDictionary.registerOre("stickWood", this);
		this.setUnlocalizedName("DryStick");
		this.setCreativeTab(CreativeTabTest.TEST_TAB);

	}
}
