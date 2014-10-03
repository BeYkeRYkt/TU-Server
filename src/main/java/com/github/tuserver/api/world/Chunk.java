package com.github.tuserver.api.world;

public interface Chunk {

	public int getX();

	public int getZ();

	public void loadChunk();

	public void unloadChunk();

	public World getWorld();
}