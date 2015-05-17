package com.blockingHD.test.creativetab;

import com.blockingHD.test.init.ModItems;
import com.blockingHD.test.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTest{

	public static final CreativeTabs TEST_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()){
	
	@Override
	public Item getTabIconItem(){
		return ModItems.DryStick;
		}
	
	};
}
