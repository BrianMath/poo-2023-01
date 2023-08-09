package com.github.brianmath.t11;

import java.util.ArrayList;
import java.util.List;

public class Lanchonete {
	private String nome;
	private List<Funcionario> funcionarios;
	private Funcionario gerente;

	public Lanchonete(String nome, Funcionario func1, Funcionario func2) {
		this.nome = nome;
		this.funcionarios = new ArrayList<Funcionario>();
		this.funcionarios.add(func1);
		this.funcionarios.add(func2);
		this.gerente = null;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Funcionario> getFuncionarios() {
		return this.funcionarios;
	}

	public void adicionarFuncionario(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
		funcionario.setGerente(true);
	}

	public void removerFuncionario(Funcionario funcionario) {
		this.funcionarios.remove(funcionario);
		funcionario.setGerente(false);
	}

	public Funcionario getGerente() {
		return this.gerente;
	}

	public void setGerente(Funcionario gerente) {
		this.gerente = gerente;
	}

	public void removerGerente() {
		this.gerente = null;
	}
}
