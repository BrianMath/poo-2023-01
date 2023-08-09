package com.github.brianmath.t22;

public class Policia extends Trabalhador {
	private String patente;

	public Policia(Pessoa pessoa, Posto posto, String patente) {
		super(pessoa, posto);

		this.patente = patente;
	}

	public String getPatente() {
		return this.patente;
	}
}
