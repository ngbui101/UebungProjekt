package JA1letztePRKlausur;

public class BankSparvertraege {
	private String name;
	private Sparvertrag[] vertragArray;
	public BankSparvertraege(String name) {
		this.name = name;
		vertragArray = new Sparvertrag[2];
	}
	public Sparvertrag[] getVertragArray() {
		return vertragArray;
	}
	public void vertragHinzufuegen(String sparer, double guthaben, String art) {
		boolean istVoll = false;
		for (int i = 0; i < vertragArray.length; i++) {
			if(vertragArray[i] == null && !istVoll) {
				if(art.equals("NormSparvertrag")) {
					vertragArray[i] = new NormSparvertrag(sparer, guthaben);
					break;
				}
				if(art.equals("VertragPlus")) {
					vertragArray[i] = new VertragPlus(sparer, guthaben);
					break;
					}
				else {
					System.err.println("Keine passende Vertragart eingegeben");
					break;
				}
	
			}
			if(i == vertragArray.length-1){
				istVoll = true;
			}
		}
		if(istVoll)
			System.err.println("Array ist voll");
	}
	
	
}
