package Tutorium;

import javax.swing.JOptionPane;

public class KFZ_Main {
	public static void main(String args[]) throws CloneNotSupportedException {
		String menu = "Waehlen Sie Funktion aus\n";
		menu += "1) Neues Autohaus erstellen\n";
		menu += "2) KFZ zum Verkauf eintragen\n";
		menu += "3) Kopieren eines Autohauses\n";
		menu += "4) Autohaus ansehen\n";
		menu += "5) Anwendung beenden";
		Autohaus[] ger = new Autohaus[0];
		Schleife: while (true) {
			String key = JOptionPane.showInputDialog(menu);
			switch (key) {
			case "1":
				Autohaus[] temp = ger;
				ger = new Autohaus[temp.length + 1];
				for (int i = 0; i < temp.length; i++) {
					ger[i] = temp[i];
				}
				String name = JOptionPane.showInputDialog("Name des Autohauses eingeben");
				String adresse = JOptionPane.showInputDialog("Adresse eingeben");
				ger[temp.length] = new Autohaus(name, adresse);
				break;
			case "2":
				String autohausList = "Autohaus aus der Liste waehlen: \n";
				for (int i = 0; i < ger.length; i++) {
					autohausList += (i + 1) + ". " + ger[i].getName() + "\n";
				}
				int indexAutohaus = Integer.parseInt(JOptionPane.showInputDialog(autohausList)) - 1;
				String type = JOptionPane.showInputDialog("Handelt es sich um ein PKW oder LKW");
				double aktuellerFuelstand = Double
						.parseDouble(JOptionPane.showInputDialog("Aktueller Fuelstand eingeben"));
				double kapazitaetTank = Double.parseDouble(JOptionPane.showInputDialog("Kapazitaet eingeben"));
				if (type.equals("PKW"))
					ger[indexAutohaus].addZuverkaufenKFZ(kapazitaetTank, aktuellerFuelstand, type);
				if (type.equals("LKW"))
					ger[indexAutohaus].addZuverkaufenKFZ(kapazitaetTank, aktuellerFuelstand, type);
				break;
			case "3":
				autohausList = "Welches Autohaus moechten Sie copieren: \n";
				for (int i = 0; i < ger.length; i++) {
					autohausList += (i + 1) + ". " + ger[i].getName() + "\n";
				}
				indexAutohaus = Integer.parseInt(JOptionPane.showInputDialog(autohausList)) - 1;
				temp = ger;
				ger = new Autohaus[temp.length + 1];
				for (int i = 0; i < temp.length; i++) {
					ger[i] = temp[i];
				}
				String copyType = JOptionPane.showInputDialog("(T)ief Copy oder (F)lach Kopie");
				if (copyType.equals("T")) {
					ger[temp.length] = ger[indexAutohaus].tiefKopie();
				}
				if (copyType.equals("F")) {
					ger[temp.length] = ger[indexAutohaus].flachKopie();
				}
				break;
			case "4":
				autohausList = "Autohaus waehlen: \n";
				for (int i = 0; i < ger.length; i++) {
					autohausList += (i + 1) + ". " + ger[i].getName() + "\n";
				}
				indexAutohaus = Integer.parseInt(JOptionPane.showInputDialog(autohausList)) - 1;
				for (Fahrzeugen fahrzeugen : ger[indexAutohaus].getZuVerkaufenKFZ()) {
					System.out.printf("Type: %s%nKapazitaet Tank: %.2f Liter%nAktueller Fuelstand: %.2f Liter%n",
							fahrzeugen.getTyp(), fahrzeugen.getKapazitaetTank(), fahrzeugen.getAktuellerFuelstand());
				}
				break;
			case "5":
				break Schleife;
			default:
				continue;
			}
		}
	}
}
