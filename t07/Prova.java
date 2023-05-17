public class Prova {
    private byte numQuestoes;

    public byte getNumQuestoes() {
		return numQuestoes;
	}

	public void setNumQuestoes(byte numQuestoes) {
		if (numQuestoes > 0) {
			this.numQuestoes = numQuestoes;
		}
	}
}
