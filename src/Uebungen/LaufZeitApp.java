package Uebungen;
import javax.swing.JOptionPane;

class LaufZeitApp {
	static Laeufer[] bubbleSort(Laeufer[] laeuferarr, int arrLaenge) {
		for (int i = 0; i < arrLaenge; i++) {
			for (int j = i; j < arrLaenge - i - 1; j++) {
				if (laeuferarr[j].getLaufDauerInSekunde() > laeuferarr[j +1].getLaufDauerInSekunde()) {
					Laeufer hilfLaeufer = laeuferarr[j];
					laeuferarr[j] = laeuferarr[j +1];
					laeuferarr[j +1] = hilfLaeufer;
				}
			}
		}
		return laeuferarr;
	}
	
	public static void main(String args[]) {
		String ersteEingabe, zweiteEingabe, dritteEingabe;
		Uhrzeit start, ankunft;
		String name;
		int anzahl;
		try {
			anzahl = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie die Anzahl der Teilnehmer ein"));
			Laeufer[] teilnehmer = new Laeufer[anzahl];
			// Einlesen
			for (int i = 0; i < teilnehmer.length; i++) {
				ersteEingabe = JOptionPane.showInputDialog("Name");
				zweiteEingabe = JOptionPane.showInputDialog("Startzeit(hh:mm:ss)");
				dritteEingabe = JOptionPane.showInputDialog("Ankunftszeit (hh:mm:ss)");
				name = ersteEingabe;
				start = new Uhrzeit(zweiteEingabe);
				ankunft = new Uhrzeit(dritteEingabe);
				teilnehmer[i] = new Laeufer(start, ankunft, name);
			}
			
			teilnehmer = bubbleSort(teilnehmer, teilnehmer.length);
			
			int[] platz = new int[teilnehmer.length];
			int hilf = 1;
			for (int i = 0; i < platz.length; i++) {
				if (i < platz.length - 1) {
					if (teilnehmer[i].getLaufDauerInSekunde() == teilnehmer[i + 1].getLaufDauerInSekunde())
						platz[i] = hilf;
					else {
						platz[i] = hilf;
						hilf++;
					}
				} else {
					platz[i] = hilf;
					hilf++;
				}
			}

			for (int i = 0; i < teilnehmer.length; i++) {
				System.out.printf("%d. Platz: %s: %s%n", platz[i], teilnehmer[i].getName(), teilnehmer[i].getLaufDauer());
			}
		} catch (NumberFormatException nfe) {
			System.out.println("keine Nummer gegeben");
		} finally {
			System.exit(0);
		}
	}
}