package com.github.brianmath.t08;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
	private String nome;
	private List<LinguagemDeProgramacao> linguagens;
	private List<Pessoa> pessoas;

	public Projeto(String nome) {
		this.nome = nome;
		this.linguagens = new ArrayList<>();
		this.pessoas = new ArrayList<>();
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Pessoa> getPessoas() {
		return this.pessoas;
	}

	public void adicionarPessoa(Pessoa pessoa) {
		this.pessoas.add(pessoa);
		pessoa.adicionarProjeto(this);
	}
}
