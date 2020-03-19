package ca.compflip.minecraft.entity;

import org.lwjgl.util.vector.Vector3f;

import ca.compflip.minecraft.level.Level;

public abstract class Entity {
	public Vector3f position, rotation;
	protected Level level;
	
	public Entity(Level level) {
		this.level = level;
		position = new Vector3f(0, 0, 0);
		rotation = new Vector3f(0, 0, 0);
	}
	
	public abstract void tick();
}