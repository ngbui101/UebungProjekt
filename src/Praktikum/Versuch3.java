package Praktikum;

import java.util.Scanner;

public class Versuch3 {
	

	public static double sinus(double grad) {
		return Math.sin(grad*Math.PI/180);
	}

	public static double cosinus(double grad) {
		return Math.cos(grad*Math.PI/180);
	}
	public static String[] eingabe() {
		System.out.println("Geben Sie sin oder cosin mit einer Wert in DEG oder RAD ein");
		Scanner scanner = new Scanner(System.in);
		String sinorcos = scanner.next();
		double winkel = Double.parseDouble(scanner.next());
		String gradordeg = scanner.next();
		scanner.close();
		return new String[] {sinorcos,String.valueOf(winkel),gradordeg};
	}

	public static void main(String[] args) {
		String[] eingabe = eingabe(); 
		double wert = .0;
		if(eingabe[2].equals("DEG")) {
			wert = eingabe[0].equals("sin") ? sinus(Double.parseDouble(eingabe[1])) : eingabe[0].equals("cos") ? cosinus(Double.parseDouble(eingabe[1])) : -1.0;
		}
		if(eingabe[2].equals("RAD")) {
			wert = eingabe[0].equals("sin") ? Math.sin(Double.parseDouble(eingabe[1])) : eingabe[0].equals("cos") ? Math.cos(Double.parseDouble(eingabe[1])) : -1.0;
		}
		if (wert != -1.0)
			System.out.printf("%s(%s) = %f%n", eingabe[0],eingabe[1],wert);
		else 
			System.out.println("falsche Eingabe");
	}

}
