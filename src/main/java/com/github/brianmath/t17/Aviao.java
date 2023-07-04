package com.github.brianmath.t17;

import java.util.ArrayList;
import java.util.List;

public class Aviao {
	private String modelo;
	private int capacidade;
	private List<Voo> voos;
	private List<Lugar> lugares;

	public Aviao(String modelo, int capacidade, Lugar lugar) {
		this.modelo = modelo;
		this.capacidade = capacidade;
		this.voos = new ArrayList<Voo>();
		
		this.lugares = new ArrayList<Lugar>();
		this.lugares.add(lugar);
	}

	public String getModelo() {
		return this.modelo;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public List<Voo> getVoos() {
		return this.voos;
	}

	public void adicionarVoo(Voo voo) {
		this.voos.add(voo);
	}

	public void removerVoo(Voo voo) {
		this.voos.remove(voo);
	}

	public List<Lugar> getLugares() {
		return this.lugares;
	}

	public void adicionarLugar(Lugar lugar) {
		this.lugares.add(lugar);
	}

	public void removerLugar(Lugar lugar) {
		this.lugares.remove(lugar);
	}
}
