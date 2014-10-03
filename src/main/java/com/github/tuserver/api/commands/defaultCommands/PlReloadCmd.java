package com.github.tuserver.api.commands.defaultCommands;

import java.util.ArrayList;
import java.util.List;

import com.github.tuserver.api.TUServer;
import com.github.tuserver.api.commands.ICommandSender;
import com.github.tuserver.api.commands.ICommandWrapper;
import com.github.tuserver.api.utils.ChatColors;

public class PlReloadCmd implements ICommandWrapper {
	@Override
	public String getCommandName() {
		return "plreload";
	}

	@Override
	public List getCommandAliases() {
		List<String> list = new ArrayList<String>();
		list.add("pluginreload");
		list.add("plugreload");
		return list;
	}

	@Override
	public void onCommand(ICommandSender sender, String[] args) {
		if (sender.hasPermission("tus.pluginreload")) {
			sender.sendMessage("Unloading plugins...");
			TUServer.getPluginManager().unloadPlugins();
			sender.sendMessage("Refreshing plugin list and load plugins...");
			TUServer.getPluginManager().loadPlugins();
			TUServer.getPluginManager().enablePlugins();
			sender.sendMessage(ChatColors.AQUA + "Done! " + ChatColors.WHITE + "Check in " + ChatColors.AQUA + "/plugins " + ChatColors.WHITE + "!");
		} else {
			sender.sendMessage(ChatColors.RED + "You don't have permission.");
		}
	}

	@Override
	public String getCommandUsage(ICommandSender p_71518_1_) {
		return "/plreload";
	}

}