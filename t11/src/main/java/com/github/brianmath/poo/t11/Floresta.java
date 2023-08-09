package com.github.brianmath.t11;

import java.util.ArrayList;
import java.util.List;

public class Floresta {
	private List<Arvore> arvores;

	public Floresta() {
		this.arvores = new ArrayList<Arvore>();
	}

	public List<Arvore> getArvores() {
		return arvores;
	}

	public void adicionarArvore(Arvore arvore) {
		this.arvores.add(arvore);
	}

	public void removerArvore(Arvore arvore) {
		this.arvores.remove(arvore);
	}
}
