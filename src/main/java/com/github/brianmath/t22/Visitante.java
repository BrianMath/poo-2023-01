package com.github.brianmath.t22;

import java.util.List;

public abstract class Visitante {
	private Pessoa pessoa;
	private List<Crianca> criancas;

	public Visitante(Pessoa pessoa, List<Crianca> criancas) {
		this.pessoa = pessoa;
		this.criancas = criancas;
	}

	protected List<Crianca> getCriancas() {
		return this.criancas;
	}
}
