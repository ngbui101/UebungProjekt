package Uebungen;

public class Hund2 extends Saeugetier {
	public Hund2(char geschlecht, double gewicht) {
		super(geschlecht, gewicht);
	}
	@Override
	public void setGeschlecht(char geschlecht) {
		super.setGeschlecht(geschlecht);
		if (geschlecht == 'm' && geschlecht == 'w' && geschlecht == 'u')
			setGeschlecht(geschlecht);
		else 
			setGeschlecht('u');
		
	}
}

