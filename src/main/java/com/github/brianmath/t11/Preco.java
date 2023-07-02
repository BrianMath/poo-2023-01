package com.github.brianmath.t11;

public class Preco {
	private double valor;
	private String moeda;

	public Preco(double valor, String moeda) {
		this.valor = valor;
		this.moeda = moeda;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getMoeda() {
		return moeda;
	}

	public void setMoeda(String moeda) {
		this.moeda = moeda;
	}
}
