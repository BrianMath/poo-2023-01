package com.github.brianmath.t19;

import java.util.ArrayList;
import java.util.List;

public class Time {
	private List<Jogador2> jogadores;
	private String nome;

	public Time(String nome) {
		this.nome = nome;
		this.jogadores = new ArrayList<Jogador2>();
	}

	public String getNome() {
		return nome;
	}

	public List<Jogador2> getJogadores() {
		return jogadores;
	}

	public void adicionarJogador(Jogador2 jogador) {
		this.jogadores.add(jogador);
	}

	public void removerJogador(Jogador2 jogador) {
		this.jogadores.remove(jogador);
	}
}
