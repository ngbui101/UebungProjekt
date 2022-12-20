package Praktikum;

import java.util.Scanner;

public class Versuch3G3 {
	public static String[] einlesen() throws Exception {
		Scanner eingabeScanner = new Scanner(System.in);
		System.out.println("Geben Sie Ziffern ein.");
		String zifferString = eingabeScanner.nextLine();
		System.out.println("Geben Sie ob es um eine Zahl oder Zeichenkette handeln");
		String zifferType = eingabeScanner.nextLine();
		eingabeScanner.close();
		if (zifferString.startsWith("0") == false && zifferString.length() <= 10 && (zifferType.equals("Zahl") || zifferType.equals("Zeichenkette"))) {
			String[] eingabeStrings = new String[] { zifferString, zifferType };
			return eingabeStrings;
		} else
			throw new Exception();
	}

	public static int summeRechnen(String[] einlesen) {
		if (einlesen[1].equals("Zahl"))
			return Integer.parseInt(einlesen[0]);
		else if (einlesen[1].equals("Zeichenkette")) {
			char[] hilfCharArray = einlesen[0].toCharArray();
			int summe = 0;
			for (int i : hilfCharArray) {
				summe += i;
			}
			return summe;
		} else
			return 0;
	}

	public static void ausgabe() throws Exception {
		String[] eingabeStrings = einlesen();
		// konventierteWert = summeRechnen(eingabeStrings);
		if (eingabeStrings[1].equals("Zahl")) {
			System.out.printf("Die Zahl %s wurde eingegeben.%n", eingabeStrings[0]);
		} else {
			System.out.printf("Die Ziffern der Zeichenkette %s haben als Summe ihrer ASCII-Wert den Wert %s.%n",
					eingabeStrings[0], summeRechnen(eingabeStrings));
		} 
	}

	public static void main(String[] args) {
		try {
			ausgabe();
		} catch (Exception e) {
			System.out.println("Bye");
		}
	}

}
