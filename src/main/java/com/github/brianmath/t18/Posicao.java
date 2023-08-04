package com.github.brianmath.t18;

public class Posicao {
	private float x;
	private float y;

	public Posicao(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public float getX() {
		return this.x;
	}

	public float getY() {
		return this.y;
	}

	@Override
	public String toString() {
		return "Posição: (" + getX() + ", " + getY() + ")\n";
	}
}
