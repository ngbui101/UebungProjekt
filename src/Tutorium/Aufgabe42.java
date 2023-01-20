package Tutorium;

import javax.swing.JOptionPane;

public class Aufgabe42 {

	public static void main(String[] args) {
		double a = Double.parseDouble(JOptionPane.showInputDialog("erste Zahl eingeben"));
		double b = Double.parseDouble(JOptionPane.showInputDialog("zweiste Zahl eingeben"));
		double flaecheninhalt = a*b;
		double umfang = a*b*2;
		JOptionPane.showMessageDialog(null, "Flaecheninhalt: "+flaecheninhalt+"\nUmfang: " + umfang);
	}

}
