package com.github.tuserver.api.entity.Animals;

import com.github.tuserver.api.entity.Ageable;
import com.github.tuserver.api.inv.ItemStack;

public interface Pig extends Animal {
	/**
	 * returns true if all the conditions for steering the entity are met. For
	 * pigs, this is true if it is being ridden by a player and the player is
	 * holding a carrot-on-a-stick
	 */
	public boolean canBeSteered();

	/**
	 * Returns true if the pig is saddled.
	 */
	public boolean getSaddled();

	/**
	 * Set or remove the saddle of the pig.
	 */
	public void setSaddled(boolean p_70900_1_);

	public Pig createChild(Ageable p_90011_1_);

	/**
	 * Checks if the parameter is an item which this animal can be fed to breed
	 * it (wheat, carrots or seeds depending on the animal type)
	 */
	@Override
	public boolean isBreedingItem(ItemStack p_70877_1_);
}