package com.github.tuserver.api.entity;

import com.github.tuserver.api.world.Location;
import com.github.tuserver.api.world.World;

public interface Entity {

	/**
	 * 
	 * Entity location (x, y, z, pitch and yaw)
	 * 
	 * @return Entity location
	 */
	public Location getLocation();

	/**
	 * 
	 * World entity
	 * 
	 * @return Entity world
	 */
	public World getWorld();

	/**
	 * 
	 * Teleport entity to locations
	 * 
	 * @param location
	 *            - new location
	 */
	public void teleport(Location location);

	/**
	 * 
	 * EntityID
	 * 
	 * @return EntityID (Not UUID)
	 */
	public int getEntityID();

	/**
	 * 
	 * Check entity live
	 * 
	 * @return true and false
	 */
	public boolean isAlive();

	/**
	 * 
	 * Check entity burning
	 * 
	 * @return true and false
	 */
	public boolean isBurning();

	/**
	 * 
	 * Check entity in water
	 * 
	 * @return true and false
	 */
	public boolean isInWater();

	/**
	 * 
	 * Getting Eye height
	 * 
	 * @return height
	 */
	public float getEyeHeight();

	/**
	 * 
	 * Rotation yaw head
	 * 
	 * @return yaw head
	 */
	public float getRotaionHead();

	/**
	 * 
	 * Checking eating process
	 * 
	 * @return true and false
	 */
	public boolean isEating();

	/**
	 * Return whether this entity is invulnerable to damage.
	 */
	public boolean isEntityInvulnerable();

	public boolean isImmuneToFire();

	public boolean isInvisible();

	/**
	 * Returns true if the entity is riding another entity, used by render to
	 * rotate the legs to be in 'sit' position for players.
	 */
	public boolean isRiding();

	/**
	 * Returns if this entity is sneaking.
	 */
	public boolean isSneaking();

	/**
	 * Get if the Entity is sprinting.
	 */
	public boolean isSprinting();

	/**
	 * Checks if this entity is either in water or on an open air block in rain
	 * (used in wolves).
	 */
	public boolean isWet();

	/**
	 * Whether this entity won't clip with collision or not (make note it won't
	 * disable gravity)
	 */
	public boolean isNoclip();

	public boolean onGround();

	/**
	 * Will get destroyed next tick.
	 */
	public void kill();

	public void setEating(boolean flag);

	/**
	 * Sets entity to burn for x amount of seconds, cannot lower amount of
	 * existing fire.
	 */
	public void setFire(int seconds);

	public void setInvisible(boolean flag);

	/**
	 * Sets the sneaking flag.
	 */
	public void setSneaking(boolean flag);

	/**
	 * Set sprinting switch for Entity.
	 */
	public void setSprinting(boolean flag);

	public void setNoclip(boolean flag);
}