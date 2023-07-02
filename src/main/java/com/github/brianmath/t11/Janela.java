package com.github.brianmath.t11;

public class Janela {
	private double area;

	public Janela(double area) {
		this.area = area;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		if (area >= 0.0) {
			this.area = area;
		}
	}
}
