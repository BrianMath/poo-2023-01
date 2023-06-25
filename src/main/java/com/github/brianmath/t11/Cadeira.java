package com.github.brianmath.t11;

public class Cadeira {
	private Pessoa dono;

	public Cadeira(Pessoa dono) {
		this.dono = dono;
	}

	public Pessoa getDono() {
		return dono;
	}

	public void setDono(Pessoa dono) {
		this.dono = dono;
	}
}
