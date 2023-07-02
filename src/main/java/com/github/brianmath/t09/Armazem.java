package com.github.brianmath.t09;

import java.util.ArrayList;
import java.util.List;

public class Armazem {
	private String nome;
	private Cidade cidade;
	private List<ListaDePedidos> pedidos;

	public Armazem(String nome, Cidade cidade) {
		this.nome = nome;
		this.cidade = cidade;
		this.pedidos = new ArrayList<ListaDePedidos>();
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cidade getCidade() {
		return this.cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public List<ListaDePedidos> getPedidos() {
		return this.pedidos;
	}

	public void adicionarPedido(ListaDePedidos pedido) {
		this.pedidos.add(pedido);
	}

	public void removerPedido(ListaDePedidos pedido) {
		this.pedidos.remove(pedido);
	}
}
