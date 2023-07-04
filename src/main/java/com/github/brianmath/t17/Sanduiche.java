package com.github.brianmath.t17;

public class Sanduiche {
	private String nome;
	private Lanchonete lanchonete;
	private Item item;

	public Sanduiche(String nome, Lanchonete lanchonete, Item item) {
		this.nome = nome;
		this.lanchonete = lanchonete;
		this.item = item;
	}

	public String getNome() {
		return this.nome;
	}

	public Lanchonete getLanchonete() {
		return this.lanchonete;
	}

	public Item getItem() {
		return this.item;
	}
}
