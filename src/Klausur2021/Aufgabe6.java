package Klausur2021;

import java.util.Scanner;

public class Aufgabe6 {
	public static int zeichen(char[] a) {
		char max = a[0];
		char min = a[1];
		char ziel = a[2];
		if (max < min) {
			return zeichen(new char[] { a[1], a[0], a[2] });
		}
		char randomChar = (char) (min + 1 + (int) (Math.random() * (max - min)));
		if (randomChar == ziel)
			return 1;
		else
			return zeichen(a) + 1;
	}

	public static String eingabe() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Geben Sie ein Zeichenkette mit 3  sichtbare Zeichen ein");
		String eingabe = sc.nextLine();
		sc.close();
		return eingabe;
	}

	public static void main(String[] args) {
		try {
			String eingabe = eingabe();
			if (eingabe.length() != 3)
				throw new Exception("Zeichenkette darf nur 3 Zeichen erhalten");
			char[] a = eingabe.toCharArray();
			if (Math.abs(a[0] - a[1]) == 1)
				throw new Exception("Die Grenze darf nicht leer sein");
			for (char c : a) {
				if (c > 126 || c < 32)
					throw new Exception("unsichtbar Zeichen");
			}
//			System.out.println("Beginn");
			int count = zeichen(a);
			System.out.println("count");
			System.out.println(count);
		} catch (Exception e) {
			System.err.println(e);
			System.exit(0);
		}
	}
}
