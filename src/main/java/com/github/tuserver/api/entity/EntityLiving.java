package com.github.tuserver.api.entity;

import com.github.tuserver.api.entity.AI.IEntityAITasks;
import com.github.tuserver.api.entity.AI.INavigate;
import com.github.tuserver.api.inv.ItemStack;

public interface EntityLiving extends EntityLivingBase {

	public boolean isNoDespawnRequired();

	@Override
	public float getAIMoveSpeed();

	public boolean getAlwaysRenderNameTag();

	public EntityLivingBase getAttackTarget();

	public boolean getCanSpawnHere();

	public String getCustomNameTag();

	public IEntityAITasks getTargetAITasks();

	public IEntityAITasks getAITasks();

	@Override
	public ItemStack getItemInHand();

	public INavigate getNavigator();

	public int getTalkInterval();

	public void setAlwaysRenderNameTag(boolean flag);

	public void setAttackTarget(EntityLivingBase base);

	@Override
	public void setAIMoveSpeed(float f);

	public void setCanPickUpLoot(boolean flag);

	@Override
	public void setCurrentItemOrArmor(int slot, ItemStack item);

	public void setCustomNameTag(String name);

	public void setEquipmentDropChance(int slot, float chance);

	public boolean canAttackClass(Class clas);

	public boolean canPickUpLoot();
}