package Tutorium;

public class HausApplikation {

	public static void main(String[] args) {
		Haus arnold = new Haus("Arnoldstr. 37");
		arnold.addPerson("Bui", "Nguyen Lam", 25);
		arnold.addPerson("Bui", "Sibel", 21);
		arnold.addPerson("Nguyen", "Thi Hoa", 50);
		arnold.addPerson("Hua", "Van Tap", 55);
		arnold.addPerson("Nguyen", "Thi Van Anh", 24);
		arnold.bewohnerAusgeben();
	}

}
