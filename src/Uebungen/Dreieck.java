package Uebungen;

public class Dreieck extends GleichseitigesEck {

	public Dreieck(int seitenLaenge) {
		super(seitenLaenge);
		super.setAnzEcken(3);
		super.setType("Dreieck");
	}
}
