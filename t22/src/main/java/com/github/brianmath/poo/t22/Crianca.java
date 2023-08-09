package com.github.brianmath.t22;

import java.util.List;

public class Crianca extends Visitante {
	private List<Visitante> acompanhantes;

	public Crianca(Pessoa pessoa, List<Visitante> acompanhantes) {
		super(pessoa, null);
		this.acompanhantes = acompanhantes;
	}

	private List<Visitante> getAcompanhantes() {
		return this.acompanhantes;
	}
}
