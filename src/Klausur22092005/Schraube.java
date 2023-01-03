package Klausur22092005;

public class Schraube {
	private double laenge;
	private double durchmesser;
	
	public Schraube(double laenge, double durchmesser) {
		this.laenge = laenge;
		this.durchmesser = durchmesser;
	}
	public double getLaenge() {
		return laenge;
	}
	public void setLaenge(double laenge) {
		this.laenge = laenge;
	}
	public double getDurchmesser() {
		return durchmesser;
	}
	public void setDurchmesser(double durchmesser) {
		this.durchmesser = durchmesser;
	}
	public String getType() {
		return "Schraube";
	}
}
