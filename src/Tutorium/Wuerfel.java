package Tutorium;

import java.util.Random;

public class Wuerfel {
	private int seite;
	private int zahl;
	public int getSeite() {
		return seite;
	}
	
	public Wuerfel(int seite) {
		this.seite = seite;
	}
	public int wuerfel() {
		Random r = new Random();
		zahl = r.nextInt(seite)+1;
		return zahl;
	}
	public int getZahl() {
		return zahl;
	}
	public void setSeite(int seite) {
		this.seite = seite;
	}
	public void setZahl(int zahl) {
		this.zahl = zahl;
	}
}
