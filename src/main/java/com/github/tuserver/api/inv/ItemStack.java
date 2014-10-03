package com.github.tuserver.api.inv;

import java.util.List;
import java.util.Random;

public interface ItemStack {

	// from ItemStack
	public boolean isItemDamaged();

	public boolean isItemEnchantable();

	public boolean isItemEnchanted();

	public boolean isItemStackDamageable();

	public boolean isOnItemFrame();

	public boolean isStackable();

	public boolean hasDisplayName();

	public String getDisplayName();

	public int getItemDamage();

	public int getItemDamageForDisplay();

	public int getMaxDamage();

	public int getMaxItemUseDuration();

	public int getMaxStackSize();

	public int getRepairCost();

	public void setDisplayName(String name);

	public void setItemDamage(int dmg);

	public void setRapiarCost(int cost);

	public boolean isRepairable();

	//public void setNoRepair();

	public boolean isUnbreakable();

	public void setUnbreakable(boolean flag);

	/**
	 * Attempts to damage the ItemStack with par1 amount of damage, If the
	 * ItemStack has the Unbreaking enchantment there is a chance for each point
	 * of damage to be negated. Returns true if it takes more damage than
	 * getMaxDamage(). Returns false otherwise or if the ItemStack can't be
	 * damaged or if all points of damage are negated.
	 */
	public boolean attemptDamageItem(int p_96631_1_, Random p_96631_2_);

	/**
	 * Returns true if the ItemStack has an NBTTagCompound. Currently used to
	 * store enchantments.
	 */
	public boolean hasTagCompound();

	// public NBTTagListWrapper getEnchantmentTagList();

	// **
	// * Adds an enchantment with a desired level on the ItemStack.
	// */
	// public void addEnchantment(Enchantment p_77966_1_, int p_77966_2_)

	public void setLore(List<String> list);

	public List<String> getLore();

	public void setFakeEnchants();

	public int getItemId();
}