package com.github.brianmath.t17;

public class PlacaMae extends Dispositivo {
    private CPU cpu;

    public PlacaMae(String nome, String marca, CPU cpu) {
        super(nome, marca);
        this.cpu = cpu;
    }

    public CPU getCpu() {
        return this.cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
}
