package Tutorium;

public class Autohaus implements Cloneable{
	private Fahrzeugen[] zuVerkaufenKFZ = new Fahrzeugen[0];
	private String name;
	private String adresse;
	public Autohaus(String name, String adresse) {
		this.name = name;
		this.adresse = adresse;
	}
	public String getName() {
		return name;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public Fahrzeugen[] getZuVerkaufenKFZ() {
		return zuVerkaufenKFZ;
	}
	public void addZuverkaufenKFZ(double kapazitaetTank, double aktuellerFuelstand, String typ) {
		Fahrzeugen[] temp = zuVerkaufenKFZ;
		zuVerkaufenKFZ = new Fahrzeugen[temp.length+1];
		for (int i = 0; i < temp.length; i++) {
			zuVerkaufenKFZ[i] = temp[i]; 
		}
		if(typ.equals("PKV"))
			zuVerkaufenKFZ[temp.length] = new Privatfahrzeugen(kapazitaetTank, aktuellerFuelstand);
		if(typ.equals("LKW"))
			zuVerkaufenKFZ[temp.length] = new Lastwagen(kapazitaetTank, aktuellerFuelstand);
	}
	public Autohaus flachKopie() throws CloneNotSupportedException{
		return (Autohaus)super.clone();
	}
	public Autohaus tiefKopie() throws CloneNotSupportedException {
		Autohaus hilf = (Autohaus)super.clone();
		Fahrzeugen[] temp = new Fahrzeugen[zuVerkaufenKFZ.length];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = zuVerkaufenKFZ[i].clone(); 
		}
		hilf.zuVerkaufenKFZ = temp;
		return hilf;
	}
}
