package ch.sebi.libgdxtestproject.obj;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;

/**
 * Created by Sebastian on 29.09.2017.
 * Represents a general object. This object will be updated by the {@link ObjectManager}
 */
public abstract class GObject {
	private ObjectManager parent;

	/**
	 * called from {@link ObjectManager#init()} which gets called from the {@link com.badlogic.gdx.Screen}
	 */
	public abstract void init();

	/**
	 * called from {@link ObjectManager#render(float)} which gets called from {@link com.badlogic.gdx.Screen#render(float)}
	 * @param delta
	 */
	public abstract void render(float delta);

	/**
	 * called from {@link ObjectManager#dispose()} which gets called from {@link Screen#dispose()}
	 */
	public abstract void dispose();


	/**
	 * Sets the parent of this GObject. This function is called from {@link ObjectManager#add(GObject)} when the object is added.
	 * @param parent
	 */
	protected void setParent(ObjectManager parent) {
		this.parent = parent;
	}

	/**
	 * Returns the parent of this object or null if it either isn't added to a parent or
	 * @return
	 */
	public ObjectManager getParent() {
		return parent;
	}

	/**
	 * Returns the world of its parent or if its parent is null (because it isn't set to an parent or it is the root object) it will return null.
	 * @return the world
	 */
	public World getWorld() {
		if(getParent() == null) return null;
		return getParent().getWorld();
	}

}
