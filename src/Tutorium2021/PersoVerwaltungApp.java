package Tutorium2021;

public class PersoVerwaltungApp {

	public static void main(String[] args) {
		PersonalVerwaltung sparkasse = new PersonalVerwaltung();
		Mitarbeiter a = new Mitarbeiter("Nguyen Lam Bui");
		Mitarbeiter b = new Mitarbeiter("Sibel Bui");
		Mitarbeiter c = new Mitarbeiter("Juergen Brandau");
		Mitarbeiter d = new Mitarbeiter("Susane Brandau");
		sparkasse.mitarbeiterHinzufuegin(a);
		sparkasse.mitarbeiterHinzufuegin(b);
		sparkasse.mitarbeiterHinzufuegin(c);
		sparkasse.mitarbeiterHinzufuegin(d);
		sparkasse.sortMitarbeiter();
		sparkasse.listMitarbeiter();
	}

}
