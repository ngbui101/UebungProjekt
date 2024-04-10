package JA1letztePRKlausur;

import javax.swing.JOptionPane;

public class Aufgabe6 {
	public static int zeichen(char[] arr) {
		char max = arr[0];
		char min = arr[1];
		if (max < min) {
			char hilf = max;
			max = min;
			min = hilf;
		}
		int zaehler = 0;
		while (true) {
			char randomChar = (char) ((int) (Math.random() * (max - min) * min - 1));
			if (randomChar == arr[2])
				break;
			zaehler++;
		}
		return zaehler;
	}

	public static String eingabe() {
		String eingabe = JOptionPane.showInputDialog("Geben Sie 3 Ziffer aus sichtbaren Bereich ein");
		return eingabe;
	}

	public static void main(String[] args) {
		try {
			char[] eingabe = eingabe().toCharArray();
			if (eingabe.length != 3)
				throw new Exception("Es darf nur 3 Zeichen eingeben");
			for (char c : eingabe) {
				if (c <= 32 || c >= 127) {
					throw new Exception("Es darf nur Zeichen aus dem sichbaren Bereich");
				}
			}
			if (Math.abs(eingabe[0] - eingabe[1]) == 1) {
				throw new Exception("Die beide erste Zeichen darf nicht nebeneinander stehen");
			}
			System.out.println(zeichen(eingabe));
		} catch (Exception e) {
			System.err.println(e);
		}

	}

}
