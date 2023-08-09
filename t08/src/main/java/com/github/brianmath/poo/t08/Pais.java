package com.github.brianmath.t08;

import java.util.ArrayList;
import java.util.List;

public class Pais {
	private String nome;
	private List<Cidade> cidades;
	private Cidade capital;

	public Pais(String nome) {
		this.nome = nome;
		this.cidades = new ArrayList<>();
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Cidade> getCidades() {
		return this.cidades;
	}

	public void adicionarCidade(Cidade cidade) {
		cidade.setPais(this);
		this.cidades.add(cidade);
	}

	public Cidade getCapital() {
		return this.capital;
	}

	public void setCapital(Cidade cidade) {
		this.capital = cidade;
		cidade.setIsCapital(true);
	}
}
