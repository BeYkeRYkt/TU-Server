package com.github.tuserver.api.event.world;

import com.github.tuserver.api.event.HandlerList;
import com.github.tuserver.api.world.Chunk;

public class ChunkPopulateEvent extends ChunkEvent {
	private static final HandlerList handlers = new HandlerList();

	public ChunkPopulateEvent(final Chunk chunk) {
		super(chunk);
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}
}
