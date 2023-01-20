package Tutorium;

import javax.swing.JOptionPane;

public class KFZApplikation {

	public static void main(String[] args) {
		int anzahl = Integer.parseInt(JOptionPane.showInputDialog("Anzahl eingeben"));
		KFZ[] auto = new KFZ[anzahl];
		for (int i = 0; i < auto.length; i++) {
			int anzahlRaeder = Integer.parseInt(JOptionPane.showInputDialog("Raeder Anzahl eingeben"));
			int anzahlTueren = Integer.parseInt(JOptionPane.showInputDialog("Tuerenanzahl eingeben"));
			String besitze = JOptionPane.showInputDialog("Besitzer eingeben");
			auto[i].setAnzahlRaeder(anzahlRaeder);
			auto[i].setAnzahlTueren(anzahlTueren);
			auto[i].setBesitzer(besitze);
		}
	}

}
