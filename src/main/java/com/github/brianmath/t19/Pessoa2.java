package com.github.brianmath.t19;

import java.util.ArrayList;
import java.util.List;

public class Pessoa2 {
	private String nome;
	private List<Mesa> mesas;

	public Pessoa2(String nome) {
		this.nome = nome;
		this.mesas = new ArrayList<Mesa>();
	}

	public String getNome() {
		return nome;
	}

	public List<Mesa> getMesas() {
		return mesas;
	}

	public void adicionarMesa(Mesa mesa) {
		this.mesas.add(mesa);
		mesa.adicionarPessoa(this);
	}
}
