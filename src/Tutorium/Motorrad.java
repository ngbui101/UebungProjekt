package Tutorium;

public class Motorrad extends Kraftfahrzeug{
	
	public Motorrad(String bezeichnung) {
		this.typ = "Motorrad";
		this.reifenanzahl = 2;
		this.bezeichnung = bezeichnung;
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
