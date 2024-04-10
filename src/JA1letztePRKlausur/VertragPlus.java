package JA1letztePRKlausur;

public class VertragPlus extends NormSparvertrag{

	public VertragPlus(String sparer, double guthaben) {
		super(sparer, guthaben);
		setVertragTyp("VertragPlus");
	}

	@Override
	public void addZins(int dauer) {
		if(dauer > 9) {
			System.out.println("Dauern darf nicht groesser als 9 sein, wurde auf 9 gesetzt");
			dauer = 9;
		}
		if(dauer < 0) {
			System.out.println("Dauern darf nicht kleiner als 1, wurde auf 1 gesetzt");
			dauer = 1;
		}
		
		super.addZins(dauer);
	}
}
