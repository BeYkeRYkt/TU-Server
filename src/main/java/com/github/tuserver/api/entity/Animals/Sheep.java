package com.github.tuserver.api.entity.Animals;

import java.util.Random;

import com.github.tuserver.api.entity.Ageable;

public interface Sheep extends Animal {


	public int getColor();

	public void setColor(int colorID);

	/**
	 * returns true if a sheeps wool has been sheared
	 */
	public boolean getSheared();

	/**
	 * make a sheep sheared if set to true
	 */
	public void setSheared(boolean flag);

	/**
	 * This method is called when a sheep spawns in the world to select the
	 * color of sheep fleece.
	 */
	public int getRandomColor(Random p_70895_0_);

	public Sheep createChild(Ageable p_90011_1_);

	/**
	 * This function applies the benefits of growing back wool and faster
	 * growing up to the acting entity. (This function is used in the
	 * AIEatGrass)
	 */
	public void eatGrassBonus();
}
