package Tutorium;

public class PKW extends Kraftfahrzeug{
	public PKW(String bezeichnung) {
		this.bezeichnung = bezeichnung;
		this.typ = "PKW";
		this.reifenanzahl = 4;
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
