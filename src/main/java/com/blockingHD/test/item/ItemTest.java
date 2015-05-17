package com.blockingHD.test.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.blockingHD.test.creativetab.CreativeTabTest;
import com.blockingHD.test.reference.Reference;

public class ItemTest extends Item {
	
	public ItemTest(){
		super();
		this.setCreativeTab(CreativeTabTest.TEST_TAB);
	}
	
    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
    
    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
	
}
