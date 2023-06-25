package com.github.brianmath.t10;

import java.util.ArrayList;
import java.util.List;

public class Percurso {
	private double distancia;
	private String lugarInicio;
	private String lugarFim;
	private List<Familia> familias;

	public Percurso(double distancia, String lugarInicio, String lugarFim) {
		this.distancia = distancia;
		this.lugarInicio = lugarInicio;
		this.lugarFim = lugarFim;
		this.familias = new ArrayList<Familia>();
	}

	public double getDistancia() {
		return this.distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public String getLugarInicio() {
		return this.lugarInicio;
	}

	public void setLugarInicio(String lugarInicio) {
		this.lugarInicio = lugarInicio;
	}

	public String getLugarFim() {
		return this.lugarFim;
	}

	public void setLugarFim(String lugarFim) {
		this.lugarFim = lugarFim;
	}

	public List<Familia> getFamilias() {
		return this.familias;
	}

	public void adicionarFamilia(Familia familia) {
		this.familias.add(familia);
	}

	public void removerFamilia(Familia familia) {
		this.familias.remove(familia);
	}
}
