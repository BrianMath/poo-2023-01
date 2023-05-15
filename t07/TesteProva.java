class Prova implements Identificacao {
	private byte numQuestoes;

	public byte getNumQuestoes() {
		return numQuestoes;
	}

	public void setNumQuestoes(byte n) {
		if (n > 0) {
			numQuestoes = n;
		}
	}
}

public class TesteProva {
	public static void main(String[] args) {
		Prova pf = new Prova();
	}
}

