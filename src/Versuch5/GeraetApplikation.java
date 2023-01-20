package Versuch5;

public class GeraetApplikation {

	public static void main(String[] args) {
		Foehn f1 = new Foehn("alt", "alt");
		System.out.println(f1.getGeraeteTyp());
		System.out.println(f1.wechseln("Kabel"));
		System.out.println(f1.wechseln("Einausschalter"));
		f1.ausgabe();
	}

}
