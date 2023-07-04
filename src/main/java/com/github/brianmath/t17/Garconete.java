package com.github.brianmath.t17;

import java.util.ArrayList;
import java.util.List;

public class Garconete {
	private String nome;
	private List<Pedido> pedidos;

	public Garconete(String nome) {
		this.nome = nome;
		this.pedidos = new ArrayList<Pedido>();
	}

	public String getNome() {
		return this.nome;
	}

	public List<Pedido> getPedidos() {
		return this.pedidos;
	}

	public void adicionarPedido(Pedido pedido) {
		this.pedidos.add(pedido);
	}

	public void removerPedido(Pedido pedido) {
		this.pedidos.remove(pedido);
	}
}
