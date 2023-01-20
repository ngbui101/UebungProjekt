package Tutorium;

public class Aufgabe82 {
	public static double umfangRechtecks(double a, double b) {
		return 2 * a * b;
	}
	public static double flaecheninhaltRechtecks(double a, double b) {
		return a *b;
	}
	public static double umfangKreis(double r) {
		return 2 * r * Math.PI;
	}
	public static double flaecheninhaltKreis(double r) {
		return r * r * Math.PI;
	}
	public static void main(String[] args) {
		double a = 5;
		double b = 9;
		double r = 5.8;
		System.out.println("Umfang Rechtecks: " + umfangRechtecks(a, b));
		System.out.println("Flaecheninhalt Rechtecks: " + flaecheninhaltRechtecks(a, b));
		System.out.println("Kreisumfang: " + umfangKreis(r));
		System.out.println("Kreisflaecehninhalt: " + flaecheninhaltKreis(r));
	}

}
