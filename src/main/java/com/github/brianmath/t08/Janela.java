package com.github.brianmath.t08;

import java.util.ArrayList;
import java.util.List;

public class Janela {
	private List<ElementoDeInteracao> elementos;

	public Janela() {
		this.elementos = new ArrayList<>();
	}

	public List<ElementoDeInteracao> getElementos() {
		return this.elementos;
	}

	public void adicionarElemento(ElementoDeInteracao elemento) {
		this.elementos.add(elemento);
	}

	public void removerElemento(ElementoDeInteracao elemento) {
		this.elementos.remove(elemento);
	}
}
