package com.github.brianmath.t08;

import java.util.ArrayList;
import java.util.List;

public class Arquivo {
	private List<Permissao> permissoes;

	public Arquivo() {
		this.permissoes = new ArrayList<>();
	}

	public List<Permissao> getPermissoes() {
		return this.permissoes;
	}

	public void adicionarPermissao(Permissao permissao) {
		this.permissoes.add(permissao);
	}

	public void removerPermissao(Permissao permissao) {
		this.permissoes.remove(permissao);
	}
}
