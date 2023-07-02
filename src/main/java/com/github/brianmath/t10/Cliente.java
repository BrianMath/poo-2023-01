package com.github.brianmath.t10;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nome;
	private String cpf;
	private String celular;
	private List<Bicicleta> bicicletas;
	private Familia familia;

	public Cliente(String nome, String cpf, String celular, Familia familia) {
		this.nome = nome;
		this.cpf = cpf;
		this.celular = celular;
		this.bicicletas = new ArrayList<Bicicleta>();
		this.familia = familia;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public List<Bicicleta> getBicicletas() {
		return this.bicicletas;
	}

	public void adicionarBicicleta(Bicicleta bicicleta) {
		this.bicicletas.add(bicicleta);
	}

	public void removerBicicleta(Bicicleta bicicleta) {
		this.bicicletas.remove(bicicleta);
	}

	public Familia getFamilia() {
		return this.familia;
	}

	public void setFamilia(Familia familia) {
		this.familia = familia;
	}
}
