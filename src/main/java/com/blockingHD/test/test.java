package com.blockingHD.test;

import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.blockingHD.test.client.handler.KeyInputEventHandler;
import com.blockingHD.test.handler.ConfigHandler;
import com.blockingHD.test.init.ModBlocks;
import com.blockingHD.test.init.ModItems;
import com.blockingHD.test.init.Recipes;
import com.blockingHD.test.proxy.IProxy;
import com.blockingHD.test.reference.Reference;
import com.blockingHD.test.utility.logHelper;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class test {

	@Mod.Instance(Reference.MOD_ID)
	public static test instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		ConfigHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigHandler());

		proxy.registerKeyBindings();

		logHelper.info("PreInit Complete!");

	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {

		FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());

		ModItems.init();
		ModBlocks.init();
		Recipes.init();

		logHelper.info("Init Complete!");
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

		logHelper.info("PostInit Complete!");
	}
}
