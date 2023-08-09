package com.github.brianmath.t11;

import java.util.ArrayList;
import java.util.List;

public class Frase {
	private List<Palavra> palavras;

	public Frase() {
		this.palavras = new ArrayList<Palavra>();
	}

	public List<Palavra> getPalavras() {
		return palavras;
	}

	public void adicionarPalavra(Palavra palavra) {
		this.palavras.add(palavra);
	}

	public void removerPalavra(Palavra palavra) {
		this.palavras.remove(palavra);
	}
}
