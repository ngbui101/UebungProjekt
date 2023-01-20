package Uebungen;

public abstract class Flaeche {
	private String type;

	public Flaeche() {
	}

	public String getType() {
		return type;
	}

	abstract int getUmfang();

	void setType(String type) {
		this.type = type;
	}
	
}
