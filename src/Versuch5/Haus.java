package Versuch5;

public class Haus extends Gebaeude implements Einbau{

	public Haus(String alarmanlage, String automatischerTueroeffner) {
		super("eingebaut", alarmanlage, automatischerTueroeffner);
		setType("Haus");
	}
	
	@Override
	void typeAusgabe() {
		System.out.print("Das Objekt hat folgenden Type: ");
		super.typeAusgabe();
	}
	@Override
	public void einbauen(String gebaeudeElement) {
		if(gebaeudeElement.equals("Klingelanlage")) {
			setKlingeanlage("eingebaut");
			System.out.println("Klingelanlage wurde eingebaut");
		}
		if(gebaeudeElement.equals("Alarmanlage")) {
			setKlingeanlage("eingebaut");
			System.out.println("Alarmanlage wurde eingebaut");
		}
		if(gebaeudeElement.equals("Automatischer Tueroeffner")) {
			setKlingeanlage("eingebaut");
			System.out.println("Automatischer Tueroeffner wurde eingebaut");
		}
	}
	
}
