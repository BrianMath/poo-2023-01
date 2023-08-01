package com.github.brianmath.t19;

import java.util.ArrayList;
import java.util.List;

public class Software {
	private List<Versao> versoes;

	public Software() {
		this.versoes = new ArrayList<Versao>();
	}

	public List<Versao> getVersoes() {
		return this.versoes;
	}

	public void adicionarVersao(Versao versao) {
		this.versoes.add(versao);
	}
}
