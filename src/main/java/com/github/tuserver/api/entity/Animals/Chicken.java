package com.github.tuserver.api.entity.Animals;

import com.github.tuserver.api.entity.Ageable;
import com.github.tuserver.api.inv.ItemStack;

public interface Chicken extends Animal {

	public Chicken createChild(Ageable p_90011_1_);

	/**
	 * Checks if the parameter is an item which this animal can be fed to breed
	 * it (wheat, carrots or seeds depending on the animal type)
	 */
	@Override
	public boolean isBreedingItem(ItemStack p_70877_1_);

}