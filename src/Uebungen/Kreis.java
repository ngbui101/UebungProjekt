package Uebungen;

public class Kreis extends Flaeche {
	private int radius;

	public Kreis(int radius) {
		super.setType("Kreis");
		this.radius = radius;
	}

	@Override
	public int getUmfang() {
		return (int)(2 * Math.PI * radius);
	}
	
	
}
