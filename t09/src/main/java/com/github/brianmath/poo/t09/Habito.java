package com.github.brianmath.t09;

public class Habito {
	private String descricao;
	private Pessoa pessoa;

	public Habito(String descricao, Pessoa pessoa) {
		this.descricao = descricao;
		this.pessoa = pessoa;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Pessoa getPessoa() {
		return this.pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}
