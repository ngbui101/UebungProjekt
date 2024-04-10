package Klausur2021;

public class SparvertragApp {

	public static void main(String[] args) {
		BankSparvertraege sparkasse = new BankSparvertraege("Sparkasse");
		String name = "Lam Bui";
		double guthaben = 1000.;
		String vertragArt = "NormSparvertrag";
		String name1 = "Sibel Bui";
		double guthaben1 = 1050.;
		String vertragArt1 = "VertragPlus";
		sparkasse.vertragHinzufuegin(name, guthaben, vertragArt);
		sparkasse.vertragHinzufuegin(name1, guthaben1, vertragArt1);
		Sparvertrag[] kunden = sparkasse.getvertragArray();
		for (Sparvertrag sparvertrag : kunden) {
			if (sparvertrag != null) {
				if (sparvertrag.getClass() == NormSparvertrag.class) {
					NormSparvertrag a = (NormSparvertrag) sparvertrag;
					a.addZins(5);
					System.out.printf("Name: %s%nGuthaben: %.2f Euro%nVertragart: %s%n", a.getSparer(), a.getGuthaben(),
							a.getVertragType());
				}
				if (sparvertrag.getClass() == VertragPlus.class) {
					VertragPlus a = (VertragPlus) sparvertrag;
					a.addZins(15);
					System.out.printf("Name: %s%nGuthaben: %.2f Euro%nVertragart: %s%n", a.getSparer(), a.getGuthaben(),
							a.getVertragType());
				} 
			}
		}
		
	}
}
