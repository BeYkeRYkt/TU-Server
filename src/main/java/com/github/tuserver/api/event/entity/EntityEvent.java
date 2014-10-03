package com.github.tuserver.api.event.entity;

import com.github.tuserver.api.entity.Entity;
import com.github.tuserver.api.event.Event;

public abstract class EntityEvent extends Event {
	protected Entity entity;

	public EntityEvent(final Entity what) {
		entity = what;
	}

	public Entity getEntity() {
		return entity;
	}
}
