package com.github.brianmath.t19;

import java.util.ArrayList;
import java.util.List;

public class Viagem {
	private Onibus onibus;
	private List<Passageiro> passageiros;

	public Viagem(Onibus onibus) {
		this.onibus = onibus;
		this.passageiros = new ArrayList<Passageiro>();
	}

	public Onibus getOnibus() {
		return this.onibus;
	}

	public List<Passageiro> getPassageiros() {
		return this.passageiros;
	}

	public void adicionarPassageiro(Passageiro passageiro) {
		this.passageiros.add(passageiro);
	}

	public void removerPassageiro(Passageiro passageiro) {
		this.passageiros.remove(passageiro);
	}
}
