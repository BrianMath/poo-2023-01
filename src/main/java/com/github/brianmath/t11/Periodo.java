package com.github.brianmath.t11;

public class Periodo {
	private int dia;
	private int mes;
	private int ano;

	public Periodo(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		if (dia > 0 && dia <= 31) {
			this.dia = dia;
		}
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if (mes > 0 && mes <= 12) {
			this.mes = mes;
		}
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if (ano > 0) {
			this.ano = ano;
		}
	}
}
