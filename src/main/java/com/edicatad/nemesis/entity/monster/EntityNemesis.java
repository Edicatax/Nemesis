package com.edicatad.nemesis.entity.monster;

import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class EntityNemesis extends EntityMob{

	public EntityNemesis(World worldIn) {
		super(worldIn);
		// TODO Auto-generated constructor stub
	}

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
	public void onLivingUpdate(){
		super.onLivingUpdate();
	}
}
