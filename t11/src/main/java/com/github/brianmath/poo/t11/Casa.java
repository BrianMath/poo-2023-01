package com.github.brianmath.t11;

import java.util.ArrayList;
import java.util.List;

public class Casa {
	private List<Quarto> quartos;
	private List<Sala> salas;
	private List<Garagem> garagens;
	private List<Area> areas;
	private List<Banheiro> banheiros;

	public Casa() {
		this.quartos = new ArrayList<Quarto>();
		this.salas = new ArrayList<Sala>();
		this.garagens = new ArrayList<Garagem>();
		this.areas = new ArrayList<Area>();
		this.banheiros = new ArrayList<Banheiro>();
	}

	public List<Quarto> getQuartos() {
		return this.quartos;
	}

	public void adicionarQuarto(Quarto quarto) {
		this.quartos.add(quarto);
	}

	public void removerQuarto(Quarto quarto) {
		this.quartos.remove(quarto);
	}

	public List<Sala> getSalas() {
		return this.salas;
	}

	public void adicionarSala(Sala sala) {
		this.salas.add(sala);
	}

	public void removerSala(Sala sala) {
		this.salas.remove(sala);
	}

	public List<Garagem> getGaragens() {
		return this.garagens;
	}

	public void adicionarGaragem(Garagem garagem) {
		this.garagens.add(garagem);
	}

	public void removerGaragem(Garagem garagem) {
		this.garagens.remove(garagem);
	}

	public List<Area> getAreas() {
		return this.areas;
	}

	public void adicionarArea(Area area) {
		this.areas.add(area);
	}

	public void removerArea(Area area) {
		this.areas.remove(area);
	}

	public List<Banheiro> getBanheiros() {
		return this.banheiros;
	}

	public void adicionarBanheiro(Banheiro banheiro) {
		this.banheiros.add(banheiro);
	}

	public void removerBanheiro(Banheiro banheiro) {
		this.banheiros.remove(banheiro);
	}
}
