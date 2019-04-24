package net.tslat.aoa3.client.render.entities.projectiles.staff;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.tslat.aoa3.client.fx.FXFlickeringFluffyTrail;
import net.tslat.aoa3.entity.projectiles.staff.EntityNightmareFall;
import net.tslat.aoa3.library.Enums;

import javax.annotation.Nullable;

public class NightmareFallRenderer extends Render<EntityNightmareFall> {
	private final ResourceLocation texture;

	public NightmareFallRenderer(final RenderManager manager, final ResourceLocation textureResource) {
		super(manager);
		texture = textureResource;
	}

	@Override
	public void doRender(EntityNightmareFall entity, double x, double y, double z, float entityYaw, float partialTicks) {
		for (int i = 0; i < 8; i++) {
			new FXFlickeringFluffyTrail(entity.world, entity.posX, entity.posY, entity.posZ, 0, 0, 0, Enums.RGBIntegers.PURPLE, 3).create();
		}
	}

	@Nullable
	@Override
	protected ResourceLocation getEntityTexture(EntityNightmareFall entity) {
		return texture;
	}
}