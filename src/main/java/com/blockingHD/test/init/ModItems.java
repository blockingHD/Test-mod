package com.blockingHD.test.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.blockingHD.test.item.ItemDryStick;
import com.blockingHD.test.item.ItemTest;
import com.blockingHD.test.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
	public static final ItemTest DryStick = new ItemDryStick();
	
	public static void init(){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(DryStick, 0, new ModelResourceLocation(Reference.MOD_ID+":"+"DryStick", "inventory"));
		GameRegistry.registerItem(DryStick, "DryStick");
	}
}
