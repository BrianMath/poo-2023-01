package com.github.brianmath.t19;

public class Linha1 {
	private Ponto1 p1;
	private Ponto1 p2;

	public Linha1() {
		this.p1 = new Ponto1();
		this.p2 = new Ponto1();
	}

	public Ponto1 getP1() {
		return this.p1;
	}

	public Ponto1 getP2() {
		return this.p2;
	}

	public void setP1(Ponto1 p1) {
		this.p1 = p1;
	}

	public void setP2(Ponto1 p2) {
		this.p2 = p2;
	}
}
