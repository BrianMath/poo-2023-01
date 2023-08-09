package com.github.brianmath.t17;

public class Detalhe {
    private String descricao;
    private String acompanhamento;
    private Item item;

    public Detalhe(String descricao, String acompanhamento, Item item) {
        this.descricao = descricao;
        this.acompanhamento = acompanhamento;
        this.item = item;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAcompanhamento() {
        return this.acompanhamento;
    }

    public void setAcompanhamento(String acompanhamento) {
        this.acompanhamento = acompanhamento;
    }

    public Item getItem() {
        return this.item;
    }
}
