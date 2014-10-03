package com.github.tuserver.api.event.world;

import com.github.tuserver.api.event.Event;
import com.github.tuserver.api.world.World;

public abstract class WorldEvent extends Event {
	private final World world;

	public WorldEvent(final World world) {
		this.world = world;
	}

	public World getWorld() {
		return world;
	}
}