package Uebungen;

import javax.swing.*;

class Aufgabe152 {
	public static void main(String args[]) {
		String s1 = JOptionPane.showInputDialog(null, "Geben Sie einen Namen ein.");
		String s2 = JOptionPane.showInputDialog(null, "Geben Sie einen zweiten Namen ein.");
		s1 = s1.trim();
		s1 = s1.toUpperCase();
		s2 = s2.trim();
		s2 = s2.toUpperCase();
		if (s1.compareTo(s2) > 0)
			System.out.println(s1 + " ist lexikographisch größer als " + s2 + ".");
		else if (s1.compareTo(s2) < 0)
			System.out.println(s2 + " ist lexikographisch größer als " + s1 + ".");
		else {
			System.out.println("Beide Eingaben sind gleich.");
			System.exit(0);
		}
		for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
			if (!(s1.substring(i, i + 1).equals(s2.substring(i, i + 1))) && s1.compareTo(s2) > 0) {
				System.out.println("Der " + (i + 1) + ". Buchstabe von " + s1 + " ist um " + s1.compareTo(s2)
						+ " Buchstaben größer als der " + (i + 1) + ". Buchstabe von " + s2 + ".");
				break;
			} else if (!(s1.substring(i, i + 1).equals(s2.substring(i, i + 1)))) { // && (s1.compareTo(s2) < 0)
				System.out.println("Der " + (i + 1) + ". Buchstabe von " + s1 + " ist um " + Math.abs(s1.compareTo(s2))
						+ " Buchstaben kleiner als der " + (i + 1) + ". Buchstabe von " + s2 + ".");
				break;
			}
			if (i + 1 == Math.min(s1.length(), s2.length())) // letzter Durchlauf
				if (s1.compareTo(s2) > 0)
					System.out.println(s1 + " ist um " + s1.compareTo(s2) + " Buchstaben länger als " + s2 + ".");
				else
					System.out.println(
							s2 + " ist um " + Math.abs(s1.compareTo(s2)) + " Buchstaben länger als " + s1 + ".");
		}
		System.exit(0);
	}
}