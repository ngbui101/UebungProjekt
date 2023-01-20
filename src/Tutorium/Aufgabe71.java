package Tutorium;


import javax.swing.JOptionPane;

public class Aufgabe71 {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Zahl eingeen >0"));
		int zaehler = 1;
		while(true) {
			if(zaehler*zaehler <= a) {
				if (a % zaehler == 0) {
					System.out.println("a ist keine Primzahl");
					break;
				} else {
					zaehler ++;
				}
			}else {
				System.out.println("a ist eine Primzahl");
				break;
			}
		}
	}

}
