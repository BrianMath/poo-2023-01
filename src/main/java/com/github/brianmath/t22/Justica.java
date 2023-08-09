package com.github.brianmath.t22;

public class Justica extends Trabalhador {
	private String cargo;

	public Justica(Pessoa pessoa, Posto posto, String cargo) {
		super(pessoa, posto);

		this.cargo = cargo;
	}

	public String getCargo() {
		return this.cargo;
	}
}
