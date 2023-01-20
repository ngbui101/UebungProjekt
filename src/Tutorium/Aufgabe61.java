package Tutorium;

import javax.swing.JOptionPane;

public class Aufgabe61 {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Zahl eingeben"));
		if (a >= 0 && a <= 11) {
			int fakutaet = 1;
			while(a > 0) {
				fakutaet *= a;
				a--;
			}
			System.out.println(fakutaet);
		} else {
			System.err.println("falsche Eingabe");
		}
			
	}

}
