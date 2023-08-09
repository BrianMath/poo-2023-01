package com.github.brianmath.t22;

import java.util.List;

public class Parque {
	private String nome;
	private Calendario calendario;
	private List<Pessoa> pessoas;

	public Parque(String nome, Calendario calendario, List<Pessoa> pessoas) {
		this.nome = nome;
		this.calendario = calendario;
		this.pessoas = pessoas;
	}

	public String getNome() {
		return this.nome;
	}

	public Calendario getCalendario() {
		return this.calendario;
	}

	public List<Pessoa> getPessoas() {
		return this.pessoas;
	}

	public void adicionarPessoa(Pessoa pessoa) {
		this.pessoas.add(pessoa);
	}

	public void removerPessoa(Pessoa pessoa) {
		this.pessoas.remove(pessoa);
	}
}
