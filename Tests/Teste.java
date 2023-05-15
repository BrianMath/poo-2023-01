class Cliente {
	String nome;
	char sexo;
	int idade;
}

class Conta {
	Cliente titular;
	String tipo;
	double saldo;

	boolean saca(double valor) {
		double novoSaldo = this.saldo - valor;

		if (novoSaldo >= 0) {
			this.saldo = novoSaldo;
			return true;
		} else {
			return false;
		}
	}

	void deposita(double valor) {
		this.saldo += valor;
	}

	boolean transferePara(Conta contaDestino, double valor) {
		if (this.saca(valor)) {
			contaDestino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

	void mostraSaldo() {
		System.out.println("\033[0;36mSaldo da conta de " + this.titular.nome + ": R$"
														  + saldo + "\033[m");
	}

	String mostraDados() {
		String dados = "\033[4;34mNome: \033[1;35m" + this.titular.nome + "\033[4;34m";
		dados += "\nTipo da conta: \033[1;35m" + this.tipo + "\033[4;34m";
		dados += "\nSaldo da conta: \033[1;35m" + this.saldo + "\033[m";
		dados += "\n";

		return dados;
	}
}

public class Teste {
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();

		// Criação de cliente1
		cliente1.nome = "Pedro";
		cliente1.sexo = 'M';
		cliente1.idade = 43;
		
		// Criação da conta1
		conta1.titular = cliente1;
		conta1.tipo = "Poupança";
		conta1.saldo = 1000.00;
		System.out.println(conta1.mostraDados());

		// Criação de cliente2
		cliente2.nome = "Clara";
		cliente2.sexo = 'F';
		cliente2.idade = 20;

		// Valores padrão - conta2
		conta2.titular = cliente2;
		conta2.tipo = "Conta Corrente";
		conta2.saldo = 500.00;
		System.out.println(conta2.mostraDados());

		System.out.println("\n------------------------------------------\n");
		System.out.println(cliente1.nome + " tenta sacar R$500,00");

		if (conta1.saca(500.00)) {
			conta1.mostraSaldo();
		} else {
			System.out.println("\033[0;31mNão deu pra sacar 😢\033[m");
		}

		System.out.println("\n" + cliente2.nome + " tenta sacar R$600,00");

		if (conta2.saca(600.00)) {
			conta2.mostraSaldo();
		} else {
			System.out.println("\033[0;31mNão deu pra sacar 😢\033[m");
		}

		System.out.println("\n------------------------------------------\n");
		System.out.println(cliente1.nome + " tenta transferir R$250,00 para Clara");

		if (conta1.transferePara(conta2, 250.00)) {
			conta1.mostraSaldo();
			conta2.mostraSaldo();
		} else {
			System.out.println("\033[0;31mNão deu para transferir 😢\033[m");
		}
	}
}