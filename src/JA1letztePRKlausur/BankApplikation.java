package JA1letztePRKlausur;

public class BankApplikation {

	public static void main(String[] args) {
		BankSparvertraege sparkasse = new BankSparvertraege("Sparkasse");
		sparkasse.vertragHinzufuegen("Nguyen Lam Bui", 1000, "NormSparvertrag");
		sparkasse.vertragHinzufuegen("Sibel Bui", 5000, "VertragPlus");
		Sparvertrag[] vertragArray = sparkasse.getVertragArray();
		for (Sparvertrag sparvertrag : vertragArray) {
			if (sparvertrag != null) {
				if (sparvertrag.getClass() == VertragPlus.class) {
					VertragPlus a = (VertragPlus) sparvertrag;
					a.addZins(15);
					System.out.printf("Name: %s%nVertragart: %s%nGuthaben: %.2f Euro%n ", a.getSparer(),
							a.getVertragTyp(), a.getGuthaben());
				}
				if (sparvertrag.getClass() == NormSparvertrag.class) {
					NormSparvertrag b = (NormSparvertrag) sparvertrag;
					b.addZins(19);
					System.out.printf("Name: %s%nVertragart: %s%nGuthaben: %.2f Euro%n ", b.getSparer(),
							b.getVertragTyp(), b.getGuthaben());
				} 
			}
		}
	}

}
