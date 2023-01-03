package Uebungen;

public class FlaechenAplikation {

	public static void main(String[] args) {
		Flaeche[] fl = new Flaeche[3];
		fl[0] = new Dreieck(1);
		fl[1] = new Kreis(2);
		fl[2] = new Quadrat(3);
		for (Flaeche flaeche : fl) {
			System.out.printf("Der Umfang von dem %s ist: %d%n", flaeche.getType(),flaeche.getUmfang());
		}
	}

}
