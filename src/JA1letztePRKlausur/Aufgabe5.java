package JA1letztePRKlausur;

import javax.swing.JOptionPane;

public class Aufgabe5 {

	public static void main(String[] args) {
		int summe = 0;
		int anzahl = 0;
		while(true) {
			String eingabe = JOptionPane.showInputDialog("Note");
			int note = Integer.parseInt(eingabe);
			if(note == 0) {
				if(anzahl >= 2) {
					double durchschnitt = (double)summe/anzahl;
					System.out.println("Durchschnitte: " +durchschnitt);
					break;
				}else {
					System.out.println("Zu wenig Noteneingaben!");
				}
			}else {
				if(note > 0 && note <= 6) {
					summe+= note;
					anzahl++;
				}else {
					System.out.println("Nur Ziffern von 1-6");
					break;
				}
			}
		}
	}

}
