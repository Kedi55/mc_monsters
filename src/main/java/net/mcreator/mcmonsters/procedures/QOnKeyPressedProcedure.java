package net.mcreator.mcmonsters.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.projectile.SmallFireball;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.mcmonsters.network.McMonstersModVariables;
import net.mcreator.mcmonsters.McMonstersMod;

public class QOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (McMonstersModVariables.MapVariables.get(world).Ghost == true) {
			if (McMonstersModVariables.MapVariables.get(world).qcooldown == false) {
				if (entity instanceof ServerPlayer _player)
					_player.setGameMode(GameType.SPECTATOR);
				McMonstersMod.queueServerWork(140, () -> {
					if (entity instanceof ServerPlayer _player)
						_player.setGameMode(GameType.SURVIVAL);
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 140, 1));
				});
				McMonstersModVariables.MapVariables.get(world).qcooldown = true;
				McMonstersModVariables.MapVariables.get(world).syncData(world);
				McMonstersMod.queueServerWork(400, () -> {
					McMonstersModVariables.MapVariables.get(world).qcooldown = false;
					McMonstersModVariables.MapVariables.get(world).syncData(world);
				});
			}
		}
		if (McMonstersModVariables.MapVariables.get(world).Dragon == true) {
			if (McMonstersModVariables.MapVariables.get(world).qcooldown == false) {
				{
					Entity _shootFrom = entity;
					Level projectileLevel = _shootFrom.level;
					if (!projectileLevel.isClientSide()) {
						Projectile _entityToSpawn = new SmallFireball(EntityType.SMALL_FIREBALL, projectileLevel);
						_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
						_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 6, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
				}
				McMonstersModVariables.MapVariables.get(world).qcooldown = true;
				McMonstersModVariables.MapVariables.get(world).syncData(world);
				McMonstersMod.queueServerWork(120, () -> {
					McMonstersModVariables.MapVariables.get(world).qcooldown = false;
					McMonstersModVariables.MapVariables.get(world).syncData(world);
				});
			}
		}
		if (McMonstersModVariables.MapVariables.get(world).Cat == true) {
			if (McMonstersModVariables.MapVariables.get(world).qcooldown == false) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 100, 3));
				McMonstersModVariables.MapVariables.get(world).qcooldown = true;
				McMonstersModVariables.MapVariables.get(world).syncData(world);
				McMonstersMod.queueServerWork(220, () -> {
					McMonstersModVariables.MapVariables.get(world).qcooldown = false;
					McMonstersModVariables.MapVariables.get(world).syncData(world);
				});
			}
		}
<<<<<<< Updated upstream
		if (McMonstersModVariables.MapVariables.get(world).Cat == true) {
			if (McMonstersModVariables.MapVariables.get(world).qcooldown == false) {
				McMonstersModVariables.MapVariables.get(world).qcooldown = true;
				McMonstersModVariables.MapVariables.get(world).syncData(world);
=======
		if (McMonstersModVariables.MapVariables.get(world).Shadow == true) {
			if (McMonstersModVariables.MapVariables.get(world).qcooldown == false) {
>>>>>>> Stashed changes
				{
					Entity _ent = entity;
					_ent.teleportTo(
							(entity.level.clip(
									new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(20)),
											ClipContext.Block.OUTLINE, ClipContext.Fluid.ANY, entity))
									.getBlockPos().getX()),
							(entity.level.clip(
									new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(20)),
											ClipContext.Block.OUTLINE, ClipContext.Fluid.ANY, entity))
									.getBlockPos().getY()),
							(entity.level.clip(
									new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(20)),
											ClipContext.Block.OUTLINE, ClipContext.Fluid.ANY, entity))
									.getBlockPos().getZ()));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(
								(entity.level.clip(
										new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(20)),
												ClipContext.Block.OUTLINE, ClipContext.Fluid.ANY, entity))
										.getBlockPos().getX()),
								(entity.level.clip(
										new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(20)),
												ClipContext.Block.OUTLINE, ClipContext.Fluid.ANY, entity))
										.getBlockPos().getY()),
								(entity.level.clip(
										new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(20)),
												ClipContext.Block.OUTLINE, ClipContext.Fluid.ANY, entity))
										.getBlockPos().getZ()),
								_ent.getYRot(), _ent.getXRot());
				}
<<<<<<< Updated upstream
				McMonstersMod.queueServerWork(120, () -> {
=======
				McMonstersModVariables.MapVariables.get(world).qcooldown = true;
				McMonstersModVariables.MapVariables.get(world).syncData(world);
				McMonstersMod.queueServerWork(140, () -> {
>>>>>>> Stashed changes
					McMonstersModVariables.MapVariables.get(world).qcooldown = false;
					McMonstersModVariables.MapVariables.get(world).syncData(world);
				});
			}
		}
	}
}
