package com.github.brianmath.t11;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	private List<ItemCompra> itens;

	public Compra() {
		this.itens = new ArrayList<ItemCompra>();
	}

	public List<ItemCompra> getItens() {
		return itens;
	}

	public void adicionarItem(ItemCompra item) {
		this.itens.add(item);
	}

	public void removerItem(ItemCompra item) {
		this.itens.remove(item);
	}
}
