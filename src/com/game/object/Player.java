package com.game.object;

import java.awt.Graphics;
import java.awt.Rectangle;

import com.game.object.util.Handler;
import com.game.object.util.ObjectId;

public class Player extends GameObject {
	private static final float WIDTH = 16;
	private static final float HEIGHT = 32;
	
	private Handler handler;
	
	public Player(float x, float y, int scale, Handler handler) {
		super(x, y, ObjectId.Player, WIDTH, HEIGHT, scale);
		this.handler = handler;
	}

	@Override
	public void tick() {
		setX(getVelX() + getX());
		setY(getVelY() + getY());
		applyGravity();
	}

	@Override
	public void render(Graphics g) {
		
	}

	@Override
	public Rectangle getBounds() {
		return null;
	}
}










