package test;

import javax.swing.JOptionPane;

public class Test1 {

	public static void main(String[] args) {
		char c = JOptionPane.showInputDialog("Eingabe").toCharArray()[0];
		System.out.println(c);
		
	}

}
