class Data {
	private short dia;
	private short mes;
	private short ano;
}

// abstract: não pode ser instanciada
// e serve para ser extendida
public abstract class Pessoa {
	private Data nascimento;
	private String nome;
	private Pessoa pai;
	private Pessoa mae;
}

class Aluno extends Pessoa {}

class PessoaFisica extends Pessoa {
	String cpf;
	String corPele;
}

class PessoaJuridica extends Pessoa {
	String cnpj;
	String nomeFantasia;	
}