package com.github.brianmath.t08;

import java.util.ArrayList;
import java.util.List;

public class Paragrafo {
	private String paragrafo;
    private List<Sentenca> sentencas;

    public Paragrafo(String paragrafo) {
        this.paragrafo = paragrafo;
        this.sentencas = new ArrayList<>();
    }

    public void adicionarSentecas(Sentenca sentenca) {
        this.sentencas.add(sentenca);
    }
}
