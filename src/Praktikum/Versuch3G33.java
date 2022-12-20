package Praktikum;
import java.util.Scanner;

public class Versuch3G33 {
	public static String[] eingabe() {
		Scanner sc = new Scanner(System.in);
		String zifferString = "";
		String type = "";
		System.out.println("Geben Sie ein Ziffer ein.");
		zifferString = sc.nextLine();
		System.out.println("Handelt es um eine Zahl oder Zeichenkette.");
		type = sc.nextLine();
		sc.close();
		if(zifferString.startsWith("0") || zifferString.length() > 10)
			return new String[] {"-1","-1"};
		else 
			return new String[] {zifferString,type};
	}
	public static long summe(String[] eingabe) {
		if(eingabe[1].equals("Zahl"))
			return Long.parseLong(eingabe[0]);
		else if (eingabe[1].equals("Zeichenkette")) {
			long summe = 0;
			for(int i : eingabe[0].toCharArray())
				summe += i;
			return summe;
		}
		else return -1;
		
	}
	public static void ausgabe() {
		String[] eingabeStrings = eingabe();
		if (eingabeStrings[1].equals("Zahl"))
			System.out.printf("Die Zahl %s wurde eingegeben",eingabeStrings[0]);
		else if (eingabeStrings[1].equals("Zeichenkette"))
			System.out.printf("Die Ziffer der Zeichenkette %s haben als Summe ihrer ASCII-Wert den Wert %d.%n",
					eingabeStrings[0],summe(eingabeStrings));
		else 
			System.out.println("ungueltige Eingabe");
		
	}

	public static void main(String[] args) {
		ausgabe();
	}

}
