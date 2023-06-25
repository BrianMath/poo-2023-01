package com.github.brianmath.t11;

import java.util.ArrayList;
import java.util.List;

public class Armario {
	private List<Prateleira> prateleiras;

	public Armario() {
		this.prateleiras = new ArrayList<Prateleira>();
	}

	public List<Prateleira> getPrateleiras() {
		return prateleiras;
	}

	public void adicionarPrateleira(Prateleira prateleira) {
		this.prateleiras.add(prateleira);
	}

	public void removerPrateleira(Prateleira prateleira) {
		this.prateleiras.remove(prateleira);
	}
}
