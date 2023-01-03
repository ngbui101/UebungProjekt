package Uebungen;

public class Pkw extends Auto{
	private int insassen;
	public Pkw(String typ, int kw, int insassen) {
		super(typ, kw);
		setInsassen(insassen);
	}
	public int getInsassen() {
		return insassen;
	}
	public void setInsassen(int insassen) {
		this.insassen = insassen;
	}

}
