package com.github.brianmath.t22;

import java.util.List;

public class Parente extends Visitante {
	private String parentesco;

	public Parente(Pessoa pessoa, List<Crianca> criancas, String parentesco) {
		super(pessoa, criancas);
		this.parentesco = parentesco;
	}

	public String getParentesco() {
		return this.parentesco;
	}
}
