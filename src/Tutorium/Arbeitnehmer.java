package Tutorium;

public class Arbeitnehmer extends Person {
	private String beruf;
	private int gehalt;
	public Arbeitnehmer(int alter, String name, String vorname, String beruf, int gehalt) {
		super(alter, name, vorname);
		this.beruf = beruf;
		this.gehalt = gehalt;
	}
	public String getBeruf() {
		return beruf;
	}
	public int getGehalt() {
		return gehalt;
	}
	public void setBeruf(String beruf) {
		this.beruf = beruf;
	}
	public void setGehalt(int gehalt) {
		this.gehalt = gehalt;
	}
	
	
}
