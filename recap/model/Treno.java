package com.azienda.esercizio.recap.model;

public class Treno extends Veicolo{
	private Boolean regionale;

	public Treno(String modello, Float velocita, Boolean regionale) {
		super(modello, velocita);
		this.regionale = regionale;
	}

	public Boolean getRegionale() {
		return regionale;
	}

	public void setRegionale(Boolean regionale) {
		this.regionale = regionale;
	}
	public String percorreBinario() {
		String info = regionale?" il treno è regionale.":" il treno non è regionaale";
		return "Treno:"+super.toString()+info;
	}
}
