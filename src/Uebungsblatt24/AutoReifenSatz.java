package Uebungsblatt24;

public class AutoReifenSatz implements Cloneable{
	private String typ;
	private int anzahl;
	
	public AutoReifenSatz(String typ, int anzahl) {
		this.typ = typ;
		this.anzahl = anzahl;
	}
	public AutoReifenSatz clone() throws CloneNotSupportedException {
		return (AutoReifenSatz)super.clone();
	}

	public String getTyp() {
		return typ;
	}

	public int getAnzahl() {
		return anzahl;
	}

	void setTyp(String typ) {
		this.typ = typ;
	}

	void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}

}
