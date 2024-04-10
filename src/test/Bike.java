package test;

public class Bike implements Cloneable{
	int ps;
	int marke;
	
	public Bike(int ps, int marke) {
		this.ps = ps;
		this.marke = marke;
	}
	 
	
	@Override
	public String toString() {
		return "Bike [ps=" + ps + ", marke=" + marke + "]";
	}


	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public int getPs() {
		return ps;
	}

	public int getMarke() {
		return marke;
	}

	public void setPs(int ps) {
		this.ps = ps;
	}

	public void setMarke(int marke) {
		this.marke = marke;
	}
}
