package Klausur2021;

public class VertragPlus extends NormSparvertrag {
	
	public VertragPlus(String sparer, double guthaben) {
		super(sparer, guthaben);
		setVertragType("VertragPlus");
	}
	@Override
	public void addZins(int dauer) {
		if (dauer < 1) {
			dauer = 1;
			System.out.println("Dauer darf nicht kleiner als 1, auf 1 gesetzt");
		}
		if (dauer > 9) {
			dauer = 9;
			System.out.println("Dauer darf nicht groesser als 9, auf 9 gesetzt");
		}
		super.addZins(dauer);
	}
}
