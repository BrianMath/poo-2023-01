package com.github.brianmath.t17;

import java.util.ArrayList;
import java.util.List;

public class Computador {
	private String numSerie;
	private List<Dispositivo> dispositivos;

	public Computador(String numSerie) {
		this.numSerie = numSerie;
		this.dispositivos = new ArrayList<Dispositivo>();
	}

	public String getNumSerie() {
		return this.numSerie;
	}

	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

	public List<Dispositivo> getDispositivos() {
		return this.dispositivos;
	}

	public void adicionarDispositivo(Dispositivo dispositivo) {
		this.dispositivos.add(dispositivo);
	}

	public void removerDispositivo(Dispositivo dispositivo) {
		this.dispositivos.remove(dispositivo);
	}
}
