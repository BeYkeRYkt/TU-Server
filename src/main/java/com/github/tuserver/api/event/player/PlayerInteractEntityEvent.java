package com.github.tuserver.api.event.player;

import com.github.tuserver.api.entity.Entity;
import com.github.tuserver.api.entity.Player.Player;
import com.github.tuserver.api.event.Cancellable;
import com.github.tuserver.api.event.HandlerList;

public class PlayerInteractEntityEvent extends PlayerEvent implements Cancellable {
	private static final HandlerList handlers = new HandlerList();
	protected Entity clickedEntity;
	boolean cancelled = false;

	public PlayerInteractEntityEvent(final Player who, final Entity clickedEntity) {
		super(who);
		this.clickedEntity = clickedEntity;
	}

	public boolean isCancelled() {
		return cancelled;
	}

	public void setCancelled(boolean cancel) {
		this.cancelled = cancel;
	}

	public Entity getRightClicked() {
		return this.clickedEntity;
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}
}
