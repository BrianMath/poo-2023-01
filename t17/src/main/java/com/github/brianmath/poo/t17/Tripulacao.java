package com.github.brianmath.t17;

import java.util.ArrayList;
import java.util.List;

public class Tripulacao {
	private Piloto piloto;
	private Copiloto copiloto;
	private List<Aeromoca> aeromocas;

	public Tripulacao(Piloto piloto, Copiloto copiloto) {
		this.piloto = piloto;
		this.copiloto = copiloto;
		this.aeromocas = new ArrayList<Aeromoca>();
	}

	public Piloto getPiloto() {
		return this.piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	public Copiloto getCopiloto() {
		return this.copiloto;
	}

	public void setCopiloto(Copiloto copiloto) {
		this.copiloto = copiloto;
	}

	public List<Aeromoca> getAeromocas() {
		return this.aeromocas;
	}

	public void adicionarAeromoca(Aeromoca aeromoca) {
		this.aeromocas.add(aeromoca);
	}

	public void removerAeromoca(Aeromoca aeromoca) {
		if (this.aeromocas.size() > 1) {
			this.aeromocas.remove(aeromoca);
		} else {
			System.out.println("Não é possível remover a última aeromoça");
		}
	}
}
