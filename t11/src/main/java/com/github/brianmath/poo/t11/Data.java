package com.github.brianmath.t11;

public class Data {
	private Periodo inicio;
	private Periodo fim;

	public Data(Periodo inicio, Periodo fim) {
		this.inicio = inicio;
		this.fim = fim;
	}

	public Periodo getInicio() {
		return inicio;
	}

	public void setInicio(Periodo inicio) {
		this.inicio = inicio;
	}

	public Periodo getFim() {
		return fim;
	}

	public void setFim(Periodo fim) {
		this.fim = fim;
	}
}
