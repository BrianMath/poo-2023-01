package com.github.brianmath.t19;

public class Jogador {
	private String nome;
	private MaoJogador mao;

	public Jogador(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public MaoJogador getMaoJogador() {
		return this.mao;
	}

	public void setMao(MaoJogador mao) {
		this.mao = mao;
	}

	public void jogar(Monte monte) {
		Carta cartaComprada = monte.comprarCarta();
		Carta cartaSubstituida = this.mao.pegarCartaAleatoria();

		this.mao.adicionarCarta(cartaComprada);
		monte.adicionarCarta(cartaSubstituida);
	}
}
