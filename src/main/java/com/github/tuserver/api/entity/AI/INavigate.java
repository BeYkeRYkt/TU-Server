package com.github.tuserver.api.entity.AI;

import com.github.tuserver.api.entity.Entity;

public interface INavigate {

	public void setAvoidsWater(boolean flag);

	public boolean getAvoidsWater();

	public void setBreakDoors(boolean flag);

	/**
	 * Sets if the entity can enter open doors
	 */
	public void setEnterDoors(boolean flag);

	public boolean getCanBreakDoors();

	/**
	 * Sets if the path should avoid sunlight
	 */
	public void setAvoidSun(boolean flag);

	/**
	 * Sets the speed
	 */
	public void setSpeed(double speed);

	/**
	 * Sets if the entity can swim
	 */
	public void setCanSwim(boolean flag);

	/**
	 * Gets the maximum distance that the path finding will search in.
	 */
	public float getPathSearchRange();

	/**
	 * Returns the path to the given coordinates
	 */
	public IPathEntity getPathToXYZ(double x, double y, double z);

	/**
	 * Try to find and set a path to XYZ. Returns true if successful.
	 */
	public boolean tryMoveToXYZ(double x, double y, double z, double p_75492_7_);

	/**
	 * Returns the path to the given EntityLiving
	 */
	public IPathEntity getPathToEntityLiving(Entity entity);

	/**
	 * Try to find and set a path to EntityLiving. Returns true if successful.
	 */
	public boolean tryMoveToEntityLiving(Entity entity, double d0);

	/**
	 * sets the active path data if path is 100% unique compared to old path,
	 * checks to adjust path for sun avoiding ents and stores end coords
	 */
	public boolean setPath(IPathEntity path, double flag);

	/**
	 * gets the actively used PathEntity
	 */
	public IPathEntity getPath();

	public void onUpdateNavigation();

	/**
	 * If null path or reached the end
	 */
	public boolean noPath();

	/**
	 * sets active PathEntity to null
	 */
	public void clearPathEntity();
}