package com.github.brianmath.t18;

import java.util.ArrayList;
import java.util.List;

public class Partida {
	private List<Lance> lances;
	private String nome;

	public Partida(String nome) {
		this.lances = new ArrayList<Lance>();
		this.nome = nome;
	}

	public void adicionarLance(Lance lance) {
		if (lance == null) {
			throw new IllegalArgumentException("Lance inválido!");
		}

		this.lances.add(lance);
	}

	@Override
	public String toString() {
		return "Partida(" + this.nome + ")\n" + 
			"Lances: " + this.lances + "\n";
	}
}
