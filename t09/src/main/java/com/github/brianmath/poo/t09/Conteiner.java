package com.github.brianmath.t09;

import java.util.ArrayList;
import java.util.List;

public class Conteiner extends Elemento {
	private List<Elemento> elementos;

	public Conteiner() {
		super();
		this.elementos = new ArrayList<Elemento>();
	}

	public List<Elemento> getElementos() {
		return this.elementos;
	}

	public void adicionarElemento(Elemento elemento) {
		this.elementos.add(elemento);
	}

	public void removerElemento(Elemento elemento) {
		this.elementos.remove(elemento);
	}
}
