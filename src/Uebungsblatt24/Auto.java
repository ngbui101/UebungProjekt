package Uebungsblatt24;

public class Auto implements Cloneable{
	private String typ;
	private AutoReifenSatz reifen;
	@Override
	
	public String toString() {
		return "Auto [typ=" + typ + ", reifen=" + reifen.getAnzahl()+ " " +reifen.getTyp() + "]";
	}

	public Auto() {
	}
	
	public String getTyp() {
		return typ;
	}
	public AutoReifenSatz getReifen() {
		return reifen;
	}
	public void setTyp(String typ) {
		this.typ = typ;
	}
	public void setReifen(AutoReifenSatz reifen) {
		this.reifen = reifen;
	}
	public Auto clone() throws CloneNotSupportedException{
		Auto hilf = (Auto)super.clone();
		hilf.reifen = reifen.clone();
		return hilf;
	}
}
