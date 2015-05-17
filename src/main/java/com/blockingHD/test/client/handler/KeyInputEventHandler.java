package com.blockingHD.test.client.handler;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

import com.blockingHD.test.client.settings.Keybindings;
import com.blockingHD.test.reference.Key;

public class KeyInputEventHandler {

	private static Key getPressedKeybinding() {

		if (Keybindings.charge.isPressed()) {

			return Key.CHARGE;
		} else if (Keybindings.release.isPressed()) {

			return Key.RELEASE;
		}

		return Key.UNKNOW;
	}

	@SubscribeEvent
	public void handleKeyImputEvent(InputEvent.KeyInputEvent event) {

	}
}
