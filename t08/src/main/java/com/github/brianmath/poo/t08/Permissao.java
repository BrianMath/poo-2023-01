package com.github.brianmath.t08;

public class Permissao {
	private Grupo grupo;
	private Arquivo arquivo;

	public Permissao(Grupo grupo, Arquivo arquivo) {
		this.grupo = grupo;
		this.arquivo = arquivo;
	}

	public Grupo getGrupo() {
		return this.grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public Arquivo getArquivo() {
		return this.arquivo;
	}

	public void setArquivo(Arquivo arquivo) {
		this.arquivo = arquivo;
	}
}
