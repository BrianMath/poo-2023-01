package com.github.brianmath.t11;

import java.util.ArrayList;
import java.util.List;

public class Palavra {
	private List<Letra> letras;

	public Palavra() {
		this.letras = new ArrayList<Letra>();
	}

	public List<Letra> getLetras() {
		return letras;
	}

	public void adicionarLetra(Letra letra) {
		this.letras.add(letra);
	}

	public void removerLetra(Letra letra) {
		this.letras.remove(letra);
	}
}
