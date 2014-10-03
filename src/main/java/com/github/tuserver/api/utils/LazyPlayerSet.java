package com.github.tuserver.api.utils;

import java.util.HashSet;
import java.util.List;

import com.github.tuserver.api.TUServer;
import com.github.tuserver.api.entity.Player.Player;

public class LazyPlayerSet extends LazyHashSet<Player> {

	@Override
	HashSet<Player> makeReference() {
		if (reference != null) {
			throw new IllegalStateException("Reference already created!");
		}
		List<Player> players = TUServer.getOnlinePlayers();
		HashSet<Player> reference = new HashSet<Player>(players.size());
		for (Player player : players) {
			reference.add(player);
		}
		return reference;
	}

}
