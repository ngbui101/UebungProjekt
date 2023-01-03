package Klausur22092005;

public class Aufgabe8 {
	public static int zaehlenArray(String[] arr, String text) {
		int zaehl = 0;
		for (String string : arr) {
			if (string.equals(text))
				zaehl++;
		}
		return zaehl;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
