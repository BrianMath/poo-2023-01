package com.github.brianmath.t17;

public class Voo {
	private Tripulacao tripulacao;
	private Operacao operacao;
	private Aviao aviao;

	public Voo(Tripulacao tripulacao, Operacao operacao, Aviao aviao) {
		this.tripulacao = tripulacao;
		this.operacao = operacao;
		this.aviao = aviao;
	}

	public Tripulacao getTripulacao() {
		return this.tripulacao;
	}

	public void setTripulacao(Tripulacao tripulacao) {
		this.tripulacao = tripulacao;
	}

	public Operacao getOperacao() {
		return this.operacao;
	}

	public Aviao getAviao() {
		return this.aviao;
	}

	public void setAviao(Aviao aviao) {
		this.aviao = aviao;
	}
}
