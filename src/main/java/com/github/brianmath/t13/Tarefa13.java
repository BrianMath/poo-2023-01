package com.github.brianmath.t13;

public class Tarefa13 {
	private static void print(String msg) {
		System.out.println(msg);
	}

	public static void main(String args[]) {
		Banco banco = new Banco("Nubank", "01.234.567/8901-23");

		Cliente cliente0 = new Cliente("João", 45, new Conta("1234-5", "20230702/1"));
		Cliente cliente1 = new Cliente("Maria", 32, new Conta("1234-5", "20230702/2"));

		banco.adicionaCliente(cliente0);
		banco.adicionaCliente(cliente1);

		banco.consultaClientes();

		print("\n\n");

		String nomeCliente0 = cliente0.getNome();

		print("Consulta de dados de " + nomeCliente0 + ":");
		cliente0.consultaDados();
		print("\n" + nomeCliente0 + " deposita 1000.0");
		cliente0.deposita(1000.0);
		print("\nConsulta de dados de " + nomeCliente0 + ":");
		cliente0.consultaDados();

		print("\n\n");

		String nomeCliente1 = cliente1.getNome();

		print("Consulta de dados de " + nomeCliente1 + ":");
		cliente1.consultaDados();
		print("\n" + nomeCliente1 + " deposita 500.0");
		cliente1.deposita(500.0);
		print("\nConsulta de dados de " + nomeCliente1 + ":");
		cliente1.consultaDados();

		print("\n\n");

		print(nomeCliente0 + " transfere 500.0 para " + nomeCliente1);
		cliente0.transfere(500.0, cliente1);
		print("\nConsulta de saldo de " + nomeCliente0 + ":");
		cliente0.consultaDados();
		print("\nConsulta de saldo de " + nomeCliente1 + ":");
		cliente1.consultaDados();
	}
}
