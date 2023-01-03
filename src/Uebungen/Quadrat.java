package Uebungen;

public class Quadrat extends GleichseitigesEck {

	public Quadrat(int seitenLaenge) {
		super(seitenLaenge);
		super.setAnzEcken(4);
		super.setType("Quadrat");
	}

	@Override
	int getUmfang() {
		return 4*getSeitenLaenge();
	}
	
}
