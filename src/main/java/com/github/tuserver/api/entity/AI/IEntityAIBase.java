package com.github.tuserver.api.entity.AI;

public interface IEntityAIBase {
	/**
	 * Returns whether the EntityAIBase should begin execution.
	 */
	public abstract boolean shouldExecute();

	/**
	 * Returns whether an in-progress EntityAIBase should continue executing
	 */
	public boolean continueExecuting();

	/**
	 * Execute a one shot task or start executing a continuous task
	 */
	public void startExecuting();

	/**
	 * Resets the task
	 */
	public void resetTask();

	/**
	 * Updates the task
	 */
	public void updateTask();
}