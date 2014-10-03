package com.github.tuserver.api.inv;

import com.github.tuserver.api.entity.Player.Player;

public interface PlayerInventory extends Inventory {

	/**
	 * Returns the item stack currently held by the player.
	 */
	public ItemStack getCurrentItem();

	/**
	 * Get the size of the player hotbar inventory
	 */
	public int getHotbarSize();

	/**
	 * Returns the first item stack that is empty.
	 */
	public int getFirstEmptyStack();

	/**
	 * Clear this player's inventory (including armor), using the specified Item
	 * and metadata as filters or -1 for no filter.
	 */
	public int clearInventory(ItemStack p_146027_1_, int p_146027_2_);

	/**
	 * removed one item of specified Item from inventory (if it is in a stack,
	 * the stack size will reduce with 1)
	 */
	public boolean consumeInventoryItem(ItemStack p_146026_1_);

	/**
	 * Checks if a specified Item is inside the inventory
	 */
	public boolean hasItem(ItemStack p_146028_1_);

	/**
	 * Adds the item stack to the inventory, returns false if it is impossible.
	 */
	public boolean addItemStackToInventory(final ItemStack p_70441_1_);

	/**
	 * Removes from an inventory slot (first arg) up to a specified number
	 * (second arg) of items and returns them in a new stack.
	 */
	@Override
	public ItemStack decrStackSize(int p_70298_1_, int p_70298_2_);

	/**
	 * When some containers are closed they call this on each slot, then drop
	 * whatever it returns as an EntityItem - like when you close a workbench
	 * GUI.
	 */
	@Override
	public ItemStack getStackInSlotOnClosing(int p_70304_1_);

	/**
	 * Sets the given item stack to the specified slot in the inventory (can be
	 * crafting or armor sections).
	 */
	@Override
	public void setInventorySlotContents(int p_70299_1_, ItemStack p_70299_2_);

	/**
	 * Returns the number of slots in the inventory.
	 */
	@Override
	public int getSize();

	/**
	 * Returns the stack in slot i
	 */
	@Override
	public ItemStack getStackInSlot(int p_70301_1_);

	/**
	 * Returns the name of the inventory
	 */
	@Override
	public String getName();

	/**
	 * Returns if the inventory is named
	 */
	@Override
	public boolean hasCustomName();

	/**
	 * Returns the maximum stack size for a inventory slot.
	 */
	@Override
	public int getInventoryStackLimit();

	/**
	 * returns a player armor item (as itemstack) contained in specified armor
	 * slot.
	 */
	public ItemStack armorItemInSlot(int p_70440_1_);

	/**
	 * Based on the damage values and maximum damage values of each armor item,
	 * returns the current armor value.
	 */
	public int getTotalArmorValue();

	/**
	 * Damages armor in each slot by the specified amount.
	 */
	public void damageArmor(float p_70449_1_);

	/**
	 * Drop all armor and main inventory items.
	 */
	public void dropAllItems();

	/**
	 * For tile entities, ensures the chunk containing the tile entity is saved
	 * to disk later - the game won't think it hasn't changed and skip it.
	 */
	@Override
	public void markDirty();

	/**
	 * Do not make give this method the name canInteractWith because it clashes
	 * with Container
	 */
	public boolean isUseableByPlayer(Player p_70300_1_);

	/**
	 * Returns true if the specified ItemStack exists in the inventory.
	 */
	public boolean hasItemStack(ItemStack p_70431_1_);

	/**
	 * Returns true if automation is allowed to insert the given stack (ignoring
	 * stack size) into the given slot.
	 */
	@Override
	public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_);

	public void setItemStack(ItemStack p_70437_1_);

	public ItemStack getItemStack();
}