package Tutorium;

import javax.swing.JOptionPane;

public class Aufgabe92 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Name eingeben");
		name.trim();
		if (name.isEmpty())
			System.out.println("Eingabe ist leer");
		else {
			char[] nameArr = name.toCharArray();
 			int zaehler = 1;
			for (int i = 0; i < nameArr.length; i++) {
				if(nameArr[i] == ' ') {
					zaehler++;
				}
			}
			char[] initialen = new char[zaehler];
			for (int i = 0, j = 0; i < nameArr.length; i++) {
				if (i == 0) {
					initialen[j] = nameArr[i];
					j++;
				}
				if(nameArr[i] == ' ') {
					initialen[j] = nameArr[i+1];
					j++;
				}
			}
			System.out.println("Der Name besteht aus " + zaehler + " Teile");
			for (char c : initialen) {
				System.out.print(c);
			}
		}

	}

}
