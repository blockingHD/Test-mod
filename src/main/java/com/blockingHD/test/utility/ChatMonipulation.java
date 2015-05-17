package com.blockingHD.test.utility;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.SERVER)
public class ChatMonipulation {

	public static void addMessage(String msg) {

		boolean s = false;

		if (s == true) {
			Minecraft.getMinecraft().thePlayer
					.addChatMessage(new ChatComponentText(
							"\2478[\247cTest\2478] \247f" + msg));
		}
	}

}
