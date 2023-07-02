package com.github.brianmath.t09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Viagem {
	private CaixeiroViajante caixeiro;
	private List<Cidade> cidades;
	private List<ListaDePedidos> pedidos;

	public Viagem(CaixeiroViajante caixeiro) {
		this.caixeiro = caixeiro;
		this.cidades = new ArrayList<Cidade>();
		this.pedidos = new ArrayList<ListaDePedidos>();
	}

	public CaixeiroViajante getCaixeiro() {
		return this.caixeiro;
	}

	public void setCaixeiro(CaixeiroViajante caixeiro) {
		this.caixeiro = caixeiro;
	}

	public List<Cidade> getCidades() {
		return this.cidades;
	}

	public void adicionarCidade(Cidade cidade) {
		this.cidades.add(cidade);
		Collections.sort(this.cidades, Comparator.comparing(Cidade::getNome));
	}

	public void removerCidade(Cidade cidade) {
		this.cidades.remove(cidade);
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
