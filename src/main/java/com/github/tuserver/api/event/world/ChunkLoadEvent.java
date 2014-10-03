package com.github.tuserver.api.event.world;

import com.github.tuserver.api.event.HandlerList;
import com.github.tuserver.api.world.Chunk;

public class ChunkLoadEvent extends ChunkEvent {
	private static final HandlerList handlers = new HandlerList();
	private final boolean newChunk;

	public ChunkLoadEvent(final Chunk chunk, final boolean newChunk) {
		super(chunk);
		this.newChunk = newChunk;
	}

	public boolean isNewChunk() {
		return newChunk;
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}
}
