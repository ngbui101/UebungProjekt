package Uebungen;

class Auto {
	private String typ;
	private int kw;

	public Auto(String typ, int kw) {
		this.typ = typ;
		this.kw = kw;
	}

	public int getKw() {
		return kw;
	}

	public void setKw(int kw) {
		this.kw = kw;
	}

	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}
}
