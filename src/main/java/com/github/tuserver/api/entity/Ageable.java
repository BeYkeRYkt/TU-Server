package com.github.tuserver.api.entity;

public interface Ageable extends Creature {

	public Ageable createChild(Ageable p_90011_1_);

	/**
	 * The age value may be negative or positive or zero. If it's negative, it
	 * get's incremented on each tick, if it's positive, it get's decremented
	 * each tick. Don't confuse this with EntityLiving.getAge. With a negative
	 * value the Entity is considered a child.
	 */
	public int getGrowingAge();

	/**
	 * "Adds the value of the parameter times 20 to the age of this entity. If
	 * the entity is an adult (if the entity's age is greater than 0), it will
	 * have no effect."
	 */
	public void addGrowth(int p_110195_1_);

	/**
	 * The age value may be negative or positive or zero. If it's negative, it
	 * get's incremented on each tick, if it's positive, it get's decremented
	 * each tick. With a negative value the Entity is considered a child.
	 */
	public void setGrowingAge(int p_70873_1_);

	/**
	 * If Animal, checks if the age timer is negative
	 */
	@Override
	public boolean isChild();

	/**
	 * "Sets the scale for an ageable entity according to the boolean parameter, which says if it's a child."
	 */
	public void setScaleForAge(boolean p_98054_1_);

}