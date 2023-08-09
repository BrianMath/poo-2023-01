package com.github.brianmath.t09;

import java.util.ArrayList;
import java.util.List;

public class Cidade {
	private String nome;
	private List<Viagem> viagens;
	private List<Armazem> armazens;

	public Cidade(String nome) {
		this.nome = nome;
		this.viagens = new ArrayList<Viagem>();
		this.armazens = new ArrayList<Armazem>();
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Viagem> getViagens() {
		return this.viagens;
	}

	public void adicionarViagem(Viagem viagem) {
		this.viagens.add(viagem);
	}

	public void removerViagem(Viagem viagem) {
		this.viagens.remove(viagem);
	}

	public List<Armazem> getArmazens() {
		return this.armazens;
	}

	public void adicionarArmazem(Armazem armazem) {
		this.armazens.add(armazem);
	}

	public void removerArmazem(Armazem armazem) {
		this.armazens.remove(armazem);
	}
}
