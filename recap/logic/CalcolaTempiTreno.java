package com.azienda.esercizio.recap.logic;

import com.azienda.esercizio.recap.model.Treno;
import com.azienda.esercizio.recap.model.Veicolo;
import com.azienda.esercizio.recap.util.CalcolaTempiBase;

public class CalcolaTempiTreno extends CalcolaTempiBase{
	
	@Override
	public void informazioniMovimento(Veicolo veicolo) {
		if(veicolo instanceof Treno) {
			System.out.println(((Treno)veicolo).percorreBinario());
		}else {
			System.out.println("Errore: informazini non inserite.");
		}
	}
}
