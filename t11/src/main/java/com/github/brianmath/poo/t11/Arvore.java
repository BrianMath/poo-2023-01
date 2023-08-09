package com.github.brianmath.t11;

import java.util.ArrayList;
import java.util.List;

public class Arvore {
	private List<Floresta> florestas;
	private List<Folha> folhas;

	public Arvore() {
		this.florestas = new ArrayList<Floresta>();
		this.folhas = new ArrayList<Folha>();
	}

	public List<Floresta> getFlorestas() {
		return florestas;
	}

	public void adicionarFloresta(Floresta floresta) {
		this.florestas.add(floresta);
	}

	public void removerFloresta(Floresta floresta) {
		this.florestas.remove(floresta);
	}

	public List<Folha> getFolhas() {
		return folhas;
	}

	public void adicionarFolha(Folha folha) {
		this.folhas.add(folha);
	}

	public void removerFolha(Folha folha) {
		this.folhas.remove(folha);
	}
}
