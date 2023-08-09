package com.github.brianmath.t17;

public class Pedido {
	private Garconete garconete;
	private Item item;

	public Pedido(Garconete garconete, Item item) {
		this.garconete = garconete;
		this.item = item;
	}

	public Garconete getGarconete() {
		return this.garconete;
	}

	public Item getItem() {
		return this.item;
	}
}
