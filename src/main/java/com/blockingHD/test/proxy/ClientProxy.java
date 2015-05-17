package com.blockingHD.test.proxy;

import com.blockingHD.test.client.settings.Keybindings;

import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy{

	@Override
	public void registerKeyBindings() {
		
		ClientRegistry.registerKeyBinding(Keybindings.charge);
		ClientRegistry.registerKeyBinding(Keybindings.release);
		
	}

}
