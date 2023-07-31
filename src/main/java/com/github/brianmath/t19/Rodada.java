package com.github.brianmath.t19;

import java.util.List;

public class Rodada {
	private List<Jogador> jogadores;
	private Monte monte;

	public Rodada(List<Jogador> jogadores, Monte monte) {
		this.jogadores = jogadores;
		this.monte = monte;
	}

	public void executar() {
		for (Jogador jogador : this.jogadores) {
			jogador.jogar(this.monte);
		}
	}
}
