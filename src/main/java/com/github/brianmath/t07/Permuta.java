package com.github.brianmath.t07;

public class Permuta {
	public static void permuta(String prefixo, String sequencia) {
		if (sequencia.length() == 0) {
			System.out.println(prefixo);
		} else {
			String sLinha;
			String pLinha;

			for (int i = 0; i < sequencia.length(); i++) {
				pLinha = prefixo + sequencia.charAt(i);
				sLinha = sequencia.substring(0, i) + sequencia.substring(i+1);
				permuta(pLinha, sLinha);
			}
		}
	}

	public static void main(String[] args) {
		permuta(new String(), args[0]);
	}
}
