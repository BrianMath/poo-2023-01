package com.github.brianmath.t19;

import java.util.Collections;

public class Monte extends ConfiguracaoCartas {
	public void embaralharCartas() {
		Collections.shuffle(this.cartas);
	}

	public Carta comprarCarta() {
		return this.cartas.remove(0);
	}
}
