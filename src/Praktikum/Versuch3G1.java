package Praktikum;

import java.util.Scanner;
class Versuch3G1 {
	static String[] ausgabe(String  zahl, String einheit, String[] ergebnis) {
		return new String[]{zahl,einheit,ergebnis[0],ergebnis[1]};
	}
	static double gradUmrechnung(double zahlInKelvin) {
		return zahlInKelvin - 273.15;
	}
	static double kelvinUmrechnung(double zahlInGrad) {
		return zahlInGrad + 273;
	}
	public static void main(String args[]) {
		System.out.println("Geben Sie Temperatur in Celsius(°C) oder Kelvin(K) ein");
		Scanner eingabe = new Scanner(System.in);
		double zahl = Double.parseDouble(eingabe.next());
		String einheit = eingabe.next();
		System.out.println(einheit);
		boolean korrektEingabe = true;
		String[] ergebnis = new String[2];
		if(einheit.equals("°C")) { 
			if(zahl < -273.15) 
				korrektEingabe = false;
			else 
				ergebnis = new String[] {""+kelvinUmrechnung(zahl),"K"};
		}else if(einheit.equals("K")) {
			if (zahl < 0)
				korrektEingabe = false;
			else 
				ergebnis = new String[] {""+gradUmrechnung(zahl),"°C"};
		}else
			korrektEingabe = false;
		String[] ausgabe = ausgabe(""+zahl,einheit,ergebnis);	
		if (korrektEingabe)
			System.out.printf("%s %s entspricht %s %s%n",ausgabe[0],ausgabe[1],ausgabe[2],ausgabe[3]);
		else
			System.out.println("Keine korrekte Eingabe");
		eingabe.close();
	}

}
		
			
