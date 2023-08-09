package com.github.brianmath.t22;

public class Trabalhador {
	private Pessoa pessoa;
	private Posto posto;

	public Trabalhador(Pessoa pessoa, Posto posto) {
		this.pessoa = pessoa;
		this.posto = posto;
	}

	public Pessoa getPessoa() {
		return this.pessoa;
	}

	public Posto getPosto() {
		return this.posto;
	}
}
