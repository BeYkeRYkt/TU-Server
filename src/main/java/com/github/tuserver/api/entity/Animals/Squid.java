package com.github.tuserver.api.entity.Animals;

public interface Squid {

	/**
	 * Checks if this entity is inside water (if inWater field is true as a
	 * result of handleWaterMovement() returning true)
	 */
	public boolean isInWater();

	/**
	 * Moves the entity based on the specified heading. Args: strafe, forward
	 */
	public void moveEntityWithHeading(float strafe, float forward);

	/**
	 * Checks if the entity's current position is a valid location to spawn this
	 * entity.
	 */
	public boolean getCanSpawnHere();
}
