package com.blockingHD.test.blocks;

import com.blockingHD.test.creativetab.CreativeTabTest;
import com.blockingHD.test.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTest extends Block{
	public BlockTest(Material material){
		super (material);
		this.setCreativeTab(CreativeTabTest.TEST_TAB);
	}
	
	public BlockTest(){
		this(Material.rock);
	}
	
    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}

