package com.github.brianmath.t08;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private String nome;
	private List<Emprego> empregos;
	public List<Pessoa> empregados;

	public Empresa(String nome) {
		this.nome = nome;
		this.empregos = new ArrayList<>();
		this.empregados = new ArrayList<>();
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Emprego> getEmpregos() {
		return this.empregos;
	}

	public void adicionarEmprego(Emprego emprego) {
		this.empregos.add(emprego);
	}

	public void removerEmprego(Emprego emprego) {
		this.empregos.remove(emprego);
	}

	public List<Pessoa> getEmpregados() {
		return this.empregados;
	}

	public void adicionarEmpregado(Pessoa empregado) {
		this.empregados.add(empregado);
	}

	public void removerEmpregado(Pessoa empregado) {
		this.empregados.remove(empregado);
	}
}
