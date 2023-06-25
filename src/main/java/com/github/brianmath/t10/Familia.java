package com.github.brianmath.t10;

import java.util.ArrayList;
import java.util.List;

public class Familia {
	private int qtdMembros;
	private List<Cliente> membros;

	public Familia(int qtdMembros) {
		this.qtdMembros = qtdMembros;
		this.membros = new ArrayList<Cliente>();
	}

	public int getQtdMembros() {
		return this.qtdMembros;
	}

	public void setQtdMembros(int qtdMembros) {
		this.qtdMembros = qtdMembros;
	}

	public List<Cliente> getMembros() {
		return this.membros;
	}

	public void adicionarMembro(Cliente membro) {
		this.membros.add(membro);
	}

	public void removerMembro(Cliente membro) {
		this.membros.remove(membro);
	}

	public void adicionarPercurso(Percurso percurso) {
		percurso.adicionarFamilia(this);
	}

	public void removerPercurso(Percurso percurso) {
		percurso.removerFamilia(this);
	}
}
