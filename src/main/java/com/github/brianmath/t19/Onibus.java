package com.github.brianmath.t19;

import java.util.ArrayList;
import java.util.List;

public class Onibus {
	private String id;
	private List<Viagem> viagens;

	public Onibus(String id) {
		this.id = id;
		this.viagens = new ArrayList<Viagem>();
	}

	public String getId() {
		return this.id;
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
