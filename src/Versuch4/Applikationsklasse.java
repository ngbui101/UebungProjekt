package Versuch4;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Applikationsklasse {
	public static void main(String[] args) {
		try {
			int anzahl = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie die Anzahl der Familie ein"));
			int summeGeburtsjahre = 0; // Hilfvariable um Mittelwert zu berechnen
			Mensch[] familie = new Mensch[anzahl];
			for (int i = 0; i < familie.length; i++) {
				familie[i] = new Mensch();
			}
			// einlesen
			Einlesenschleife: 
				for (int i = 0; i < familie.length; i++) {
				String name = JOptionPane
						.showInputDialog("Geben Sie Nachname und Vorname des Mitglieders mit \",\" als Trennung ein");
				int geburtsdatum = Integer.parseInt(JOptionPane
						.showInputDialog("Geben Sie die Geburtsdatum der Mitglieder in der Form ttmmjjjj ein"));
				Scanner sc = new Scanner(name).useDelimiter(",");
				String nachname = sc.next();
				String vorname = sc.next();
				sc.close();

				// Name im Array vergleichen
				if (i > 0) {
					for (int j = i; j > 0; j--) {
						if (vorname.equals(familie[j - 1].getVorname())
								&& nachname.equals(familie[j - 1].getNachname())) {
							JOptionPane.showMessageDialog(null,
									"Der Name " + nachname + "," + vorname + " ist schon existiert.");
							i--;
							continue Einlesenschleife;
						}
					}
				}
				familie[i] = new Mensch(vorname, nachname);
				familie[i].setGeburtsdatum(geburtsdatum);
				summeGeburtsjahre += familie[i].geburtsjahr();
			}
			// Ausgeben
			/*
			 * for (int i = 0; i < familie.length; i++) {
			 * System.out.printf("Vorname: %s%nNachname: %s%nGeburtsjahr: %d%n",
			 * familie[i].getVorname(), familie[i].getNachname(), familie[i].geburtsjahr());
			 * }
			 */
			// Berechnung der Mittelwert der Geburtsjahre der Familienmitglieder
			for (Mensch mensch : familie) {
				System.out.println(mensch);
			}
			System.out.println("Die Mittelwert der Geburtsjahre der Familienmitglieder: "
					+ Math.round(summeGeburtsjahre / familie.length));
		} catch (NumberFormatException e) {
			System.out.println("Sie haben keine Nummer gegeben");
			System.exit(0);
		}
	}

}
