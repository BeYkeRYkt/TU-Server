package com.github.tuserver.api.entity.Monsters;

import com.github.tuserver.api.entity.Creature;
import com.github.tuserver.api.entity.Entity;

public interface Monster extends Creature {

	public boolean attackEntityAsMob(Entity p_70652_1_);

	/**
	 * Checks if the entity's current position is a valid location to spawn this
	 * entity.
	 */
	public boolean getCanSpawnHere();
}