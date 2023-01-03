package Klausur2021;

import javax.swing.JOptionPane;

public class Aufgabe5 {

	public static void main(String[] args) {
		int summe = 0;
		int anzahl = 0;
		do {
			int note = Integer.parseInt(JOptionPane.showInputDialog(
					"Geben Sie die Note ein, '0' eingabe um den Durchschnitt der eingegebenen Noten auszugeben"));
			if (note == 0)
				if (anzahl >= 2) {
					int durchschnitt = summe / anzahl;
					System.out.println("Durchschnitte Note: " + durchschnitt);
					break;
				} else {
					System.out.println("Zu wenig Noteneingaben!");
				}
			else {
				if (note > 0 && note <= 6) {
					summe += note;
					anzahl++;
				} else {
					System.out.println("Nur Ziffer von 1-6!");
					break;
				}
			}

		} while (true);

	}

}
