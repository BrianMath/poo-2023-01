package com.github.brianmath.t08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Curva {
	private List<Ponto> pontos;

	public Curva() {
		this.pontos = new ArrayList<>();
	}

	public List<Ponto> getPontos() {
		return this.pontos;
	}

	public void addPonto(Ponto ponto) {
		this.pontos.add(ponto);
		Collections.sort(this.pontos, Comparator.comparingDouble(Ponto::getX));
	}
}
