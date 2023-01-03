package Versuch4;

import javax.swing.JOptionPane;

public class FahrApplikation {

	public static void main(String[] args) {
		Fahrt[] fahrplan = new Fahrt[3];
		for (int i = 0; i < fahrplan.length; i++) {
			String startHafen = JOptionPane.showInputDialog("Starthafen eingabe");
			String ankunftHafen = JOptionPane.showInputDialog("Ankunfthafen eingabe");
			String startTermin = JOptionPane.showInputDialog("Starttermin eingabe");
			String ankunftTermin = JOptionPane.showInputDialog("Ankunfttermin eingabe");
			double preis = Double.parseDouble(JOptionPane.showInputDialog("Preis eingabe"));
			fahrplan[i] = new Fahrt(startHafen, ankunftHafen, startTermin, ankunftTermin);
			fahrplan[i].setPreis(preis);
		}
		for (Fahrt fahrt : fahrplan) {
			System.out.println("Starthafen: " + fahrt.getStartHafen());
			System.out.println("Ankunfthafen: " + fahrt.getAnkunftHafen());
			System.out.println("Starttermin: " + fahrt.getStartTermin());
			System.out.println("Ankunfttermin: " + fahrt.getAnkunftTermin());
			System.out.println("Preis: " + fahrt.getPreis());
			System.out.println("Runde Tour? " + fahrt.rundtour());
			System.out.println("---------------------------------------");
		}
	}
}
