package com.github.tuserver.api.event.player;

import com.github.tuserver.api.entity.Player.Player;
import com.github.tuserver.api.event.Cancellable;
import com.github.tuserver.api.event.HandlerList;
import com.github.tuserver.api.world.World;

public class PlayerChangedWorldEvent extends PlayerEvent implements Cancellable {
	private static final HandlerList handlers = new HandlerList();
	private final World from;
	private boolean canceled;
	private World to;

	public PlayerChangedWorldEvent(final Player player, final World from, final World to) {
		super(player);
		this.from = from;
		this.to = to;
	}

	public World getFrom() {
		return from;
	}

	public World getTo() {
		return to;
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

	@Override
	public boolean isCancelled() {
		return canceled;
	}

	@Override
	public void setCancelled(boolean cancel) {
		canceled = cancel;
	}
}
