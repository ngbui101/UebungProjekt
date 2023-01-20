package Versuch4;

public class Behaelter {
	private String farbe;
	private double preis;
	private String form;
	
	public Behaelter(String form) {
		this.form = form;
	}
	
	public Behaelter(String farbe, String form) {
		this.farbe = farbe;
		this.form = form;
	}
	
	public void preisErhoehung(double wert) {
		preis += wert;
	}
	public Behaelter(char[] farbe) {
		this.farbe = String.valueOf(farbe);
		setForm("3 Liter Eimer");
	}

	public String getFarbe() {
		return farbe;
	}
	public double getPreis() {
		return preis;
	}
	public String getForm() {
		return form;
	}
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	public void setPreis(double preis) {
		this.preis = preis;
	}
	public void setForm(String form) {
		this.form = form;
	}
	
}
