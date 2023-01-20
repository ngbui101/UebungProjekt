package Tutorium;

public abstract class Kraftfahrzeug {
	String typ;
	int reifenanzahl;
	String bezeichnung;
	public abstract String getTyp();
	public abstract int getReifenanzahl(); 
	public abstract String getBezeichnung();
}
