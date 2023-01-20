package Tutorium;

import javax.swing.JOptionPane;

public class Aufgabe91 {

	public static void main(String[] args) {
		String eingabe = JOptionPane.showInputDialog("Eingabe: ");
		System.out.println(eingabe);
		char[] arr = eingabe.toCharArray();
		char hilf = ' ';
		for (int i = 0, j = arr.length-1; i < arr.length/2; i++, j--) {
			hilf = arr[i];
			arr[i] = arr[j];
			arr[j] = hilf;
		}
		for (char c : arr) {
			System.out.print(c);
		}
	}

}
