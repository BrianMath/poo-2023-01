package com.github.brianmath.t18;

public class Jogador {
	private String nome;

	public Jogador(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	@Override
	public String toString() {
		return "Nome: " + getNome() + "\n";
	}
}
