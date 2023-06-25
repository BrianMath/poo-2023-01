package com.github.brianmath.t11;

public class JanelaComVidro extends Janela {
	private double areaVidro;

	public JanelaComVidro(double area, double areaVidro) {
		super(area);
		this.areaVidro = areaVidro;
	}

	public double getAreaVidro() {
		return areaVidro;
	}

	public void setAreaVidro(double areaVidro) {
		if (areaVidro >= 0.0) {
			this.areaVidro = areaVidro;
		}
	}
}
