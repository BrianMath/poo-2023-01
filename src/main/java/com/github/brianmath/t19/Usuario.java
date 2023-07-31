package com.github.brianmath.t19;

public class Usuario {
    private String username;
	private String senha;
	private Pessoa pessoa;

	public Usuario(String username, String senha) {
		this.username = username;
		this.senha = senha;
	}

	public String getUsername() {
		return username;
	}

	public String getSenha() {
		return senha;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}
