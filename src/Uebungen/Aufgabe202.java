package Uebungen;

import java.util.Random;
import javax.swing.JOptionPane;

public class Aufgabe202 {
	public static void main(String[] args) {
		try {
			String eingabe;
			int[] r = new int[10];
			Random rg = new Random();
			for (int i = 0; i < r.length; i++) {
				r[i] = rg.nextInt(10) + 1;
			}
			eingabe = JOptionPane.showInputDialog(
					"Geben Sie eine ganze Zahl zwischen 1 und 10 ein,\num eine Zufallszahl zu bestimmen:");
			try {
				Double.parseDouble(eingabe);
			} catch (NumberFormatException e) {
				System.out.println("Keine Zahl gegeben");
				System.exit(0);
			}

			int j = Integer.parseInt(eingabe);
			System.out.println("Die Zahl ist: " + r[j - 1]);
			
		} catch (NumberFormatException nfe) {
			System.out.println("Keine ganze Zahl gegeben.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Die gegebene Zahl ist nicht zwischen 1 und 10");
		}
	}
}