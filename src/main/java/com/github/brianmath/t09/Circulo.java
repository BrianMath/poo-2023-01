package com.github.brianmath.t09;

public class Circulo {
	private Ponto centro;
	private double raio;

	public Circulo(Ponto centro, double raio) {
		this.centro = centro;
		this.raio = raio;
	}

	public Ponto getCentro() {
		return this.centro;
	}

	public void setCentro(Ponto centro) {
		this.centro = centro;
	}

	public double getRaio() {
		return this.raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public void transladar(double dx, double dy) {
		this.centro.setX(this.centro.getX() + dx);
		this.centro.setY(this.centro.getY() + dy);
	}
}
