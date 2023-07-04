package com.github.brianmath.t17;

import java.util.ArrayList;
import java.util.List;

public class Lanchonete {
	private String nome;
	private List<Sanduiche> sanduiche;

	public Lanchonete(String nome) {
		this.nome = nome;
		this.sanduiche = new ArrayList<Sanduiche>();
	}

	public String getNome() {
		return this.nome;
	}

	public List<Sanduiche> getSanduiche() {
		return this.sanduiche;
	}

	public void adicionarSanduiche(Sanduiche sanduiche) {
		this.sanduiche.add(sanduiche);
	}

	public void removerSanduiche(Sanduiche sanduiche) {
		this.sanduiche.remove(sanduiche);
	}
}
