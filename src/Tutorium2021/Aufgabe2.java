package Tutorium2021;

public class Aufgabe2 {

	public static void main(String[] args) {
		String eingabe1 = args[1];
		String eingabe2 = args[2];
		
		if(eingabe1.equals("Schere"))
			if(eingabe2.equals(eingabe1))
				System.out.println("Unentschieden");
			if(eingabe2.equals("Papier"))
				System.out.println("Spiel 1 gewinnt");
		
			
	}

}
