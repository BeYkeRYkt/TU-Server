package com.github.tuserver.api.entity.Animals;

import com.github.tuserver.api.entity.Ageable;
import com.github.tuserver.api.inv.ItemStack;

public interface Animal extends Ageable {

	/**
	 * Checks if the entity's current position is a valid location to spawn this
	 * entity.
	 */
	public boolean getCanSpawnHere();

	/**
	 * Checks if the parameter is an item which this animal can be fed to breed
	 * it (wheat, carrots or seeds depending on the animal type)
	 */
	public boolean isBreedingItem(ItemStack p_70877_1_);

	/**
	 * Returns if the entity is currently in 'love mode'.
	 */
	public boolean isInLove();

	public void resetInLove();

	/**
	 * Returns true if the mob is currently able to mate with the specified mob.
	 */
	public boolean canMateWith(Animal p_70878_1_);

}