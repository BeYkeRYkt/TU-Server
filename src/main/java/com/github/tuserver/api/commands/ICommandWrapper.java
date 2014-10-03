package com.github.tuserver.api.commands;

import java.util.List;

public interface ICommandWrapper {

	public String getCommandName();

	public List getCommandAliases();

	public String getCommandUsage(ICommandSender p_71518_1_);

	public void onCommand(ICommandSender sender, String[] args);
}