package com.github.brianmath.t13;

public class Conta {
	private String numAgencia;
	private String numConta;
	private double saldo;

	public Conta(String numAgencia, String numConta) {
		this.numAgencia = numAgencia;
		this.numConta = numConta;
		this.saldo = 0.0;
	}

	private String getNumAgencia() {
		return this.numAgencia;
	}

	private String getNumConta() {
		return this.numConta;
	}

	public double getSaldo() {
		return this.saldo;
	}

	private void setSaldo(double novoSaldo) {
		this.saldo = novoSaldo;
	}

	public void depositar(double valor) {
		this.setSaldo(this.getSaldo() + valor);
	}

	public boolean sacar(double valor) {
		if (valor > this.getSaldo()) {
			System.out.println("Saldo insuficiente!");
			return false;
		} else {
			this.setSaldo(this.getSaldo() - valor);
			return true;
		}
	}

	public void transferir(double valor, Conta destinatario) {
		if (this.sacar(valor)) {
			destinatario.depositar(valor);
		} else {
			System.out.println("Não foi possível realizar a transferência.");
		}
	}

	public void consultaDados() {
		System.out.println("-  Agência: " + this.getNumAgencia());
		System.out.println("-  Conta: " + this.getNumConta());
		System.out.println("-  Saldo: " + this.getSaldo());
	}
}
