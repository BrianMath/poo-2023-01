package com.github.brianmath.t11;

public class Funcionario {
	private String nome;
	private boolean gerente;

	public Funcionario(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isGerente() {
		return this.gerente;
	}

	public void setGerente(boolean gerente) {
		this.gerente = gerente;
	}
}
