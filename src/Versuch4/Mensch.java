package Versuch4;

public class Mensch {
	private String vorname;
	private String nachname;
	private int geburtsdatum;
	
	public Mensch(int geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

	public Mensch(String vorname, String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
	}
	
	public Mensch() {
		this.vorname = "Muster";
		this.nachname = "Test";
		this.geburtsdatum = 1012000;
	}
	public int geburtsjahr() {
		return geburtsdatum % 10000;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public int getGeburtsdatum() {
		return geburtsdatum;
	}
	public void setGeburtsdatum(int geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

	@Override
	public String toString() {
		return "Vorname: " + vorname + "\nNachname: " + nachname + "\nGeburtsjahr: " + geburtsjahr();
	}
	
}
