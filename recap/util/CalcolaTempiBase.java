package com.azienda.esercizio.recap.util;

import com.azienda.esercizio.recap.logic.CalcolaTempi;
import com.azienda.esercizio.recap.model.Veicolo;

public abstract class CalcolaTempiBase implements CalcolaTempi{
	@Override
	public Float calcolaTempiPercorrenza(Veicolo veicolo, Float distanza) {
		return distanza/veicolo.getVelocita();
	}
}
