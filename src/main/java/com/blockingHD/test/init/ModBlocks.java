package com.blockingHD.test.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;

import com.blockingHD.test.blocks.BlockOreNickel;
import com.blockingHD.test.blocks.BlockTest;
import com.blockingHD.test.blocks.BlockWoodLamp;
import com.blockingHD.test.reference.Reference;

public class ModBlocks {

	public static final BlockTest WoodLamp = new BlockWoodLamp();
	public static final BlockTest Nickel_ore = new BlockOreNickel();

	public static void init() {

		Minecraft
				.getMinecraft()
				.getRenderItem()
				.getItemModelMesher()
				.register(
						net.minecraft.item.Item.getItemFromBlock(WoodLamp),
						0,
						new ModelResourceLocation(Reference.MOD_ID + ":"
								+ "WoodLamp", "inventory"));

		Minecraft
				.getMinecraft()
				.getRenderItem()
				.getItemModelMesher()
				.register(
						net.minecraft.item.Item.getItemFromBlock(Nickel_ore),
						0,
						new ModelResourceLocation(Reference.MOD_ID + ":"
								+ "Nickel_ore", "inventory"));
	}
}
