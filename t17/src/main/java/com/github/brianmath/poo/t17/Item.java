package com.github.brianmath.t17;

import java.util.ArrayList;
import java.util.List;

public class Item {
	private Pedido pedido;
	private Sanduiche sanduiche;
	private Bebida bebida;
	private List<Detalhe> detalhe;

	public Item(Pedido pedido, Sanduiche sanduiche, Bebida bebida) {
		this.pedido = pedido;
		this.sanduiche = sanduiche;
		this.bebida = bebida;
		this.detalhe = new ArrayList<Detalhe>();
	}

	public Pedido getPedido() {
		return this.pedido;
	}

	public Sanduiche getSanduiche() {
		return sanduiche;
	}

	public void setSanduiche(Sanduiche sanduiche) {
		this.sanduiche = sanduiche;
	}

	public void removerSanduiche(Sanduiche sanduiche) {
		this.sanduiche = null;
	}

	public Bebida getBebida() {
		return bebida;
	}

	public void setBebida(Bebida bebida) {
		this.bebida = bebida;
	}

	public void removerBebida(Bebida bebida) {
		this.bebida = null;
	}

	public List<Detalhe> getDetalhe() {
		return this.detalhe;
	}

	public void adicionarDetalhe(Detalhe detalhe) {
		this.detalhe.add(detalhe);
	}

	public void removerDetalhe(Detalhe detalhe) {
		this.detalhe.remove(detalhe);
	}
}
