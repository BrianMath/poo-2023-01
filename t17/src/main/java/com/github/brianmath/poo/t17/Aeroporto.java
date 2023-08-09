package com.github.brianmath.t17;

import java.util.ArrayList;
import java.util.List;

public class Aeroporto {
	private String nome;
	private List<Operacao> operacoes;

	public Aeroporto(String nome) {
		this.nome = nome;
		this.operacoes = new ArrayList<Operacao>();
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Operacao> getOperacoes() {
		return this.operacoes;
	}

	public void adicionarOperacao(Operacao operacao) {
		this.operacoes.add(operacao);
	}

	public void removerOperacao(Operacao operacao) {
		this.operacoes.remove(operacao);
	}
}
