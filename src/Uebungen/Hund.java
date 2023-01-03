package Uebungen;

public class Hund extends Saeugetier {
	public Hund(char geschlecht, double gewicht) {
		super(geschlecht, gewicht);
		if (geschlecht == 'm' && geschlecht == 'w' && geschlecht == 'u')
			setGeschlecht(geschlecht);
		else 
			setGeschlecht('u');
	}
}

