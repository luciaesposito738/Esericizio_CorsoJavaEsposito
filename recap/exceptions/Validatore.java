package com.azienda.esercizio.recap.exceptions;

public class Validatore {
	public static final String A = "aereo";
	public static final String T = "treno";
	 public static void controlli(String v) throws VeicoloNonValidoException{
		if(!A.equals(v) && !T.equals(v)) {
			throw new VeicoloNonValidoException("Errore: veicolo non valido",null);
		}
	}
}
