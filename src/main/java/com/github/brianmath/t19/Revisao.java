package com.github.brianmath.t19;

public class Revisao extends Versao {
	private Versao anterior;

	public Revisao(String numVersao) {
		super(numVersao);
	}

	public Versao getAnterior() {
		return anterior;
	}

	public void adicionarAnterior(Versao anterior) {
		this.anterior = anterior;
	}
}
