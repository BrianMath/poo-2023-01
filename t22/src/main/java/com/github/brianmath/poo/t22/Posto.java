package com.github.brianmath.t22;

public class Posto {
	private Policia policia;
	private Justica justica;
	private int identificacao;

	public Posto(Policia policia, Justica justica, int identificacao) {
		this.policia = policia;
		this.justica = justica;
		this.identificacao = identificacao;
	}
	
	public Policia getPolicia() {
		return this.policia;
	}
	
	public Justica getJustica() {
		return this.justica;
	}

	public int getIdentificacao() {
		return this.identificacao;
	}
}
