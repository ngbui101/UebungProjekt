package Klausur2021;

public class BankSparvertraege {
	private String name;
	private Sparvertrag[] vertragArray;
	public BankSparvertraege(String name) {
		this.name = name;
		vertragArray = new Sparvertrag[756];
	}
	public Sparvertrag[] getvertragArray() {
		return vertragArray;
	}
	public void vertragHinzufuegin(String sparer, double guthaben, String art) {
		boolean istVoll = false;
		for (int i = 0; i < vertragArray.length; i++) {
			if(vertragArray[i] == null && !istVoll) {
				if(art.equals("NormSparvertrag")) {
					vertragArray[i] = new NormSparvertrag(sparer, guthaben);
					break;
				}
				else if(art.equals("VertragPlus")) {
					vertragArray[i] = new VertragPlus(sparer, guthaben);
					break;
				}
			}
			if(vertragArray[vertragArray.length-1] != null) {
				istVoll = true;
			}
		}
		if(istVoll)
			System.err.println("Array ist voll");
	}
	
}
