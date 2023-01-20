package Versuch5;

public abstract class Geraet implements Wechsel {
	private String kabel;
	private String einAusSchalter;
	private String geraeteTyp;

	public Geraet(String kabel, String einAusSchalter) {
		this.kabel = kabel;
		this.einAusSchalter = einAusSchalter;
	}
	@Override
	public String wechseln(String teil) {
		if (teil.equals("Kabel")) {
			kabel = "neu";
			return "Kabel wurde gewechselt";
		}
		if (teil.equals("Einausschalter")) {
			einAusSchalter = "neu";
			return "Einausschalter wurde gewechselt";
		} else
			return "Keine richtige Eingabe";
	}
	public String getKabel() {
		return kabel;
	}
	public String getEinAusSchalter() {
		return einAusSchalter;
	}

	public void setGeraeteTyp(String geraeteTyp) {
		this.geraeteTyp = geraeteTyp;
	}
	public String getGeraeteTyp() {
		return geraeteTyp;
	}
	abstract void ausgabe();

}
