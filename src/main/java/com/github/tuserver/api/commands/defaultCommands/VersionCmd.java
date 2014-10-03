package com.github.tuserver.api.commands.defaultCommands;

import java.util.ArrayList;
import java.util.List;

import com.github.tuserver.api.TUServer;
import com.github.tuserver.api.commands.ICommandSender;
import com.github.tuserver.api.commands.ICommandWrapper;
import com.github.tuserver.api.plugin.Plugin;
import com.github.tuserver.api.utils.ChatColors;

public class VersionCmd implements ICommandWrapper {
	@Override
	public String getCommandName() {
		return "version";
	}

	@Override
	public List getCommandAliases() {
		List<String> list = new ArrayList<String>();
		list.add("ver");
		return list;
	}

	@Override
	public void onCommand(ICommandSender sender, String[] args) {
		if (sender.hasPermission("tus.version")) {
			if (args.length == 0) {
				String plugins = ChatColors.WHITE + "This server is running " + ChatColors.AQUA + TUServer.getName() + ChatColors.WHITE + " version " + ChatColors.AQUA + TUServer.getVersion() + ChatColors.WHITE + " (MC: " + ChatColors.AQUA + TUServer.getMCVersion() + ChatColors.WHITE + " )";
				sender.sendMessage(plugins);
			} else {
				if (TUServer.getPluginManager().getPlugin(args[0]) != null) {
					Plugin plugin = TUServer.getPluginManager().getPlugin(args[0]);

					sender.sendMessage("Name: " + ChatColors.AQUA + plugin.getFileDescription().getName());
					sender.sendMessage("Description: " + ChatColors.AQUA + plugin.getFileDescription().getDescription());
					sender.sendMessage("Author: " + ChatColors.AQUA + plugin.getFileDescription().getAuthor());
					sender.sendMessage("Version: " + ChatColors.AQUA + plugin.getFileDescription().getVersion());
				} else {
					sender.sendMessage(ChatColors.RED + "Plugin not found!");
				}
			}
		} else {
			sender.sendMessage(ChatColors.RED + "You don't have permission.");
		}
	}

	@Override
	public String getCommandUsage(ICommandSender p_71518_1_) {
		return "/version";
	}

}