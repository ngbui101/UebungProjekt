import java.util.Iterator;
import java.util.Scanner;

public class Aufgabe152 {
	public static void main(String[] args) {
		String name1, name2;
		int differenz;
		Scanner eingabeScanner = new Scanner(System.in);
		System.out.println("Geben Sie ein Name ein");
		name1 = eingabeScanner.nextLine();
		System.out.println("Geben Sie zweiten Name ein");
		name2 = eingabeScanner.nextLine();
		name1 = name1.trim().toUpperCase();
		name2 = name2.trim().toUpperCase();
		differenz = name1.compareTo(name2);
		if (differenz != 0) {
			for (int i = 0; i < name1.length() && i < name2.length(); i++) {
				String grosserString, kleinString;
				if (differenz > 0) {
					grosserString = name1;
					kleinString = name2;
				} else {
					grosserString = name2;
					kleinString = name1;
				}
				if (name1.substring(i, i + 1).equals(name2.substring(i, i + 1)) == false) {
					// buchstaben = name1.substring(i, i+1);
					System.out.printf("%s ist unterschiedlich zu %s bei %d.Buchstabe" + "der Unteschied ist %d%n",
							grosserString, kleinString, i + 1, Math.abs(differenz));
					break;
				}
				if (i + 1 == Math.min(name1.length(), name2.length()))
					System.out.printf("%s ist um %s Buchstaben langer als %s.%n", grosserString, Math.abs(differenz),
							kleinString);
			}
		} else
			System.out.println("Die beide Namen sind gleich");
		eingabeScanner.close();
	}

}