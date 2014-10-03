package com.github.tuserver.api.event.world;

import com.github.tuserver.api.event.Cancellable;
import com.github.tuserver.api.event.HandlerList;
import com.github.tuserver.api.world.Chunk;

/**
 * Called when a chunk is unloaded
 */
public class ChunkUnloadEvent extends ChunkEvent implements Cancellable {
	private static final HandlerList handlers = new HandlerList();
	private boolean cancel = false;

	public ChunkUnloadEvent(final Chunk chunk) {
		super(chunk);
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
