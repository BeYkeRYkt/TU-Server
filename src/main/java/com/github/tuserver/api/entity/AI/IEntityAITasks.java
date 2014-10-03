package com.github.tuserver.api.entity.AI;

public interface IEntityAITasks {

	public void addTask(int priority, IEntityAIBase base);

	/**
	 * removes the indicated task from the entity's AI tasks.
	 */
	public void removeTask(IEntityAIBase base);

	public void onUpdateTasks();
}