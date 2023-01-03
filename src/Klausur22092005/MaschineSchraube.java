package Klausur22092005;

public class MaschineSchraube extends Schraube {
	private String schraubenkopf = "DIN 931";
	private String qualitaet = "400 N/mm^2 Zugfestigkeit";
	public MaschineSchraube(double laenge, double durchmesser, String schraubenkopf, String qualitaet) {
		super(laenge, durchmesser);
		this.schraubenkopf = schraubenkopf;
		this.qualitaet = qualitaet;
	}
	
	public String getSchraubenkopf() {
		return schraubenkopf;
	}
	public void setSchraubenkopf(String schraubenkopf) {
		this.schraubenkopf = schraubenkopf;
	}
	public String getQualitaet() {
		return qualitaet;
	}
	public void setQualitaet(String qualitaet) {
		this.qualitaet = qualitaet;
	}

	@Override
	public String getType() {
		return "MaschinenSchraube";
	}
	
}
