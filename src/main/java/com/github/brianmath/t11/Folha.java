package com.github.brianmath.t11;

public class Folha {
	private TipoFolha tipo;

	public Folha(TipoFolha tipo) {
		this.tipo = tipo;
	}

	public TipoFolha getTipo() {
		return tipo;
	}

	public void setTipo(TipoFolha tipo) {
		this.tipo = tipo;
	}
}
