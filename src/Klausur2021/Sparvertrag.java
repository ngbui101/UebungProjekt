package Klausur2021;

public abstract class Sparvertrag {
	private String sparer;
	private String vertragType;
	
	public Sparvertrag(String sparer, String vertragType) {
		this.sparer = sparer;
		this.vertragType = vertragType;
	}
	public String getSparer() {
		return sparer;
	}
	void setSparer(String sparer) {
		this.sparer = sparer;
	}
	public String getVertragType() {
		return vertragType;
	}
	void setVertragType(String vertragType) {
		this.vertragType = vertragType;
	}
	

}
