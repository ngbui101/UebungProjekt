package Uebungen;

public abstract class GleichseitigesEck extends Flaeche {
	private int anzEcken;
	private int seitenLaenge;
	public GleichseitigesEck(int seitenLaenge) {
		this.seitenLaenge = seitenLaenge;
	}
	@Override
	int getUmfang() {
		return 0;
	}
	public int getSeitenLaenge() {
		return seitenLaenge;
	}
	public void setSeitenLaenge(int seitenLaenge) {
		this.seitenLaenge = seitenLaenge;
	}
	public int getAnzEcken() {
		return anzEcken;
	}
	public void setAnzEcken(int anzEcken) {
		this.anzEcken = anzEcken;
	}
	
	
}
