package com.github.brianmath.t22;

import java.util.List;

public class Calendario {
	private List<Data> datasAbertura;

	public Calendario(List<Data> datasAbertura) {
		this.datasAbertura = datasAbertura;
	}

	public List<Data> getDatasAbertura() {
		return this.datasAbertura;
	}

	public void adicionarDataAbertura(Data data) {
		this.datasAbertura.add(data);
	}

	public void removerDataAbertura(Data data) {
		this.datasAbertura.remove(data);
	}
}
