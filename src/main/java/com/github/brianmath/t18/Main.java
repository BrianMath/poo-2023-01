package com.github.brianmath.t18;

public class Main {
	public static void main(String[] args) {
		Partida partida = new Partida("Imortal");
		Jogador j1 = new Jogador("Zé");
		Jogador j2 = new Jogador("Maria");

		partida.adicionarLance(
			new Lance(
				Peca.PEAO, 
				new Posicao(1, 2),
				new Posicao(1, 2), 
				j1));

		partida.adicionarLance(
			new Lance(
				Peca.PEAO, 
				new Posicao(2, 3),
				new Posicao(1, 2), 
				j2));

		System.out.println(partida);
	}
}
