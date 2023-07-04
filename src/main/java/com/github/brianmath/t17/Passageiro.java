package com.github.brianmath.t17;

public class Passageiro {
	private String nome;
	private String bilhete;

	public Passageiro(String nome, String bilhete) {
		this.nome = nome;
		this.bilhete = bilhete;
	}

	public String getNome() {
		return this.nome;
	}

	public String getBilhete() {
		return this.bilhete;
	}

	public void setBilhete(String bilhete) {
		this.bilhete = bilhete;
	}
}
