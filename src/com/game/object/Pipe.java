package com.game.object;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import com.game.gfx.Texture;
import com.game.main.Game;
import com.game.object.util.ObjectId;

public class Pipe extends GameObject {
	private Texture tex = Game.getTexture();
	private int index;
	private BufferedImage[] sprite;
	private boolean enterable;
	
	public Pipe(int x, int y, int width, int height, int scale, int index, boolean enterable) {
		super(x, y, ObjectId.Pipe, width, height, scale);
		this.enterable = enterable;
		this.index = index;
		sprite = tex.getPipe1();
	}

	@Override
	public void tick() {
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(sprite[index], (int) getX(), (int) getY(), (int) getWidth(), (int) getHeight(), null);
	}

	@Override
	public Rectangle getBounds() {
		return new Rectangle((int) getX(), (int) getY(), (int) getWidth(), (int) getHeight());
	}
	
}
