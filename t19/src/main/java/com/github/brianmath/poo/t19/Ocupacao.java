package com.github.brianmath.t19;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ocupacao {
	private List<Pessoa2> pessoa;
	private List<Mesa> mesa;
	private List<Date> data;

	public Ocupacao() {
		this.pessoa = new ArrayList<Pessoa2>();
		this.mesa = new ArrayList<Mesa>();
		this.data = new ArrayList<Date>();
	}

	public List<Pessoa2> getPessoa() {
		return pessoa;
	}

	public List<Mesa> getMesa() {
		return mesa;
	}

	public List<Date> getData() {
		return data;
	}
}
