package Tutorium;

import javax.swing.JOptionPane;

public class KFZmains {

	public static void main(String[] args) {
		int anzahl = Integer.parseInt(JOptionPane.showInputDialog("Wie viel KFZ moechten Sie einlesen"));
		Kraftfahrzeug[] kfz = new Kraftfahrzeug[anzahl];
		for (int i = 0; i < anzahl; i++) {
			String key = JOptionPane.showInputDialog("Welchen Typ KFZ handelt es sich?((M)otorrad,(L)kw,(P)kw");
			Kraftfahrzeug temp;
			switch (key) {
			case "M":
				temp = new Motorrad(JOptionPane.showInputDialog("Bezeichnung eingeben"));
				break;
			case "P":
				temp = new PKW(JOptionPane.showInputDialog("Bezeichnung eingeben"));
				break;
			case "L":
				temp = new LKW(JOptionPane.showInputDialog("Bezeichnung eingeben"));
				break;
			default:
				i--;
				continue;
			}
			kfz[i] = temp;
		}
		for (Kraftfahrzeug kraftfahrzeug : kfz) {
			System.out.printf("Typ: %s%nReifenanzahl: %d%nBezeichnung: %s%n", kraftfahrzeug.getTyp(),
					kraftfahrzeug.getReifenanzahl(), kraftfahrzeug.getBezeichnung());
		}
	}

}
