package com.github.brianmath.t19;

import java.util.ArrayList;
import java.util.List;

public class Calendario {
	private String ano;
	private List<Dia> feriados;
	private List<Dia> datasImportantes;

	public Calendario(String ano, List<Dia> feriados, List<Dia> datasImportantes) {
		this.ano = ano;
		this.feriados = feriados;
		this.datasImportantes = datasImportantes;
	}

	public String getAno() {
		return this.ano;
	}

	public List<Dia> getFeriados() {
		return this.feriados;
	}

	public void adicionarFeriado(Dia feriado) {
		this.feriados.add(feriado);
	}

	public void removerFeriado(Dia feriado) {
		this.feriados.remove(feriado);
	}

	public void adicionarDataImportante(Dia dataImportante) {
		this.datasImportantes.add(dataImportante);
	}

	public void removerDataImportante(Dia dataImportante) {
		this.datasImportantes.remove(dataImportante);
	}
}
