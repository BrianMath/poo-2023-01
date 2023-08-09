package com.github.brianmath.t22;

import java.util.List;

public class Pessoa {
	private String nome;
	private int idade;
	private boolean isVisitante;
	private boolean isTrabalhador;
	private List<Ocorrencia> ocorrencias;

	public Pessoa(String nome, int idade, boolean isVisitante, boolean isTrabalhador, List<Ocorrencia> ocorrencias) {
		this.nome = nome;
		this.idade = idade;
		this.isVisitante = isVisitante;
		this.isTrabalhador = isTrabalhador;
		this.ocorrencias = ocorrencias;
	}

	public void getNome(String nome) {
		this.nome = nome;
	}

	public void getIdade(int idade) {
		this.idade = idade;
	}

	public boolean isVisitante() {
		return this.isVisitante;
	}

	public void setIsVisitante(boolean isVisitante) {
		this.isVisitante = isVisitante;
	}

	public boolean isTrabalhador() {
		return this.isTrabalhador;
	}

	public void setIsTrabalhador(boolean isTrabalhador) {
		this.isTrabalhador = isTrabalhador;
	}

	public List<Ocorrencia> getOcorrencias() {
		return this.ocorrencias;
	}

	public void adicionarOcorrencia(Ocorrencia ocorrencia) {
		this.ocorrencias.add(ocorrencia);
	}

	public void removerOcorrencia(Ocorrencia ocorrencia) {
		if (this.ocorrencias.size() > 0) {
			this.ocorrencias.remove(ocorrencia);
		} else {
			System.out.println("Não existe ocorrência para remover!");
		}
	}
}
