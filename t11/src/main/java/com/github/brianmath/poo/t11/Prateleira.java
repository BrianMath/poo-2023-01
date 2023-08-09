package com.github.brianmath.t11;

import java.util.ArrayList;
import java.util.List;

public class Prateleira {
	private List<Compartimento> compartimentos;

	public Prateleira() {
		this.compartimentos = new ArrayList<Compartimento>();
	}

	public List<Compartimento> getCompartimentos() {
		return compartimentos;
	}

	public void adicionarCompartimento(Compartimento compartimento) {
		this.compartimentos.add(compartimento);
	}

	public void removerCompartimento(Compartimento compartimento) {
		this.compartimentos.remove(compartimento);
	}
}
