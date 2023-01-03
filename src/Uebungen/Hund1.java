package Uebungen;

public class Hund1 extends Saeugetier {
	public Hund1(char geschlecht, double gewicht) {
		super(geschlecht, gewicht);
		checkGeschlecht(geschlecht);
	}
	public void checkGeschlecht(char geschlecht) {
		if (geschlecht != 'm' && geschlecht != 'w')
			setGeschlecht('u');
	}
}

