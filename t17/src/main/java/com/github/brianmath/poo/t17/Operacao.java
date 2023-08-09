package com.github.brianmath.t17;

import java.util.ArrayList;
import java.util.List;

public class Operacao {
	private String tipo;
	private String data;
	private String hora;
	private List<Voo> voos;
	private Aeroporto aeroporto;

	public Operacao(String tipo, String data, String hora, Aeroporto aeroporto) {
		this.tipo = tipo;
		this.data = data;
		this.hora = hora;
		this.voos = new ArrayList<Voo>();
		this.aeroporto = aeroporto;
	}

	public String getTipo() {
		return this.tipo;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return this.hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
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

	public Aeroporto getAeroporto() {
		return this.aeroporto;
	}

	public void setAeroporto(Aeroporto aeroporto) {
		this.aeroporto = aeroporto;
	}
}
