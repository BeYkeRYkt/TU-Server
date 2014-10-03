package com.github.tuserver.api.event;

public interface EventExecutor {
	public void execute(Event event) throws EventException;
}