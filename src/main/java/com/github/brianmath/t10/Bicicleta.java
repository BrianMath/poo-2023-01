package com.github.brianmath.t10;

public class Bicicleta {
	private double preco;
	private String cor;
	private int anoFabricacao;
	private Cliente dono;

	public Bicicleta(double preco, String cor, int anoFabricacao, Cliente dono) {
		this.preco = preco;
		this.cor = cor;
		this.anoFabricacao = anoFabricacao;
		this.dono = dono;
	}

	public double getPreco() {
		return this.preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getCor() {
		return this.cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAnoFabricacao() {
		return this.anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public Cliente getDono() {
		return this.dono;
	}

	public void setDono(Cliente dono) {
		this.dono = dono;
	}
}
