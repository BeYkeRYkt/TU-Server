package com.github.tuserver.api.entity.Player;

import com.github.tuserver.api.Gamemode;
import com.github.tuserver.api.entity.EntityLivingBase;
import com.github.tuserver.api.inv.InventoryType;
import com.github.tuserver.api.inv.ItemStack;

public interface Human extends EntityLivingBase {
	public String getDisplayName();

	public void setDisplayName(String name);

        @Override
	public boolean isSneaking();

        @Override
	public void setSneaking(boolean sneak);

        @Override
	public boolean isSprinting();

        @Override
	public void setSprinting(boolean sprinting);

	public void saveData();

	public void loadData();

	public void updateInventory();

	public String getName();

	public boolean hasItemInHand();

        @Override
	public ItemStack getItemInHand(); // getCurrentEquippedItem()

	public void setItemInHand(ItemStack item);

	public boolean isSleeping();

	public boolean isBlocking();

        @Override
	public boolean isNoclip();

        @Override
	public void setNoclip(boolean noclip);

	public void sleepInBedAt(int x, int y, int z);

	public float getArmorVisibility();

	public ItemStack getCurrentArmor(int slot);

	public boolean needFood();

	public int getFoodLevel();

	/**
	 * Args: int foodLevel, float foodSaturationModifier
	 */
	public void addFood(int p_75122_1_, float p_75122_2_);

	public float getSaturationLevel();

	public void setFoodLevel(int p_75114_1_);

	public void setFoodSaturationLevel(float p_75119_1_);

	public Gamemode getGameMode();

	public void setGamemode(Gamemode mode);

	public void closeInventory();

	public void displayGUI(InventoryType type);
}