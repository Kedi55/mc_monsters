package net.mcreator.mcmonsters.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.SmallFireball;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.mcmonsters.network.McMonstersModVariables;
import net.mcreator.mcmonsters.McMonstersMod;

public class RP1Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double aaa = 0;
		if (McMonstersModVariables.MapVariables.get(world).Ghost == true) {
			if (McMonstersModVariables.MapVariables.get(world).rcooldown == false) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
										_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
										_ent.getDisplayName(), _ent.level.getServer(), _ent),
								"execute at @s as @e[distance=0.1..10] run effect give @s levitation 5 2 true");
					}
				}
				McMonstersModVariables.MapVariables.get(world).rcooldown = true;
				McMonstersModVariables.MapVariables.get(world).syncData(world);
				McMonstersMod.queueServerWork(180, () -> {
					McMonstersModVariables.MapVariables.get(world).rcooldown = false;
					McMonstersModVariables.MapVariables.get(world).syncData(world);
				});
			}
		}
		if (McMonstersModVariables.MapVariables.get(world).Dragon == true) {
			if (McMonstersModVariables.MapVariables.get(world).rcooldown == false) {
				McMonstersModVariables.MapVariables.get(world).rcooldown = true;
				McMonstersModVariables.MapVariables.get(world).syncData(world);
				{
					Entity _shootFrom = entity;
					Level projectileLevel = _shootFrom.level;
					if (!projectileLevel.isClientSide()) {
						Projectile _entityToSpawn = new SmallFireball(EntityType.SMALL_FIREBALL, projectileLevel);
						_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
						_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 4, 6);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
				}
				{
					Entity _shootFrom = entity;
					Level projectileLevel = _shootFrom.level;
					if (!projectileLevel.isClientSide()) {
						Projectile _entityToSpawn = new SmallFireball(EntityType.SMALL_FIREBALL, projectileLevel);
						_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
						_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 4, 6);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
				}
				{
					Entity _shootFrom = entity;
					Level projectileLevel = _shootFrom.level;
					if (!projectileLevel.isClientSide()) {
						Projectile _entityToSpawn = new SmallFireball(EntityType.SMALL_FIREBALL, projectileLevel);
						_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
						_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 4, 6);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
				}
				{
					Entity _shootFrom = entity;
					Level projectileLevel = _shootFrom.level;
					if (!projectileLevel.isClientSide()) {
						Projectile _entityToSpawn = new SmallFireball(EntityType.SMALL_FIREBALL, projectileLevel);
						_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
						_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 4, 6);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
				}
				{
					Entity _shootFrom = entity;
					Level projectileLevel = _shootFrom.level;
					if (!projectileLevel.isClientSide()) {
						Projectile _entityToSpawn = new SmallFireball(EntityType.SMALL_FIREBALL, projectileLevel);
						_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
						_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 4, 6);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
				}
				{
					Entity _shootFrom = entity;
					Level projectileLevel = _shootFrom.level;
					if (!projectileLevel.isClientSide()) {
						Projectile _entityToSpawn = new SmallFireball(EntityType.SMALL_FIREBALL, projectileLevel);
						_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
						_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 4, 6);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
				}
				{
					Entity _shootFrom = entity;
					Level projectileLevel = _shootFrom.level;
					if (!projectileLevel.isClientSide()) {
						Projectile _entityToSpawn = new SmallFireball(EntityType.SMALL_FIREBALL, projectileLevel);
						_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
						_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 4, 6);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
				}
				{
					Entity _shootFrom = entity;
					Level projectileLevel = _shootFrom.level;
					if (!projectileLevel.isClientSide()) {
						Projectile _entityToSpawn = new SmallFireball(EntityType.SMALL_FIREBALL, projectileLevel);
						_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
						_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 4, 6);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
				}
				{
					Entity _shootFrom = entity;
					Level projectileLevel = _shootFrom.level;
					if (!projectileLevel.isClientSide()) {
						Projectile _entityToSpawn = new SmallFireball(EntityType.SMALL_FIREBALL, projectileLevel);
						_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
						_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 4, 6);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
				}
				{
					Entity _shootFrom = entity;
					Level projectileLevel = _shootFrom.level;
					if (!projectileLevel.isClientSide()) {
						Projectile _entityToSpawn = new SmallFireball(EntityType.SMALL_FIREBALL, projectileLevel);
						_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
						_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 4, 6);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
				}
				McMonstersMod.queueServerWork(300, () -> {
					McMonstersModVariables.MapVariables.get(world).rcooldown = false;
					McMonstersModVariables.MapVariables.get(world).syncData(world);
				});
			}
		}
	}
}
