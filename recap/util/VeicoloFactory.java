package com.azienda.esercizio.recap.util;

import java.util.Scanner;

import com.azienda.esercizio.recap.exceptions.Validatore;
import com.azienda.esercizio.recap.exceptions.VeicoloNonValidoException;
import com.azienda.esercizio.recap.model.Aereo;
import com.azienda.esercizio.recap.model.Treno;
import com.azienda.esercizio.recap.model.Veicolo;

public class VeicoloFactory {
	public static Veicolo creaVeicolo(String tipo, Scanner s) {
        try {
            Validatore.controlli(tipo);

            System.out.println("Inserisci il modello:");
            String modello = s.nextLine();

            System.out.println("Inserisci velocità:");
            float velocita = InputUtils.readFloat(s);

            boolean extraFlag;
            if (tipo.equalsIgnoreCase(Validatore.A)) {
                System.out.println("L’aereo è di linea? (true/false)");
                extraFlag = InputUtils.readBoolean(s);

                return new Aereo(modello, velocita, extraFlag);

            } else if (tipo.equalsIgnoreCase(Validatore.T)) {
                System.out.println("Il treno è regionale? (true/false)");
                extraFlag = InputUtils.readBoolean(s);

                return new Treno(modello, velocita, extraFlag);
            }

        } catch (VeicoloNonValidoException e) {
            System.out.println("Errore: tipo veicolo non valido!");
            return null;
        } catch (Exception e) {
            System.out.println("Errore imprevisto nella creazione del veicolo.");
            return null;
        }

        return null;
    }
}
