package com.github.tuserver.api.event.player;

import com.github.tuserver.api.entity.Player.Player;
import com.github.tuserver.api.event.Cancellable;
import com.github.tuserver.api.event.HandlerList;

public class PlayerItemHeldEvent extends PlayerEvent implements Cancellable {
	private static final HandlerList handlers = new HandlerList();
	private boolean cancel = false;
	private final int previous;
	private final int current;

	public PlayerItemHeldEvent(final Player player, final int previous, final int current) {
		super(player);
		this.previous = previous;
		this.current = current;
	}

	public int getPreviousSlot() {
		return previous;
	}

	public int getNewSlot() {
		return current;
	}

	@Override
	public boolean isCancelled() {
		return cancel;
	}

	@Override
	public void setCancelled(boolean cancel) {
		this.cancel = cancel;
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}
}
