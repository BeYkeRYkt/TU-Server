package com.github.tuserver.api.event.entity;

import com.github.tuserver.api.entity.EntityLiving;
import com.github.tuserver.api.event.Cancellable;
import com.github.tuserver.api.event.HandlerList;

public class EntitySpawnEvent extends EntityEvent implements Cancellable {
	private static final HandlerList handlers = new HandlerList();
	private boolean canceled;

	public EntitySpawnEvent(final EntityLiving spawnee) {
		super(spawnee);
	}

	@Override
	public boolean isCancelled() {
		return canceled;
	}

	@Override
	public void setCancelled(boolean cancel) {
		canceled = cancel;
	}

	@Override
	public EntityLiving getEntity() {
		return (EntityLiving) entity;
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}
}
