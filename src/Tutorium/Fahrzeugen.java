package Tutorium;

public abstract class Fahrzeugen implements Tankbar,Cloneable {
	private String typ;
	private double kapazitaetTank;
	private double aktuellerFuelstand;
	public String getTyp() {
		return typ;
	}
	public double getKapazitaetTank() {
		return kapazitaetTank;
	}
	public double getAktuellerFuelstand() {
		return aktuellerFuelstand;
	}
	public void setTyp(String typ) {
		this.typ = typ;
	}
	public void setKapazitaetTank(double kapazitaetTank) {
		this.kapazitaetTank = kapazitaetTank;
	}
	public void setAktuellerFuelstand(double aktuellerFuelstand) {
		this.aktuellerFuelstand = aktuellerFuelstand;
	}
	@Override
	public void tanken(double benzin) {
		aktuellerFuelstand += benzin;
	}
	public Fahrzeugen clone() throws CloneNotSupportedException {
		return (Fahrzeugen)super.clone();
	}
	
}
