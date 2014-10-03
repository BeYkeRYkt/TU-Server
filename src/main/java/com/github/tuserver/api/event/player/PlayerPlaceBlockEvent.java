package com.github.tuserver.api.event.player;

import com.github.tuserver.api.block.Block;
import com.github.tuserver.api.block.BlockSide;
import com.github.tuserver.api.entity.Player.Player;
import com.github.tuserver.api.event.Cancellable;
import com.github.tuserver.api.event.HandlerList;
import com.github.tuserver.api.inv.ItemStack;

public class PlayerPlaceBlockEvent extends PlayerEvent implements Cancellable {
	private static final HandlerList handlers = new HandlerList();
	protected boolean cancel = false;
	protected Block placedAgainst;
	protected Block placedBlock;
	protected ItemStack itemInHand;
	protected Player player;
	private BlockSide side;

	public PlayerPlaceBlockEvent(final Block placedBlock, final Block placedAgainst, final ItemStack itemInHand, final BlockSide side, final Player player) {
		super(player);
		this.placedAgainst = placedAgainst;
		this.itemInHand = itemInHand;
		this.placedBlock = placedBlock;
		this.side = side;
	}

	public boolean isCancelled() {
		return cancel;
	}

	public void setCancelled(boolean cancel) {
		this.cancel = cancel;
	}

	public Block getBlockPlaced() {
		return placedBlock;
	}

	public Block getBlockAgainst() {
		return placedAgainst;
	}

	public ItemStack getItemInHand() {
		return itemInHand;
	}

	public BlockSide getSide() {
		return side;
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}
}
