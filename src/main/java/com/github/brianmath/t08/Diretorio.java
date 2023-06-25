package com.github.brianmath.t08;

import java.util.ArrayList;
import java.util.List;

public class Diretorio {
	private String nome;
	private Usuario dono;
	private List<Usuario> usuariosAutorizados;

	public Diretorio(String nome, Usuario dono) {
		this.nome = nome;
		this.dono = dono;
		this.usuariosAutorizados = new ArrayList<>();
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Usuario getDono() {
		return this.dono;
	}

	public void setDono(Usuario dono) {
		this.dono = dono;
	}

	public List<Usuario> getUsuariosAutorizados() {
		return this.usuariosAutorizados;
	}

	public void adicionarUsuarioAutorizado(Usuario usuarioAutorizado) {
		this.usuariosAutorizados.add(usuarioAutorizado);
	}

	public void removerUsuarioAutorizado(Usuario usuarioAutorizado) {
		this.usuariosAutorizados.remove(usuarioAutorizado);
	}
}
