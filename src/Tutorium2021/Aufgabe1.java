package Tutorium2021;

public class Aufgabe1 {

	public static void main(String[] args) {
		String eingabe = "dasdvsadyxsad dasdasdasdDWUUUUUsadeeee";
		int[] zaehler = new int[5];
		char[] vokale = new char[]{'a','e','i','o','u'};
		char[] eingabeChar = eingabe.toLowerCase().toCharArray();
		for (int i = 0; i < eingabeChar.length; i++) {
			for (int j = 0; j < vokale.length; j++) {
				if (eingabeChar[i] == vokale[j])
					zaehler[j]++;
			}
		}
		for (int i = 0; i < vokale.length; i++) {
			System.out.printf("%s kommt %d Mal%n",vokale[i],zaehler[i]);
		}
	}

}
