package com.github.brianmath.t19;

import java.util.ArrayList;
import java.util.List;

public class Passageiro {
	private String nome;
	private List<Viagem> viagens;

	public Passageiro(String nome) {
		this.nome = nome;
		this.viagens = new ArrayList<Viagem>();
	}

	public String getNome() {
		return this.nome;
	}

	public List<Viagem> getViagens() {
		return this.viagens;
	}

	public void adicionarViagem(Viagem viagem) {
		this.viagens.add(viagem);
	}

	public void removerViagem(Viagem viagem) {
		this.viagens.remove(viagem);
	}
}
