package com.azienda.esercizio.recap.ui;

import java.util.Scanner;

import com.azienda.esercizio.recap.exceptions.Validatore;
import com.azienda.esercizio.recap.exceptions.VeicoloNonValidoException;
import com.azienda.esercizio.recap.logic.CalcolaTempi;
import com.azienda.esercizio.recap.logic.CalcolaTempiAereo;
import com.azienda.esercizio.recap.logic.CalcolaTempiTreno;
import com.azienda.esercizio.recap.model.Aereo;
import com.azienda.esercizio.recap.model.Veicolo;
import com.azienda.esercizio.recap.util.InputUtils;
import com.azienda.esercizio.recap.util.VeicoloFactory;

public class Test {

	public static void main(String[] args) {
		try(Scanner s = new Scanner(System.in)){
			String st;
			do {
				System.out.println("Inserisci che tipo di veicolo vuoi: ");
				st  = s.nextLine();
				if(st.equalsIgnoreCase("ESC")) {
					break;
				}
				Veicolo v = VeicoloFactory.creaVeicolo(st, s);
				try {
				Validatore.controlli(st);
			}catch(VeicoloNonValidoException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
				float distanza = InputUtils.readFloat(s);
				Float tempo;
				CalcolaTempi calcola;
				if(v instanceof Aereo) {
					calcola = new CalcolaTempiAereo(); 
				}else {
					calcola = new CalcolaTempiTreno();
				}
				tempo = new CalcolaTempiAereo().calcolaTempiPercorrenza(v, distanza);
				System.out.println("Tempo:"+tempo+"ore.");
				calcola.informazioniMovimento(v);
			}while(true);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
