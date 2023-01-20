package Tutorium;

public class Lastwagen extends Fahrzeugen{
	public Lastwagen(double kapazitaetTank, double aktuellerFuelstand) {
		setAktuellerFuelstand(aktuellerFuelstand);
		setKapazitaetTank(kapazitaetTank);
		setTyp("LKW");
	}
}
