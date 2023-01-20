package Tutorium;

public class LKW extends Kraftfahrzeug{
	public LKW(String bezeichnung) {
		this.bezeichnung = bezeichnung;
		reifenanzahl = 4;
		typ = "LKW";
	}
	@Override
	public String getTyp() {
		return typ;
	}

	@Override
	public int getReifenanzahl() {
		return reifenanzahl;
	}

	@Override
	public String getBezeichnung() {
		return bezeichnung;
	}
}
