package com.github.brianmath.t09;

public class ListaDePedidos {
	private Viagem viagem;
	private Armazem armazem;

	public ListaDePedidos(Viagem viagem, Armazem armazem) {
		this.viagem = viagem;
		this.armazem = armazem;
	}

	public Viagem getViagem() {
		return this.viagem;
	}

	public void setViagem(Viagem viagem) {
		this.viagem = viagem;
	}

	public Armazem getArmazem() {
		return this.armazem;
	}

	public void setArmazem(Armazem armazem) {
		this.armazem = armazem;
	}
}
