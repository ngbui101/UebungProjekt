package Klausur2021;

public class SparvertragApp {

	public static void main(String[] args) {
		BankSparvertraege sparkasse = new BankSparvertraege("Sparkasse");
		String name = "Lam Bui";
		double guthaben = 1000.;
		String vertragArt = "NormSparvertrag";
		int dauer = 5;
		//Vertrag hinzufügen
		sparkasse.vertragHinzufuegin(name, guthaben, vertragArt);
		//Casting
		NormSparvertrag vertrag = (NormSparvertrag) sparkasse.getvertragArray()[0];
		vertrag.addZins(dauer);
		System.out.printf("Kundensname: %s%nKontostand: %.2f Euro%n",vertrag.getSparer(),vertrag.getGuthaben());
	}
}
