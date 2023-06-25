package com.github.brianmath.t11;

public class Carne {
	private Prestacao prestacao;
	private Compra compra;

	public Carne(Prestacao prestacao, Compra compra) {
		this.prestacao = prestacao;
		this.compra = compra;
	}

	public Prestacao getPrestacao() {
		return prestacao;
	}

	public void setPrestacao(Prestacao prestacao) {
		this.prestacao = prestacao;
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}
}
