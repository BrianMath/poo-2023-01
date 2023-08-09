package com.github.brianmath.t09;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	private String nome;
	private int idade;
	private List<Habito> habitos;

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		this.habitos = new ArrayList<>();
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	  public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public List<Habito> getHabitos() {
		return this.habitos;
	}

	public void adicionarHabito(Habito habito) {
		this.habitos.add(habito);
	}

	public void removerHabito(Habito habito) {
		this.habitos.remove(habito);
	}
}
