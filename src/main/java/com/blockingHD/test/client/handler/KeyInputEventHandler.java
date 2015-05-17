package com.blockingHD.test.client.handler;

import com.blockingHD.test.client.settings.Keybindings;
import com.blockingHD.test.reference.Key;
import com.blockingHD.test.utility.logHelper;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

public class KeyInputEventHandler {
	
	private static Key getPressedKeybinding(){
		
		if (Keybindings.charge.isPressed()){
			
			
			return Key.CHARGE;
		}else if(Keybindings.release.isPressed()){
			
			return Key.RELEASE;
		}
		
		return Key.UNKNOW;
	}
	
	@SubscribeEvent
	public void handleKeyImputEvent(InputEvent.KeyInputEvent event){
		logHelper.info(getPressedKeybinding());
		
	}
}
