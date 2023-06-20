package com.github.brianmath.t08;

import java.util.ArrayList;
import java.util.List;

public class Pais {
	private String nome;
	private List<Cidade> cidades;

	public Pais(String nome) {
		this.nome = nome;
		this.cidades = new ArrayList<>();
	}

	public void adicionarCidade(Cidade cidade) {
		this.cidades.add(cidade);
	}
}
