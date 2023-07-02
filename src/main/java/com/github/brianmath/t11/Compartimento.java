package com.github.brianmath.t11;

import java.util.ArrayList;
import java.util.List;

public class Compartimento {
	private List<Livro> livros;
	private List<CD> cds;
	private List<CD> cdsTemporarios;

	public Compartimento() {
		this.livros = new ArrayList<Livro>();
		this.cds = new ArrayList<CD>();
		this.cdsTemporarios = new ArrayList<CD>();
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void adicionarLivro(Livro livro) {
		if (this.livros.size() < 3) {
			this.livros.add(livro);
		}
	}

	public void removerLivro(Livro livro) {
		if (this.livros.size() > 0) {
			this.livros.remove(livro);
		}
	}

	public List<CD> getCDs() {
		return cds;
	}

	public void adicionarCD(CD cd) {
		int tam;

		if (this.cds.size() < 2 || (this.cds.size() >= 2 && this.cds.size() < 4) ||
			(this.cds.size() >= 4 && this.cds.size() < 7)) {
			if (this.cds.size() < 4) {
				tam = 1;
			} else {
				tam = 2;
			}
			
			if (this.cdsTemporarios.size() < tam) {
				this.cdsTemporarios.add(cd);
			} else {
				for (CD CD : cdsTemporarios) {
					this.cds.add(CD);
				}

				this.cdsTemporarios.clear();
				this.cds.add(cd);
			}
		} else if (this.cds.size() >= 7) {
			this.cds.add(cd);
		}
	}

	public void removerCD(CD cd) {
		if (this.cds.size() == 2) {
			this.cds.clear();
		} else if (this.cds.size() == 4) {
			this.cds.clear();
			this.cds.clear();
		} else if (this.cds.size() == 7) {
			this.cds.clear();
			this.cds.clear();
			this.cds.clear();
		} else if (this.cds.size() > 7) {
			this.cds.clear();
		}
	}
}
