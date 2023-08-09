package com.github.brianmath.t22;

import java.util.List;

public class Ocorrencia {
	private String descricao;
	private String local;
	private Data data;
	private List<Pessoa> pessoasEnvolvidas;

	public Ocorrencia(String descricao, String local, Data data, List<Pessoa> pessoasEnvolvidas) {
		this.descricao = descricao;
		this.local = local;
		this.data = data;
		this.pessoasEnvolvidas = pessoasEnvolvidas;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLocal() {
		return this.local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public List<Pessoa> getPessoasEnvolvidas() {
		return this.pessoasEnvolvidas;
	}

	public void adicionarPessoaEnvolvida(Pessoa pessoa) {
		this.pessoasEnvolvidas.add(pessoa);
	}
	
	public void removerPessoaEnvolvida(Pessoa pessoa) {
		if (this.pessoasEnvolvidas.size() > 1) {
			this.pessoasEnvolvidas.remove(pessoa);
		} else {
			System.out.println("Não é possível remover a última pessoa envolvida!");
		}
	}
}
