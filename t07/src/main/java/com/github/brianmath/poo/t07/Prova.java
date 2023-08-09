package com.github.brianmath.t07;

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
