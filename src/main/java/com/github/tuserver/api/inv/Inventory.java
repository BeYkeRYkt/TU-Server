package com.github.tuserver.api.inv;

import com.github.tuserver.api.entity.Player.Player;

public interface Inventory {
	/**
	 * Returns the number of slots in the inventory.
	 */
	int getSize();

	/**
	 * Returns the stack in slot i
	 */
	ItemStack getStackInSlot(int p_70301_1_);

	/**
	 * Removes from an inventory slot (first arg) up to a specified number
	 * (second arg) of items and returns them in a new stack.
	 */
	ItemStack decrStackSize(int p_70298_1_, int p_70298_2_);

	/**
	 * When some containers are closed they call this on each slot, then drop
	 * whatever it returns as an EntityItem - like when you close a workbench
	 * GUI.
	 */
	ItemStack getStackInSlotOnClosing(int p_70304_1_);

	/**
	 * Sets the given item stack to the specified slot in the inventory (can be
	 * crafting or armor sections).
	 */
	void setInventorySlotContents(int p_70299_1_, ItemStack p_70299_2_);

	/**
	 * Returns the name of the inventory
	 */
	String getName();

	/**
	 * Returns if the inventory is named
	 */
	boolean hasCustomName();

	/**
	 * Returns the maximum stack size for a inventory slot.
	 */
	int getInventoryStackLimit();

	/**
	 * For tile entities, ensures the chunk containing the tile entity is saved
	 * to disk later - the game won't think it hasn't changed and skip it.
	 */
	void markDirty();

	/**
	 * Do not make give this method the name canInteractWith because it clashes
	 * with Container
	 */
	boolean isUseableByPlayer(Player p_70300_1_);

	void openInventory(Player player);

	void closeInventory(Player player);

	/**
	 * Returns true if automation is allowed to insert the given stack (ignoring
	 * stack size) into the given slot.
	 */
	boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_);
}