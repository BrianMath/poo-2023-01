package com.github.brianmath.t19;

import java.util.Random;

public class MaoJogador extends ConfiguracaoCartas {
	public boolean temCarta(Carta carta) {
		return this.cartas.contains(carta);
	}

	public Carta pegarCartaAleatoria() {
		Random random = new Random();
		return this.cartas.remove(random.nextInt(this.cartas.size()));
	}
}
