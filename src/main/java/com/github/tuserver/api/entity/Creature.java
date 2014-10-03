package com.github.tuserver.api.entity;

import com.github.tuserver.api.entity.AI.IPathEntity;
import com.github.tuserver.api.world.Location;

public interface Creature extends EntityLiving {

	/**
	 * Checks if the entity's current position is a valid location to spawn this
	 * entity.
	 */
	@Override
	public boolean getCanSpawnHere();

	/**
	 * if the entity has a PathEntity to follow, it returns true, else false
	 */
	public boolean hasPath();

	/**
	 * sets the EntityCreature's walk path
	 */
	public void setPathToEntity(IPathEntity p_70778_1_);

	/**
	 * returns the target Entity
	 */
	public Entity getEntityToAttack();

	/**
	 * Sets the entity which is to be attacked.
	 */
	public void setTarget(Entity p_70784_1_);

	public boolean isWithinHomeDistanceCurrentPosition();

	public boolean isWithinHomeDistance(int p_110176_1_, int p_110176_2_, int p_110176_3_);

	public void setHomeArea(int p_110171_1_, int p_110171_2_, int p_110171_3_, int p_110171_4_);

	public Location getHomePosition();

	/**
	 * Returns whether a home area is defined for this entity.
	 */
	public boolean hasHome();

}