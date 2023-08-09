package com.github.brianmath.t11;

import java.util.Date;

public class Prestacao {
	private Date dataLimite;
	private double valor;

	public Prestacao(Date dataLimite, double valor) {
		this.dataLimite = dataLimite;
		this.valor = valor;
	}

	public Date getDataLimite() {
		return dataLimite;
	}

	public double getValor() {
		return valor;
	}
}
