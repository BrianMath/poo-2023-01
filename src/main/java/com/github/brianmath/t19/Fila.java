package com.github.brianmath.t19;

import java.util.ArrayList;
import java.util.List;

public class Fila {
	private List<Cliente> clientes;

	public Fila() {
		this.clientes = new ArrayList<Cliente>();
	}

	public List<Cliente> getClientes() {
		return this.clientes;
	}

	public void entrarNaFila(Cliente cliente) {
		this.clientes.add(cliente);
	}

	public Cliente sairDaFila() {
		return this.clientes.remove(0);
	}	
}
