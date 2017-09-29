package ch.sebi.libgdxtestproject.obj;

import com.badlogic.gdx.math.Vector2;

/**
 * Created by Sebastian on 29.09.2017.
 */
public abstract class GObject {
	private Vector2 position;

	public abstract void render();

	public Vector2 getPosition() {
		return position;
	}

	protected void setPosition(Vector2 position) {
		this.position = position;
	}
}
