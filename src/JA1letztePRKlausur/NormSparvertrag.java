package JA1letztePRKlausur;

public class NormSparvertrag extends Sparvertrag implements Zinsen{
	private double guthaben;

	public NormSparvertrag(String sparer,  double guthaben) {
		super(sparer, "Normaler Sparvertrag");
		this.guthaben = guthaben;
	}

	public double getGuthaben() {
		return guthaben;
	}

	void setGuthaben(double guthaben) {
		this.guthaben = guthaben;
	}

	@Override
	public void addZins(int dauer) {
		if(dauer <= 5) {
			guthaben += guthaben * ZINS1/100; 
		}else {
			guthaben += guthaben * ZINS2/100;
		}
	}
	
	
}
