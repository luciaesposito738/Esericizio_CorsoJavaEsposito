package com.azienda.esercizio.recap.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtils {
	public static boolean readBoolean(Scanner s) {
		while(true) {
			System.out.println("Inserisci true o false:");
			String st = s.nextLine();
			if(st.equalsIgnoreCase("true")) {
				return true;
			}
			if(st.equalsIgnoreCase("false")) {
				return false;
			}
		}
	}
	public static float readFloat(Scanner s) {
		while(true){
		try {
			System.out.println("Inserisci un numero:");
			String st = s.nextLine();
			float f = Float.parseFloat(st);
			return f;
		}catch(InputMismatchException e) {
			System.out.println("Errore non hai inserito un numero.");
			e.printStackTrace();
		}
		}
	}
}
