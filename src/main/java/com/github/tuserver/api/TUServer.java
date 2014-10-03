package com.github.tuserver.api;

import java.io.File;
import java.util.List;

import org.apache.logging.log4j.Logger;

import com.github.tuserver.api.commands.ICommandWrapper;
import com.github.tuserver.api.entity.Player.Player;
import com.github.tuserver.api.plugin.PluginManager;
import com.github.tuserver.api.world.World;

public class TUServer {

	private static Server server;
	private final static File pluginsFolder = new File("plugins");
	private static PluginManager pluginManager;
	//private static PermissionManager permManager;

	public static Server getServer() {
		return server;
	}

	public static void setServer(Server server) {
		if (TUServer.server != null) {
			throw new UnsupportedOperationException("Cannot redefine singleton Server");
		}

		TUServer.server = server;
		server.getLogger().info("This server is running " + server.getName() + " version " + server.getVersion());

		if (!getPluginsFolder().exists()) {
			getPluginsFolder().mkdirs(); // create folder "plugins"
		}

		pluginManager = new PluginManager();
		getPluginManager().loadPlugins();

		//permManager = new PermissionManager();
		//getPermissionManager().init();
	}

	//public static PermissionManager getPermissionManager() {
	//	return permManager;
	//}

	public static void registerCommand(ICommandWrapper wrap) {
		server.registerCommand(wrap);
	}

	public static String getName() {
		return server.getName();
	}

	public static String getVersion() {
		return server.getVersion();
	}

	public static String getMCVersion() {
		return server.getMCVersion();
	}

	public static File getPluginsFolder() {
		return pluginsFolder;
	}

	public static PluginManager getPluginManager() {
		return pluginManager;
	}

	public static Logger getLogger() {
		return getServer().getLogger();
	}

	public static void shutdown() {
		pluginManager.unloadPlugins();
	}

	public static Player getPlayer(String name) {
		return server.getPlayer(name);
	}

	public static List<Player> getOnlinePlayers() {
		return server.getOnlinePlayers();
	}

	public static World getWorld(int dimension) {
		return server.getWorld(dimension);
	}
}