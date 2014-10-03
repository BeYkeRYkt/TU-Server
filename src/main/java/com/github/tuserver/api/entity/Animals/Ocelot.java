package com.github.tuserver.api.entity.Animals;

import com.github.tuserver.api.entity.Ageable;
import com.github.tuserver.api.inv.ItemStack;

public interface Ocelot extends Tameable {

	public Ocelot createChild(Ageable p_90011_1_);

	/**
	 * Checks if the parameter is an item which this animal can be fed to breed
	 * it (wheat, carrots or seeds depending on the animal type)
	 */
	public boolean isBreedingItem(ItemStack p_70877_1_);

	/**
	 * Returns true if the mob is currently able to mate with the specified mob.
	 */
	public boolean canMateWith(Animal p_70878_1_);

	public int getTameSkin();

	public void setTameSkin(int p_70912_1_);

	/**
	 * Checks if the entity's current position is a valid location to spawn this
	 * entity.
	 */
	public boolean getCanSpawnHere();
}
