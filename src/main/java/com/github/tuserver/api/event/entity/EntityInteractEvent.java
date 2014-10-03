package com.github.tuserver.api.event.entity;

import com.github.tuserver.api.entity.EntityLiving;
import com.github.tuserver.api.entity.Player.Player;
import com.github.tuserver.api.event.Cancellable;
import com.github.tuserver.api.event.HandlerList;
import com.github.tuserver.api.inv.ItemStack;

public class EntityInteractEvent extends EntityEvent implements Cancellable {
	private static final HandlerList handlers = new HandlerList();
	private boolean canceled;
	private Player player;
	private ItemStack item;

	public EntityInteractEvent(EntityLiving entity, Player who, ItemStack item) {
		super(entity);
		this.player = who;
		this.item = item;
	}

	public Player getPlayer() {
		return player;
	}

	public ItemStack getItem() {
		return item;
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