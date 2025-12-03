package com.azienda.esercizio.recap.logic;

import com.azienda.esercizio.recap.model.Aereo;
import com.azienda.esercizio.recap.model.Veicolo;
import com.azienda.esercizio.recap.util.CalcolaTempiBase;

public class CalcolaTempiAereo extends CalcolaTempiBase{
	
	@Override
	public void informazioniMovimento(Veicolo veicolo) {
		if(veicolo instanceof Aereo) {
			System.out.println(((Aereo)veicolo).volo());
		}else {
			System.out.println("Errore: informazini non inserite.");
		}
	}
}
