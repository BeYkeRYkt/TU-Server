package com.github.tuserver.api.entity.AI;

public interface IPathPoint {
	public int makeHash(int p_75830_0_, int p_75830_1_, int p_75830_2_);

	/**
	 * Returns the linear distance to another path point
	 */
	public float distanceTo(IPathPoint p_75829_1_);

	/**
	 * Returns the squared distance to another path point
	 */
	public float distanceToSquared(IPathPoint p_75832_1_);

	@Override
	public boolean equals(Object p_equals_1_);

	@Override
	public int hashCode();

	/**
	 * Returns true if this point has already been assigned to a path
	 */
	public boolean isAssigned();

	@Override
	public String toString();
}