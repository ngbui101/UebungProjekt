package Tutorium;

import javax.swing.JOptionPane;

public class Aufgabe62 {

	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("Monat eingeben");
		String ausgabe;
		switch (a) {
		case "1","3","5","7","8","10","12": ausgabe = "31";
			break;
		case "2" : ausgabe = "28";
			break;
		case "4","6","9","11" : ausgabe = "30";
		default: ausgabe = "falsche Eingabe";
			break;
		}
		System.out.println(ausgabe);
	}

}
