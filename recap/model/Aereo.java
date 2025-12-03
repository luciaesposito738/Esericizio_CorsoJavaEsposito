package com.azienda.esercizio.recap.model;

public class Aereo extends Veicolo{
	private Boolean diLinea;

	public Aereo(String modello, Float velocita, Boolean diLinea) {
		super(modello, velocita);
		this.diLinea = diLinea;
	}

	public Boolean getDiLinea() {
		return diLinea;
	}

	public void setDiLinea(Boolean diLinea) {
		this.diLinea = diLinea;
	}
	public String volo() {
		String info = diLinea?" l'aereo non è di linea.":" l'aereo non è di linea";
		return "Aereo:"+super.toString()+info;
	}
}
