package com.github.tuserver.api.event.world;

import com.github.tuserver.api.event.Cancellable;
import com.github.tuserver.api.event.HandlerList;
import com.github.tuserver.api.world.World;

public class WorldUnloadEvent extends WorldEvent implements Cancellable {
	private static final HandlerList handlers = new HandlerList();
	private boolean isCancelled;

	public WorldUnloadEvent(final World world) {
		super(world);
	}

	@Override
	public boolean isCancelled() {
		return this.isCancelled;
	}

	@Override
	public void setCancelled(boolean cancel) {
		this.isCancelled = cancel;
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}
}
