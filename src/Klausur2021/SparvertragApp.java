package Klausur2021;

public class SparvertragApp {

	public static void main(String[] args) {
		BankSparvertraege sparkasse = new BankSparvertraege("Sparkasse");
		String name = "Lam Bui";
		double guthaben = 1000.;
		String vertragArt = "NormSparvertrag";
		sparkasse.vertragHinzufuegin(name, guthaben, vertragArt);
		int dauer = 5;
		NormSparvertrag vertrag = (NormSparvertrag) sparkasse.getvertragArray()[0];
		vertrag.addZins(dauer);
		System.out.println("Saldo von dem Kunde " + vertrag.getSparer() + " betraegt: " + vertrag.getGuthaben()+ " Euro.");
	}
}
