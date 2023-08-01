package com.github.brianmath.t19;

import java.util.ArrayList;
import java.util.List;

public class Mesa {
	private List<Pessoa2> pessoas;

	public Mesa() {
		this.pessoas = new ArrayList<Pessoa2>();
	}

	public List<Pessoa2> getPessoas() {
		return this.pessoas;
	}

	public void adicionarPessoa(Pessoa2 pessoa) {
		this.pessoas.add(pessoa);
	}
}
