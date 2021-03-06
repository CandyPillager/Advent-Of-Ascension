package net.tslat.aoa3.entity.mobs.abyss;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.LootSystemRegister;
import net.tslat.aoa3.common.registration.SoundsRegister;
import net.tslat.aoa3.entity.base.AoAMeleeMob;

import javax.annotation.Nullable;

public class EntityFiend extends AoAMeleeMob {
	public static final float entityWidth = 0.5625f;

	public EntityFiend(World world) {
		super(world, entityWidth, 1.5f);
	}

	@Override
	public float getEyeHeight() {
		return 1.375f;
	}

	@Override
	protected double getBaseKnockbackResistance() {
		return 0;
	}

	@Override
	protected double getBaseMaxHealth() {
		return 90;
	}

	@Override
	protected double getBaseMeleeDamage() {
		return 8.5;
	}

	@Override
	protected double getBaseMovementSpeed() {
		return 0.2875;
	}

	@Nullable
	@Override
	protected SoundEvent getAmbientSound() {
		return SoundsRegister.mobFiendLiving;
	}

	@Override
	protected SoundEvent getDeathSound() {
		return SoundsRegister.mobFiendDeath;
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return SoundsRegister.mobFiendHit;
	}

	@Nullable
	@Override
	protected ResourceLocation getLootTable() {
		return LootSystemRegister.entityFiend;
	}

	@Override
	protected void doMeleeEffect(Entity target) {
		if (target instanceof EntityLivingBase)
			((EntityLivingBase) target).addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, 150, 2, true, false));
	}
}
