package com.github.tuserver.api.event.player;

import com.github.tuserver.api.block.Block;
import com.github.tuserver.api.entity.Player.Player;
import com.github.tuserver.api.event.Cancellable;
import com.github.tuserver.api.event.HandlerList;

public class PlayerInteractEvent extends PlayerEvent implements Cancellable {
	private static final HandlerList handlers = new HandlerList();
	protected Block block;
	private boolean cancelled;
	private Action action;

	public static enum Action {
		RIGHT_CLICK_AIR, RIGHT_CLICK_BLOCK, LEFT_CLICK_BLOCK
	}

	public PlayerInteractEvent(final Player entity, final Block block, Action action) {
		super(entity);
		this.block = block;
		this.action = action;
	}

	public Action getAction() {
		return action;
	}

	public boolean isCancelled() {
		return cancelled;
	}

	public void setCancelled(boolean cancel) {
		cancelled = cancel;
	}

	public Block getBlock() {
		return block;
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}
}
