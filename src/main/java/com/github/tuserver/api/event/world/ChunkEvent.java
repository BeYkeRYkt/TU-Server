package com.github.tuserver.api.event.world;

import com.github.tuserver.api.world.Chunk;

public abstract class ChunkEvent extends WorldEvent {
	protected Chunk chunk;

	protected ChunkEvent(final Chunk chunk) {
		super(chunk.getWorld());
		this.chunk = chunk;
	}

	public Chunk getChunk() {
		return chunk;
	}
}
