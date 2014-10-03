package com.github.tuserver.api.event.player;

import com.github.tuserver.api.entity.Player.Player;
import com.github.tuserver.api.event.Event;

public abstract class PlayerEvent extends Event {

	private Player player;

	public PlayerEvent(Player player) {
		this.player = player;
	}

	PlayerEvent(final Player who, boolean async) {
		super(async);
		player = who;

	}

	public Player getPlayer() {
		return player;
	}
}