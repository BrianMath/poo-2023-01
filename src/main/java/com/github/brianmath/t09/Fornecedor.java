package com.github.brianmath.t09;

import java.util.ArrayList;
import java.util.List;

public class Fornecedor {
	private List<Transacao> transacoes;

	public Fornecedor() {
		this.transacoes = new ArrayList<Transacao>();
	}

	public List<Transacao> getTransacoes() {
		return this.transacoes;
	}

	public void adicionarTransacao(Transacao transacao) {
		this.transacoes.add(transacao);
	}

	public void removerTransacao(Transacao transacao) {
		this.transacoes.remove(transacao);
	}
}
