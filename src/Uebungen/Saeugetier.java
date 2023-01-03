package Uebungen;

class Saeugetier {
	private char geschlecht;
	private double gewicht;

	public Saeugetier(char geschlecht, double gewicht) {
		setGeschlecht(geschlecht);
		setGewicht(gewicht);
	}

	public void setGeschlecht(char geschlecht) {
		this.geschlecht = geschlecht;
	}

	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}

	public char getGeschlecht() {
		return geschlecht;
	}

	public double getGewicht() {
		return gewicht;
	}
}
