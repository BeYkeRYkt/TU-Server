package com.github.tuserver.api.entity.Animals;

import com.github.tuserver.api.entity.EntityLivingBase;

public interface Tameable extends Animal {

	public boolean isTamed();

	public void setTamed(boolean flag);

	public boolean isSitting();

	public void setSitting(boolean flag);

	public EntityLivingBase getOwner();

	public boolean isOwner(EntityLivingBase entity);

	public void setOwner(String uuid);
}
