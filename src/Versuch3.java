import java.util.Scanner;

public class Versuch3 {
	public static double psRechnen(double wert) {
		return wert / 735.5;
	}

	public static double wattRechnen(double wert) {
		return wert * 735.5;
	}

	public static String[] eingabe() {
		Scanner eingabe = new Scanner(System.in);
		String sc1 = eingabe.next();
		String sc2 = eingabe.next();
		eingabe.close();
		return new String[] { sc1, sc2 };
	}

	public static void main(String[] args) {
		System.out.println("Geben Sie eine Wert in W oder PS ein.");
		String[] einlesenStrings = eingabe();
		try {
			double wert = Double.parseDouble(einlesenStrings[0]);
			String einheitString = einlesenStrings[1];

			if (einheitString.equals("W"))
				System.out.printf("%.0f Watt entsprechen %f PS", wert, psRechnen(wert));
			else if (einheitString.equals("PS"))
				System.out.printf("%.1f PS entsprechen %.0f W", wert, wattRechnen(wert));
			else
				System.out.println("keine gueltige Einheit");
		}
		catch (NumberFormatException nfe) {
			System.out.println("Geben Sie ein gueltige Zahl ein");
		}
	
	}
}
