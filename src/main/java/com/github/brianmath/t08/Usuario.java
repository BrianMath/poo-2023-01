package com.github.brianmath.t08;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nome;
	private List<Diretorio> diretorios;

	public Usuario(String nome) {
		this.nome = nome;
		this.diretorios = new ArrayList<>();
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Diretorio> getDiretorios() {
		return this.diretorios;
	}

	public void adicionarDiretorio(Diretorio diretorio) {
		this.diretorios.add(diretorio);
	}

	public void removerDiretorio(Diretorio diretorio) {
		this.diretorios.remove(diretorio);
	}

	public void autorizarDiretorio(Diretorio diretorio) {
		diretorio.adicionarUsuarioAutorizado(this);
	}

	public void desautorizarDiretorio(Diretorio diretorio) {
		diretorio.removerUsuarioAutorizado(this);
	}
}
