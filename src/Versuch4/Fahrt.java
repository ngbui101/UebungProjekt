package Versuch4;

public class Fahrt {
	private String startHafen;
	private String ankunftHafen;
	private String startTermin;
	private String ankunftTermin;
	private double preis;

	public Fahrt(String startHafen, String ankunftHafen, String startTermin, String ankunftTermin) {
		this.startHafen = startHafen;
		this.ankunftHafen = ankunftHafen;
		if (startTermin.substring(startTermin.length() - 4, startTermin.length())
				.compareTo(ankunftTermin.substring(ankunftTermin.length() - 4, ankunftTermin.length())) < 0) {
			System.err.println("Fehle Eingabe");
			System.exit(0);
		} else {
			this.startTermin = startTermin;
			this.ankunftTermin = ankunftTermin;
		}
	}

	public Fahrt() {
		startHafen = "Hamburg";
	}

	public String getStartHafen() {
		return startHafen;
	}

	public String getAnkunftHafen() {
		return ankunftHafen;
	}

	public String getStartTermin() {
		return startTermin;
	}

	public String getAnkunftTermin() {
		return ankunftTermin;
	}

	public double getPreis() {
		return preis;
	}

	void setStartHafen(String startHafen) {
		this.startHafen = startHafen;
	}

	void setAnkunftHafen(String ankunftHafen) {
		this.ankunftHafen = ankunftHafen;
	}

	void setStartTermin(String startTermin) {
		this.startTermin = startTermin;
	}

	void setAnkunftTermin(String ankunftTermin) {
		this.ankunftTermin = ankunftTermin;
	}

	void setPreis(double preis) {
		this.preis = preis;
	}
	boolean rundtour() {
		if(startHafen.equals(ankunftHafen))
			return true;
		return false;
	}
}
