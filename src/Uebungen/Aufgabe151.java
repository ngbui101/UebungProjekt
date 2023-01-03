package Uebungen;

import java.util.Scanner;

public class Aufgabe151 {

	public static void main(String[] args) {
		// eingabe
		System.out.println("Geben Sie Ihre Email Adresse ein");
		Scanner sc = new Scanner(System.in);
		String eingabe = sc.nextLine();
		sc.close();
		eingabe = eingabe.toLowerCase();
		System.out.println(eingabe);
		if (eingabe.contains("@")) {
			String domain = eingabe.substring(eingabe.indexOf('@') + 1, eingabe.length());
			String praefix = eingabe.substring(0, eingabe.indexOf('@'));
			if (domain.contains("@"))
				System.out.println("Fehlermeldung: Es darf nur ein @ geben");
			else {
				if (praefix.isEmpty() || domain.isEmpty())
					System.out.println("Praefix oder Domain darf nicht leer sein");
				else {
					System.out.printf("Praefix:%s%nDomain:%s%n", praefix, domain);
					if (eingabe.contains("bochum"))
						System.out.println("bochum ist im String vorkommt\n" + "letzte drei Zeichen is: "
								+ eingabe.substring(eingabe.length() - 3));
					else
						System.out.println("bochum ist im String nicht vorkommt");
					String modifizierteEingabe = eingabe.replace("@", "_at_");
					modifizierteEingabe = "OK" + modifizierteEingabe;
					System.out.println("Modifizierte Email: " + modifizierteEingabe);
				}

			}
		} else
			System.out.println("Fehlermeldung: Kein Email-Adresse vorhanden");
		
	}

}
