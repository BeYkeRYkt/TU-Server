package com.github.tuserver.api.commands.defaultCommands;

import java.util.ArrayList;
import java.util.List;

import com.github.tuserver.api.TUServer;
import com.github.tuserver.api.commands.ICommandSender;
import com.github.tuserver.api.commands.ICommandWrapper;
import com.github.tuserver.api.plugin.Plugin;
import com.github.tuserver.api.utils.ChatColors;
import java.util.Arrays;

public class PluginsCmd implements ICommandWrapper {
	@Override
	public String getCommandName() {
		return "plugins";
	}

	@Override
	public List getCommandAliases() {
		return Arrays.asList(new String[]{"pl"});
	}

	@Override
	public void onCommand(ICommandSender sender, String[] args) {
		ArrayList<Plugin> pluginList = TUServer.getPluginManager().getPlugins();

		String plugins = ChatColors.AQUA + "Plugins " + ChatColors.WHITE + "(" + ChatColors.AQUA + pluginList.size() + ChatColors.WHITE + "): ";

		if (sender.hasPermission("tus.plugins")) {
			if (pluginList.size() >= 2) {
				for (Plugin plugin : pluginList) {
					String at = plugin.getFileDescription().getName();
					if (plugin.isEnable()) {
						at = ChatColors.GREEN + at;
					} else {
						at = ChatColors.RED + at;
					}

					if (pluginList.indexOf(plugin) == (pluginList.size() - 1)) {
						plugins += at;
					} else {
						plugins += at + ChatColors.WHITE + ", ";
					}

				}
			} else if (pluginList.size() == 1) {
				Plugin plugin = pluginList.get(0);
				String at = plugin.getFileDescription().getName();
				if (plugin.isEnable()) {
					at = ChatColors.GREEN + at;
				} else {
					at = ChatColors.RED + at;
				}
				plugins += at;
			}

			sender.sendMessage(plugins);
		} else {
			sender.sendMessage(ChatColors.RED + "You don't have permission.");
		}
	}

	@Override
	public String getCommandUsage(ICommandSender p_71518_1_) {
		return "/plugins";
	}

}