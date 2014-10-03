package com.github.tuserver.api.entity.Animals;

import com.github.tuserver.api.entity.Ageable;
import com.github.tuserver.api.entity.EntityLivingBase;
import com.github.tuserver.api.entity.Player.Player;
import com.github.tuserver.api.inv.ItemStack;

public interface Wolf extends Tameable {
	/**
	 * Sets the active target the Task system uses for tracking
	 */
	public void setAttackTarget(EntityLivingBase entity);

	public float getEyeHeight();

	/**
	 * The speed it takes to move the entityliving's rotationPitch through the
	 * faceEntity method. This is only currently use in wolves.
	 */
	public int getVerticalFaceSpeed();

	public void setTamed(boolean flag);

	/**
	 * Checks if the parameter is an item which this animal can be fed to breed
	 * it (wheat, carrots or seeds depending on the animal type)
	 */
	public boolean isBreedingItem(ItemStack p_70877_1_);

	/**
	 * Will return how many at most can spawn in a chunk at once.
	 */
	public int getMaxSpawnedInChunk();

	/**
	 * Determines whether this wolf is angry or not.
	 */
	public boolean isAngry();

	/**
	 * Sets whether this wolf is angry or not.
	 */
	public void setAngry(boolean flag);

	/**
	 * Return this wolf's collar color.
	 */
	public int getCollarColor();

	/**
	 * Set this wolf's collar color.
	 */
	public void setCollarColor(int id);

	public Wolf createChild(Ageable p_90011_1_);

	public void setMate(boolean flag);

	/**
	 * Returns true if the mob is currently able to mate with the specified mob.
	 */
	public boolean canMateWith(Animal p_70878_1_);

	public boolean isMate();
}
