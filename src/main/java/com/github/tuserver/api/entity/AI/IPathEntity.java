package com.github.tuserver.api.entity.AI;

import com.github.tuserver.api.entity.Entity;

public interface IPathEntity {
	/**
	 * Directs this path to the next point in its array
	 */
	public void incrementPathIndex();

	/**
	 * Returns true if this path has reached the end
	 */
	public boolean isFinished();

	/**
	 * returns the last PathPoint of the Array
	 */
	public IPathPoint getFinalPathPoint();

	/**
	 * return the PathPoint located at the specified PathIndex, usually the
	 * current one
	 */
	public IPathPoint getPathPointFromIndex(int p_75877_1_);

	public int getCurrentPathLength();

	public void setCurrentPathLength(int p_75871_1_);

	public int getCurrentPathIndex();

	public void setCurrentPathIndex(int p_75872_1_);

	/**
	 * Gets the vector of the PathPoint associated with the given index.
	 */
	public Object getVectorFromIndex(Entity p_75881_1_, int p_75881_2_);

	/**
	 * returns the current PathEntity target node as Vec3D
	 */
	public Object getPosition(Entity p_75878_1_);

	/**
	 * Returns true if the EntityPath are the same. Non instance related equals.
	 */
	public boolean isSamePath(IPathEntity p_75876_1_);

	/**
	 * Returns true if the final PathPoint in the PathEntity is equal to Vec3D
	 * coords.
	 */
	public boolean isDestinationSame(Object p_75880_1_);
}