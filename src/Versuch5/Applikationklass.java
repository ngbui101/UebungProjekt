package Versuch5;

public class Applikationklass {

	public static void main(String[] args) {
		Haus h1 = new Haus("nicht eingebaut", "nicht eingebaut");
		h1.typeAusgabe();
		h1.einbauen("Alarmanlage");
		System.out.println("Klingelanlage: " + h1.getKlingelanlage());
		System.out.println("Alarmanlage: " + h1.getAlarmanlage());
		System.out.println("Automatischer Tueroeffner: " + h1.getAutomatischerTueroeffner());
	}

}
