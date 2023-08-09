package com.github.brianmath.t19;

import java.util.List;

public abstract class ConfiguracaoCartas {
	protected List<Carta> cartas;

	public List<Carta> getCartas() {
		return this.cartas;
	}

	public void adicionarCarta(Carta carta) {
		this.cartas.add(carta);
	}

	public void removerCarta(Carta carta) {
		this.cartas.remove(carta);
	}
}