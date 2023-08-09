package com.github.brianmath.t08;

public class Emprego {
	private double salario;
	private String dataInicio;
	private String dataFim;
	private Pessoa empregado;
	private Empresa empregador;

	public Emprego(double salario, String dataInicio, String dataFim) {
		this.salario = salario;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDataInicio() {
		return this.dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataFim() {
		return this.dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	public Pessoa getEmpregado() {
		return this.empregado;
	}

	public void setEmpregado(Pessoa empregado) {
		this.empregado = empregado;
	}

	public Empresa getEmpregador() {
		return this.empregador;
	}

	public void setEmpregador(Empresa empregador) {
		this.empregador = empregador;
	}
}
