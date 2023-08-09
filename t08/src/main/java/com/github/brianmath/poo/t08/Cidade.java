package com.github.brianmath.t08;

public class Cidade {
	private String nome;
	private Pais pais;
	private boolean isCapital;

	public Cidade(String nome) {
		this.nome = nome;
		this.isCapital = false;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pais getPais() {
		return this.pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public boolean isCapital() {
		return this.isCapital;
	}

	public void setIsCapital(boolean isCapital) {
		this.isCapital = isCapital;
	}
}
