package com.github.brianmath.t09;

public class Transacao {
	private Cliente cliente;
	private Fornecedor fornecedor;

	public Transacao(Cliente cliente, Fornecedor fornecedor) {
		this.cliente = cliente;
		this.fornecedor = fornecedor;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Fornecedor getFornecedor() {
		return this.fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
}
