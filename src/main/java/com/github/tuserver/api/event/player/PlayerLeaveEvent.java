package com.github.tuserver.api.event.player;

import com.github.tuserver.api.entity.Player.Player;
import com.github.tuserver.api.event.HandlerList;

public class PlayerLeaveEvent extends PlayerEvent {
	private static final HandlerList handlers = new HandlerList();

	public PlayerLeaveEvent(final Player who) {
		super(who);
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}
}
