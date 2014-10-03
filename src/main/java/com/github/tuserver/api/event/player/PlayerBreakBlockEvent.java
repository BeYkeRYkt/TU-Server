package com.github.tuserver.api.event.player;

import com.github.tuserver.api.block.Block;
import com.github.tuserver.api.entity.Player.Player;
import com.github.tuserver.api.event.Cancellable;
import com.github.tuserver.api.event.HandlerList;

public class PlayerBreakBlockEvent extends PlayerEvent implements Cancellable {
	private final Block block;
	private boolean cancel;
	private static final HandlerList handlers = new HandlerList();

	public PlayerBreakBlockEvent(final Block block, final Player player) {
		super(player);

		this.block = block;
	}

	public Block getBlock() {
		return block;
	}

	public boolean isCancelled() {
		return cancel;
	}

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
