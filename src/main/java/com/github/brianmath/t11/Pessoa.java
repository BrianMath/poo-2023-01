package com.github.brianmath.t11;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	private String sexo;
	private List<Cadeira> cadeiras;

	public Pessoa(String sexo) {
		this.sexo = sexo;
		this.cadeiras = new ArrayList<Cadeira>();
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public List<Cadeira> getCadeiras() {
		return cadeiras;
	}

	public void adicionarCadeira(Cadeira cadeira) {
		this.cadeiras.add(cadeira);
		cadeira.setDono(this);
	}

	public void removerCadeira(Cadeira cadeira) {
		this.cadeiras.remove(cadeira);
	}
}
