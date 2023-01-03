package Uebungen;

class Laeufer {
	// Attribute
	private Uhrzeit startZeit, ankunftsZeit;
	private String laufDauer;
	private String name;
	private int laufDauerInSekunde;
	// Konstruktor
	Laeufer(Uhrzeit startZeit, Uhrzeit ankunftsZeit, String name) {
		this.startZeit = startZeit;
		this.ankunftsZeit = ankunftsZeit;
		this.name = name;
	}

	// Methode
	String getLaufDauer() {
		laufDauer = ankunftsZeit.minus(startZeit);
		return laufDauer;
	}
	int getLaufDauerInSekunde() {
		laufDauerInSekunde = ankunftsZeit.minusInsekunden(startZeit);
		return laufDauerInSekunde;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
