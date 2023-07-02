package com.github.brianmath.t13;

public class Cliente {
	private String nome;
	private int idade;
	private Conta conta;

	public Cliente(String nome, int idade, Conta conta) {
		this.nome = nome;
		this.idade = idade;
		this.conta = conta;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String novoNome) {
		this.nome = novoNome;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int novaIdade) {
		this.idade = novaIdade;
	}

	public Conta getConta() {
		return this.conta;
	}

	public void setConta(Conta novaConta) {
		this.conta = novaConta;
	}

	public void deposita(double valor) {
		this.conta.depositar(valor);
	}

	public void saca(double valor) {
		this.conta.sacar(valor);
	}

	public void transfere(double valor, Cliente destinatario) {
		this.conta.transferir(valor, destinatario.getConta());
	}

	public void consultaDados() {
		System.out.println("-  Nome: " + this.getNome());
		System.out.println("-  Idade: " + this.getIdade());
		this.conta.consultaDados();
	}
}
