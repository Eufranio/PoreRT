package net.amigocraft.pore.implementation.entity;

import org.bukkit.entity.Zombie;

public class PoreZombie extends PoreMonster implements Zombie {

    // TODO: Bridge

	public PoreZombie(org.spongepowered.api.entity.LivingEntity handle) { //TODO: accept most specfific type
		super(handle);
	}

    @Override
    public boolean isBaby() {
        return false;
    }

    @Override
    public void setBaby(boolean flag) {

    }

    @Override
    public boolean isVillager() {
        return false;
    }

    @Override
    public void setVillager(boolean flag) {

    }
}