package com.github.brianmath.t17;

public class Bebida {
    private String nome;
    private Item item;

    public Bebida(String nome, Item item) {
        this.nome = nome;
        this.item = item;
    }

    public String getNome() {
        return this.nome;
    }

    public Item getItem() {
        return this.item;
    }
}
