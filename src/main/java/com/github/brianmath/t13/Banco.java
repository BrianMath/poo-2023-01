package com.github.brianmath.t13;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	private String cnpj;
	private List<Cliente> clientes;

	public Banco(String nome, String cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.clientes = new ArrayList<Cliente>();
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String novoNome) {
		this.nome = novoNome;
	}

	public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(String novoCnpj) {
		this.cnpj = novoCnpj;
	}

	public void consultaClientes() {
		System.out.println("Clientes do banco " + this.nome + ":");

		for (Cliente cliente : this.clientes) {
			System.out.println("--------------------");
			cliente.consultaDados();
		}
		System.out.println("--------------------");
	}

	public void adicionaCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}

	public void removeCliente(Cliente cliente) {
		this.clientes.remove(cliente);
	}
}
