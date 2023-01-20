package Uebungen;

public class Aufgabe261 {
	public static int qhochp(int p, int q) {
		if (q == 0)
			return 1;
		if (q == 1)
			return p;
		return p * qhochp(p, q - 1);
	}

	public static void main(String[] args) {
		int p = 6;
		int q = 2;
		System.out.println(qhochp(p, q));
	}

}
