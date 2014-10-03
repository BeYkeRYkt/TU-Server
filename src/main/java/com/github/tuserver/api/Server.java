package com.github.tuserver.api;

import java.util.List;

import org.apache.logging.log4j.Logger;

import com.github.tuserver.api.commands.ICommandWrapper;
import com.github.tuserver.api.entity.Player.Player;
import com.github.tuserver.api.world.World;

public interface Server {

	public Logger getLogger();

	public void broadcastMessage(String message);

	public String getVersion();

	public String getMCVersion();

	public String getName();

	public Player getPlayer(String name);

	public List<Player> getOnlinePlayers();

	public void registerCommand(ICommandWrapper wrap);

	public World getWorld(int dimension);
	
	public int getDifficulty();
	
	public int getMaxPlayers();
	
	public void stopServer();
}