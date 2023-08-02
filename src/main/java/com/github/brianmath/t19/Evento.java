package com.github.brianmath.t19;

public class Evento {
	private Dia dia;
	private String descricao;

	public Evento(Dia dia, String descricao) {
		this.dia = dia;
		this.descricao = descricao;
	}

	public Dia getDia() {
		return this.dia;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
