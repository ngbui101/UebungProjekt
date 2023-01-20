package Uebungen;

public class Aufgabe262 {
	public static long fibonacci(int n) {
		if (n <= 2)
			return 1;
		else {
			System.out.println("+1");
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	public static void main(String[] args) {
		int n = 100;
		System.out.printf("Die %d.Fibonacci-Zahl ist: %d%n",n,fibonacci(n));
	}

}
