package Uebungsblatt24;

public abstract class Moebel implements Lackierbar {
	private int farbe = 0;
	private String type;

	public void setType(String type) {
		this.type = type;
	}
	public void lackieren(int farbe) {
		this.farbe = farbe;
	}
}
