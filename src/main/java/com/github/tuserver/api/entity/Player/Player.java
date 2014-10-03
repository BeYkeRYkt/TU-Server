package com.github.tuserver.api.entity.Player;

import java.util.UUID;

import com.github.tuserver.api.commands.ICommandSender;
import com.github.tuserver.api.inv.InventoryType;
import com.github.tuserver.api.inv.PlayerInventory;

public interface Player extends Human, ICommandSender {

	public void kickPlayer(String message);

	@Override
	public void displayGUI(InventoryType type);

	public PlayerInventory getInventory();

	public UUID getUniqueId();

	public boolean isOp();

	public void setOp(boolean flag);

	public void executeCommand(String commandName);

	public void chat(String message);
}