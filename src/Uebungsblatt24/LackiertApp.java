package Uebungsblatt24;

public class LackiertApp {

	public static void main(String[] args) {
		Lackierbar[] obj = new Lackierbar[3];
		obj[0] = new Tisch();
		obj[1] = new Stuhl();
		obj[2] = new Fahrrad();
		for (int i = 0; i < obj.length; i++) {
			obj[i].lackieren(Lackierbar.ROT);
		}
	}

}
