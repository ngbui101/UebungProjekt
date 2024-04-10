package Tutorium2021;

public class Mitarbeiter {
	private static int MAX_ID = 1;
	private int id;
	private String name;
	public Mitarbeiter(String name) {
		this.id = MAX_ID ++;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean istKleiner(Mitarbeiter m) {
		if(name.compareTo(m.getName()) > 0)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Mitarbeiter [id=" + id + ", name=" + name + "]";
	}
	
}
