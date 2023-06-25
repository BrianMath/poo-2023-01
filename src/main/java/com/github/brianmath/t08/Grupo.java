package com.github.brianmath.t08;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
	private List<Usuario> usuarios;
	private List<Permissao> permissoes;

	public Grupo() {
		this.usuarios = new ArrayList<>();
		this.permissoes = new ArrayList<>();
	}

	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void adicionarUsuario(Usuario usuario) {
		this.usuarios.add(usuario);
	}

	public void removerUsuario(Usuario usuario) {
		this.usuarios.remove(usuario);
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
