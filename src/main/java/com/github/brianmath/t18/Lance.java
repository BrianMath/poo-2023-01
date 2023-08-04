package com.github.brianmath.t18;

public class Lance {
	private Peca peca;
	private Posicao origem;
	private Posicao destino;
	private Jogador jogador;

	public Lance(Peca peca, Posicao origem, Posicao destino, Jogador jogador) {
		this.peca = peca;
		this.origem = origem;
		this.destino = destino;
		this.jogador = jogador;
	}

	public Peca getPeca() {
		return this.peca;
	}

	public Posicao getOrigem() {
		return this.origem;
	}

	public Posicao getDestino() {
		return this.destino;
	}

	public Jogador getJogador() {
		return this.jogador;
	}

	@Override
	public String toString() {
		return "Lance {\n" + 
			"\tJogador: " + this.jogador + 
			"\tOrigem: " + this.origem + 
			"\tDestino: " + this.destino + 
			"\tPeça: " + this.peca + 
			"}\n";
	}
}
