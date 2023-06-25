package com.github.brianmath.t08;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	private String nome;
	private List<Projeto> projetos;
	private List<Emprego> empregos;
	private List<Empresa> empregadores;

	public Pessoa(String nome) {
		this.nome = nome;
		this.projetos = new ArrayList<>();
		this.empregos = new ArrayList<>();
		this.empregadores = new ArrayList<>();
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Projeto> getProjetos() {
		return this.projetos;
	}

	public void adicionarProjeto(Projeto projeto) {
		this.projetos.add(projeto);
	}

	public void removerProjeto(Projeto projeto) {
		this.projetos.remove(projeto);
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

	public List<Empresa> getEmpregadores() {
		return this.empregadores;
	}

	public void adicionarEmpregador(Empresa empregador) {
		this.empregadores.add(empregador);
	}

	public void removerEmpregador(Empresa empregador) {
		this.empregadores.remove(empregador);
	}
}
