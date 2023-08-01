package com.github.brianmath.t19;

import java.util.List;

public class Versao {
	private String numVersao;
	private Revisao proximo;

	public Versao(String numVersao) {
		this.numVersao = numVersao;
	}

	public String getNumVersao() {
		return numVersao;
	}

	public Revisao getProximo() {
		return proximo;
	}

	public void adicionarProximo(Revisao revisao) {
		this.proximo = revisao;
	}
}
