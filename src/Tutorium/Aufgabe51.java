package Tutorium;

import javax.swing.JOptionPane;

public class Aufgabe51 {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("1. Zahl eingeben"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("2. Zahl eingeben"));
		String ausgabe = a < b ? "a kleiner als b" : a > b ? "a groesser als b" : "a und b sind gleich";
		System.out.println(ausgabe);
	}

}
