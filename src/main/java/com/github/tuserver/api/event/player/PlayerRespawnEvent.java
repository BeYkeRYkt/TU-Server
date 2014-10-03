package com.github.tuserver.api.event.player;

import org.apache.commons.lang3.Validate;

import com.github.tuserver.api.entity.Player.Player;
import com.github.tuserver.api.event.HandlerList;
import com.github.tuserver.api.world.Location;

public class PlayerRespawnEvent extends PlayerEvent {
	private static final HandlerList handlers = new HandlerList();
	private Location respawnLocation;
	private final boolean isBedSpawn;

	public PlayerRespawnEvent(final Player respawnPlayer, final Location respawnLocation, final boolean isBedSpawn) {
		super(respawnPlayer);
		this.respawnLocation = respawnLocation;
		this.isBedSpawn = isBedSpawn;
	}

	public Location getRespawnLocation() {
		return this.respawnLocation;
	}

	public void setRespawnLocation(Location respawnLocation) {
		Validate.notNull(respawnLocation, "Respawn location can not be null");
		Validate.notNull(respawnLocation.getWorld(), "Respawn world can not be null");

		this.respawnLocation = respawnLocation;
	}

	public boolean isBedSpawn() {
		return this.isBedSpawn;
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}
}
