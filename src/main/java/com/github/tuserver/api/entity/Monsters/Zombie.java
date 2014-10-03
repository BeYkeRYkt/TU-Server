package com.github.tuserver.api.entity.Monsters;

import com.github.tuserver.api.entity.Entity;

public interface Zombie extends Monster {

	/**
	 * Returns the current armor value as determined by a call to
	 * InventoryPlayer.getTotalArmorValue
	 */
	public int getTotalArmorValue();

	/**
	 * If Animal, checks if the age timer is negative
	 */
	public boolean isChild();

	/**
	 * Set whether this zombie is a child.
	 */
	public void setChild(boolean p_82227_1_);

	/**
	 * Return whether this zombie is a villager.
	 */
	public boolean isVillager();

	/**
	 * Set whether this zombie is a villager.
	 */
	public void setVillager(boolean p_82229_1_);

	public boolean attackEntityAsMob(Entity p_70652_1_); // ???

	/**
	 * Returns whether this zombie is in the process of converting to a villager
	 */
	public boolean isConverting();
}