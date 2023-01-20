package Tutorium;

import javax.swing.JOptionPane;

public class ArbeitnehmerMain {

	public static void main(String[] args) {
		String menue = "Eingabe\n";
		menue += " 1) neue Person/Arbeitnemer anlegen\n";
		menue += " 2) alle Personen/Arbeitnehmer ausgeben\n";
		menue += " 3) Person/Arbeitnehmer loeschen\n";
		menue += " 4) Anwendung beenden\n";

		Person[] person = new Person[0];
		Schleife: while (true) {
			String key = JOptionPane.showInputDialog(menue);
			switch (key) {
			case "1":
				Person neu;
				String name = JOptionPane.showInputDialog("Name eingeben");
				String vorname = JOptionPane.showInputDialog("Vorname eingeben");
				int alter = Integer.parseInt(JOptionPane.showInputDialog("Alter eingeben"));
				if (JOptionPane.showInputDialog("Hat diese Person einen Beruf").equals("Ja")) {
					String beruf = JOptionPane.showInputDialog("Geben Sie die Berufsbezeichnung der person ein");
					int gehalt = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie das Gehalt der Person ein"));
					neu = new Arbeitnehmer(alter, name, vorname, beruf, gehalt);
				} else {
					neu = new Person(alter, name, vorname);
				}
				Person[] temp = person;
				person = new Person[temp.length + 1];
				for (int i = 0; i < temp.length; i++) {
					person[i] = temp[i];
				}
				person[temp.length] = neu;
				break;
			case "2":
				// String ausgabe = "";
				for (int i = 0; i < person.length; i++) {
					if (person[i].getClass() == Arbeitnehmer.class)
						System.out.printf("Name: %s %s%nAlter: %d%nBeruf:%s%nGehalt: %d Euro%n", person[i].getVorname(),
								person[i].getName(), person[i].getAlter(), ((Arbeitnehmer) person[i]).getBeruf(),
								((Arbeitnehmer) person[i]).getGehalt());
					else {
						System.out.printf("Name: %s %s%nAlter: %d%n", person[i].getVorname(), person[i].getName(),
								person[i].getAlter());
					}
				}
				break;
			case "3":
				for (int i = 0; i < person.length; i++) {
					if (person[i].getClass() == Arbeitnehmer.class)
						System.out.printf("Name: %s %s%nAlter: %d%nBeruf:%s%nGehalt: %d Euro%n", person[i].getVorname(),
								person[i].getName(), person[i].getAlter(), ((Arbeitnehmer) person[i]).getBeruf(),
								((Arbeitnehmer) person[i]).getGehalt());
					else {
						System.out.printf("Name: %s %s%nAlter: %d%n", person[i].getVorname(), person[i].getName(),
								person[i].getAlter());
					}
				}
				int zuLoeschen = Integer.parseInt(JOptionPane.showInputDialog("Welche Person soll geloescht werden"));
				Person[] temp2 = person;
				person = new Person[temp2.length -1];
				int personIndex = 0;
				for (int i = 0; i < temp2.length; i++) {
					if(i == zuLoeschen-1)
						continue;
					person[personIndex] = temp2[i];
					personIndex++;
				}
				break;
			case "4":
				break Schleife;
			default:
				continue Schleife;
			}
		}
	}

}
