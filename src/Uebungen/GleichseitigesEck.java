package Uebungen;

public abstract class GleichseitigesEck extends Flaeche {
	private int anzEcken;
	private int seitenLaenge;
	public GleichseitigesEck(int seitenLaenge) {
		this.seitenLaenge = seitenLaenge;
	}
	@Override
	int getUmfang() {
		return seitenLaenge*anzEcken;
	}

	public void setAnzEcken(int anzEcken) {
		this.anzEcken = anzEcken;
	}
	
	
}
