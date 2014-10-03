package com.github.tuserver.api.event;

public interface Cancellable {

	public boolean isCancelled();

	public void setCancelled(boolean cancel);
}
