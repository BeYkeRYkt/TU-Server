package com.github.tuserver.api.commands;

import com.github.tuserver.api.entity.Player.Player;

public interface ICommandSender {

	public void sendMessage(String message);

	public String getName();

	public Player getPlayer();

	public boolean hasPermission(String permission);
}