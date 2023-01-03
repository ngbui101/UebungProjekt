package Uebungen;

class Uhrzeit {
	// Attribute
	private int stunde, minute, sekunde;

	// Konstruktor
	Uhrzeit(String text) {
		stunde = Integer.parseInt(text.substring(0, 2));
		minute = Integer.parseInt(text.substring(3, 5));
		sekunde = Integer.parseInt(text.substring(6, 8));
	}

	// Methoden
	int rechneInSekunden() {
		int sekundenZeit; // Uhrzeit in Sekunden (lokale Variable)
		sekundenZeit = sekunde;
		sekundenZeit = sekundenZeit + 60 * minute;
		sekundenZeit = sekundenZeit + 3600 * stunde;
		return sekundenZeit;
	}

	String minus(Uhrzeit zeit) {
		// subtrahiert die Uhrzeit zeit von der Uhrzeit des Objektes und gibt String in
		// h,m,s zurueck
		int differenz, diffStunde, diffMinute, diffSekunde;
		String rueckgabe = "";
		differenz = rechneInSekunden() - zeit.rechneInSekunden();
		diffStunde = differenz / 3600;
		differenz = differenz % 3600;
		diffMinute = differenz / 60;
		diffSekunde = differenz % 60;
		rueckgabe += diffStunde + " h ";
		rueckgabe += diffMinute + " min ";
		rueckgabe += diffSekunde + " sec ";
		return rueckgabe;
	}
	int minusInsekunden(Uhrzeit zeit) {
		return rechneInSekunden() - zeit.rechneInSekunden();
	}
}
