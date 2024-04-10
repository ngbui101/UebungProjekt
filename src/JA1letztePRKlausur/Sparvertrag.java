package JA1letztePRKlausur;

public abstract class Sparvertrag {
	private String sparer;
	private String vertragTyp;
	public Sparvertrag(String sparer, String vertragTyp) {
		super();
		this.sparer = sparer;
		this.vertragTyp = vertragTyp;
	}
	public String getSparer() {
		return sparer;
	}
	public String getVertragTyp() {
		return vertragTyp;
	}
	void setSparer(String sparer) {
		this.sparer = sparer;
	}
	void setVertragTyp(String vertragTyp) {
		this.vertragTyp = vertragTyp;
	}
	

}
