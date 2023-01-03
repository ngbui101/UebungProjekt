package Klausur2021;

public class BankSparvertraege {
	String name;
	Sparvertrag[] vertragArray;
	public BankSparvertraege(String name) {
		this.name = name;
		vertragArray = new Sparvertrag[739];
	}
	public Sparvertrag[] getvertragArray() {
		return vertragArray;
	}
	public void vertragHinzufuegin(String sparer, double guthaben, String art) {
		for (int i = 0; i < vertragArray.length; i++) {
			if(vertragArray[i] == null) {
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
				System.out.println("Array ist voll, koennte kein weiter Sparvertraeger hinzufuegin!");
			}
		}
	}
	
}
