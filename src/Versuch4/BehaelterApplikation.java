package Versuch4;

import javax.swing.JOptionPane;

public class BehaelterApplikation {
	public static void main(String[] args) {
		Behaelter[] behaelterkiste = new Behaelter[3];
		String form = JOptionPane.showInputDialog("Geben Sie den Form ein");
		for (int i = 0; i < behaelterkiste.length; i++) {
			behaelterkiste[i] = new Behaelter(form);
		}
		for (int i = 0; i < behaelterkiste.length; i++) {
			behaelterkiste[i]
					.setFarbe(JOptionPane.showInputDialog("Geben Sie Farbe vom Behaelter Nr. " + (i + 1) + " ein!"));
			behaelterkiste[i].setPreis(Double.parseDouble(
					JOptionPane.showInputDialog("Geben Sie den Preis vom Behaelter Nr. " + (i + 1) + " ein!")));
		}

		for (int i = 0; i < behaelterkiste.length; i++) {
			behaelterkiste[i].preisErhoehung(0.08);
		}
		double sum = 0;
		for (int i = 0; i < behaelterkiste.length; i++) {
			System.out.printf("Behaelter Nr.%d%nForm: %s%nFarbe: %s%nPreis: %.2f Euro%n", i+1,behaelterkiste[i].getForm(),
					behaelterkiste[i].getFarbe(), behaelterkiste[i].getPreis());
			sum += behaelterkiste[i].getPreis();
		}
		System.out.printf("Gesamtpreis: %.2f Euro%n",sum);
	}
}
