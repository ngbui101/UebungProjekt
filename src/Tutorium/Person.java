package Tutorium;

public class Person {
	private int alter;
	private String name;
	private String vorname;	
	public Person(int alter, String name, String vorname) {
		this.alter = alter;
		this.name = name;
		this.vorname = vorname;
	}
	public int getAlter() {
		return alter;
	}
	public String getName() {
		return name;
	}
	public String getVorname() {
		return vorname;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
}
