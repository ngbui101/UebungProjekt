package Praktikum;

import java.util.*;

public class Versuch3G4 {
	public static double kalorieUmrechnung(double wertInJoule) {
		return wertInJoule / 4.1868;
	}

	public static double jouleUmrechnung(double wertInKalorie) {
		return wertInKalorie * 4.1868;
	}

	public static String[] eingabe() {
		Scanner sc = new Scanner(System.in);
		String[] eingabe = new String[] { sc.next(), sc.next() };
		sc.close();
		return eingabe;
	}

	public static String[] ausgabe(String[] eingabe, double wert, String einheit) {
		return new String[] { eingabe[0], eingabe[1], String.valueOf(wert), einheit };
	}

	public static void main(String[] args) {
		try {
			System.out.println("Geben Sie eine Wert in J oder cal ein.");
			String[] eingabe = eingabe();
			double wert = Double.parseDouble(eingabe[0]);
			String einheit = eingabe[1];
			double umgerechneteWert = .0;
			String einheit2 = "";
			boolean richtigEingabe = false;
			if (einheit.equals("J")) {
				umgerechneteWert = kalorieUmrechnung(wert);
				einheit2 = "cal";
				richtigEingabe = true;
			}
			if (einheit.equals("cal")) {
				umgerechneteWert = jouleUmrechnung(wert);
				einheit2 = "J";
				richtigEingabe = true;
			}
			String[] ausgabe = ausgabe(eingabe, umgerechneteWert, einheit2);
			if (richtigEingabe)
				System.out.printf("%s %s entsprechen %s %s%n", ausgabe[0], ausgabe[1], ausgabe[2], ausgabe[3]);
			else
				throw new Exception();
		} catch (NumberFormatException nfe) {
			System.out.println("keine Zahl wurde gegeben");
		} catch (Exception e) {
			System.out.println("bitte nur J oder cal als Einheit eingeben");
			System.exit(0);
		}
	}

}
