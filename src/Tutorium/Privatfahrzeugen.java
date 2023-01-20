package Tutorium;

public class Privatfahrzeugen extends Fahrzeugen{

	public Privatfahrzeugen(double kapazitaetTank, double aktuellerFuelstand) {
		setAktuellerFuelstand(aktuellerFuelstand);
		setKapazitaetTank(kapazitaetTank);
		setTyp("PKW");
	}
}
