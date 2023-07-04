package com.github.brianmath.t17;

public class Lugar {
    private Passageiro passageiro;

    public Lugar() {
    }

    public Passageiro getPassageiro() {
        return this.passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public void removerPassageiro() {
        this.passageiro = null;
    }
}
