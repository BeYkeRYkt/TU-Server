package com.github.tuserver.api.entity.Animals;

import com.github.tuserver.api.entity.Ageable;
import com.github.tuserver.api.entity.EntityLivingBase;
import com.github.tuserver.api.entity.Player.Player;

public interface Villager extends Ageable {

	public void setProfession(int id);

	public int getProfession();

	public boolean isMating();

	public void setMating(boolean flag);

	public void setPlaying(boolean flag);

	public boolean isPlaying();

	public void setRevengeTarget(EntityLivingBase target);

	public void setCustomer(Player player);

	public Player getCustomer();

	public boolean isTrading();

	public void setLookingForHome();

	public Villager createChild(Ageable p_90011_1_);
}
