package com.github.brianmath.t08;

import java.util.ArrayList;
import java.util.List;

public class Texto {
	private String texto;
	private List<Paragrafo> paragrafos;

	public Texto(String texto) {
		this.texto = texto;
		this.paragrafos = new ArrayList<>();
	}

	public void adicionarParagrafos(Paragrafo paragrafo) {
		this.paragrafos.add(paragrafo);
	}
}
