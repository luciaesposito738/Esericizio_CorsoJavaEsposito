package com.azienda.esercizio.recap.logic;

import com.azienda.esercizio.recap.model.Veicolo;

public interface CalcolaTempi {
	public Float calcolaTempiPercorrenza(Veicolo veicolo, Float distanza);
    public void informazioniMovimento(Veicolo veicolo);
}
