package Tutorium2021;

public class PersonalVerwaltung {
	private Mitarbeiter[] mitarbeiterListe = new Mitarbeiter[0];

	public void mitarbeiterHinzufuegin(Mitarbeiter mitarbeiter) {
		Mitarbeiter[] temp = mitarbeiterListe;
		mitarbeiterListe = new Mitarbeiter[temp.length + 1];
		for (int i = 0; i < temp.length; i++) {
			mitarbeiterListe[i] = temp[i];
		}
		mitarbeiterListe[temp.length] = mitarbeiter;
	}

	public void mitarbeiterEntfernen(int index) {
		Mitarbeiter[] temp = mitarbeiterListe;
		mitarbeiterListe = new Mitarbeiter[temp.length - 1];
		int j = 0;
		for (int i = 0; i < temp.length; i++) {
			if (i == index - 1) {
				continue;
			}
			mitarbeiterListe[j] = temp[i];
		}
	}

	public void listMitarbeiter() {
		for (Mitarbeiter mitarbeiter : mitarbeiterListe) {
			System.out.printf("%d.Mitarbeiter: %s%n", mitarbeiter.getId(), mitarbeiter.getName());
		}
	}

	public void sortMitarbeiter() {
		for (int i = 0; i < mitarbeiterListe.length; i++)
			for (int j = i + 1; j < mitarbeiterListe.length; j++)
				if (mitarbeiterListe[j].istKleiner(mitarbeiterListe[i])) {
					Mitarbeiter hilf = mitarbeiterListe[i];
					mitarbeiterListe[i] = mitarbeiterListe[j];
					mitarbeiterListe[j] = hilf;
				}
	}
}
