package Uebungen;

public class ApplicationAuto {

	public static void main(String[] args) {
		Auto[] fahrzeug = {new Auto("BMW", 1000),new Auto("WV", 50),
				new Pkw("Porsche", 20000, 4),new Pkw("Benz", 1000, 4),new Pkw("Opel", 10, 4)};
		for(int i = 0; i < fahrzeug.length; i++) {
			try {
				Pkw a = (Pkw)fahrzeug[i];
				System.out.println(a.getTyp() + "\n" + a.getKw() + "\n" + a.getInsassen());
			} catch (Exception e1) {
				Auto a = fahrzeug[i];
				System.out.println(a.getTyp() + "\n" + a.getKw());
			}
		}

	}

}
